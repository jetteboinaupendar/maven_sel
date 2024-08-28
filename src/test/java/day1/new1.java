package day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class new1 {

	
	//public static void main(String[] args) throws IOException {
	WebDriver driver;
	@BeforeClass
	@Test
	public void m1() {
		
		 //ChromeDriver driver = new ChromeDriver();
		
		
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		 String mm=driver.getPageSource();
		 System.out.println(mm);
		 
	

		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 WebElement l =driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]"));
		 l.click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement ll =driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
		 ll.sendKeys("telugu songs");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@Test
	public void m2() throws IOException {
		 // Take a screenshot
         File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

         // Specify the location to save the screenshot
         File destinationFile = new File("C:\\Users\\upend\\OneDrive\\Pictures\\Screenshots.png");
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

         // Copy the screenshot to the specified location
         FileUtils.copyFile(screenshot, destinationFile);
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         
         
	}
	@AfterMethod
	@Test
	public void qiutt() {
		driver.quit();
	}
         
         
		

	     	}

