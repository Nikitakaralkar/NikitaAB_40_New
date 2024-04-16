package string_examples;

public class Str2 {

	public static void main(String[] args) {
		
		
		String name="Manish1";
		char ch[] = name.toCharArray();
		
	boolean b = Character.isDigit(ch[0]);
	System.out.println(b);
	
	for(int i=0;i<name.length();i++)
	{
		boolean b1=Character.isDigit(ch[i]);
		System.out.println();
		
		if(b1==true)
		{
			System.out.println("Numeric is present");
		}
	}

	}

}
