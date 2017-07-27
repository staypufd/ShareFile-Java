
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

public class SFContactsSearchParams extends SFODataObject {

	@SerializedName("SearchText")
	private String SearchText;
	@SerializedName("FieldSelector")
	private SFSearchTextFieldSelectorFlags FieldSelector;
	@SerializedName("ListType")
	private SFSafeEnum<SFContactListType> ListType;
	@SerializedName("ListSelectionParams")
	private SFContactsListSelectionParams ListSelectionParams;

		/**
		* SearchText
		*/
	public String getSearchText() {
		return this.SearchText;
	}

		/**
		* SearchText
		*/
	public void setSearchText(String searchtext) {
		this.SearchText = searchtext;
	}
		/**
		* FieldSelector
		*/
	public SFSearchTextFieldSelectorFlags getFieldSelector() {
		return this.FieldSelector;
	}

		/**
		* FieldSelector
		*/
	public void setFieldSelector(SFSearchTextFieldSelectorFlags fieldselector) {
		this.FieldSelector = fieldselector;
	}
		/**
		* ListType. mutually exclusive with ListSelectionParams
		*/
	public SFSafeEnum<SFContactListType> getListType() {
		return this.ListType;
	}

		/**
		* ListType. mutually exclusive with ListSelectionParams
		*/
	public void setListType(SFSafeEnum<SFContactListType> listtype) {
		this.ListType = listtype;
	}
		/**
		* ListSelectionParams. mutually exclusive with ListType
		*/
	public SFContactsListSelectionParams getListSelectionParams() {
		return this.ListSelectionParams;
	}

		/**
		* ListSelectionParams. mutually exclusive with ListType
		*/
	public void setListSelectionParams(SFContactsListSelectionParams listselectionparams) {
		this.ListSelectionParams = listselectionparams;
	}

}