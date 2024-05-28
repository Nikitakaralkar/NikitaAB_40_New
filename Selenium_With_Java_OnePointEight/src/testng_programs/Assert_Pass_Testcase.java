package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Pass_Testcase {
	
	
	@Test
	public void testcase1()//fail tescase
	{
		Assert.assertTrue(false);	}
	
	@Test
	public void testcase2()// Pass testcase
	{
		Assert.assertTrue(true);
	}

}
