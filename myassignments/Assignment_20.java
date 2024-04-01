package myassignments;

public class Assignment_20 {

	public static void main(String[] args) {


		int count=0;
		String s="Manish123  $#  Kumar ";
		char ch[]= s.toCharArray();
        int space_count=0, alpha_count=0, digit_count=0;
        
		for(int i=0;i<s.length();i++)
		{
			boolean alpha = Character.isAlphabetic(ch[i]);
			boolean digit= Character.isDigit(ch[i]);
			boolean spaces= Character.isSpaceChar(ch[i]);
			
			if(alpha==true)
			{
				alpha_count++;
			}
			else if(digit==true)
			{
				digit_count++;
			}
			else if(spaces==true)
			{
				space_count++;
			}
		}
		
		int total_count= alpha_count+digit_count+space_count;
		int Spechar = s.length()- total_count;
		System.out.println("No. of special characters present in the given string are:"  +Spechar);


	}

}
