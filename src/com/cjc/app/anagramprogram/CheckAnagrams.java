package com.cjc.app.anagramprogram;

import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

public class CheckAnagrams

{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string");
		
		String s1= sc.nextLine();
		
		System.out.println("Enter the second String");
		String s2= sc.nextLine();
		
		//String s1= new String("Leader");
		//String s2= new String("Dealer");
		
		if(s1.length()!= s2.length())
		{
			System.out.println("Not an anagrams");
		}
		else
		{
			char [] string1=s1.toUpperCase().toCharArray();
			char [] string2=s2.toUpperCase().toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			//Status =Arrays.equals(string1, string2);
		
		if(Arrays.equals(string1, string2))
		{
			System.out.println("its an Anagram");
			}
		else {
			System.out.println("not anagrams");
		}
		}
		
		
	}
}
