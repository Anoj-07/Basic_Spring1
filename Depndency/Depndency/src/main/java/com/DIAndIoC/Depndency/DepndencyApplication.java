package com.DIAndIoC.Depndency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

public class DepndencyApplication {

	public static void main(String[] args) {

		/*//XML based Configuration
		//Bean Container is using
		//ApplicationContext is using
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");*/

/* for IoC, Configuration and DI --->
	1. Doctor doc = context.getBean(Doctor.class);

	2.Nurse doc = (Nurse) context.getBean( "nurse");
		doc.assist();*/

		ApplicationContext context = new AnnotationConfigApplicationContext(Bean_Config.class);

/*
		*//*for spring bean scope*//*
		*//*By default it is singleton*/

		/*
		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		doctor.setQualification("MBBS");
		System.out.println(doctor);

		Doctor doctor1 = context.getBean(Doctor.class);
		System.out.println(doctor1);*/


		/*bean life cycle*/
		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		doctor.setQualification("MBBS");
		doctor.pre_Destroy();

	}
}
