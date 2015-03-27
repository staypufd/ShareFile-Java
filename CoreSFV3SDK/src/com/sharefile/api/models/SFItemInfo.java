
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2015 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.*;
import com.sharefile.api.enumerations.*;
import com.sharefile.api.models.*;

public class SFItemInfo extends SFODataObject {

	@SerializedName("CurrentAccessControl")
	private SFAccessControl CurrentAccessControl;
	@SerializedName("HasVroot")
	private Boolean HasVroot;
	@SerializedName("IsSystemRoot")
	private Boolean IsSystemRoot;
	@SerializedName("IsAccountRoot")
	private Boolean IsAccountRoot;
	@SerializedName("IsVRoot")
	private Boolean IsVRoot;
	@SerializedName("IsMyFolders")
	private Boolean IsMyFolders;
	@SerializedName("IsAHomeFolder")
	private Boolean IsAHomeFolder;
	@SerializedName("IsMyHomeFolder")
	private Boolean IsMyHomeFolder;
	@SerializedName("IsAStartFolder")
	private Boolean IsAStartFolder;
	@SerializedName("IsSharedFolder")
	private Boolean IsSharedFolder;
	@SerializedName("IsPassthrough")
	private Boolean IsPassthrough;
	@SerializedName("IsVersioned")
	private Boolean IsVersioned;
	@SerializedName("CanAddFolder")
	private Boolean CanAddFolder;
	@SerializedName("CanAddNode")
	private Boolean CanAddNode;
	@SerializedName("CanView")
	private Boolean CanView;
	@SerializedName("CanDownload")
	private Boolean CanDownload;
	@SerializedName("CanWatermarkDownload")
	private Boolean CanWatermarkDownload;
	@SerializedName("CanDocViewerPrint")
	private Boolean CanDocViewerPrint;
	@SerializedName("CanUpload")
	private Boolean CanUpload;
	@SerializedName("CanSend")
	private Boolean CanSend;
	@SerializedName("CanDeleteCurrentItem")
	private Boolean CanDeleteCurrentItem;
	@SerializedName("CanDeleteChildItems")
	private Boolean CanDeleteChildItems;
	@SerializedName("CanManagePermissions")
	private Boolean CanManagePermissions;
	@SerializedName("CanEditFolderOpts")
	private Boolean CanEditFolderOpts;
	@SerializedName("FolderPayID")
	private String FolderPayID;
	@SerializedName("ShowFolderPayBuyButton")
	private Boolean ShowFolderPayBuyButton;
	@SerializedName("TreeMode")
	private SFSafeEnum<SFTreeMode> TreeMode;
	@SerializedName("TreeModeOperationAllowed")
	private Boolean TreeModeOperationAllowed;
	@SerializedName("TreeModeSourceId")
	private String TreeModeSourceId;
	@SerializedName("ForcedSortField")
	private String ForcedSortField;
	@SerializedName("ForcedSortOrder")
	private String ForcedSortOrder;
	@SerializedName("SortField")
	private SFSafeEnum<SFSortField> SortField;
	@SerializedName("SortDirection")
	private SFSafeEnum<SFSortDirection> SortDirection;

	public SFAccessControl getCurrentAccessControl() {
		return this.CurrentAccessControl;
	}

	public void setCurrentAccessControl(SFAccessControl currentaccesscontrol) {
		this.CurrentAccessControl = currentaccesscontrol;
	}
	public Boolean getHasVroot() {
		return this.HasVroot;
	}

	public void setHasVroot(Boolean hasvroot) {
		this.HasVroot = hasvroot;
	}
	public Boolean getIsSystemRoot() {
		return this.IsSystemRoot;
	}

	public void setIsSystemRoot(Boolean issystemroot) {
		this.IsSystemRoot = issystemroot;
	}
	public Boolean getIsAccountRoot() {
		return this.IsAccountRoot;
	}

	public void setIsAccountRoot(Boolean isaccountroot) {
		this.IsAccountRoot = isaccountroot;
	}
	public Boolean getIsVRoot() {
		return this.IsVRoot;
	}

	public void setIsVRoot(Boolean isvroot) {
		this.IsVRoot = isvroot;
	}
	public Boolean getIsMyFolders() {
		return this.IsMyFolders;
	}

	public void setIsMyFolders(Boolean ismyfolders) {
		this.IsMyFolders = ismyfolders;
	}
	public Boolean getIsAHomeFolder() {
		return this.IsAHomeFolder;
	}

	public void setIsAHomeFolder(Boolean isahomefolder) {
		this.IsAHomeFolder = isahomefolder;
	}
	public Boolean getIsMyHomeFolder() {
		return this.IsMyHomeFolder;
	}

	public void setIsMyHomeFolder(Boolean ismyhomefolder) {
		this.IsMyHomeFolder = ismyhomefolder;
	}
	public Boolean getIsAStartFolder() {
		return this.IsAStartFolder;
	}

	public void setIsAStartFolder(Boolean isastartfolder) {
		this.IsAStartFolder = isastartfolder;
	}
	public Boolean getIsSharedFolder() {
		return this.IsSharedFolder;
	}

