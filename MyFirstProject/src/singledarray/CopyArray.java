package singledarray;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[]=new int[4];
		int a[] = new int[4];
		a[0]= 5;
		a[1]=6;
		a[2]=33;
		a[3]=7;
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			
		
		 
		}
		
		System.out.println("First array"+Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
