package com.cbo.mntr.service;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cbo.mntr.constants.MsgConstants;
import com.cbo.mntr.constants.StatusConstants;
import com.cbo.mntr.dto.RoleDto;
import com.cbo.mntr.entity.UserRole;
import com.cbo.mntr.exceptions.CustomException;
import com.cbo.mntr.jpa.RoleRepository;
import com.cbo.mntr.jpa.specs.RoleSpec;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	@Qualifier("roleSpec")
	private RoleSpec rolespec;

	@Override
	public DataTablesOutput<UserRole> getAllRoles(DataTablesInput dtInput, Long eId) throws Exception {
		DataTablesOutput<UserRole> page = null;
		try {
			page = roleRepository.findAll(dtInput, rolespec.isActive(eId));
			return page;
		} finally {
			page = null;
		}
	}

	@Override
	public RoleDto getDataByKeyAndStatusAndExcludeKey(Long id, Long eId) throws Exception {
		RoleDto roleDto = null;
		UserRole role = null;
		try {
			role = roleRepository.findByRoleIdAndStatusAndRoleIdNot(id, StatusConstants.active, eId);
			if (role != null) {
				roleDto = new RoleDto();
				BeanUtils.copyProperties(role, roleDto);
			} else {
				throw new CustomException(MsgConstants.noRecordsFound);
			}
			return roleDto;
		} finally {
			roleDto = null;
			role = null;
		}
	}

	@Override
	public void save(RoleDto object, Long userKey) throws Exception {
		UserRole role = null;
		Date d = null;
		try {
			d = new Date();
			role = new UserRole();
			BeanUtils.copyProperties(object, role);
			role.setCreatedBy(userKey);
			role.setModifiedBy(userKey);
			role.setCreatedDT(d);
			role.setModifiedDT(d);
			role.setStatus(StatusConstants.active);
			roleRepository.save(role);
		} finally {
			object = null;
			role = null;
			d = null;
		}
	}

	@Override
	public void edit(RoleDto object, Long userKey) throws Exception {
		UserRole role = null;
		Date d = null;
		try {
			d = new Date();
			role = new UserRole();
			BeanUtils.copyProperties(object, role);
			role.setModifiedBy(userKey);
			role.setModifiedDT(d);
			roleRepository.save(role);
		} finally {
			object = null;
			role = null;
			d = null;
		}
	}

	@Override
	public void delete(Long rcdKey) throws Exception {
		roleRepository.delete(rcdKey);
	}

	@Override
	public RoleDto getDataByKeyAndStatus(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}