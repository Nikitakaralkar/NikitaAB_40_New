package mypackage;

public class Continue_Keyword {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<6;i++)
		{
			if(i==4)
			{
				continue;    //iteration will be skipped
			}
			System.out.println("My age is"+i);
		}

	}

}
