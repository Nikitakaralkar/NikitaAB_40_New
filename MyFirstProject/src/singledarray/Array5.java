package singledarray;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		
		int n1[] = new int[3];
		int n2[] = new int[3];
		
		n1[0]=20;
		n1[1]=10;
		n1[2]=10;
		
		n2[0]=20;
		n2[1]=10;
		n2[2]=10;
		
		boolean answer= Arrays.equals(n1, n2);
       System.out.println(answer);
	}

}
