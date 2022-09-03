package com.ust;
class A{}
class B extends A{}
public class InstanceofDemo1 {
	public static void main(String[] args)
	{
		B objOfClassB = new B();
		System.out.println("ObjOfClassB is an instance of B:" +(objOfClassB instanceof B));
		System.out.println("ObjOfClassB is an instance of the parentclass A:" +(objOfClassB instanceof A));
		
	}
	

}
