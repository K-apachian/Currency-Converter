package com.currency.service;

import com.currency.bean.USD;

public class ConverterClass extends USD{
	String destCurrency;
	float convAmt;
	USD us=null;
	
	public String getDestCurrency() {
		return destCurrency;
	}
	public void setDestCurrency(String destCurrency) {
		this.destCurrency = destCurrency;
	}
	public ConverterClass(float usdQty,String destCurrency) {
		us = new USD(usdQty);
		this.destCurrency=destCurrency;
//		System.out.println(usdQty+this.destCurrency);
	}
	public boolean validate(float usdQty, String destCurrency) {
		boolean message=false;
		String d=destCurrency;
		if((us.getUsdQty()>0) 
			&& (d.equals("EUR") || d.equals("INR") || d.equals("MYR") || d.equals("SGD") || d.equals("GBP") || d.equals("CAD"))) {
			message=true;
		}
		return message;
	}
	public float convertCurrency() {
		
		if(destCurrency.equals("CAD"))
			convAmt=(float)(us.getUsdQty()*(1.26));
	if(destCurrency.equals("EUR"))
		convAmt=(float)(us.getUsdQty()*(0.81));
	if(destCurrency.equals("INR"))
		convAmt=(float)(us.getUsdQty()*(64.31));	
	if(destCurrency.equals("MYR"))
		convAmt=(float)(us.getUsdQty()*(3.95));
	if(destCurrency.equals("SGD"))
		convAmt=(float)(us.getUsdQty()*(1.32));
	if(destCurrency.equals("GBP"))
		convAmt=(float)(us.getUsdQty()*(0.72));
	
		return convAmt;
	}
	public void display() {
		System.out.println("THE "+destCurrency +" amount equivalent to "+us.getUsdQty()+" USD is: "+convAmt);
	}

}
