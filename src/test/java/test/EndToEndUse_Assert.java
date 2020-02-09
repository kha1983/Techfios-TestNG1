package test;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndUse_Assert {
	
	//Scenario:

		//Open the web page: https://www.google.com on the Chrome browser.
		//Verify if the opened page title is equivalent to that of expected page title using the asserttrue method.
		//On the search textbox, enter the search keyword: selenium.
		//Hit the Enter button on the keyboard.
		//Verify if the opened page title on the search results page is equivalent to that of the expected page title using the assertequals method and assertfalse method.
		//Close the browser.
	
	
	//Solution:
	
	@Test
	public void UserWillAbleToUseAllAssertation() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		// Validate if actual web page title matches with that of expected title using assert true method
		String expectedTitle = "Google";
		driver.manage().window().maximize();

		
		System.out.println("Assert true method validation");
		
		Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
		
		
		// Enter the keyword selenium on the search textbox
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@title='Search']"));
		
		searchBox.sendKeys("selenium");
		
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		
		 
		
		// Validate the actual page title with expected page title using assert equals method
		
		String expectedText = "selenium - Google Search";

		System.out.println("Assert equals method validation");
		
		Assert.assertEquals(expectedText, driver.getTitle());
		
		
		// Page title validation using assert false method
		
		System.out.println("Assert false method validation");
		
		Assert.assertFalse(false,"Title does match");
		
		driver.close();
		driver.quit();



		
		



	}
	

}
