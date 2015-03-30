
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

public class SFShare extends SFODataObject {

	@SerializedName("AliasID")
	private String AliasID;
	@SerializedName("ShareType")
	private SFSafeEnum<SFShareType> ShareType;
	@SerializedName("Title")
	private String Title;
	@SerializedName("HasSentMessage")
	private Boolean HasSentMessage;
	@SerializedName("SentMessageTitle")
	private String SentMessageTitle;
	@SerializedName("RequireLogin")
	private Boolean RequireLogin;
	@SerializedName("RequireUserInfo")
	private Boolean RequireUserInfo;
	@SerializedName("Parent")
	private SFItem Parent;
	@SerializedName("Creator")
	private SFUser Creator;
	@SerializedName("User")
	private SFUser User;
	@SerializedName("Items")
	private ArrayList<SFItem> Items;
	@SerializedName("CreationDate")
	private Date CreationDate;
	@SerializedName("ExpirationDate")
	private Date ExpirationDate;
	@SerializedName("MaxDownloads")
	private Integer MaxDownloads;
	@SerializedName("TotalDownloads")
	private Integer TotalDownloads;
	@SerializedName("IsViewOnly")
	private Boolean IsViewOnly;
	@SerializedName("TrackUntilDate")
	private Date TrackUntilDate;
	@SerializedName("SendFrequency")
	private Integer SendFrequency;
	@SerializedName("SendInterval")
	private Integer SendInterval;
	@SerializedName("LastDateSent")
	private Date LastDateSent;
	@SerializedName("IsConsumed")
	private Boolean IsConsumed;
	@SerializedName("IsRead")
	private Boolean IsRead;
	@SerializedName("IsArchived")
	private Boolean IsArchived;
	@SerializedName("SendTool")
	private String SendTool;
	@SerializedName("SendMethod")
	private String SendMethod;
	@SerializedName("UsesStreamIDs")
	private Boolean UsesStreamIDs;
	@SerializedName("Uri")
	private URI Uri;
	@SerializedName("Recipients")
	private ArrayList<SFShareAlias> Recipients;
	@SerializedName("Zone")
	private SFZone Zone;
	@SerializedName("Signature")
	private String Signature;
	@SerializedName("HasRemoteChildren")
	private Boolean HasRemoteChildren;
	@SerializedName("Redirection")
	private SFRedirection Redirection;
	@SerializedName("ShareSubType")
	private SFSafeEnum<SFShareSubType> ShareSubType;
	@SerializedName("ShareItemHistory")
	private ArrayList<SFShareItemHistory> ShareItemHistory;
	@SerializedName("Settings")
	private SFShareSettings Settings;

		/**
		* When a Share is sent to multiple users, with RequireLogin or RequireUserInfo set, then a different
		* Share Alias is created for each user. The email ShareFile sends to these users will contain different
		* AliasIDs, allowing ShareFile to track the user activity on the share.
		* For anonymous Shares, the AliasID will be the same as the Share ID.
		*/
	public String getAliasID() {
		return this.AliasID;
	}

		/**
		* When a Share is sent to multiple users, with RequireLogin or RequireUserInfo set, then a different
		* Share Alias is created for each user. The email ShareFile sends to these users will contain different
		* AliasIDs, allowing ShareFile to track the user activity on the share.
		* For anonymous Shares, the AliasID will be the same as the Share ID.
		*/
	public void setAliasID(String aliasid) {
		this.AliasID = aliasid;
	}
		/**
		* Either "Send" or "Request". Send Shares are used to Send files and folders to the specified users. Request
		* shares are used to allow users to upload files to the share owner chosen location.
		*/
	public SFSafeEnum<SFShareType> getShareType() {
		return this.ShareType;
	}

		/**
		* Either "Send" or "Request". Send Shares are used to Send files and folders to the specified users. Request
		* shares are used to allow users to upload files to the share owner chosen location.
		*/
	public void setShareType(SFSafeEnum<SFShareType> sharetype) {
		this.ShareType = sharetype;
	}
		/**
		* Share title
		*/
	public String getTitle() {
		return this.Title;
	}

		/**
		* Share title
		*/
	public void setTitle(String title) {
		this.Title = title;
	}
		/**
		* Flag to indicate if ShareFile has sent email messages for this Share
		*/
	public Boolean getHasSentMessage() {
		return this.HasSentMessage;
	}

