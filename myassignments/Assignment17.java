package myassignments;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		
	
		System.out.println("Enter string to check if its Palindrome or not");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String output="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char rev=s.charAt(i);
			
			output=output+rev;
		}
		System.out.println("Reversed string is:"  +output);
		
		if(s.contentEquals(output))
		{
			System.out.println("string is Palindrome");
		}
		else
		{
			System.out.println("string is not Palindrome");
		}
	}

}
