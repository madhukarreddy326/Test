/*
 * This program will read two string from the user
 * To find both are Anag or not
 * Example Listen and Silent are the anag strings
 * like each character should suffel and form new string
 * New method to call to find the anag or not
 * remove the white spaces before finding the lenght or converting to char array
 * if lenght of the strings are diferent then both strings are not anag
 * convert string into character arrays
 * sort both
 * return the result of bolean value Arrays.equals(first_string,second_String)
 * 
 */
package com.funnlearn.org;

import java.util.Arrays;
import java.util.Scanner;

public class ValidateAnagramString {
	
	private static String reason=null;

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first String");
	
	String first = sc.nextLine();
	
	System.out.println("Enter Second String");
	String second = sc.nextLine();
	
	System.out.println("First String value :"+first+" Second String value is:"+second);
	
	if(validateAnaga(first,second))
			System.out.println("Both string are anag");
	else
			System.out.println("Both strings are not anag:"+reason);
		

	}

	private static boolean validateAnaga(String first, String second) {
		
		//check if both strings are same or not.
		first = first.replace("\\s","");
		second = second.replace("\\s", "");
		
		if(first.length() != second.length())
		{
			reason = "length are not same";		
				return false;
		}
		else
		{
			//convert the both the strings into char array by converting into lowercase
			char start[] = first.toLowerCase().toCharArray();
			char end[] = second.toLowerCase().toCharArray();
			
			//sort both the arrays
			Arrays.sort(start);
			Arrays.sort(end);
			
			return Arrays.equals(start, end);
			
			
			
		}
		
		
		
		//return true;
		
	}

}
