package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.DHL;
import com.nt.beans.Flipkart;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    Flipkart bean = ctx.getBean("fpkt",Flipkart.class);
		  String shopping = bean.shopping(new String[] {"shirt","doll","veg"}, new float[]{100,200,300});
		  System.out.println(shopping);
	}

}
