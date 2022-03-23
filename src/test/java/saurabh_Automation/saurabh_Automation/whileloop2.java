package saurabh_Automation.saurabh_Automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class whileloop2 
{

	
	  WebDriver driver;
	  
	  @Test(priority = 1) public void setup() {
	  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	  driver.manage().window().maximize();
	  }
	   
	  @Test(priority = 2)
	  public void p1()
	  {
		  List<WebElement> list = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
			 
			System.out.println(list.size());
			int i=list.size()-1;
			/*
			 * while() { list.get(i).click(); i++; if(i==4) { break; } }
			 */
		  
	  }
	 

	/*
	 * public static void main(String args[]) {
	 * 
	 * int n=100; for(int i=n;i>=0;i--) {
	 * 
	 * System.out.println(i); } }
	 */
	/*
	 * public static void main(String args[]) { int [] arry= {1,2,3,4,5,6}; for(int
	 * i: arry) { if(i%2==0); System.out.println("ddas"); } }
	 */
	
	
	
}
