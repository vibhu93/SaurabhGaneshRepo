package saurabh_Automation.saurabh_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table
{


	WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}
	//@Test(priority = 2)
	public void table()
	{
	 List<WebElement> list = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr"));
		
		for(int i=0;i<=list.size()-1;i++)
		{			System.out.println(list.get(i).getText());
		}
	}
	
	@Test(priority = 3)
	public void lastIndexOfTable() {
		WebElement lastRow = driver.findElement(By.xpath("(((//table[@id='product'])[1]/tbody/tr)[last()])"));
		System.out.println(lastRow.getText());
	}
}
