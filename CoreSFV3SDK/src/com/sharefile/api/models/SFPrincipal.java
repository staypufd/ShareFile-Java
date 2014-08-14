
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

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFPrincipal extends SFODataObject {

	@SerializedName("Name")
	private String Name;
	@SerializedName("Email")
	private String Email;
	@SerializedName("Username")
	private String Username;
	@SerializedName("Domain")
	private String Domain;

		/**
		* User name
		*/
	public String getName() {
		return this.Name;
	}

		/**
		* User name
		*/
	public void setName(String name) {
		this.Name = name;
	}
		/**
		* Email address
		*/
	public String getEmail() {
		return this.Email;
	}

		/**
		* Email address
		*/
	public void setEmail(String email) {
		this.Email = email;
	}
		/**
		* Username for the account - the value used for login. This is the same as Email for ShareFile accounts, but
		* may be different on Connectors
		*/
	public String getUsername() {
		return this.Username;
	}

		/**
		* Username for the account - the value used for login. This is the same as Email for ShareFile accounts, but
		* may be different on Connectors
		*/
	public void setUsername(String username) {
		this.Username = username;
	}
		/**
		* Account domain
		*/
	public String getDomain() {
		return this.Domain;
	}

		/**
		* Account domain
		*/
	public void setDomain(String domain) {
		this.Domain = domain;
	}

}