package com.cg.test;
import com.cg.demo.Person;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
	// xxx	p.i=12; not acessible this is private data member of Person class
	// xxx	p.i2=13;  this is protected 
		p.i3=23;
		System.out.println(p.i3);
	// xxx	p.i4=56;// this is default
	// xxx	p.sum(); private method of Person class
	// xxx	p.sum2(); Protected method of Person class
		p.sum3();
		// xxx p.sum4(); default method of Person class
		
		

	}

}
