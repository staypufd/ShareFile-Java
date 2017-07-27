
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

public class SFContactsListSelectionParams extends SFODataObject {

	@SerializedName("IncludeAllClients")
	private Boolean IncludeAllClients;
	@SerializedName("IncludeClientsInPersonalAddressBook")
	private Boolean IncludeClientsInPersonalAddressBook;
	@SerializedName("IncludeClientsInSharedAddressBook")
	private Boolean IncludeClientsInSharedAddressBook;
	@SerializedName("IncludeAllEmployees")
	private Boolean IncludeAllEmployees;
	@SerializedName("IncludeEmployeesInPersonalAddressBook")
	private Boolean IncludeEmployeesInPersonalAddressBook;
	@SerializedName("IncludeEmployeesInSharedAddressBook")
	private Boolean IncludeEmployeesInSharedAddressBook;
	@SerializedName("IncludeSharedAddressBook")
	private Boolean IncludeSharedAddressBook;
	@SerializedName("IncludePersonalAddressBook")
	private Boolean IncludePersonalAddressBook;
	@SerializedName("IncludeGroups")
	private Boolean IncludeGroups;

		/**
		* IncludeAllClients
		*/
	public Boolean getIncludeAllClients() {
		return this.IncludeAllClients;
	}

		/**
		* IncludeAllClients
		*/
	public void setIncludeAllClients(Boolean includeallclients) {
		this.IncludeAllClients = includeallclients;
	}
		/**
		* IncludeClientsInPersonalAddressBook
		*/
	public Boolean getIncludeClientsInPersonalAddressBook() {
		return this.IncludeClientsInPersonalAddressBook;
	}

		/**
		* IncludeClientsInPersonalAddressBook
		*/
	public void setIncludeClientsInPersonalAddressBook(Boolean includeclientsinpersonaladdressbook) {
		this.IncludeClientsInPersonalAddressBook = includeclientsinpersonaladdressbook;
	}
		/**
		* IncludeClientsInSharedAddressBook
		*/
	public Boolean getIncludeClientsInSharedAddressBook() {
		return this.IncludeClientsInSharedAddressBook;
	}

		/**
		* IncludeClientsInSharedAddressBook
		*/
	public void setIncludeClientsInSharedAddressBook(Boolean includeclientsinsharedaddressbook) {
		this.IncludeClientsInSharedAddressBook = includeclientsinsharedaddressbook;
	}
		/**
		* IncludeAllEmployees
		*/
	public Boolean getIncludeAllEmployees() {
		return this.IncludeAllEmployees;
	}

		/**
		* IncludeAllEmployees
		*/
	public void setIncludeAllEmployees(Boolean includeallemployees) {
		this.IncludeAllEmployees = includeallemployees;
	}
		/**
		* IncludeEmployeesInPersonalAddressBook
		*/
	public Boolean getIncludeEmployeesInPersonalAddressBook() {
		return this.IncludeEmployeesInPersonalAddressBook;
	}

		/**
		* IncludeEmployeesInPersonalAddressBook
		*/
	public void setIncludeEmployeesInPersonalAddressBook(Boolean includeemployeesinpersonaladdressbook) {
		this.IncludeEmployeesInPersonalAddressBook = includeemployeesinpersonaladdressbook;
	}
		/**
		* IncludeEmployeesInSharedAddressBook
		*/
	public Boolean getIncludeEmployeesInSharedAddressBook() {
		return this.IncludeEmployeesInSharedAddressBook;
	}

		/**
		* IncludeEmployeesInSharedAddressBook
		*/
	public void setIncludeEmployeesInSharedAddressBook(Boolean includeemployeesinsharedaddressbook) {
		this.IncludeEmployeesInSharedAddressBook = includeemployeesinsharedaddressbook;
	}
		/**
		* IncludeSharedAddressBook
		*/
	public Boolean getIncludeSharedAddressBook() {
		return this.IncludeSharedAddressBook;
	}

		/**
		* IncludeSharedAddressBook
		*/
	public void setIncludeSharedAddressBook(Boolean includesharedaddressbook) {
		this.IncludeSharedAddressBook = includesharedaddressbook;
	}
		/**
		* IncludePersonalAddressBook
		*/
	public Boolean getIncludePersonalAddressBook() {
		return this.IncludePersonalAddressBook;
	}

		/**
		* IncludePersonalAddressBook
		*/
	public void setIncludePersonalAddressBook(Boolean includepersonaladdressbook) {
		this.IncludePersonalAddressBook = includepersonaladdressbook;
	}
		/**
		* Include distribution groups
		*/
	public Boolean getIncludeGroups() {
		return this.IncludeGroups;
	}

		/**
		* Include distribution groups
		*/
	public void setIncludeGroups(Boolean includegroups) {
		this.IncludeGroups = includegroups;
	}

}