package com.ust;

public class Method {
	static int x=1;
	private int y=3;
	public void method1(int x)
	{
		Method t=new Method();
		this.x=2;
		y=4;
		System.out.println("Test1.x:"+ Method.x);
		System.out.println("t.x:"+ t.x);
		System.out.println("t.y:" + t.y);
		System.out.println("y:"+ y);
	}
	public static void main(String args[])
	{
		Method t=new Method();
		t.method1(5);
	}
	
}
