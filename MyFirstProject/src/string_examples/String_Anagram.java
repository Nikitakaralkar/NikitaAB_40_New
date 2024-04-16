package string_examples;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		
		
		String s1="horse";
		String s2="shore";
		
		char ch1[]= s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		 System.out.println(Arrays.toString(ch1));
		 System.out.println(Arrays.toString(ch2));
				
	    Arrays.sort(ch1);
	    System.out.println(Arrays.toString(ch1));
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch2));
		
		boolean b= Arrays.equals(ch1, ch2);
		if(b==true)
		{
			System.out.println("Two strings are anagrams of each other");
		}
		else
		{
			System.out.println("Two strings are not anagrams of each other");
		}
		
	}

}
