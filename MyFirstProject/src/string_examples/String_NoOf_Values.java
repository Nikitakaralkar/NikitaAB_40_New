package string_examples;

public class String_NoOf_Values {

	public static void main(String[] args) {
		
		
		int count=0;
		String name ="Manish1234";
		boolean answer;
		
		char ch[] = name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			answer=Character.isDigit(ch[i]);
			//System.out.println(answer);
			
			if(answer==true)
			{
				count++;
			}
		}
		System.out.println("No. of Numeric in given string are:"  +count);
		
		
		

	}

}
