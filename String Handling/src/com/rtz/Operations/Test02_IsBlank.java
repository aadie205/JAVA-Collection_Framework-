package com.rtz.Operations;

import java.util.Scanner;

public class Test02_IsBlank {

	public static void main(String[] args) {
		
		String s1="";
		
		System.out.println("Is s1 empty: "+s1.isEmpty()); 	//true
		System.out.println("Is s1 blank: "+s1.isBlank()); 	//true
		
		
		String s2=" ";
		
		System.out.println();
		System.out.println("Is s2 empty: "+s2.isEmpty()); 	//false
		System.out.println("Is s2 blank: "+s2.isBlank()); 	//true
		
		String s3="a";
		
		System.out.println();
		System.out.println("Is s3 empty: "+s3.isEmpty()); 	//false
		System.out.println("Is s3 blank: "+s3.isBlank()); 	//false
		
		String s4=new String();
		
		System.out.println();
		System.out.println("Is s4 empty: "+s4.isEmpty()); 	//true
		System.out.println("Is s4 blank: "+s4.isBlank()); 	//true
		
		String s5=new String("");
		
		System.out.println();
		System.out.println("Is s5 empty: "+s5.isEmpty()); 	//true
		System.out.println("Is s5 blank: "+s5.isBlank()); 	//true
		
		String s6=new String(" ");
		
		System.out.println();
		System.out.println("Is s6 empty: "+s6.isEmpty()); 	//false
		System.out.println("Is s6 blank: "+s6.isBlank()); 	//true
		
		String s7=new String("a");
		
		System.out.println();
		System.out.println("Is s7 empty: "+s7.isEmpty()); 	//false
		System.out.println("Is s7 blank: "+s7.isBlank()); 	//false
		
		String s8=null;
		
		System.out.println();
//		System.out.println("Is s8 empty: "+s8.isEmpty()); 	//RE: NPE
//		System.out.println("Is s8 blank: "+s8.isBlank()); 	//RE: NPE
		
		String s9;
		
		System.out.println();
//		System.out.println("Is s10 empty: "+s9.isEmpty()); 	//CE: variable might not have been initialized
//		System.out.println("Is s10 blank: "+s9.isBlank()); 	//CE: variable might not have been initialized
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String 1: ");
		
		String s10=sc.nextLine();
		System.out.println("Is s10 empty: "+s10.isEmpty()); 	//depends on the input
		System.out.println("Is s10 blank: "+s10.isBlank());		//depends on the input
		
		
		
		
		
		
		
		
		
		
	}

}
