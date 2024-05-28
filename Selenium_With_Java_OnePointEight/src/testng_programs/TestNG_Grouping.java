package testng_programs;

import org.testng.annotations.Test;

public class TestNG_Grouping {

	
	
	@Test(groups= {"smoke"})
	public void testcase1()
	{
		
	}
	
	@Test(groups= {"smoke","system"})
	public void testcase2()
	{
		
	}
	
	@Test(groups= {"regression","system"})
	public void testcase3()
	{
		
	}
	@Test(groups= {"system"})
	public void testcase4()
	{
		
	}
	
	@Test(groups= {"system"})
	public void testcase5()
	{
		
	}
	
	@Test(groups= {"system"})
	public void testcase6()
	{
		
	}
	
	@Test(groups= {"system"})
	public void testcase7()
	{
		
	}
}

