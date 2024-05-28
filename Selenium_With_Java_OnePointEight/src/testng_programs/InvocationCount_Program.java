package testng_programs;

import org.testng.annotations.Test;
public class InvocationCount_Program {

	@Test(timeOut=5000, priority=-1, invocationCount=10)
	public void method1()
	{
		System.out.println("Nikita");

	}
	
	@Test(enabled=false)
	public void method2()
	{
		System.out.println("Student");

	}
}
