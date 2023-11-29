package NewJenkins;

import org.testng.annotations.Test;

public class HelloTest1 
{
	@Test(groups="smoke")
	public void data()
	{
		System.out.println("smoke testing is passed");
		
		
	}
	
	@Test(groups="regression")
	public void data1()
	{
		System.out.println("Regression testing is passed");
		System.out.println("ok done");

		
		
	}

}


