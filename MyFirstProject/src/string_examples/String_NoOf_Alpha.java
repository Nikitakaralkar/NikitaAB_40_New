package string_examples;

public class String_NoOf_Alpha {

	public static void main(String[] args) {
		
		String name="Nikita1234";
		int count=0;
		
		char ch[]=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			boolean result= Character.isAlphabetic(ch[i]);
			if(result==true)
			{
				count++;
			}
		}
		System.out.println("No. of Alphabets present in the given string are:"  +count);

	}

}
