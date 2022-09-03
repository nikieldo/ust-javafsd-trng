package com.ust;
import java.util.Scanner;

  class Input {
	  public static void main(String[]args) {
	  Scanner input =new Scanner(System.in);
	  
	  //getting float input
	  System.out.println("enter float:");
	  float myFloat =input.nextFloat();
	  System.out.println("float entered="+myFloat);
	  
	  //getting double input
	  System.out.println("enter double:");
	  double myDouble =input.nextDouble();
	  System.out.println("double entered=" + myDouble);
	  
	  //getting String input
	  System.out.println("enter text:");
	  String myString =input.next();
	  System.out.println("Text entered=" +myString);
	  }

}
