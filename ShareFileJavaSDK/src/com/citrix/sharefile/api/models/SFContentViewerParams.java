
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

public class SFContentViewerParams extends SFODataObject {

	@SerializedName("DocumentViewId")
	private String DocumentViewId;
	@SerializedName("ViewOnly")
	private Boolean ViewOnly;
	@SerializedName("Watermark")
	private String Watermark;

	public String getDocumentViewId() {
		return this.DocumentViewId;
	}

	public void setDocumentViewId(String documentviewid) {
		this.DocumentViewId = documentviewid;
	}
	public Boolean getViewOnly() {
		return this.ViewOnly;
	}

	public void setViewOnly(Boolean viewonly) {
		this.ViewOnly = viewonly;
	}
	public String getWatermark() {
		return this.Watermark;
	}

	public void setWatermark(String watermark) {
		this.Watermark = watermark;
	}

}