		/**
		* Flag to indicate if ShareFile has sent email messages for this Share
		*/
	public void setHasSentMessage(Boolean hassentmessage) {
		this.HasSentMessage = hassentmessage;
	}
		/**
		* Subject of Share email message
		*/
	public String getSentMessageTitle() {
		return this.SentMessageTitle;
	}

		/**
		* Subject of Share email message
		*/
	public void setSentMessageTitle(String sentmessagetitle) {
		this.SentMessageTitle = sentmessagetitle;
	}
		/**
		* If set, only authenticated users can download files from this share.
		*/
	public Boolean getRequireLogin() {
		return this.RequireLogin;
	}

		/**
		* If set, only authenticated users can download files from this share.
		*/
	public void setRequireLogin(Boolean requirelogin) {
		this.RequireLogin = requirelogin;
	}
		/**
		* If set, users must provide Name, Email and Company information to download files from the share.
		*/
	public Boolean getRequireUserInfo() {
		return this.RequireUserInfo;
	}

		/**
		* If set, users must provide Name, Email and Company information to download files from the share.
		*/
	public void setRequireUserInfo(Boolean requireuserinfo) {
		this.RequireUserInfo = requireuserinfo;
	}
		/**
		* Folder location that contain the share files (Send); or the folder were files will be uploaded to
		* (Request).
		*/
	public SFItem getParent() {
		return this.Parent;
	}

		/**
		* Folder location that contain the share files (Send); or the folder were files will be uploaded to
		* (Request).
		*/
	public void setParent(SFItem parent) {
		this.Parent = parent;
	}
		/**
		* User that created this Share.
		*/
	public SFUser getCreator() {
		return this.Creator;
	}

		/**
		* User that created this Share.
		*/
	public void setCreator(SFUser creator) {
		this.Creator = creator;
	}
		/**
		* User given permission to use this share - used for Aliases.
		*/
	public SFUser getUser() {
		return this.User;
	}

		/**
		* User given permission to use this share - used for Aliases.
		*/
	public void setUser(SFUser user) {
		this.User = user;
	}
		/**
		* List of shared Items (for Send Shares only)
		*/
	public ArrayList<SFItem> getItems() {
		return this.Items;
	}

		/**
		* List of shared Items (for Send Shares only)
		*/
	public void setItems(ArrayList<SFItem> items) {
		this.Items = items;
	}
		/**
		* Date the share was created
		*/
	public Date getCreationDate() {
		return this.CreationDate;
	}

		/**
		* Date the share was created
		*/
	public void setCreationDate(Date creationdate) {
		this.CreationDate = creationdate;
	}
		/**
		* Date the share expires
		*/
	public Date getExpirationDate() {
		return this.ExpirationDate;
	}

		/**
		* Date the share expires
		*/
	public void setExpirationDate(Date expirationdate) {
		this.ExpirationDate = expirationdate;
	}
		/**
		* Maximum number of downloads each user can perform.
		*/
	public Integer getMaxDownloads() {
		return this.MaxDownloads;
	}

		/**
		* Maximum number of downloads each user can perform.
		*/
	public void setMaxDownloads(Integer maxdownloads) {
		this.MaxDownloads = maxdownloads;
	}
	public Integer getTotalDownloads() {
		return this.TotalDownloads;
	}

	public void setTotalDownloads(Integer totaldownloads) {
		this.TotalDownloads = totaldownloads;
	}
		/**
		* Used for Virtual Data Room accounts - indicates the files in the share can only be
		* downloaded with an applied watermark.
		*/
	public Boolean getIsViewOnly() {
		return this.IsViewOnly;
	}

		/**
		* Used for Virtual Data Room accounts - indicates the files in the share can only be
		* downloaded with an applied watermark.
		*/
	public void setIsViewOnly(Boolean isviewonly) {
		this.IsViewOnly = isviewonly;
	}
		/**
		* User activity on this share will be tracked up to this date.
		*/
	public Date getTrackUntilDate() {
		return this.TrackUntilDate;
	}

		/**
		* User activity on this share will be tracked up to this date.
		*/
	public void setTrackUntilDate(Date trackuntildate) {
		this.TrackUntilDate = trackuntildate;
	}
	public Integer getSendFrequency() {
		return this.SendFrequency;
	}

