






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

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;


public class SFAdvancedSearchResults extends SFODataObject {



	@SerializedName("ParitalResults")

	private Boolean ParitalResults;


	@SerializedName("Results")

	private ArrayList<SFSearchResult> Results;


	@SerializedName("QueryPaging")

	private SFQueryPaging QueryPaging;




	public Boolean getParitalResults() {
		return ParitalResults;
	}


	public void setParitalResults(Boolean paritalresults) {
		ParitalResults = paritalresults;
	}


	public ArrayList<SFSearchResult> getResults() {
		return Results;
	}


	public void setResults(ArrayList<SFSearchResult> results) {
		Results = results;
	}


	public SFQueryPaging getQueryPaging() {
		return QueryPaging;
	}


	public void setQueryPaging(SFQueryPaging querypaging) {
		QueryPaging = querypaging;
	}

}