
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

package com.sharefile.api.entities;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;

public class SFItemsEntity extends SFODataEntityBase
{
    /**
	* Get List of Items
	* Retrieve the initial folder and files of the authenticated user.
	* This method will return the user's root directory, using Item.GetRootFromWasabiPath("root").
	* It will force expansion of the Children element, so first level of items under the root is also returned
	* @return a user's root directory and first level of children items
    */
	public ISFQuery<SFItem> get()
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Item by ID
	* Returns a single Item
	* @param url 	
	* @param includeDeleted 	
	* @return a single Item
    */
	public ISFQuery<SFItem> get(URI url, Boolean includeDeleted = false)
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("includeDeleted", includeDeleted);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get TreeView
	* Retrieves a folder list structure tailored for TreeView navigation - used by clients
	* to create folder trees for specific operations.
	* This operation will enforce a specific $select and $expand operators. You can provide
	* additional $expand, for example Children, which is not added by default. The $select
	* operator will apply to the expanded objects as well. You can also specify additional
	* $select elements.
	* @param url 	
	* @param treeMode 	
	* @param sourceId 	
	* @param canCreateRootFolder 	
	* @param fileBox 	
	* @return A tree root element.
    */
	public ISFQuery<SFItem> get(URI url, SFSafeEnum<SFTreeMode> treeMode, String sourceId, Boolean canCreateRootFolder = false, Boolean fileBox = false)
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("treeMode", treeMode);
		sfApiQuery.addQueryString("sourceId", sourceId);
		sfApiQuery.addQueryString("canCreateRootFolder", canCreateRootFolder);
		sfApiQuery.addQueryString("fileBox", fileBox);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Stream
	* Retrieves the versions of a given Stream.
	* An Item represents a single version of a file system object. The stream identifies
	* all versions of the same file system object. For example, when users upload or modify an existing file, a new Item
	* is created with the same StreamID. All default Item enumerations return only the latest version of a given stream.
	* Use this method to retrieve previous versions of a given stream
	* @param url 	
	* @param includeDeleted 	
    */
	public ISFQuery<SFODataFeed<SFItem>> stream(URI url, Boolean includeDeleted = false)
	{
		SFQuery<SFODataFeed<SFItem>> sfApiQuery = new SFQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Stream");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("includeDeleted", includeDeleted);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Item by Path
	* Retrieves an item from its path. The path is of format /foldername/foldername/filename
	* This call may redirect the client to another API provider, if the path
	* contains a symbolic link.
	* @param path 	
	* @return An item identified by a path
    */
	public ISFQuery<SFItem> byPath(String path)
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("ByPath");
		sfApiQuery.addQueryString("path", path);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Item by relative Path from ID
	* Retrieves an item from its path, relative to the provided ID.
	* The path is of format /foldername/foldername/filename
	* This call may redirect the client to another API provider, if the path
	* contains a symbolic link.
	* @param url 	
	* @param path 	
	* @return An item identified by a path
    */
	public ISFQuery<SFItem> byPath(URI url, String path)
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("ByPath");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("path", path);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Parent Item
	* Retrieves the Parent navigation property of a single Item.
	* @param url 	
	* @return the Parent Item of the give object ID.
    */
	public ISFQuery<SFItem> getParent(URI url)
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Parent");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Children
	* Handler for the Children navigation property of a given Item.
	* A 302 redirection is returned if the folder is a SymbolicLink. The redirection
	* will enumerate the children of the remote connector
	* @param url 	
	* @return the list of children under the given object ID
    */
	public ISFQuery<SFODataFeed<SFItem>> getChildren(URI url)
	{
		SFQuery<SFODataFeed<SFItem>> sfApiQuery = new SFQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Children");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Folder Access Info
	* Returns the effective Access Controls for the current authenticated user for the
	* selected folder - i.e., the resulting set of Access Controls for the Item/User context.This operation applies to Folders only, will return an error for other Item types.
	* @param url 	
	* @return The Folder Access Control Information
    */
	public ISFQuery<SFItemInfo> getInfo(URI url)
	{
		SFQuery<SFItemInfo> sfApiQuery = new SFQuery<SFItemInfo>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Info");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Download Item Content
	* Initiate the download operation for an item. It will return 302 redirection to the
	* actual download link. For Folders, the download link will retrieve a ZIP archive
	* with the contents of the Folder.
	* @param url 	
	* @param redirect 	
	* @return the download link for the provided item content.
    */
	public ISFQuery<SFDownloadSpecification> download(URI url, Boolean redirect = true)
	{
		SFQuery<SFDownloadSpecification> sfApiQuery = new SFQuery<SFDownloadSpecification>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Download");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("redirect", redirect);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create Folder
    * {
    * "Name":"Folder Name",
    * "Description":"Description",
    * "Zone":{ "Id":"z014766e-8e96-4615-86aa-57132a69843c" }
    * }
	* Creates a new Folder.
	* The POST body must contain the serialized object.
	* For top-level folders, use Items/Folder.
	* The Zone object may only be provided for top-level folders. The Zone object must
	* contain a zone ID.
	* @param parentUrl 	
	* @param folder 	
	* @param overwrite 	
	* @param passthrough 	
	* @return the new Folder
    */
	public ISFQuery<SFFolder> createFolder(URI parentUrl, SFFolder folder, Boolean overwrite = false, Boolean passthrough = false)
	{
		SFQuery<SFFolder> sfApiQuery = new SFQuery<SFFolder>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Folder");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.addQueryString("overwrite", overwrite);
		sfApiQuery.addQueryString("passthrough", passthrough);
		sfApiQuery.setBody(folder);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Create Note
    * {
    * "Name":"Note Name",
    * "Description":"Description"
    * }
	* Creates a new Note.
	* @param parentUrl 	
	* @param note 	
	* @return the new Note
    */
	public ISFQuery<SFNote> createNote(URI parentUrl, SFNote note)
	{
		SFQuery<SFNote> sfApiQuery = new SFQuery<SFNote>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Note");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setBody(note);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Create Link
    * {
    * "Name":"Link Name",
    * "Description":"Description",
    * "Uri":"https://server/path"
    * }
	* Creates a new Link
	* @param parentUrl 	
	* @param link 	
	* @return the new Link
    */
	public ISFQuery<SFLink> createLink(URI parentUrl, SFLink link)
	{
		SFQuery<SFLink> sfApiQuery = new SFQuery<SFLink>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Link");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.setBody(link);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Create SymbolicLink
    * {
    * "Name":"Connection Name",
    * "Description":"Description",
    * "Link":"https://server/path"
    * }
    * {
    * "FileName":"RemoteFileName",
    * "Description":"Description",
    * "Zone":{ "Id":"z014766e-8e96-4615-86aa-57132a69843c" }
    * }
	* Creates a Symbolic Link
	* The body must contain either a "Link" parameter with a fully qualified URI; or use
	* FileName + Zone to have sharefile.com attempt to convert the Connector path to an
	* URI using a call to the Zone - using ShareFile Hash authentication mode. For active
	* clients, it's recommended to make the convertion call to the Zone directly, using
	* Items/ByPath=name, retriving the resulting URL, and calling this method with the
	* Link parameter.SymbolicLinks must be created as top-level folders
	* @param parentUrl 	
	* @param symlink 	
	* @param overwrite 	
	* @return the new SymbolicLink
    */
	public ISFQuery<SFSymbolicLink> createSymbolicLink(URI parentUrl, SFSymbolicLink symlink, Boolean overwrite = false)
	{
		SFQuery<SFSymbolicLink> sfApiQuery = new SFQuery<SFSymbolicLink>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("SymbolicLink");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.addQueryString("overwrite", overwrite);
		sfApiQuery.setBody(symlink);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update Item
    * {
    * "Name":"Name",
    * "FileName":"FileName",
    * "Description":"Description",
    * "ExpirationDate": "date",
    * "Parent": { "Id": "parentid" },
    * "Zone": { "Id": "zoneid" }
    * }
	* Updates an Item object
	* @param url 	
	* @param item 	
	* @param forceSync 	
	* @return A modified Item object. If the item Zone or Parent Zone is modified, then this method will return an Asynchronous operation record instead. Note: the parameters listed in the body of the request are the only parameters that can be updated through this call.
    */
	public ISFQuery<SFItem> update(URI url, SFItem item, String batchid = null, Long batchSizeInBytes = 0, Boolean forceSync = false, Boolean scheduleAsync = true)
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("batchid", batchid);
		sfApiQuery.addQueryString("batchSizeInBytes", batchSizeInBytes);
		sfApiQuery.addQueryString("forceSync", forceSync);
		sfApiQuery.addQueryString("scheduleAsync", scheduleAsync);
		sfApiQuery.setBody(item);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Update Link
    * {
    * "Name":"Name",
    * "Uri":"https://server/path",
    * "Description":"Description",
    * "Parent": { "Id": "parentid" },
    * }
	* Updates a Link object
	* @param url 	
	* @param link 	
	* @param notify 	
	* @return A modified Link object
    */
	public ISFQuery<SFLink> updateLink(URI url, SFLink link, Boolean notify = false)
	{
		SFQuery<SFLink> sfApiQuery = new SFQuery<SFLink>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Link");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.setBody(link);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Update Note
    * {
    * "Name":"Name",
    * "Description":"Description",
    * "Parent": { "Id": "parentid" },
    * }
	* Updates a Note object
	* @param url 	
	* @param note 	
	* @param notify 	
	* @return The modified Note object
    */
	public ISFQuery<SFNote> updateNote(URI url, SFNote note, Boolean notify = false)
	{
		SFQuery<SFNote> sfApiQuery = new SFQuery<SFNote>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Note");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.setBody(note);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Update SymbolicLink
    * {
    * "Name":"Name",
    * "Description":"Description",
    * "Link": "https://server/path"
    * }
	* Updates a Symbolic Link object
	* @param url 	
	* @param symlink 	
	* @return The modified SymbolicLink object
    */
	public ISFQuery<SFSymbolicLink> updateSymbolicLink(URI url, SFSymbolicLink symlink)
	{
		SFQuery<SFSymbolicLink> sfApiQuery = new SFQuery<SFSymbolicLink>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("SymbolicLink");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(symlink);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	public ISFQuery delete(URI url, Boolean singleversion = false, Boolean forceSync = false)
	{
		SFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("Items");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("singleversion", singleversion);
		sfApiQuery.addQueryString("forceSync", forceSync);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Delete Multiple Items
    * ["id1","id2",...]
	* All items in bulk delete must be children of the same parent, identified in the URI
	* @param id 	
	* @param body 	
    */
	public ISFQuery bulkDelete(URI url, ArrayList<String> ids, Boolean forceSync = false)
	{
		SFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("BulkDelete");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("ids", ids);
		sfApiQuery.addQueryString("forceSync", forceSync);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery<Stream> getThumbnail(URI url, Integer size = 75, Boolean redirect = false)
	{
		SFQuery<Stream> sfApiQuery = new SFQuery<Stream>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Thumbnail");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("size", size);
		sfApiQuery.addQueryString("redirect", redirect);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Breadcrumbs
	* Retrieves the path from an item from the root. The return list is a Feed of Items, with the top-level
	* folder at the first position. If this item is in a Connection path, the breadcrumbs may contain URL
	* reference back to the parent account - and the Item in the feed will contain just the URL reference.
	* @param url 	
	* @param path 	
	* @return A feed containing the path of folders from the specified root to the item, in order
    */
	public ISFQuery<SFODataFeed<SFItem>> getBreadcrumbs(URI url, String path = null)
	{
		SFQuery<SFODataFeed<SFItem>> sfApiQuery = new SFQuery<SFODataFeed<SFItem>>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Breadcrumbs");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("path", path);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Copy Item
	* Copies an item to a new target Folder. If the target folder is in another zone, the operation will
	* return an AsyncOperation record instead. Clients may query the /AsyncOperation Entity to determine
	* operation progress and result.
	* @param url 	
	* @param targetid 	
	* @param overwrite 	
	* @return the modified source object
    */
	public ISFQuery<SFItem> copy(URI url, String targetid, Boolean overwrite = false)
	{
		SFQuery<SFItem> sfApiQuery = new SFQuery<SFItem>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Copy");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("targetid", targetid);
		sfApiQuery.addQueryString("overwrite", overwrite);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Upload File
	* Prepares the links for uploading files to the target Folder.
	* This method returns an Upload Specification object. The fields are
	* populated based on the upload method, provider, and resume parameters passed to the
	* upload call.
	* The Method determines how the URLs must be called.
	* 
	* Standard uploads use a single HTTP POST message to the ChunkUri address provided in
	* the response. All other fields will be empty. Standard uploads do not support Resume.
	* 
	* Streamed uploads use multiple HTTP POST calls to the ChunkUri address. The client must
	* append the parameters index, offset and hash to the end of the ChunkUri address. Index
	* is a sequential number representing the data block (zero-based); Offset represents the
	* byte offset for the block; and hash contains the MD5 hash of the block. The last HTTP
	* POST must also contain finish=true parameter.
	* 
	* Threaded uploads use multiple HTTP POST calls to ChunkUri, and can have a number of
	* threads issuing blocks in parallel. Clients must append index, offset and hash to
	* the end of ChunkUri, as explained in Streamed. After all chunks were sent, the client
	* must call the FinishUri provided in this spec.
	* 
	* For all uploaders, the contents of the POST Body can either be "raw", if the "Raw" parameter
	* was provided to the Uploader, or use MIME multi-part form encoding otherwise. Raw uploads
	* simply put the block content in the POST body - Content-Length specifies the size. Multi-part
	* form encoding has to pass the File as a Form parameter named "File1".
	* 
	* For streamed and threaded, if Resume options were provided to the Upload call, then the
	* fields IsResume, ResumeIndex, ResumeOffset and ResumeFileHash MAY be populated. If they are,
	* it indicates that the server has identified a partial upload with that specification, and is
	* ready to resume on the provided parameters. The clients can then verify the ResumeFileHash to
	* ensure the file has not been modified; and continue issuing ChunkUri calls from the ResumeIndex
	* ResumeOffset parameters. If the client decides to restart, it should simply ignore the resume
	* parameters and send the blocks from Index 0.
	* 
	* For all uploaders: the result code for the HTTP POST calls to Chunk and Finish Uri can either
	* be a 401 - indicating authentication is required; 4xx/5xx indicating some kind of error; or
	* 200 with a Content Body of format 'ERROR:message'. Successful calls will return either a 200
	* response with no Body, or with Body of format 'OK'.
	* @param url 	
	* @param method 	
	* @param raw 	
	* @param fileName 	
	* @param fileSize 	
	* @param batchId 	
	* @param batchLast 	
	* @param canResume 	
	* @param startOver 	
	* @param unzip 	
	* @param tool 	
	* @param overwrite 	
	* @param title 	
	* @param details 	
	* @param isSend 	
	* @param sendGuid 	
	* @param opid 	
	* @param threadCount 	
	* @param responseFormat 	
	* @param notify 	
	* @param clientCreatedDateUTC 	
	* @param clientModifiedDateUTC 	
	* @return an Upload Specification element, containing the links for uploading, and the parameters for resume. The caller must know the protocol for sending the prepare, chunk and finish URLs returned in the spec; as well as negotiate the resume upload.
    */
	public ISFQuery<SFUploadSpecification> upload(URI url, SFSafeEnum<SFUploadMethod> method = Standard, Boolean raw = false, String fileName = null, Long fileSize = 0, String batchId = null, Boolean batchLast = false, Boolean canResume = false, Boolean startOver = false, Boolean unzip = false, String tool = "apiv3", Boolean overwrite = false, String title = null, String details = null, Boolean isSend = false, String sendGuid = null, String opid = null, Integer threadCount = 4, String responseFormat = "json", Boolean notify = false, Date clientCreatedDateUTC = null, Date clientModifiedDateUTC = null, Integer expirationDays = null)
	{
		SFQuery<SFUploadSpecification> sfApiQuery = new SFQuery<SFUploadSpecification>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Upload");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("method", method);
		sfApiQuery.addQueryString("raw", raw);
		sfApiQuery.addQueryString("fileName", fileName);
		sfApiQuery.addQueryString("fileSize", fileSize);
		sfApiQuery.addQueryString("batchId", batchId);
		sfApiQuery.addQueryString("batchLast", batchLast);
		sfApiQuery.addQueryString("canResume", canResume);
		sfApiQuery.addQueryString("startOver", startOver);
		sfApiQuery.addQueryString("unzip", unzip);
		sfApiQuery.addQueryString("tool", tool);
		sfApiQuery.addQueryString("overwrite", overwrite);
		sfApiQuery.addQueryString("title", title);
		sfApiQuery.addQueryString("details", details);
		sfApiQuery.addQueryString("isSend", isSend);
		sfApiQuery.addQueryString("sendGuid", sendGuid);
		sfApiQuery.addQueryString("opid", opid);
		sfApiQuery.addQueryString("threadCount", threadCount);
		sfApiQuery.addQueryString("responseFormat", responseFormat);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.addQueryString("clientCreatedDateUTC", clientCreatedDateUTC);
		sfApiQuery.addQueryString("clientModifiedDateUTC", clientModifiedDateUTC);
		sfApiQuery.addQueryString("expirationDays", expirationDays);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Unlock File
	* Unlock a locked file.
	* This operation is only implemented in Sharepoint providers (/sp)
	* @param url 	
	* @param message 	
    */
	public ISFQuery checkIn(URI url, String message)
	{
		SFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("CheckIn");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("message", message);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Lock File
	* Locks a file.
	* This operation is only implemented in Sharepoint providers (/sp)
	* @param url 	
    */
	public ISFQuery checkOut(URI url)
	{
		SFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("CheckOut");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Search
	* Search for Items matching the criteria of the query parameter
	* @param query 	
	* @return SearchResults
    */
	public ISFQuery<SFSearchResults> search(String query)
	{
		SFQuery<SFSearchResults> sfApiQuery = new SFQuery<SFSearchResults>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Search");
		sfApiQuery.addQueryString("query", query);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Web Preview Link
	* Redirects the caller to the Web Edit application for the selected item.
	* @param id 	
	* @return A redirection message to the Web Edit app for this item. It returns 400 (BadRequest) if the Web Preview app doesn't support the file type.
    */
	public ISFQuery<SFRedirection> webView(URI url, String id)
	{
		SFQuery<SFRedirection> sfApiQuery = new SFQuery<SFRedirection>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("WebView");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("id", id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get all Item Protocol Link
	* This method returns all alternate protocol links supported by ShareFile (such
	* as WOPI, FTP, WebDAV).
	* @param id 	
	* @return A Feed containing all protocols links supported by the given item
    */
	public ISFQuery<SFODataFeed<SFItemProtocolLink>> getProtocolLinks(URI url)
	{
		SFQuery<SFODataFeed<SFItemProtocolLink>> sfApiQuery = new SFQuery<SFODataFeed<SFItemProtocolLink>>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("ProtocolLinks");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get an Item Protocol Link
	* @param url 	
	* @param protocol 	
	* @return A single protocol link if supported, 404 (Not Found) if not supported by the item
    */
	public ISFQuery<SFItemProtocolLink> getProtocolLinks(URI url, String protocol)
	{
		SFQuery<SFItemProtocolLink> sfApiQuery = new SFQuery<SFItemProtocolLink>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("ProtocolLinks");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(protocol);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Redirection endpoint Information
	* Returns the redirection endpoint for this Item.This operation applies to Folders and SymbolicLinks only, will return an error for other Item types.
	* @param url 	
	* @return The Redirection endpoint Information
    */
	public ISFQuery<SFRedirection> getRedirection(URI url)
	{
		SFQuery<SFRedirection> sfApiQuery = new SFQuery<SFRedirection>();
		sfApiQuery.setFrom("Items");
		sfApiQuery.setAction("Redirection");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

