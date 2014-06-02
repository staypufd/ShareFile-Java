






// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------


package com.sharefile.api.models;

import java.util.Date;

import com.google.gson.annotations.SerializedName;


public class SFUserSecurity extends SFODataObject {



	@SerializedName("IsDisabled")

	private Boolean IsDisabled;


	@SerializedName("IsLocked")

	private Boolean IsLocked;


	@SerializedName("LockExpires")

	private Date LockExpires;


	@SerializedName("LastWebAppLogin")

	private Date LastWebAppLogin;


	@SerializedName("LastAnyLogin")

	private Date LastAnyLogin;


	@SerializedName("UserIPRestrictions")

	private String UserIPRestrictions;


	@SerializedName("DisableLoginBefore")

	private Date DisableLoginBefore;


	@SerializedName("DisableLoginAfter")

	private Date DisableLoginAfter;


	@SerializedName("ForcePasswordChange")

	private Boolean ForcePasswordChange;


	@SerializedName("PasswordNeverExpires")

	private Boolean PasswordNeverExpires;


	@SerializedName("LastPasswordChange")

	private Date LastPasswordChange;


	@SerializedName("UsernameShort")

	private String UsernameShort;


	@SerializedName("LastFailedLogin")

	private Date LastFailedLogin;


	@SerializedName("LastFailedLoginIP")

	private String LastFailedLoginIP;


	@SerializedName("FailedLoginCount")

	private Integer FailedLoginCount;




	public Boolean getIsDisabled() {
		return IsDisabled;
	}


	public void setIsDisabled(Boolean isdisabled) {
		IsDisabled = isdisabled;
	}


	public Boolean getIsLocked() {
		return IsLocked;
	}


	public void setIsLocked(Boolean islocked) {
		IsLocked = islocked;
	}


	public Date getLockExpires() {
		return LockExpires;
	}


	public void setLockExpires(Date lockexpires) {
		LockExpires = lockexpires;
	}


	public Date getLastWebAppLogin() {
		return LastWebAppLogin;
	}


	public void setLastWebAppLogin(Date lastwebapplogin) {
		LastWebAppLogin = lastwebapplogin;
	}


	public Date getLastAnyLogin() {
		return LastAnyLogin;
	}


	public void setLastAnyLogin(Date lastanylogin) {
		LastAnyLogin = lastanylogin;
	}


	public String getUserIPRestrictions() {
		return UserIPRestrictions;
	}


	public void setUserIPRestrictions(String useriprestrictions) {
		UserIPRestrictions = useriprestrictions;
	}


	public Date getDisableLoginBefore() {
		return DisableLoginBefore;
	}


	public void setDisableLoginBefore(Date disableloginbefore) {
		DisableLoginBefore = disableloginbefore;
	}


	public Date getDisableLoginAfter() {
		return DisableLoginAfter;
	}


	public void setDisableLoginAfter(Date disableloginafter) {
		DisableLoginAfter = disableloginafter;
	}


	public Boolean getForcePasswordChange() {
		return ForcePasswordChange;
	}


	public void setForcePasswordChange(Boolean forcepasswordchange) {
		ForcePasswordChange = forcepasswordchange;
	}


	public Boolean getPasswordNeverExpires() {
		return PasswordNeverExpires;
	}


	public void setPasswordNeverExpires(Boolean passwordneverexpires) {
		PasswordNeverExpires = passwordneverexpires;
	}


	public Date getLastPasswordChange() {
		return LastPasswordChange;
	}


	public void setLastPasswordChange(Date lastpasswordchange) {
		LastPasswordChange = lastpasswordchange;
	}


	public String getUsernameShort() {
		return UsernameShort;
	}


	public void setUsernameShort(String usernameshort) {
		UsernameShort = usernameshort;
	}


	public Date getLastFailedLogin() {
		return LastFailedLogin;
	}


	public void setLastFailedLogin(Date lastfailedlogin) {
		LastFailedLogin = lastfailedlogin;
	}


	public String getLastFailedLoginIP() {
		return LastFailedLoginIP;
	}


	public void setLastFailedLoginIP(String lastfailedloginip) {
		LastFailedLoginIP = lastfailedloginip;
	}


	public Integer getFailedLoginCount() {
		return FailedLoginCount;
	}


	public void setFailedLoginCount(Integer failedlogincount) {
		FailedLoginCount = failedlogincount;
	}

}