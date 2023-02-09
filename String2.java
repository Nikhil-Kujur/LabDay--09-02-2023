package com.lab;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upto four Strings");
		String[] s = new String[20];
		for(int i=0;i<4;i++) {
		s[i] = sc.nextLine();
		}
		String result = concat(s);
		System.out.println(result);

	}

	private static String concat(String[] str) {
		String res = "";
		if (str != null) 
		{ 
			for (int i = 0; i < str.length; i++) 
			{ 
				res += str[i];
			}
		}
		return res;
	}

}

