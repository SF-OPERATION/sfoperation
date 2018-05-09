package com.sabatfinance.sfoperation.response;


public class CurrencyResponse{

	private int saleRate;

	private String code;

	private int rate;

	private int avgRate;

	private String description;

	private int id;

	public void setSaleRate(int saleRate){
		this.saleRate = saleRate;
	}

	public int getSaleRate(){
		return saleRate;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setRate(int rate){
		this.rate = rate;
	}

	public int getRate(){
		return rate;
	}

	public void setAvgRate(int avgRate){
		this.avgRate = avgRate;
	}

	public int getAvgRate(){
		return avgRate;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"CurrencyResponse{" + 
			"saleRate = '" + saleRate + '\'' + 
			",code = '" + code + '\'' + 
			",rate = '" + rate + '\'' + 
			",avgRate = '" + avgRate + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}