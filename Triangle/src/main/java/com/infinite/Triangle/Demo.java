package com.infinite.Triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SprintTri.xml");
		Triangledemo tri = (Triangledemo) context.getBean("triangleDemo");
		tri.draw();
	}
}
