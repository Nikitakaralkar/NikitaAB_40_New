package testng_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Program {
	
	@Test
	public void testcase1()
	{
		Assert.assertEquals(false,true);
		Assert.assertEquals(0,1);
		Assert.assertEquals("Amazon", "Google");
	}
	
	@Test
	public void testcase2()
	{
		Assert.assertTrue(true);
	}


}
