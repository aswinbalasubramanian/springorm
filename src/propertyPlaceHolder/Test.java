package com.aswin.spring.springCore.propertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aswin/spring/springCore/propertyPlaceHolder/config.xml");
		MyDAO mydao = (MyDAO) context.getBean("myDAO");
		System.out.println(mydao);
	}
}
