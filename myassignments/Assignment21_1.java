package myassignments;

public class Assignment21_1 {

	public static void main(String[] args) {
		
		String s="12345";
		int  count=0;
		char ch[]= s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			boolean alpha = Character.isDigit(ch[i]);
			
			
			if(alpha==true)
			{
				count++;
			}
	
		}
		if(s.length()==count)
		{
			System.out.println("Given string only consists of Digits");
		}
		else
		{
			System.out.println("Given string does not consists only Digits");
		}


	}

}
