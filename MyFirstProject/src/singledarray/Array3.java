package singledarray;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		
		
		int age[] = new int[3];
		age[0]=20;
		age[1]=30;
		age[2]=25;
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		
		for(int i=0;i<3;i++)
		{
			System.out.println(age[i]);
			 
		}
		
		System.out.println(Arrays.toString(age)); 
	}

}
