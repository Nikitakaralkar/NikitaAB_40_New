package string_examples;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="madam";
		String output="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char rev=s.charAt(i);
			output= output+rev;
			
		}
		
		if(s.equals(output))
		{
			System.out.println("String is Palindrome");
		}
		else
			
			System.out.println("String is Not Palindrome");
	}

}
