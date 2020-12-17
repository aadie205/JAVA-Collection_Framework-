package com.rtz.Operations;

import java.util.Scanner;

public class Test03_lengthTest {

	public static void main(String[] args) {
		
		String s1="";
		System.out.println("s1 length: "+s1.length()); 	//0
		
		String s2=" ";
		System.out.println("\ns2 length: "+s2.length());	//1
		
		String s3="ab";
		System.out.println("\ns3 length: "+s3.length());	//2
		
		String s4=new String();
		System.out.println("\ns4 length: "+s4.length());	//0
	
		String s5=new String("");
		System.out.println("\ns5 length: "+s5.length());	//0
		
		String s6=new String(" ");
		System.out.println("\ns6 length: "+s6.length()); 	//1
		
		String s7=new String("ab");	
		System.out.println("\ns7 length: "+s7.length()); 	//2
		
		String s8=null;
//		System.out.println("\ns8 length: "+s8.length()); 	//RE: NPE
		
		String s9;
//		System.out.println("\ns9 length: "+s9.length()); 	//CE: local variable might not have been initialized
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String 1: ");
		System.out.println("length of String is :"+sc.nextLine().length()); 	//Depends on the input provided.
		
		
		
		
		
		
		
	}

}
