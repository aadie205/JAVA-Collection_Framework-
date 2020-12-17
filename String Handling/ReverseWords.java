class ReverseWords{
	public static void main(String args[]){
		String s1="How are You?";

		String[] s2=s1.split(" "); //Spliting the string into tockens
		String[] s3=new String[s2.length];	//creating new String[] with same size of original array

		int j=0;	
		
		for(int i=s2.length; i>0; i--,j++)
			s3[j]=s2[i-1];						//logic to reverse

		System.out.println("Given String: "+java.util.Arrays.toString(s2));
		System.out.println("After Reverse:"+java.util.Arrays.toString(s3));
		System.out.println();
	}
}