package testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AllAnnotations {
	
	

	@Test
	public void test1()
	{
		System.out.println("Test");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("BM");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("AM");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("AS");
	}
	@BeforeSuite
	public void BS()
	{
		System.out.println("BS");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("AC");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("BC");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("AT");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("BT");
	}
}
