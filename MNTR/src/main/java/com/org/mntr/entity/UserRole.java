package com.org.mntr.entity;
// Generated 11-Aug-2017 13:10:52 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserRole generated by hbm2java
 */
@Entity
@Table(name = "user_role", catalog = "rdev")
public class UserRole implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long roleId;
	private String roleName;
	private Integer status;
	private Long createdBy;
	private Date createdDt;
	private Long modifiedBy;
	private Date modifiedDt;
	private String description;
	private Set<UserRoleMapping> userRoleMappings = new HashSet<UserRoleMapping>(0);
	private Set<RoleMenuMapping> roleMenuMappings = new HashSet<RoleMenuMapping>(0);

	public UserRole() {
	}

	public UserRole(String roleName, Integer status, Long createdBy, Date createdDt, Long modifiedBy, Date modifiedDt) {
		this.roleName = roleName;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.modifiedBy = modifiedBy;
		this.modifiedDt = modifiedDt;
	}

	public UserRole(String roleName, Integer status, Long createdBy, Date createdDt, Long modifiedBy, Date modifiedDt,
			String description, Set<UserRoleMapping> userRoleMappings, Set<RoleMenuMapping> roleMenuMappings) {
		this.roleName = roleName;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.modifiedBy = modifiedBy;
		this.modifiedDt = modifiedDt;
		this.description = description;
		this.userRoleMappings = userRoleMappings;
		this.roleMenuMappings = roleMenuMappings;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ROLE_ID", unique = true, nullable = false)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Column(name = "ROLE_NAME", nullable = false, length = 150)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "STATUS", nullable = false)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "CREATED_BY", nullable = false)
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DT", nullable = false, length = 19)
	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	@Column(name = "MODIFIED_BY", nullable = false)
	public Long getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DT", nullable = false, length = 19)
	public Date getModifiedDt() {
		return this.modifiedDt;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRole")
	public Set<UserRoleMapping> getUserRoleMappings() {
		return this.userRoleMappings;
	}

	public void setUserRoleMappings(Set<UserRoleMapping> userRoleMappings) {
		this.userRoleMappings = userRoleMappings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRole")
	public Set<RoleMenuMapping> getRoleMenuMappings() {
		return this.roleMenuMappings;
	}

	public void setRoleMenuMappings(Set<RoleMenuMapping> roleMenuMappings) {
		this.roleMenuMappings = roleMenuMappings;
	}

}