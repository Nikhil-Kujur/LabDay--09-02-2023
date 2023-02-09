package com.lab;

import java.util.*;
public class String1 {
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);

		System.out.println("Enter text:");

		String text = s.nextLine();


		String text2 = "";

		for (int i = 0; i < text.length() - 4; i++) 
		{

		text2 = text2 + "X";

		}

		text2 += text.substring(text.length() - 4);

		System.out.println(text2);

		}}

