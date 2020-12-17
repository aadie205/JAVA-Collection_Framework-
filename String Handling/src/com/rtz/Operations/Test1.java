package com.rtz.Operations;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		
		String s1 = sc.nextLine();
		System.out.println(s1);
		String s2[] = s1.split(" ");

		int n = 0;
		int s = 0;
		int p = 0;

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				n = Integer.parseInt(s2[i]);
			} else if (i == 1)
				s = Integer.parseInt(s2[i]);
			else
				p = Integer.parseInt(s2[i]);
		}

		int power[] = new int[n];

		String s3 = sc.nextLine();
		String s4[] = s3.split(" ");

		for (int i = 0; i < n; i++) {
			power[i] = Integer.parseInt(s4[i]);
		}

		for (int i = 0; i < n; i++)
			System.out.println(power[i]);
		 int pos=0;
		while(true) {
			
			
//			for(pos=s; ;) {
//				if(pos)
//			}
//			
		}
	}

}
