package com.rtz.test;

public class Test02 {

	public static void main(String[] args) {
		
		char[] ch1= {'a','b','c','d','e','f','g'};
		
		String s1=new String(ch1);
		System.out.println(s1);
		
		String s2=new String(ch1,1,2);
		System.out.println(s2);
		
		byte[] b1= {5,6,7};
		String s3=new String(b1);
		System.out.println(s3);
	
		byte[] b2= {65,66,67,97,98,99};
		String s4=new String(b2);
		System.out.println(s4);
		
		String s5=new String(b2,2,3);
		System.out.println(s5);
		
		String s6=new String(ch1,3,3);
		System.out.println(s6);

//		String s7=new String(null);
		String s8=null;
//		String s9=new String(s8);
//		System.out.println(s9);
	
//		String s10=new String((String)s8);
		
		System.out.println("s8: "+s8);
//		System.out.println("s8: "+s8.length());
		
		String s11="null";
		System.out.println("s11: "+s11);
		System.out.println("s11 length: "+s11.length());
		
		
		
		
		
		
	
	}

}
