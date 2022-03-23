  package saurabh_Automation.saurabh_Automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

	WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	// @Test(priority = 2)
	public void linkTest() {
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> pageLinks = driver.findElements(By.cssSelector("ul li a"));
		int count = 0;
		for (WebElement li : pageLinks) {
			count++;
			System.out.println(count + ". " + li.getText().replaceAll(" ", ""));
		}
	}

	// @Test(priority = 3)
	public void goTOLink() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> pageLinks = driver.findElements(By.cssSelector("ul li a"));
		int count = 0;
		for (WebElement li : pageLinks) {
			driver.findElements(By.cssSelector("ul li a")).get(count).click();
			count++;
			Thread.sleep(500);
			driver.navigate().back();
		}
	}

	// @Test(priority = 4)
	public void getVeg() {

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> vegs = driver.findElements(By.cssSelector("h4[class='product-name']"));

		ArrayList<String> vegNames = new ArrayList<String>();

		for (int i = 0; i <= vegs.size() - 1; i++) {
			vegNames.add(vegs.get(i).getText());
		}
		System.out.println(vegNames);
	}

	// @Test(priority = 5)
	public void clickVeg() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> button = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i <= button.size() - 1; i++) {
			if (productName.get(i).getText().contains("1/4 Kg")) {
				Thread.sleep(500);
				button.get(i).click();
			}

		}
	}

	@Test(priority = 6)
	public void addSelected() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> addbutton = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		List<WebElement> pluseButton = driver.findElements(By.xpath("//a[@class='increment']"));
		String[] selectedProduct = { "Carrot - 1 Kg", "Potato - 1 Kg", "Banana - 1 Kg", "Onion - 1 Kg",
				"Musk Melon - 1 Kg" };

		for (int i = 0; i <= productName.size() - 1; i++) {
			
			for (int j = 0; j <= selectedProduct.length - 1; j++) {

				if (selectedProduct[j].equalsIgnoreCase(productName.get(i).getText())) {
					pluseButton.get(i).click();
					addbutton.get(i).click();
					System.out.println("Product Add To Cart: >>> " + productName.get(i).getText());
				
					

				}
			}

		}
		//driver.close();
	}

}
