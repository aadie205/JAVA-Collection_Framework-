import java.util.*;
class countTokens
{
	public static void main(String []args) {
		String s="Welcome to java";

		StringTokenizer st=new StringTokenizer(s);

		int n=st.countTokens();
		System.out.println(n);
	}

}