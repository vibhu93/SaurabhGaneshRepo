package saurabh_Automation.saurabh_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon
{
	WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	//Interview quation how to print hidden elements
	
	  @Test(priority =3 )
	  public void amaz() { List<WebElement> list =
	  driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
	  for(WebElement list1:list) 
	  { System.out.println(list1.getText()); }
	  
	  }
	 
	
	@Test(priority = 2)
	public void amez1()
	{
		 driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"hmenu hmenu-visible\"]//li"));
		 
		 for(WebElement list1:list)
		 {
			 System.out.println(list1.getText());
		 }
		 
	}
	

}
