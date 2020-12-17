package com.rtz.test;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Aditya");
		
		System.out.println(sb1);
		System.out.println();
		
		StringBuffer sb2=new StringBuffer();
		sb2.append("Aditya");
		System.out.println(sb2);
		System.out.println();
		
		System.out.println(sb1.equals(sb2));
		System.out.println();
		
		StringBuffer sb3=sb1;
		sb1.append("Yadav");
		System.out.println("sb1: "+sb1);
		System.out.println("sb3: "+sb3);
		System.out.println();
		
		sb3.insert(0, "Adity");
		System.out.println("sb1: "+sb1);
		System.out.println("sb3: "+sb3);
		System.out.println();
		
		sb1.insert(0, "Mr.");
		System.out.println("sb1: "+sb1);
		System.out.println("sb3: "+sb3);
		
		
	}
}
