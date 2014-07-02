package com.sharefile.api;

import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.sharefile.api.constants.SFKeywords;

/**
 *   Allows applications to specify specific configuaration settings and https headers to be added
 *   before the SDK makes urlconnection to the server.
 */
public class SFConfiguration 
{
	private final Map<String ,String> mAdditionalHttpHeaders = new HashMap<String,String>();
		
	public void addAcceptedLanguages(ArrayList<String> acceptedLanguages) 
	{
		if(acceptedLanguages == null || acceptedLanguages.size() == 0)
		{
			return;
		}
		
		StringBuilder sb = new StringBuilder();
				
		for(String str:acceptedLanguages)
		{
			sb.append(str);
			sb.append(";");
		}
		
		appendToPrevious(SFKeywords.ACCEPT_LANGUAGE, sb.toString());
	}
	
	public void addAcceptedLanguage(String acceptedLanguage) 
	{		
		appendToPrevious(SFKeywords.ACCEPT_LANGUAGE, acceptedLanguage);
	}
	
	/**
	 *  This is generic provision to add any header.
	 */
	public void addHeader(String name,String value)
	{
		mAdditionalHttpHeaders.put(name, value);
	}
	
	public void removeHeader(String name)
	{
		mAdditionalHttpHeaders.remove(name);
	}
	
	public void removeAllHeaders()
	{
		mAdditionalHttpHeaders.clear();
	}
	
	private void appendToPrevious(String name,String newvalue)
	{
		String previousValue = mAdditionalHttpHeaders.get(name);
		
		if(previousValue == null)
		{
			previousValue = "";
		}
				
		mAdditionalHttpHeaders.put(name, previousValue + newvalue);
	}
	
	public void setAddtionalHeaders(URLConnection conn)
	{
		if(conn == null)
		{
			return;
		}
		
		Iterator<Entry<String, String>> it = mAdditionalHttpHeaders.entrySet().iterator();
		
	    while (it.hasNext()) 
	    {
	        Map.Entry<String,String> pair = (Map.Entry<String,String>)it.next();
	        conn.setRequestProperty(pair.getKey(),pair.getValue());
	    }
	}
	
}