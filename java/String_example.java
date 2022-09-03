package com.ust;

public class String_example {
	public static void main(String args[]) {
		String str="   Ashiq   ";
		String str1=new String("manju");
		//str=str+str1;
		System.out.println(str+str1);
		System.out.println(str.toUpperCase());
		if(str.trim().equals("Ashiq")) {
			System.out.println("equals");
		}
		
		
		System.out.println(str1.startsWith("m"));
		System.out.println(str1.substring(3));
		
		
		
		
	}

}
