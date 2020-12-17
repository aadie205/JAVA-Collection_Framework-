class StringToOther {
     public static void main(String[] args){
		  String s="Welcome";
		  byte b[]=s.getBytes();

		  for(byte b1: b)
			  System.out.println(b1);

		char ch[]=s.toCharArray();
		
		for(char ch2:ch)
		  System.out.println(ch2);
	
		
	 }
}