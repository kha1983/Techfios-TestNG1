package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Self_Practice {
	
	//Test Case: Search "xpath" in Yahoo
	//a. Go to Yahoo.com,
	//b. Type "xpath" in the search field,
	//c. Click on the search icon,
	//d. click on the link that says, "XPath Tutorial - W3Schools",
	//e. W3Schools page should open (Validation: if else)
	
	//Solution:
	@Test
	public void W3SchoolsPageShouldOpen()   throws Exception   {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id='header-search-input']")).sendKeys("xpath");
		
		driver.findElement(By.xpath("//*[@id='header-desktop-search-button']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("XPath Tutorial - w3schools.com")).click();
		driver.manage().window().maximize();
		

		By Page_Locator = By.xpath("//*[contains(text(),'Tutorial')]");
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Page_Locator));
		
		boolean status = driver.findElement(Page_Locator).isDisplayed();
		
		if(status==true) {
		System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed!!");
		}
		
		driver.close();
		driver.quit();
		

		
	}

}
