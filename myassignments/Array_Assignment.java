package myassignments;

public class Array_Assignment {

	public static void main(String[] args) {
		
		int roll_no[]= new int[5];
		roll_no[0]= 1;
	    roll_no[1]= 2;
	    roll_no[2]= 3;
	    roll_no[3]= 4;
	    roll_no[4]= 5;
	    
	    String student_name[] = new String[5];
	    student_name[0]= "Kushal";
	    student_name[1]= "Kushal P";
	    student_name[2]= "Vishal Prasad";
	    student_name[3]= "Monica Rawat";
	    student_name[4]= "Kushagra Verma";
	    
	    char gender[] = new char[5];
	    gender[0]='M';
	    gender[1]='M';
	    gender[2]='M';
	    gender[3]='F';
	    gender[4]='M';
	    
		int mob_no[]= new int[5];
		mob_no[0]= 968574;
		mob_no[1]= 857412;
		mob_no[2]= 857412;
		mob_no[3]= 968574;
		mob_no[4]= 857412;
		
		System.out.println("Roll No." +" "+ "Student Name"+ "  " +"Gender"+ "  " +"Mobile Number");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(" " +roll_no[i]+"       "+ student_name[i]+ "         " + gender[i]+ "       " +mob_no[i]);
		}
	}
}



/* for(int i=0;i<=4;i++)
{
	
	System.out.print("Student Name" +student_name[i]+ "");
	System.out.print("Gender" +gender[i]+ "");
	System.out.print("Mobile Number" +mob_no[i]+ "");
	System.out.print("Roll No" +roll_no[i]+ "");
}

for(int i=0;i<=4;i++)
{
	
	System.out.print("Student Name" +student_name[i]+ "");
} for(int i=0;i<=4;i++)
{
	System.out.print("Gender" +gender[i]+ "");
} for(int i=0;i<=4;i++)
{
	System.out.print("Mobile Number" +mob_no[i]+ "");
}  
for(int i=0;i<=4;i++) {
	System.out.println("Roll No" +roll_no[i]+ "");
}
*/
