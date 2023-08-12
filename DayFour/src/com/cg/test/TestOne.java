package com.cg.test;

import com.cg.demo.Person;

// imported.com.cg.demo;

public class TestOne extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOne t=new TestOne();
       Person p=new Person();
      //  t.sum4(); because the scope of the default method is within the package not outside the package with subclass
      // t.i4=19; default level
      // t.sum(); no acess because they are not acessible outside the package and outside class
       // p.i=23; private not acessible out side the class and out side the package
       t.i2=23;
       System.out.println(t.i2);
    //xxx   p.i2=45;
       t.sum2();
       // xxx p.sum2();
      
       p.i3=10;
       System.out.println(p.i3);
       p.sum3();
       t.i3=26;
       System.out.println(t.i3);
       t.sum3();
       
       
	}

}
