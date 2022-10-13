package com.bishal.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bishal/spring/reference/refconfig.xml");
		A aobj = (A) context.getBean("aref");
		System.out.println(aobj.getX());
		System.out.println(aobj.getObj().getY());
	}

}
