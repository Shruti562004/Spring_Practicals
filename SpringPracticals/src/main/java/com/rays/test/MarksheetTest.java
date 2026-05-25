package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MarksheetTest {
	
	public static void main(String[] args) {
		
		
		BeanFactory fact=new XmlBeanFactory(new ClassPathResource("Marksheet.xml"));
		
		Marksheet mk= (Marksheet) fact.getBean("marks");
		
		System.out.println(mk.getEnglish());
		System.out.println(mk.getName());
		System.out.println(mk.getHindi());
	}

}
