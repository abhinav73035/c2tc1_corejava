package com.cg.demo;

public class Person {
	private int i=0;
	protected int i2=2;
	public int i3=3;
	int i4=4;//default
	private void sum() {
		System.out.println("hii I'm Private method");
	}
	protected void sum2() {
		System.out.println("hii I'm Protected method");
	}
	public void sum3() {
		System.out.println("hii I'm Public method");
	}
	 void sum4() {
		System.out.println("hii I'm Default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.i=22;
		p.i2=23;
		p.i3=33;
		p.i4=45;
		System.out.println(p.i+" "+p.i2+" "+p.i3+" "+p.i4);
		p.sum();
		p.sum2();
		p.sum3();
		p.sum4();
	
		
		
		
      
	}

}
