package com.ust;

public class Super_example extends Supermost {
	String colour="white";
	void display() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
	public static void main(String args[]) {
          Super_example s=new Super_example();
         // Supermost m=new Supermost();
          s.display();
         
}



class Supermost {
	String colour="black";
	void display()
	 System.out.println("in super");
	
}
Supermost() {
	System.out.println
}
