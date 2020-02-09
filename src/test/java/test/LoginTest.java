package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeMethod
	public void openBrowser()     {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		driver.get("https://www.yahoo.com");
	}
	@Test
	public void userShouldBeAbleToAddDeposit()  throws Exception  {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://techfios.com/test/billing/?ng=login/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password') and contains(@class,'form-control')]")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//*[contains(text(),'Sign in') and @name='login']")).click();
		Thread.sleep(5000);
		
	}
	@Test
	public void userShouldBeAbleToAddDeposit1()  throws Exception  {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://techfios.com/test/billing/?ng=login/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password') and contains(@class,'form-control')]")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//*[contains(text(),'Sign in') and @name='logi']")).click();
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void CloseEverything()    {
		
		WebDriver driver=new ChromeDriver();
		
		driver.close();
		driver.quit();
		
		
		
	}
	
	

}