	public void setIsSharedFolder(Boolean issharedfolder) {
		this.IsSharedFolder = issharedfolder;
	}
	public Boolean getIsPassthrough() {
		return this.IsPassthrough;
	}

	public void setIsPassthrough(Boolean ispassthrough) {
		this.IsPassthrough = ispassthrough;
	}
	public Boolean getIsVersioned() {
		return this.IsVersioned;
	}

	public void setIsVersioned(Boolean isversioned) {
		this.IsVersioned = isversioned;
	}
	public Boolean getCanAddFolder() {
		return this.CanAddFolder;
	}

	public void setCanAddFolder(Boolean canaddfolder) {
		this.CanAddFolder = canaddfolder;
	}
	public Boolean getCanAddNode() {
		return this.CanAddNode;
	}

	public void setCanAddNode(Boolean canaddnode) {
		this.CanAddNode = canaddnode;
	}
	public Boolean getCanView() {
		return this.CanView;
	}

	public void setCanView(Boolean canview) {
		this.CanView = canview;
	}
	public Boolean getCanDownload() {
		return this.CanDownload;
	}

	public void setCanDownload(Boolean candownload) {
		this.CanDownload = candownload;
	}
	public Boolean getCanWatermarkDownload() {
		return this.CanWatermarkDownload;
	}

	public void setCanWatermarkDownload(Boolean canwatermarkdownload) {
		this.CanWatermarkDownload = canwatermarkdownload;
	}
	public Boolean getCanDocViewerPrint() {
		return this.CanDocViewerPrint;
	}

	public void setCanDocViewerPrint(Boolean candocviewerprint) {
		this.CanDocViewerPrint = candocviewerprint;
	}
	public Boolean getCanUpload() {
		return this.CanUpload;
	}

	public void setCanUpload(Boolean canupload) {
		this.CanUpload = canupload;
	}
	public Boolean getCanSend() {
		return this.CanSend;
	}

	public void setCanSend(Boolean cansend) {
		this.CanSend = cansend;
	}
	public Boolean getCanDeleteCurrentItem() {
		return this.CanDeleteCurrentItem;
	}

	public void setCanDeleteCurrentItem(Boolean candeletecurrentitem) {
		this.CanDeleteCurrentItem = candeletecurrentitem;
	}
	public Boolean getCanDeleteChildItems() {
		return this.CanDeleteChildItems;
	}

	public void setCanDeleteChildItems(Boolean candeletechilditems) {
		this.CanDeleteChildItems = candeletechilditems;
	}
	public Boolean getCanManagePermissions() {
		return this.CanManagePermissions;
	}

	public void setCanManagePermissions(Boolean canmanagepermissions) {
		this.CanManagePermissions = canmanagepermissions;
	}
	public Boolean getCanEditFolderOpts() {
		return this.CanEditFolderOpts;
	}

	public void setCanEditFolderOpts(Boolean caneditfolderopts) {
		this.CanEditFolderOpts = caneditfolderopts;
	}
	public String getFolderPayID() {
		return this.FolderPayID;
	}

	public void setFolderPayID(String folderpayid) {
		this.FolderPayID = folderpayid;
	}
	public Boolean getShowFolderPayBuyButton() {
		return this.ShowFolderPayBuyButton;
	}

	public void setShowFolderPayBuyButton(Boolean showfolderpaybuybutton) {
		this.ShowFolderPayBuyButton = showfolderpaybuybutton;
	}
	public SFSafeEnum<SFTreeMode> getTreeMode() {
		return this.TreeMode;
	}

	public void setTreeMode(SFSafeEnum<SFTreeMode> treemode) {
		this.TreeMode = treemode;
	}
	public Boolean getTreeModeOperationAllowed() {
		return this.TreeModeOperationAllowed;
	}

	public void setTreeModeOperationAllowed(Boolean treemodeoperationallowed) {
		this.TreeModeOperationAllowed = treemodeoperationallowed;
	}
	public String getTreeModeSourceId() {
		return this.TreeModeSourceId;
	}

	public void setTreeModeSourceId(String treemodesourceid) {
		this.TreeModeSourceId = treemodesourceid;
	}
	public String getForcedSortField() {
		return this.ForcedSortField;
	}

	public void setForcedSortField(String forcedsortfield) {
		this.ForcedSortField = forcedsortfield;
	}
	public String getForcedSortOrder() {
		return this.ForcedSortOrder;
	}

	public void setForcedSortOrder(String forcedsortorder) {
		this.ForcedSortOrder = forcedsortorder;
	}
	public SFSafeEnum<SFSortField> getSortField() {
		return this.SortField;
	}

	public void setSortField(SFSafeEnum<SFSortField> sortfield) {
		this.SortField = sortfield;
	}
	public SFSafeEnum<SFSortDirection> getSortDirection() {
		return this.SortDirection;
	}

	public void setSortDirection(SFSafeEnum<SFSortDirection> sortdirection) {
		this.SortDirection = sortdirection;
	}

}