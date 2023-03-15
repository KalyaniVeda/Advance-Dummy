package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
@Test
public class MyTest {
	
	public void m1()
	{
		WebDriver driver = null;
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("browser"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Not Launched");
		}
			driver.get(url);
	}

}
