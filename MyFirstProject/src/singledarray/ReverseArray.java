package singledarray;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int b[]=new int[4];
		int a[] = new int[4];
		a[0]= 5;
		a[1]=6;
		a[2]=33;
		a[3]=7;
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		for(int i=b.length-1;i>=0;i--)
		{
			//System.out.println(a[i]);
			System.out.println(Arrays.toString(a));
		}
		/* int k=b.length-1;
		
		
		
		for(int i=0;i<a.length;i++)
		{
			b[k]=a[i];
			k--;
			}
			*/
		
		 
		
		
		//System.out.println("The given array is"+Arrays.toString(a));
		//System.out.println("Reverse array is"+Arrays.toString(b));


	}

}
