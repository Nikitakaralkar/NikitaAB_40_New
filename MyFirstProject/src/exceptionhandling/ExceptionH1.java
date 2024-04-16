package exceptionhandling;

public class ExceptionH1 {

	public static void main(String[] args) {
		
		
		try
		{
		  int c=1/0;
		  System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
		
			System.out.println("If exception occurs then catch block will get executed");
		}

		catch(NullPointerException a2)
		{
		
			System.out.println("If exception occurs then catch block will get executed");
		}
		
		//catch(InputMismatchException a3)
		{
		
			System.out.println("If exception occurs then catch block will get executed");
		}
		
		//catch(ArrayIndexOutOfBoundException a1)
		{
		
			System.out.println("If exception occurs then catch block will get executed");
		}
	}

}
