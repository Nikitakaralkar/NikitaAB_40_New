package myassignments;

public class Assignment21 {

	public static void main(String[] args) {
		
		
		String s="Nikita";
		int  alpha_count=0;
		char ch[]= s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			boolean alpha = Character.isAlphabetic(ch[i]);
			
			
			if(alpha==true)
			{
				alpha_count++;
			}
	
		}
		if(s.length()==alpha_count)
		{
			System.out.println("Given string only consists of alphabets");
		}
		else
		{
			System.out.println("Given string does not consists only alphabets");
		}

	}

}
