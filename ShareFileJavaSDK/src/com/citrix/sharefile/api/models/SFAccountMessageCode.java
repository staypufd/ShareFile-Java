
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

public class SFAccountMessageCode extends SFODataObject {

	@SerializedName("AccountType")
	private String AccountType;
	@SerializedName("MessageType")
	private String MessageType;
	@SerializedName("CancelDate")
	private Date CancelDate;

	public String getAccountType() {
		return this.AccountType;
	}

	public void setAccountType(String accounttype) {
		this.AccountType = accounttype;
	}
	public String getMessageType() {
		return this.MessageType;
	}

	public void setMessageType(String messagetype) {
		this.MessageType = messagetype;
	}
	public Date getCancelDate() {
		return this.CancelDate;
	}

	public void setCancelDate(Date canceldate) {
		this.CancelDate = canceldate;
	}

}