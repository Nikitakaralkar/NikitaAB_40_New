package string_examples;

public class String_NoOf_Spaces {

	public static void main(String[] args) {
		
		int count=0;
		String s=" Nikita  Karalkar ";
		char ch[]= s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			boolean b= Character.isSpaceChar(ch[i]);
			
			if(b==true)
			{
				count++;
			}
		}
		System.out.println("No. of spaces present in the given string are:"  +count);

		}
	}


