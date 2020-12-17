package com.rtz.Operations;

public class Test06_equals {

	public static void main(String[] args) {
		
		String s1="a";
		String s2="a";
		String s3=new String("a");
		String s4=new String("a");
		
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("a");
		
		System.out.println();
		System.out.println(s1==s2);				//true
		System.out.println(s3==s4);				//false
		
		System.out.println();
		System.out.println(s3==s4); 			//false
		System.out.println(sb1==sb2);			//false
		
		System.out.println();
		System.out.println(s1.equals(s2)); 		//true
		System.out.println(s3.equals(s4)); 		//true
		
		String s5="a";
		String s6="A";
		
		System.out.println();
		System.out.println(s5==s6);						//false
		System.out.println(s5.equals(s6));				//false
		System.out.println(s5.equalsIgnoreCase(s6));	//true
		
		Example e1=new Example(5);
		Example e2=new Example(5);
		Example e3=new Example(6);
		Example e4=e3;
		
		System.out.println();
		System.out.println(e1==e2);				//false
		System.out.println(e2==e3); 			//false
		System.out.println(e3==e4); 			//true
		
		System.out.println();
		System.out.println(e1.equals(e2));		//true
		System.out.println(e2.equals(e3)); 		//false
		System.out.println(e3.equals(e4)); 		//true
		
		Sample sa1=new Sample();
		System.out.println();
//		System.out.println(e1==sa1);			//CE: Incompatible type
		System.out.println(sa1.equals(e1));		//false
		System.out.println(e1.equals(sa1)); 	//false
		System.out.println(sa1==null); 			//false
		System.out.println(sa1.equals(null));	//false
		System.out.println(e1==null);			//false
		System.out.println(e1.equals(null)); 	//false
		
		
	}//main

}//class

