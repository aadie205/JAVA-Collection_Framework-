package com.rtz.Operations;

import java.util.Scanner;

public class Test01_IsEmpty {

	public static void main(String[] args) {
		
		String s1="";
		String s2=" ";
		String s3="a";
		String s4=new String();
		String s5=new String("");
		String s6=new String(" ");
		String s7=new String("a");
		
		System.out.println("Is s1 empty: "+s1.isEmpty());	//true
		System.out.println("Is s2 empty: "+s2.isEmpty());	//false
		System.out.println("Is s3 empty: "+s3.isEmpty());	//false
		System.out.println("Is s4 empty: "+s4.isEmpty());	//true
		System.out.println("Is s5 empty: "+s5.isEmpty());	//true
		System.out.println("Is s6 empty: "+s6.isEmpty());	//false
		System.out.println("Is s7 empty: "+s7.isEmpty());	//false
		
		String s8=null;
//		System.out.println("Is s8 empty: "+s8.isEmpty());	//NPE
		
		String s9;
//		System.out.println("Is s9 empty: "+s9.isEmpty()); 	//RE: variable might not have been intialized
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String 1: ");
		System.out.println(sc.nextLine().isEmpty());	//Depends on the input
		
		
		
	}

}
