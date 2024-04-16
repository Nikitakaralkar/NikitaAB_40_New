package singledarray;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int roll_no[]= new int[4];
		roll_no[0]=90;
		roll_no[1]=6;
		roll_no[2]=66;
		roll_no[3]=5;
		
		int number_to_check=6;
		
		for(int i=0;i<roll_no.length;i++)
		{
			if(roll_no[i]==number_to_check)
			{
				System.out.println("we found the number"+number_to_check+"At the index position"+i);
			}
			else
			{
				//System.out.println("Sorry we could not found the number"+number_to_check+"At the index position"+i);
			}
		}
		
		
	}

}
