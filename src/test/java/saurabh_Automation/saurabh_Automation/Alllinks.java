package saurabh_Automation.saurabh_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alllinks 

{ 
	WebDriver driver;
	@Test(priority = 1)
	public void setup()
	{ 
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		 
	}
     
	@Test(priority = 2)
	public void linkTest()
	
	{
    List<WebElement> li =driver.findElements(By.xpath("//li/a"));
    for(WebElement gi:li) {
    System.out.println(gi.getText());
    
    }
		
		
		}
}
