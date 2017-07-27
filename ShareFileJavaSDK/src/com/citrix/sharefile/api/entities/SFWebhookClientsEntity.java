
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

package com.citrix.sharefile.api.entities;

import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.entities.*;
import com.citrix.sharefile.api.models.*;
import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.citrix.sharefile.api.enumerations.SFSafeEnumFlags;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.exceptions.InvalidOrMissingParameterException;

public class SFWebhookClientsEntity extends SFEntitiesBase
{
	public SFWebhookClientsEntity(ISFApiClient client) {
		super(client);
	}

	/**
	* Gets the configuration settings for a webhook client
	* @param url 	 	
	* @return WebhookClient
	*/
	public ISFQuery<SFWebhookClient> get(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFWebhookClient> sfApiQuery = new SFApiQuery<SFWebhookClient>(this.client);
		sfApiQuery.setFrom("WebhookClients");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Generates a new primary signature key for the webhook client
	* @param url 	 	
	* @return WebhookClient
	*/
	public ISFQuery<SFWebhookClient> generatePrimarySignatureKey(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFWebhookClient> sfApiQuery = new SFApiQuery<SFWebhookClient>(this.client);
		sfApiQuery.setFrom("WebhookClients");
		sfApiQuery.setAction("PrimarySignatureKey");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Generates a new secondary signature key for the webhook client
	* @param url 	 	
	* @return WebhookClient
	*/
	public ISFQuery<SFWebhookClient> generateSecondarySignatureKey(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFWebhookClient> sfApiQuery = new SFApiQuery<SFWebhookClient>(this.client);
		sfApiQuery.setFrom("WebhookClients");
		sfApiQuery.setAction("SecondarySignatureKey");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

