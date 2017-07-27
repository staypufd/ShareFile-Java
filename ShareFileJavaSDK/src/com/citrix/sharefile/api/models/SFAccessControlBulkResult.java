
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

public class SFAccessControlBulkResult extends SFODataObject {

	@SerializedName("SuccessEntities")
	private ArrayList<SFAccessControl> SuccessEntities;
	@SerializedName("FailedEntities")
	private ArrayList<SFAccessControlFailedEntry> FailedEntities;

		/**
		* A list of entities processed successfully
		*/
	public ArrayList<SFAccessControl> getSuccessEntities() {
		return this.SuccessEntities;
	}

		/**
		* A list of entities processed successfully
		*/
	public void setSuccessEntities(ArrayList<SFAccessControl> successentities) {
		this.SuccessEntities = successentities;
	}
		/**
		* A list of entities for which the operation failed
		*/
	public ArrayList<SFAccessControlFailedEntry> getFailedEntities() {
		return this.FailedEntities;
	}

		/**
		* A list of entities for which the operation failed
		*/
	public void setFailedEntities(ArrayList<SFAccessControlFailedEntry> failedentities) {
		this.FailedEntities = failedentities;
	}

}