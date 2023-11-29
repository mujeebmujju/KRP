package NewJenkins;

import org.testng.annotations.Test;

public class HelloTest 
{
	@Test(groups="smoke")
	public void data()
	{
		System.out.println("Mujeeb Passed with smoke Testing");
		
		
	}
	
	@Test(groups="regression")
	public void data1()
	{
		System.out.println("Rehaman Passed with smoke testing");
		
		
	}

}


