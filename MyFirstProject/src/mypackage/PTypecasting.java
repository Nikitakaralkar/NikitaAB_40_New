package mypackage;

public class PTypecasting {

	public static void main(String[] args) {
		
		//implicit syntax
		double weight=    83;            
		System.out.println(weight);

		//explicit syntax of widining
		double weight1=(double)   83;           
		System.out.println(weight1);
		
		int a1= (int)  83.65;   ////narrowing
				System.out.println(a1);
				
				double a=90.87;
				int b= (int) a;
				System.out.println(a);
	}

}