	public void setSendFrequency(Integer sendfrequency) {
		this.SendFrequency = sendfrequency;
	}
	public Integer getSendInterval() {
		return this.SendInterval;
	}

	public void setSendInterval(Integer sendinterval) {
		this.SendInterval = sendinterval;
	}
	public Date getLastDateSent() {
		return this.LastDateSent;
	}

	public void setLastDateSent(Date lastdatesent) {
		this.LastDateSent = lastdatesent;
	}
	public Boolean getIsConsumed() {
		return this.IsConsumed;
	}

	public void setIsConsumed(Boolean isconsumed) {
		this.IsConsumed = isconsumed;
	}
	public Boolean getIsRead() {
		return this.IsRead;
	}

	public void setIsRead(Boolean isread) {
		this.IsRead = isread;
	}
	public Boolean getIsArchived() {
		return this.IsArchived;
	}

	public void setIsArchived(Boolean isarchived) {
		this.IsArchived = isarchived;
	}
	public String getSendTool() {
		return this.SendTool;
	}

	public void setSendTool(String sendtool) {
		this.SendTool = sendtool;
	}
	public String getSendMethod() {
		return this.SendMethod;
	}

	public void setSendMethod(String sendmethod) {
		this.SendMethod = sendmethod;
	}
		/**
		* When enabled the items are identified by stream IDs instead of item IDs.
		* Applies to Send Shares only.
		*/
	public Boolean getUsesStreamIDs() {
		return this.UsesStreamIDs;
	}

		/**
		* When enabled the items are identified by stream IDs instead of item IDs.
		* Applies to Send Shares only.
		*/
	public void setUsesStreamIDs(Boolean usesstreamids) {
		this.UsesStreamIDs = usesstreamids;
	}
		/**
		* Uri to access the share through the Web portal
		*/
	public URI getUri() {
		return this.Uri;
	}

		/**
		* Uri to access the share through the Web portal
		*/
	public void setUri(URI uri) {
		this.Uri = uri;
	}
		/**
		* List of users that have access to this share.
		*/
	public ArrayList<SFShareAlias> getRecipients() {
		return this.Recipients;
	}

		/**
		* List of users that have access to this share.
		*/
	public void setRecipients(ArrayList<SFShareAlias> recipients) {
		this.Recipients = recipients;
	}
		/**
		* The Storage Zone that contains this Share.
		*/
	public SFZone getZone() {
		return this.Zone;
	}

		/**
		* The Storage Zone that contains this Share.
		*/
	public void setZone(SFZone zone) {
		this.Zone = zone;
	}
		/**
		* HMAC Signature for the Share data
		*/
	public String getSignature() {
		return this.Signature;
	}

		/**
		* HMAC Signature for the Share data
		*/
	public void setSignature(String signature) {
		this.Signature = signature;
	}
		/**
		* Defines whether the request to retrieve Share Items is to be navigated to a remote endpoint.
		*/
	public Boolean getHasRemoteChildren() {
		return this.HasRemoteChildren;
	}

		/**
		* Defines whether the request to retrieve Share Items is to be navigated to a remote endpoint.
		*/
	public void setHasRemoteChildren(Boolean hasremotechildren) {
		this.HasRemoteChildren = hasremotechildren;
	}
		/**
		* Redirection endpoint for this Share.
		*/
	public SFRedirection getRedirection() {
		return this.Redirection;
	}

		/**
		* Redirection endpoint for this Share.
		*/
	public void setRedirection(SFRedirection redirection) {
		this.Redirection = redirection;
	}
	public SFSafeEnum<SFShareSubType> getShareSubType() {
		return this.ShareSubType;
	}

	public void setShareSubType(SFSafeEnum<SFShareSubType> sharesubtype) {
		this.ShareSubType = sharesubtype;
	}
		/**
		* Shared item history.
		*/
	public ArrayList<SFShareItemHistory> getShareItemHistory() {
		return this.ShareItemHistory;
	}

		/**
		* Shared item history.
		*/
	public void setShareItemHistory(ArrayList<SFShareItemHistory> shareitemhistory) {
		this.ShareItemHistory = shareitemhistory;
	}
		/**
		* Current Settings for the Share
		*/
	public SFShareSettings getSettings() {
		return this.Settings;
	}

		/**
		* Current Settings for the Share
		*/
	public void setSettings(SFShareSettings settings) {
		this.Settings = settings;
	}

}