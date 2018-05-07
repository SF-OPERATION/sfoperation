package com.sabatfinance.sfoperation.response;

import com.google.gson.annotations.SerializedName;

public class RolesItem{

	@SerializedName("code")
	private String code;

	@SerializedName("id")
	private int id;

	@SerializedName("label")
	private String label;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	@Override
 	public String toString(){
		return 
			"RolesItem{" + 
			"code = '" + code + '\'' + 
			",id = '" + id + '\'' + 
			",label = '" + label + '\'' + 
			"}";
		}
}