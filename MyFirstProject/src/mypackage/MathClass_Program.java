package mypackage;

public class MathClass_Program {

	public static void main(String[] args) {
		
		double pivalue=Math.PI;
		
		System.out.println(pivalue);
		System.out.println(Math.addExact(100, 900));
		System.out.println(Math.subtractExact(100, 900));
		System.out.println(Math.multiplyExact(10, 9));
		System.out.println(Math.max(10, 9));
		System.out.println(Math.min(10, 9));
		
		for(int i=0;i<10;i++)
		{
		System.out.println(Math.random());
		}
		
		System.out.println(Math.sqrt(100));

	}

}
