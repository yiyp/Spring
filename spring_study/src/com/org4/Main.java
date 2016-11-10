package com.org4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person)ctx.getBean("person3");
		System.out.println("person:" + person);
		
		Person person4 = (Person)ctx.getBean("person4");
		System.out.println("person4:" + person4);
		
		Person person5 = (Person)ctx.getBean("person5");
		System.out.println("person5:" + person5);
		
		NewPerson newPerson = (NewPerson)ctx.getBean("newPerson");
		System.out.println("newPerson:" + newPerson);
		
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getProperties());
	}

}
