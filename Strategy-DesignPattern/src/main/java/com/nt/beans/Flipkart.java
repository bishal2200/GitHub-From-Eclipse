package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	
	public void setCourier(Courier courier) {
		this.courier = courier;
	}


	public String shopping(String[] items, float[] prices) {

		float billAmt=0.0f;
		Random random=new Random();
		for(float f:prices) {
			billAmt=billAmt+f;
		}
		int nextInt = random.nextInt(1000);
		String deliver = courier.deliver(nextInt);

		return  Arrays.toString(items)+" are purchased  having prices "+Arrays.toString(prices)+"  with bill amount"+billAmt+ "----" + deliver;
	}

}
