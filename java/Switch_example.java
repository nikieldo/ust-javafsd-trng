package com.ust;

public class Switch_example {
	public static void main(String args[]) {
		String str ="green";
		switch(str) {
		case "red":
			System.out.println("i'm in red");
			System.out.println("***");
		default :
			System.out.println("default");
		
		case "green":
			System.out.println("i'm in green");
			System.out.println("***");
			break;
		case "yellow" :
			System.out.println("i'm in yellow");
			System.out.println("***");
			break;
		
		
		}
		
	}

}
