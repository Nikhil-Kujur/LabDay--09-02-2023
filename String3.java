package com.lab;


public class String3 {
	public static void main(String[] args) 
	{
		
		String[] name = {"Peter", "Amy", "John", "Boyd", "Cathy"};
		int[] value = {15, 9, 14, 10, 12};
		
		System.out.println("Name  Value");
		
		for(int i = 0; i < name.length; i++) 
		
			System.out.println(name[i] + "  " + value[i]);
		
	}

}