
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

public class SFSearchTextFieldSelector extends SFODataObject {

	@SerializedName("FirstName")
	private SFSearchField FirstName;
	@SerializedName("LastName")
	private SFSearchField LastName;
	@SerializedName("Email")
	private SFSearchField Email;
	@SerializedName("Company")
	private SFSearchField Company;

		/**
		* FirstName
		*/
	public SFSearchField getFirstName() {
		return this.FirstName;
	}

		/**
		* FirstName
		*/
	public void setFirstName(SFSearchField firstname) {
		this.FirstName = firstname;
	}
		/**
		* LastName
		*/
	public SFSearchField getLastName() {
		return this.LastName;
	}

		/**
		* LastName
		*/
	public void setLastName(SFSearchField lastname) {
		this.LastName = lastname;
	}
		/**
		* Email
		*/
	public SFSearchField getEmail() {
		return this.Email;
	}

		/**
		* Email
		*/
	public void setEmail(SFSearchField email) {
		this.Email = email;
	}
		/**
		* Company
		*/
	public SFSearchField getCompany() {
		return this.Company;
	}

		/**
		* Company
		*/
	public void setCompany(SFSearchField company) {
		this.Company = company;
	}

}