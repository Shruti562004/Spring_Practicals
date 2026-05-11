package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class UserTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("User.xml"));

		User p = (User) factory.getBean("user");

		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getAge());
		
	}

}