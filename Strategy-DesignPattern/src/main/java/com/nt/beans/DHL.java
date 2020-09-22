package com.nt.beans;

public class DHL implements Courier {

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "deliver to having id" +orderId;
	}
	
	

}
