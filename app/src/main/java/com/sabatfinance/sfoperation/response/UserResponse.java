package com.sabatfinance.sfoperation.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class UserResponse{

	@SerializedName("password")
	private String password;

	@SerializedName("credentialsexpired")
	private boolean credentialsexpired;

	@SerializedName("expired")
	private boolean expired;

	@SerializedName("allowNonBizDay")
	private boolean allowNonBizDay;

	@SerializedName("roles")
	private List<RolesItem> roles;

	@SerializedName("fullName")
	private String fullName;

	@SerializedName("id")
	private int id;

	@SerializedName("locked")
	private boolean locked;

	@SerializedName("branch")
	private String branch;

	@SerializedName("deviceId")
	private String deviceId;

	@SerializedName("enabled")
	private boolean enabled;

	@SerializedName("username")
	private String username;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setCredentialsexpired(boolean credentialsexpired){
		this.credentialsexpired = credentialsexpired;
	}

	public boolean isCredentialsexpired(){
		return credentialsexpired;
	}

	public void setExpired(boolean expired){
		this.expired = expired;
	}

	public boolean isExpired(){
		return expired;
	}

	public void setAllowNonBizDay(boolean allowNonBizDay){
		this.allowNonBizDay = allowNonBizDay;
	}

	public boolean isAllowNonBizDay(){
		return allowNonBizDay;
	}

	public void setRoles(List<RolesItem> roles){
		this.roles = roles;
	}

	public List<RolesItem> getRoles(){
		return roles;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLocked(boolean locked){
		this.locked = locked;
	}

	public boolean isLocked(){
		return locked;
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

	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}

	public boolean isEnabled(){
		return enabled;
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
			"UserResponse{" + 
			"password = '" + password + '\'' + 
			",credentialsexpired = '" + credentialsexpired + '\'' + 
			",expired = '" + expired + '\'' + 
			",allowNonBizDay = '" + allowNonBizDay + '\'' + 
			",roles = '" + roles + '\'' + 
			",fullName = '" + fullName + '\'' + 
			",id = '" + id + '\'' + 
			",locked = '" + locked + '\'' + 
			",branch = '" + branch + '\'' + 
			",deviceId = '" + deviceId + '\'' + 
			",enabled = '" + enabled + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}