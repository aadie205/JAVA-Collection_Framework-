package com.rtz.test;

public class TestString {

	public static void main(String[] args) {
		
		char[] ch= {'A','d','i'};
		System.out.println(ch);
		
		
		String st1=new String();
		st1="Adi";
		System.out.println(st1);
		System.out.println();
		
		System.out.println(ch.equals(st1));
		System.out.println();
		
		String st2=new String("Adi");
		System.out.println(st2);
		
		String st3="Adi";
		System.out.println(st3);
		
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		
		String s1="Aditya";
		System.out.println();
		System.out.println(s1);
		
		String s2=s1;
		System.out.println();
		System.out.println(s2);
		
		s1="Yadav";
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
	}
	

}
