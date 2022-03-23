package saurabh_Automation.saurabh_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice2
{
	WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test(priority = 2)
public void clicke()
	{
		driver.get("driver.get(\"https://the-internet.herokuapp.com/\");");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"_1mkliO\"]"));
		
		for(WebElement li:list){
			
			if(li.getText().equalsIgnoreCase("Appliances")) {
				li.click();
			}
			
		}
	
}
}
