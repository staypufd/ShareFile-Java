
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

public class SFMetadataTag extends SFMetadata {

	@SerializedName("InternalName")
	private String InternalName;
	@SerializedName("DefaultValue")
	private String DefaultValue;
	@SerializedName("FieldType")
	private SFSafeEnum<SFMetadataTagType> FieldType;
	@SerializedName("IsHidden")
	private Boolean IsHidden;
	@SerializedName("IsRequired")
	private Boolean IsRequired;
	@SerializedName("AllowUserInput")
	private Boolean AllowUserInput;
	@SerializedName("AllowMultipleValues")
	private Boolean AllowMultipleValues;
	@SerializedName("MaxLength")
	private Integer MaxLength;
	@SerializedName("LocaleId")
	private Integer LocaleId;
	@SerializedName("MinimumValue")
	private String MinimumValue;
	@SerializedName("MaximumValue")
	private String MaximumValue;
	@SerializedName("DecimalPlaces")
	private Integer DecimalPlaces;
	@SerializedName("IsPercentage")
	private Boolean IsPercentage;
	@SerializedName("ContentTypes")
	private ArrayList<String> ContentTypes;
	@SerializedName("DateFormat")
	private String DateFormat;
	@SerializedName("Values")
	private ArrayList<String> Values;

		/**
		* Internal name of the tag (which is not displayed to user)
		*/
	public String getInternalName() {
		return this.InternalName;
	}

		/**
		* Internal name of the tag (which is not displayed to user)
		*/
	public void setInternalName(String internalname) {
		this.InternalName = internalname;
	}
		/**
		* Default value of the Metadata Tag (or column)
		*/
	public String getDefaultValue() {
		return this.DefaultValue;
	}

		/**
		* Default value of the Metadata Tag (or column)
		*/
	public void setDefaultValue(String defaultvalue) {
		this.DefaultValue = defaultvalue;
	}
		/**
		* Type of Metadata Tag
		*/
	public SFSafeEnum<SFMetadataTagType> getFieldType() {
		return this.FieldType;
	}

		/**
		* Type of Metadata Tag
		*/
	public void setFieldType(SFSafeEnum<SFMetadataTagType> fieldtype) {
		this.FieldType = fieldtype;
	}
		/**
		* Check to determine if the tag is hidden from being displayed
		*/
	public Boolean getIsHidden() {
		return this.IsHidden;
	}

		/**
		* Check to determine if the tag is hidden from being displayed
		*/
	public void setIsHidden(Boolean ishidden) {
		this.IsHidden = ishidden;
	}
		/**
		* Check to determine if the tag should contain a value
		*/
	public Boolean getIsRequired() {
		return this.IsRequired;
	}

		/**
		* Check to determine if the tag should contain a value
		*/
	public void setIsRequired(Boolean isrequired) {
		this.IsRequired = isrequired;
	}
		/**
		* Check to determine if the tag allows users to create custom input
		*/
	public Boolean getAllowUserInput() {
		return this.AllowUserInput;
	}

		/**
		* Check to determine if the tag allows users to create custom input
		*/
	public void setAllowUserInput(Boolean allowuserinput) {
		this.AllowUserInput = allowuserinput;
	}
		/**
		* Check to determine if the tag allows selection / assignment of multiple values
		*/
	public Boolean getAllowMultipleValues() {
		return this.AllowMultipleValues;
	}

		/**
		* Check to determine if the tag allows selection / assignment of multiple values
		*/
	public void setAllowMultipleValues(Boolean allowmultiplevalues) {
		this.AllowMultipleValues = allowmultiplevalues;
	}
		/**
		* Maximum length of the tag value in case the tag is of type string
		*/
	public Integer getMaxLength() {
		return this.MaxLength;
	}

		/**
		* Maximum length of the tag value in case the tag is of type string
		*/
	public void setMaxLength(Integer maxlength) {
		this.MaxLength = maxlength;
	}
		/**
		* Current User locale id (e.g. 1033 for en-US)
		*/
	public Integer getLocaleId() {
		return this.LocaleId;
	}

		/**
		* Current User locale id (e.g. 1033 for en-US)
		*/
	public void setLocaleId(Integer localeid) {
		this.LocaleId = localeid;
	}
		/**
		* Allowable minimum value for the tag
		*/
	public String getMinimumValue() {
		return this.MinimumValue;
	}

		/**
		* Allowable minimum value for the tag
		*/
	public void setMinimumValue(String minimumvalue) {
		this.MinimumValue = minimumvalue;
	}
		/**
		* Allowable maximum value for the tag
		*/
	public String getMaximumValue() {
		return this.MaximumValue;
	}

		/**
		* Allowable maximum value for the tag
		*/
	public void setMaximumValue(String maximumvalue) {
		this.MaximumValue = maximumvalue;
	}
		/**
		* Allowable number of decimal places for a number field
		*/
	public Integer getDecimalPlaces() {
		return this.DecimalPlaces;
	}

		/**
		* Allowable number of decimal places for a number field
		*/
	public void setDecimalPlaces(Integer decimalplaces) {
		this.DecimalPlaces = decimalplaces;
	}
		/**
		* Check to determine if a number is represented as a percentage
		*/
	public Boolean getIsPercentage() {
		return this.IsPercentage;
	}

		/**
		* Check to determine if a number is represented as a percentage
		*/
	public void setIsPercentage(Boolean ispercentage) {
		this.IsPercentage = ispercentage;
	}
		/**
		* The name of the content type associated with the tag
		*/
	public ArrayList<String> getContentTypes() {
		return this.ContentTypes;
	}

		/**
		* The name of the content type associated with the tag
		*/
	public void setContentTypes(ArrayList<String> contenttypes) {
		this.ContentTypes = contenttypes;
	}
		/**
		* Date format of the field (if applicable)
		*/
	public String getDateFormat() {
		return this.DateFormat;
	}

		/**
		* Date format of the field (if applicable)
		*/
	public void setDateFormat(String dateformat) {
		this.DateFormat = dateformat;
	}
		/**
		* List of custom metadata values, used only if the tag allows multiple values
		*/
	public ArrayList<String> getValues() {
		return this.Values;
	}

		/**
		* List of custom metadata values, used only if the tag allows multiple values
		*/
	public void setValues(ArrayList<String> values) {
		this.Values = values;
	}

}