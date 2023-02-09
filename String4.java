package com.lab;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("String:");

			String str = sc.nextLine();

			char[] abc = str.toCharArray();

			System.out.println("Dublicate:");

			for (int i = 0; i < str.length(); i++)
			{

				for (int j = i + 1; j < str.length(); j++)
				{

					if (abc[i] == abc[j]) 
					{

						System.out.println(abc[j]);

					}

				}

			}

	}

}
