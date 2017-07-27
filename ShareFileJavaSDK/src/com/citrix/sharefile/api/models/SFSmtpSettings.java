
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2017 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFSmtpSettings extends SFODataObject {

	@SerializedName("IsEnabled")
	private Boolean IsEnabled;
	@SerializedName("Host")
	private String Host;
	@SerializedName("Username")
	private String Username;
	@SerializedName("Password")
	private String Password;
	@SerializedName("SenderEmail")
	private String SenderEmail;
	@SerializedName("SenderName")
	private String SenderName;
	@SerializedName("Port")
	private Integer Port;
	@SerializedName("AuthMethod")
	private SFSafeEnum<SFSmtpAuthMethod> AuthMethod;
	@SerializedName("SslMode")
	private SFSafeEnum<SFSmtpSslMode> SslMode;
	@SerializedName("FailureNotificationEmailAddress")
	private String FailureNotificationEmailAddress;
	@SerializedName("ShouldFallbackToShareFileSmtp")
	private Boolean ShouldFallbackToShareFileSmtp;

		/**
		* Flag representing if custom settings are enabled
		*/
	public Boolean getIsEnabled() {
		return this.IsEnabled;
	}

		/**
		* Flag representing if custom settings are enabled
		*/
	public void setIsEnabled(Boolean isenabled) {
		this.IsEnabled = isenabled;
	}
		/**
		* Host address of Account's SMTP server
		*/
	public String getHost() {
		return this.Host;
	}

		/**
		* Host address of Account's SMTP server
		*/
	public void setHost(String host) {
		this.Host = host;
	}
		/**
		* SMTP Server user name
		*/
	public String getUsername() {
		return this.Username;
	}

		/**
		* SMTP Server user name
		*/
	public void setUsername(String username) {
		this.Username = username;
	}
		/**
		* Password for SMTP Server (write-only, will not return)
		*/
	public String getPassword() {
		return this.Password;
	}

		/**
		* Password for SMTP Server (write-only, will not return)
		*/
	public void setPassword(String password) {
		this.Password = password;
	}
		/**
		* From Email Address
		*/
	public String getSenderEmail() {
		return this.SenderEmail;
	}

		/**
		* From Email Address
		*/
	public void setSenderEmail(String senderemail) {
		this.SenderEmail = senderemail;
	}
		/**
		* Plain text name for From Address
		*/
	public String getSenderName() {
		return this.SenderName;
	}

		/**
		* Plain text name for From Address
		*/
	public void setSenderName(String sendername) {
		this.SenderName = sendername;
	}
		/**
		* Port for connection to SMTP server
		*/
	public Integer getPort() {
		return this.Port;
	}

		/**
		* Port for connection to SMTP server
		*/
	public void setPort(Integer port) {
		this.Port = port;
	}
		/**
		* Authentication Method to connect to SMTP Server (None, Default, CRAM-MD5, Login, NTLM, Plain)
		*/
	public SFSafeEnum<SFSmtpAuthMethod> getAuthMethod() {
		return this.AuthMethod;
	}

		/**
		* Authentication Method to connect to SMTP Server (None, Default, CRAM-MD5, Login, NTLM, Plain)
		*/
	public void setAuthMethod(SFSafeEnum<SFSmtpAuthMethod> authmethod) {
		this.AuthMethod = authmethod;
	}
		/**
		* SSL Mode for connection to SMTP server (None, Implicit, Explicit)
		*/
	public SFSafeEnum<SFSmtpSslMode> getSslMode() {
		return this.SslMode;
	}

		/**
		* SSL Mode for connection to SMTP server (None, Implicit, Explicit)
		*/
	public void setSslMode(SFSafeEnum<SFSmtpSslMode> sslmode) {
		this.SslMode = sslmode;
	}
		/**
		* Email address to notify when configured SMTP server is unreachable
		*/
	public String getFailureNotificationEmailAddress() {
		return this.FailureNotificationEmailAddress;
	}

		/**
		* Email address to notify when configured SMTP server is unreachable
		*/
	public void setFailureNotificationEmailAddress(String failurenotificationemailaddress) {
		this.FailureNotificationEmailAddress = failurenotificationemailaddress;
	}
		/**
		* Flag to state whether email should be sent through ShareFile SMTP server if custom SMTP server fails
		*/
	public Boolean getShouldFallbackToShareFileSmtp() {
		return this.ShouldFallbackToShareFileSmtp;
	}

		/**
		* Flag to state whether email should be sent through ShareFile SMTP server if custom SMTP server fails
		*/
	public void setShouldFallbackToShareFileSmtp(Boolean shouldfallbacktosharefilesmtp) {
		this.ShouldFallbackToShareFileSmtp = shouldfallbacktosharefilesmtp;
	}

}