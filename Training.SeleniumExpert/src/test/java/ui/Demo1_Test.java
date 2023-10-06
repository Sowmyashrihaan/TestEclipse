package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1_Test{
	
@Test	
public void testmaven()

 {
	 
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
		

	}

}
