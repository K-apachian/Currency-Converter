package com.currency.main;

import java.util.Scanner;

import com.currency.service.ConverterClass;


public class ConverterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float usdQty=sc.nextFloat();
		String destCurrency=sc.next();
		ConverterClass converterClass = new ConverterClass(usdQty, destCurrency) ;
		if(converterClass.validate(usdQty, destCurrency)) {
			converterClass.convertCurrency();
			converterClass.display();
		}else {
			System.out.println("UNABLE TO CONVERT THE GIVEN INPUT");
		}
	}
}
