






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


public class SFFreeTrialAccount extends SFAccount {



	@SerializedName("PromoCode")

	private String PromoCode;


	@SerializedName("EndDate")

	private Date EndDate;


	@SerializedName("IsValid")

	private Boolean IsValid;


	@SerializedName("ConversionType")

	private String ConversionType;


	@SerializedName("HasFollowedUp")

	private Boolean HasFollowedUp;


	@SerializedName("FollowUpDate")

	private Date FollowUpDate;


	@SerializedName("CancellationReason")

	private String CancellationReason;


	@SerializedName("SignupProcess")

	private String SignupProcess;


	@SerializedName("ConversionIndexDay7")

	private Double ConversionIndexDay7;


	@SerializedName("ConversionIndexDay14")

	private Double ConversionIndexDay14;


	@SerializedName("LTVIndex")

	private Double LTVIndex;


	@SerializedName("AllSources")

	private String AllSources;


	@SerializedName("ReferralID")

	private String ReferralID;


	@SerializedName("TrialTypeID")

	private Integer TrialTypeID;


	@SerializedName("InitialCallRepID")

	private String InitialCallRepID;


	@SerializedName("InitialCallDate")

	private Date InitialCallDate;


	@SerializedName("DemoStatus")

	private Integer DemoStatus;


	@SerializedName("DemoDate")

	private Date DemoDate;


	@SerializedName("MarketoID")

	private String MarketoID;




	public String getPromoCode() {
		return PromoCode;
	}


	public void setPromoCode(String promocode) {
		PromoCode = promocode;
	}


	public Date getEndDate() {
		return EndDate;
	}


	public void setEndDate(Date enddate) {
		EndDate = enddate;
	}


	public Boolean getIsValid() {
		return IsValid;
	}


	public void setIsValid(Boolean isvalid) {
		IsValid = isvalid;
	}


	public String getConversionType() {
		return ConversionType;
	}


	public void setConversionType(String conversiontype) {
		ConversionType = conversiontype;
	}


	public Boolean getHasFollowedUp() {
		return HasFollowedUp;
	}


	public void setHasFollowedUp(Boolean hasfollowedup) {
		HasFollowedUp = hasfollowedup;
	}


	public Date getFollowUpDate() {
		return FollowUpDate;
	}


	public void setFollowUpDate(Date followupdate) {
		FollowUpDate = followupdate;
	}


	public String getCancellationReason() {
		return CancellationReason;
	}


	public void setCancellationReason(String cancellationreason) {
		CancellationReason = cancellationreason;
	}


	public String getSignupProcess() {
		return SignupProcess;
	}


	public void setSignupProcess(String signupprocess) {
		SignupProcess = signupprocess;
	}


	public Double getConversionIndexDay7() {
		return ConversionIndexDay7;
	}


	public void setConversionIndexDay7(Double conversionindexday7) {
		ConversionIndexDay7 = conversionindexday7;
	}


	public Double getConversionIndexDay14() {
		return ConversionIndexDay14;
	}


	public void setConversionIndexDay14(Double conversionindexday14) {
		ConversionIndexDay14 = conversionindexday14;
	}


	public Double getLTVIndex() {
		return LTVIndex;
	}


	public void setLTVIndex(Double ltvindex) {
		LTVIndex = ltvindex;
	}


	public String getAllSources() {
		return AllSources;
	}


	public void setAllSources(String allsources) {
		AllSources = allsources;
	}


	public String getReferralID() {
		return ReferralID;
	}


	public void setReferralID(String referralid) {
		ReferralID = referralid;
	}


	public Integer getTrialTypeID() {
		return TrialTypeID;
	}


	public void setTrialTypeID(Integer trialtypeid) {
		TrialTypeID = trialtypeid;
	}


	public String getInitialCallRepID() {
		return InitialCallRepID;
	}


	public void setInitialCallRepID(String initialcallrepid) {
		InitialCallRepID = initialcallrepid;
	}


	public Date getInitialCallDate() {
		return InitialCallDate;
	}


	public void setInitialCallDate(Date initialcalldate) {
		InitialCallDate = initialcalldate;
	}


	public Integer getDemoStatus() {
		return DemoStatus;
	}


	public void setDemoStatus(Integer demostatus) {
		DemoStatus = demostatus;
	}


	public Date getDemoDate() {
		return DemoDate;
	}


	public void setDemoDate(Date demodate) {
		DemoDate = demodate;
	}


	public String getMarketoID() {
		return MarketoID;
	}


	public void setMarketoID(String marketoid) {
		MarketoID = marketoid;
	}

}