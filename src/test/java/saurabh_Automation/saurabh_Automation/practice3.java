 package saurabh_Automation.saurabh_Automation;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice3
{
	WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();


}
	
	//@Test(priority = 2)
	public void linnks(){
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> list = driver.findElements(By.xpath("(//div[@id='gf-BIG']//td)[2]//li"));
	int count=0;
		for(int i=1;i<=list.size()-1;i++) {
			System.out.println(list.get(i).getText());
			/*
			 * count++; if(count==4)break;
			 */
		}
	}
	
	//@Test(priority = 3)
	public void prices() 
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> vegNames = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> list1 = driver.findElements(By.xpath("//p[@class=\"product-price\"]"));
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		for(int i=0;i<=vegNames.size()-1;i++) {
			
			capitalCities.put(vegNames.get(i).getText(), list1.get(i).getText());
			
		}
		//System.out.println(capitalCities);
		String vegName ="Pumpkin - 1 Kg";
		
		for(Entry<String, String> map:capitalCities.entrySet())
		{
			
			if((map.getKey().equalsIgnoreCase(vegName))) {
				System.out.println(map.getKey()+ " Price IS: >> " + map.getValue());	
			}
			
		}
		
		
	}
	
	@Test(priority = 4)
	public void click1()
	{
		List<WebElement> list = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> list1 = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		
	}
	
	
	
	
	
	
	
	
}