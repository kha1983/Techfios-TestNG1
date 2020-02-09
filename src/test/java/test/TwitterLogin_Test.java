package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TwitterLogin_Test {
	
	@Test
	
	public void UserWillAbleToLogin()  throws Exception   {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twitter.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("9722158094");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("KK56357citi");
		
		driver.findElement(By.xpath("//*[@role='button']")).click();
		
		Thread.sleep(5000);
		
		//Validation by using if and else
		//Hidden Element Verification

		boolean status = driver.findElement(By.linkText("Home")).isDisplayed();
			
			if(status){
				System.out.println("Element is visible and Test passed");
			} else {
				System.out.println("Could not find the element");
				
				throw new RuntimeException("Test Failed");
			}
			
			
			
			//Checkbox Validation
			//boolean status = Driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
			
			//if(status){
				//System.out.println("Checkbox is checked");
			//} else {
				//System.out.println("Checkbox is unchecked");
			//}
			
			
			//Radio Button Validation

		//boolean status = Driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
			
			//if(status){
				//System.out.println("Checkbox is checked");
			//} else {
				//System.out.println("Checkbox is unchecked");
			//}
			
			
			//Drop down Validation

		//Select dropdown = new Select(Driver.findElement(By.id("searchList")));
			
			//boolean status = dropdown.isMultiple();
			
			//if(status){
			//	System.out.println("Allows multiple selection");
			//} else {
			//	System.out.println("Does not allow multiple selection");
			//}
		

		
		//Assert.assertEquals(Actual_Title, Expected_Title, "Element did not display");
		
		//WebDriverWait wait =new WebDriverWait(driver, 1);
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Element_Title_Xpath)));

		driver.close();
		driver.quit();
		
		
	}

}
