package com.ust;

public class Constructors {
	Constructors() {
		System.out.println("zero arg");
	}
	
	Constructors(int x) {
		this(x,5);
		System.out.println(x);
		
	}
	void test() {
		check(this);
	}
	public static void main(String args[]) {
		
		Constructors c=new Constructors();
		Constructors c1=new Constructors(2);
		Constructors c2=new Constructors(2,3);
		c.test();
	}
	Constructors(int x,int y) {
		System.out.println(x+" "+y);
	}

}
