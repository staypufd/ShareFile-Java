
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

public class SFCitrixCloudAccountInfo extends SFODataObject {

	@SerializedName("EnableCwc")
	private Boolean EnableCwc;
	@SerializedName("Subdomain")
	private String Subdomain;
	@SerializedName("CompanyName")
	private String CompanyName;
	@SerializedName("AccountId")
	private String AccountId;
	@SerializedName("AppControlPlane")
	private String AppControlPlane;
	@SerializedName("ApiControlPlane")
	private String ApiControlPlane;
	@SerializedName("IsDemo")
	private Boolean IsDemo;
	@SerializedName("CustomerOrgId")
	private String CustomerOrgId;

		/**
		* Indicates if EnableCWC is present on the account
		*/
	public Boolean getEnableCwc() {
		return this.EnableCwc;
	}

		/**
		* Indicates if EnableCWC is present on the account
		*/
	public void setEnableCwc(Boolean enablecwc) {
		this.EnableCwc = enablecwc;
	}
		/**
		* Primary (first) subdomain
		*/
	public String getSubdomain() {
		return this.Subdomain;
	}

		/**
		* Primary (first) subdomain
		*/
	public void setSubdomain(String subdomain) {
		this.Subdomain = subdomain;
	}
	public String getCompanyName() {
		return this.CompanyName;
	}

	public void setCompanyName(String companyname) {
		this.CompanyName = companyname;
	}
	public String getAccountId() {
		return this.AccountId;
	}

	public void setAccountId(String accountid) {
		this.AccountId = accountid;
	}
		/**
		* Account's website domain (eg, sharefile.eu)
		*/
	public String getAppControlPlane() {
		return this.AppControlPlane;
	}

		/**
		* Account's website domain (eg, sharefile.eu)
		*/
	public void setAppControlPlane(String appcontrolplane) {
		this.AppControlPlane = appcontrolplane;
	}
		/**
		* Account's api domain (eg, sf-api.edu)
		*/
	public String getApiControlPlane() {
		return this.ApiControlPlane;
	}

		/**
		* Account's api domain (eg, sf-api.edu)
		*/
	public void setApiControlPlane(String apicontrolplane) {
		this.ApiControlPlane = apicontrolplane;
	}
	public Boolean getIsDemo() {
		return this.IsDemo;
	}

	public void setIsDemo(Boolean isdemo) {
		this.IsDemo = isdemo;
	}
	public String getCustomerOrgId() {
		return this.CustomerOrgId;
	}

	public void setCustomerOrgId(String customerorgid) {
		this.CustomerOrgId = customerorgid;
	}

}