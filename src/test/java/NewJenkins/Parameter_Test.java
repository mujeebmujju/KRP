package NewJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameter_Test 
{
	public WebDriver driver;
	@Test
	public void Test()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println("BROWSER");
		System.out.println("URL");

		
		if (BROWSER.equals("chrome")) 
		{
			driver=new ChromeDriver();
			
		}
		
		else if (BROWSER.equals("firefox")) 
		{
			driver=new FirefoxDriver();

		} 
		
		else if (BROWSER.equals("edge")) 
		{
			driver=new EdgeDriver();

			
		}
		
		driver.get(URL);

		
	}

}
