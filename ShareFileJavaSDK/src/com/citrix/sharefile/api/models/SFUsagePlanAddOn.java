
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

public class SFUsagePlanAddOn extends SFODataObject {

	@SerializedName("TypeCode")
	private String TypeCode;
	@SerializedName("Code")
	private String Code;
	@SerializedName("LimitingFactor")
	private SFSafeEnum<SFLimitingFactor> LimitingFactor;
	@SerializedName("LowerLimit")
	private Integer LowerLimit;
	@SerializedName("UpperLimit")
	private Integer UpperLimit;
	@SerializedName("Field")
	private SFSafeEnum<SFAddonField> Field;
	@SerializedName("Interval")
	private Integer Interval;
	@SerializedName("Price")
	private Double Price;
	@SerializedName("MonthlyPrice")
	private Double MonthlyPrice;
	@SerializedName("QuarterlyPrice")
	private Double QuarterlyPrice;
	@SerializedName("YearlyPrice")
	private Double YearlyPrice;
	@SerializedName("ProductClass")
	private String ProductClass;

	public String getTypeCode() {
		return this.TypeCode;
	}

	public void setTypeCode(String typecode) {
		this.TypeCode = typecode;
	}
	public String getCode() {
		return this.Code;
	}

	public void setCode(String code) {
		this.Code = code;
	}
	public SFSafeEnum<SFLimitingFactor> getLimitingFactor() {
		return this.LimitingFactor;
	}

	public void setLimitingFactor(SFSafeEnum<SFLimitingFactor> limitingfactor) {
		this.LimitingFactor = limitingfactor;
	}
	public Integer getLowerLimit() {
		return this.LowerLimit;
	}

	public void setLowerLimit(Integer lowerlimit) {
		this.LowerLimit = lowerlimit;
	}
	public Integer getUpperLimit() {
		return this.UpperLimit;
	}

	public void setUpperLimit(Integer upperlimit) {
		this.UpperLimit = upperlimit;
	}
	public SFSafeEnum<SFAddonField> getField() {
		return this.Field;
	}

	public void setField(SFSafeEnum<SFAddonField> field) {
		this.Field = field;
	}
	public Integer getInterval() {
		return this.Interval;
	}

	public void setInterval(Integer interval) {
		this.Interval = interval;
	}
	public Double getPrice() {
		return this.Price;
	}

	public void setPrice(Double price) {
		this.Price = price;
	}
	public Double getMonthlyPrice() {
		return this.MonthlyPrice;
	}

	public void setMonthlyPrice(Double monthlyprice) {
		this.MonthlyPrice = monthlyprice;
	}
	public Double getQuarterlyPrice() {
		return this.QuarterlyPrice;
	}

	public void setQuarterlyPrice(Double quarterlyprice) {
		this.QuarterlyPrice = quarterlyprice;
	}
	public Double getYearlyPrice() {
		return this.YearlyPrice;
	}

	public void setYearlyPrice(Double yearlyprice) {
		this.YearlyPrice = yearlyprice;
	}
	public String getProductClass() {
		return this.ProductClass;
	}

	public void setProductClass(String productclass) {
		this.ProductClass = productclass;
	}

}