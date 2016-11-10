package com.org1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		Main test = new Main();
		test.testStart();
	}
	
	public void testStart() {
		// 1. 创建 Spring 的 IOC 容器对象
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		// 2. 从IOC容器中获取Bean实例
		Action action = (Action)ctx.getBean("action1");
		System.out.println(action.execute(" yyp"));
		
		action = (Action)ctx.getBean("action2");
		System.out.println(action.execute(" zhsd"));
	}
}
