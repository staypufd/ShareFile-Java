






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

import com.google.gson.annotations.SerializedName;


public class SFDeviceUserWipe extends SFODataObject {



	@SerializedName("WipeToken")

	private String WipeToken;


	@SerializedName("Success")

	private String Success;


	@SerializedName("ErrorMessage")

	private String ErrorMessage;




		/**

		* Wipe token

		*/

	public String getWipeToken() {
		return WipeToken;
	}


		/**

		* Wipe token

		*/

	public void setWipeToken(String wipetoken) {
		WipeToken = wipetoken;
	}


		/**

		* Success

		*/

	public String getSuccess() {
		return Success;
	}


		/**

		* Success

		*/

	public void setSuccess(String success) {
		Success = success;
	}


		/**

		* Error message

		*/

	public String getErrorMessage() {
		return ErrorMessage;
	}


		/**

		* Error message

		*/

	public void setErrorMessage(String errormessage) {
		ErrorMessage = errormessage;
	}

}