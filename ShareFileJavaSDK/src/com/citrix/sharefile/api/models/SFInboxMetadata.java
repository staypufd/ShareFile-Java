
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

public class SFInboxMetadata extends SFODataObject {

	@SerializedName("UnreadSendUnarchived")
	private Integer UnreadSendUnarchived;
	@SerializedName("UnreadRequestUnarchived")
	private Integer UnreadRequestUnarchived;

	public Integer getUnreadSendUnarchived() {
		return this.UnreadSendUnarchived;
	}

	public void setUnreadSendUnarchived(Integer unreadsendunarchived) {
		this.UnreadSendUnarchived = unreadsendunarchived;
	}
	public Integer getUnreadRequestUnarchived() {
		return this.UnreadRequestUnarchived;
	}

	public void setUnreadRequestUnarchived(Integer unreadrequestunarchived) {
		this.UnreadRequestUnarchived = unreadrequestunarchived;
	}

}