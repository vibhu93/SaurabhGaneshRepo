package saurabh_Automation.saurabh_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google
{
	public static void main(String[] args)
	{
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}

}
