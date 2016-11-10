package com.org6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org5.Address;
import com.org5.Person;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans-relation.xml");
		/*Address address = (Address)ctx.getBean("address");
		System.out.println("address:" + address);*/
		
		Address address = (Address)ctx.getBean("address3");
		System.out.println("address3:" + address);
		
		address = (Address)ctx.getBean("address2");
		System.out.println("address2:" + address);
		
		Person person = (Person)ctx.getBean("person");
		System.out.println("person:" + person);
	}

}
