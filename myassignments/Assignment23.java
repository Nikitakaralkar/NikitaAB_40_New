package myassignments;

import java.util.Arrays;

public class Assignment23 {

	public static void main(String[] args) {
		
		
		try 
		{
			int a[]= new int[3];
			a[0]=20;
			a[1]=21;
			a[2]=30;
			a[3]=40;
			
		  System.out.println(Arrays.toString(a));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		  System.out.println("Array Index Out of Bounds Exception");
		}
	}
}
