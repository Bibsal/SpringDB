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
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");   // now this context is our spring container(IoC container), jisko hum directly bol skte hai ki ap mujhe config.xml sae us student ka object lakr dedo, so we directly write below ki context.getBean("the object name, i.e. student1 as we made it in name inside config.xml file)
        Student student = (Student) context.getBean("student1");
        System.out.println(student);	
    }
}
