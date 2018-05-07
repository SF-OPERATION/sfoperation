package com.sabatfinance.sfoperation.request;

import com.google.gson.annotations.SerializedName;


public class SignUpRequest{

	@SerializedName("password")
	private String password;

	@SerializedName("fullName")
	private String fullName;

	@SerializedName("branch")
	private String branch;

	@SerializedName("deviceId")
	private String deviceId;

	@SerializedName("username")
	private String username;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setBranch(String branch){
		this.branch = branch;
	}

	public String getBranch(){
		return branch;
	}

	public void setDeviceId(String deviceId){
		this.deviceId = deviceId;
	}

	public String getDeviceId(){
		return deviceId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"SignUpRequest{" + 
			"password = '" + password + '\'' + 
			",fullName = '" + fullName + '\'' + 
			",branch = '" + branch + '\'' + 
			",deviceId = '" + deviceId + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}