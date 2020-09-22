package com.nt.beans;

public class BlueDart implements Courier {
	
	public BlueDart() {
		// TODO Auto-generated constructor stub
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "Deliver having orderId" +orderId;
	}
	
	

}
