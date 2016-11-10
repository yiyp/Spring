package com.org2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org2.HelloWorld;

public class Main {

	public static void main(String[] args) {
		// 1. 创建 Spring 的 IOC 容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. 从IOC容器中获取Bean实例
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
		// HelloWorld helloWorld = ctx.getBean(helloWorld.class);
		System.out.println(helloWorld);
		
		// 3. 调用hello方法
		helloWorld.hello();
	}

}
