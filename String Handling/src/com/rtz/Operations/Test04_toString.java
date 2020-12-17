package com.rtz.Operations;

public class Test04_toString {
	static String s5;
	static A a4;
	public static void main(String[] args) {
		
		String s1="Hari";
		System.out.println("s1: "+s1);
		System.out.println("s1: "+s1.toString());
		System.out.println();
		
		String s2=new String("Naresh IT");
		System.out.println("s2: "+s2);
		System.out.println("s2: "+s2.toString());
		System.out.println();
		
		String s3=null;
		System.out.println("s3: "+s3);
//		System.out.println("s3: "+s3.toString());
		System.out.println();
		
		String s4;
//		System.out.println("s4: "+s4);	//CE: local variable might have not been initialized
		
		System.out.println("s5: "+s5);
//		System.out.println("s5: "+s5.toString());	//RE: NPE
		
		A a1=new A(567);
		System.out.println("a1: "+a1);
		System.out.println("a1: "+a1.hashCode());

		A a2=null;
		System.out.println("a2: "+a2);
//		System.out.println("a2: "+a2.toString());	//RE: NPE
		
		A a3;
//		System.out.println("a3: "+a3); CE: local variable a3 might not have been initialized
		
		System.out.println("a4: "+a4);
		
		
		
		
		
	}

}//Test04_toString


class A{
	private int x;

	public A(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return ""+x;
	}
	
}