






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

import com.google.gson.annotations.SerializedName;


public class SFUserInfo extends SFODataObject {



	@SerializedName("CompanyName")

	private String CompanyName;


	@SerializedName("PlanName")

	private String PlanName;


	@SerializedName("PlanFeatures")

	private SFPlanFeatures PlanFeatures;


	@SerializedName("ApplicationUrl")

	private String ApplicationUrl;


	@SerializedName("StorageCenterUrl")

	private String StorageCenterUrl;




	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyname) {
		CompanyName = companyname;
	}


	public String getPlanName() {
		return PlanName;
	}


	public void setPlanName(String planname) {
		PlanName = planname;
	}


	public SFPlanFeatures getPlanFeatures() {
		return PlanFeatures;
	}


	public void setPlanFeatures(SFPlanFeatures planfeatures) {
		PlanFeatures = planfeatures;
	}


	public String getApplicationUrl() {
		return ApplicationUrl;
	}


	public void setApplicationUrl(String applicationurl) {
		ApplicationUrl = applicationurl;
	}


	public String getStorageCenterUrl() {
		return StorageCenterUrl;
	}


	public void setStorageCenterUrl(String storagecenterurl) {
		StorageCenterUrl = storagecenterurl;
	}

}