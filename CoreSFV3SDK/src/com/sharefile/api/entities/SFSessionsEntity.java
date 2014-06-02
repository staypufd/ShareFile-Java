
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

import com.sharefile.api.interfaces.ISFQuery;
import com.sharefile.api.models.SFQuery;
import com.sharefile.api.models.SFSession;

public class SFSessionsEntity extends SFODataEntityBase
{
    /**
	* Get Session
	* Retrieve the current authentication session object. If the client is not authenticated,
	* this operation will challenge for ShareFile authentication using a 401 response. This method will
	* not trigger the SAML authentication flow - use /Sessions/Login instead.
	* @return The current authentication Context, based on the request SF_APIAuthId Cookie
    */
	public ISFQuery<SFSession> get()
	{
		ISFQuery<SFSession> sfApiQuery = new SFQuery<SFSession>();
		sfApiQuery.setFrom("Sessions");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Logout
	* Logout the current session - invalidate the current Session ID
    */
	public ISFQuery delete()
	{
		ISFQuery sfApiQuery = new SFQuery();
		sfApiQuery.setFrom("Sessions");
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Login
	* API clients can provide ShareFile Authentication directly to any API operation using OAuth (Bearer).
	* However, the client must know that the provided authentication type is supported on the API endpoint; and that SAML is not configured.
	* 
	* This API provides a generic authentication routine for clients. It will challenge for ShareFile credentials
	* passing all supported authentication methods; redirect to the SAML IDP if configured to do so; and handle
	* certain HTTP headers, like device registration.
	* 
	* If the client is already authenticated, the Session object is returned. If the client is not authenticated, and
	* the account is not configured for SAML, then the API will challenge for a local authentication. If the account
	* is configured for SAML, then the client will be redirected to the SAML IDP using the SAML passive flow - authentication
	* will be performed at the IDP domain instead. The IDP callback will be on the API Acs, which will return a Session
	* object if authentication is accepted.
	* 
	* The following HTTP Headers are also processed in this request, and stored with the Session object:
	* X-SFAPI-Tool: Tool string (user-agent equivalent for ShareFile)X-SFAPI-ToolVersion: Tool Version stringX-SFAPI-UserInitiated: true or false, indicates whether this is an interactive login, or re-authentication
	* initiated by the ToolX-SFAPI-DeviceId: Device Identifier. If set to 'register', a new DeviceID will be generated. This will
	* either create or associate an existing DeviceID to this session - indicates user is logging in using this DeviceX-SFAPI-DeviceName: Device Name. Only required/used when a registration process occurs.
	* @param authmethod 	
	* @param authcomparison 	
	* @return A Session object, if authentication is successful
    */
	public ISFQuery<SFSession> login(String authmethod, String authcomparison)
	{
		ISFQuery<SFSession> sfApiQuery = new SFQuery<SFSession>();
		sfApiQuery.setFrom("Sessions");
		sfApiQuery.setAction("Login");
		sfApiQuery.addQueryString("authmethod", authmethod);
		sfApiQuery.addQueryString("authcomparison", authcomparison);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFSession> acs()
	{
		ISFQuery<SFSession> sfApiQuery = new SFQuery<SFSession>();
		sfApiQuery.setFrom("Sessions");
		sfApiQuery.setAction("Acs");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

