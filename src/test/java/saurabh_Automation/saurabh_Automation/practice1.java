   package saurabh_Automation.saurabh_Automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {

	WebDriver driver;

	@Test(priority = 1)
	public void setup() { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

//@Test(priority = 2)
	public void spaces() {
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> list = driver.findElements(By.cssSelector("ul li a"));

		for (WebElement li : list) {
			System.out.println(li.getText().replaceAll(" ", ""));
		}
	}

//@Test(priority = 3)
	public void numbering() {
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> list = driver.findElements(By.cssSelector("ul li a"));
		int count = 0;
		for (WebElement li : list) {
			System.out.println(count + li.getText().replaceAll(" ", ""));
			count++;

		}
	}

	//@Test(priority = 4)
	public void names() {
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> list = driver.findElements(By.cssSelector("ul li a"));
		int count = 0;
		for (WebElement li : list) {

			driver.findElements(By.cssSelector("ul li a")).get(count).click();
			driver.navigate().back();
			count++;
		}

	}

	//@Test(priority = 5)
	public void manesveg()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> list = driver.findElements(By.xpath("//h4"));
		ArrayList<String> list1 = new ArrayList<String>();
		
		for(int i=0;i<=list.size()-1;i++)
		{
			list1.add(list.get(i).getText());
					
		}
		
		System.out.println(list1);
	}
	//@Test(priority = 6)
	public void select() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> baton = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		List<WebElement> vegName = driver.findElements(By.xpath("//h4"));
		
		for(int i=0;i<=baton.size()-1;i++)
		{
			if(vegName.get(i).getText().contains("1/4 Kg")){
				baton.get(i).click();
				System.out.println(vegName.get(i).getText());
			}
			
		}
		
		}
	@Test(priority = 7)
	public void doublefor()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> addButtons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		List<WebElement> vegNames = driver.findElements(By.xpath("//h4"));
	        String [] wishList = {"Cauliflower - 1 Kg", "Orange - 1 Kg" , "Walnuts - 1/4 Kg", "Banana - 1 Kg"};
		for(int i=0;i<=vegNames.size()-1;i++)
		{
			for(int j=0;j<=wishList.length-1;j++)
			{
				if(wishList[j].equalsIgnoreCase(vegNames.get(i).getText()))
				{
					System.out.println(vegNames.get(i).getText());
					addButtons.get(i).click();
				}
				
			}
				
			
			}
			
		
		
	}
	
}
