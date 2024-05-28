package testng_programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case5 {
	
	@BeforeMethod
	public void launch_browser()
	{
		System.out.println("Launch");
	}

	@Test
	public void testcase1()
	{
		System.out.println("1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("2");
	}

	@AfterMethod
	public void close_browser()
	{
		System.out.println("Quit");

	}

}
