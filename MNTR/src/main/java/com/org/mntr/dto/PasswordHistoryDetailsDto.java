package com.org.mntr.dto;
// default package

// Generated 11-Aug-2017 16:11:48 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * PasswordHistoryDetailsDto generated by hbm2java
 */
public class PasswordHistoryDetailsDto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long pwdHisRefId;
	private String password;
	private Date pwdCreationDt;

	public PasswordHistoryDetailsDto() {
	}

	public Long getPwdHisRefId() {
		return this.pwdHisRefId;
	}

	public void setPwdHisRefId(Long pwdHisRefId) {
		this.pwdHisRefId = pwdHisRefId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPwdCreationDt() {
		return this.pwdCreationDt;
	}

	public void setPwdCreationDt(Date pwdCreationDt) {
		this.pwdCreationDt = pwdCreationDt;
	}

}