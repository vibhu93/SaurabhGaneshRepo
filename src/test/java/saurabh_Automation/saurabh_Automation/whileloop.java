package saurabh_Automation.saurabh_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class whileloop 
{
	WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	}
	@Test(priority = 2)
	public void w1()
	{
		 List<WebElement> list = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		 
		System.out.println(list.size());
		int i=list.size()-1;
		
	int count=0;
		while(i>=count)
		{
			list.get(count).click();
			count++;
			if(count==4 || count==8)break;
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
