package saurabh_Automation.saurabh_Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown 
{
	WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

	}
	@Test(priority = 2)
	public void dropdow()
	{
		Select s=new Select(driver.findElement(By.xpath("//select")));
		s.selectByIndex(1);
		
	}
}
