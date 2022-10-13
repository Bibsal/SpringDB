package com.bishal.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionController {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bishal/spring/collections/collectionsconfig.xml");
		Emp employee1 = (Emp) context.getBean("employee1");
//		System.out.println(employee1);
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getAddresses());
		System.out.println(employee1.getCourses());
		System.out.println(employee1.getProps());
	}
}
