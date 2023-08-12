package com.cg.demo;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p=new Person();
    //  p.i=10; not acess outside the class it is acessible only within the class
      p.i2=6;
      p.i3=5;
      p.i4=56;
      System.out.println(" "+p.i2+" "+p.i3+" "+p.i4);
     // p.sum(); not acessible outside the class
     
      p.sum2();
      p.sum3();
      p.sum4();
      

	}

}
