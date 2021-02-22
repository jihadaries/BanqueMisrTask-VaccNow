package com.jsabry.vaccNowjsabry.model;

import java.util.Arrays;
import java.util.List;

public class PaymentOptions {

	private static final List<String> paymentOptions = Arrays.asList("Cash", "Credit", "Fawry");
	
	public static List<String> getPaymentOptions(){
		return paymentOptions;
	}

}
