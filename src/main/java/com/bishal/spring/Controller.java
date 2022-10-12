package com.bishal.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Controller 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");   // now this context is our spring container(IoC container), jisko hum directly bol skte hai ki ap mujhe config.xml sae us student ka object lakr dedo, so we directly write below ki context.getBean("the object name, i.e. student1 as we made it in name inside config.xml file)
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student1);	
        System.out.println(student2);	
        System.out.println(student3);
    }
}
