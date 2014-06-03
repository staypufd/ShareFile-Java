
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

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFFolder extends SFItem {

	@SerializedName("FileCount")
	private Integer FileCount;
	@SerializedName("Children")
	private ArrayList<SFItem> Children;
	@SerializedName("HasRemoteChildren")
	private Boolean HasRemoteChildren;
	@SerializedName("Info")
	private SFItemInfo Info;
	@SerializedName("Redirection")
	private SFRedirection Redirection;

	public Integer getFileCount() {
		return FileCount;
	}

	public void setFileCount(Integer filecount) {
		FileCount = filecount;
	}
	public ArrayList<SFItem> getChildren() {
		return Children;
	}

	public void setChildren(ArrayList<SFItem> children) {
		Children = children;
	}
	public Boolean getHasRemoteChildren() {
		return HasRemoteChildren;
	}

	public void setHasRemoteChildren(Boolean hasremotechildren) {
		HasRemoteChildren = hasremotechildren;
	}
	public SFItemInfo getInfo() {
		return Info;
	}

	public void setInfo(SFItemInfo info) {
		Info = info;
	}
	public SFRedirection getRedirection() {
		return Redirection;
	}

	public void setRedirection(SFRedirection redirection) {
		Redirection = redirection;
	}
}