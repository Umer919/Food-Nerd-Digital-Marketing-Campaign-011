package NewPackage;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ViewRoutesTest {
	static WebDriver driver = null;
	
  @Test
  public void f() throws InterruptedException {
	  

		driver.get("http://localhost:8080/ewheelz2.0/");
		driver.get("http://localhost:8080/ewheelz2.0/User.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[1]/frameset[1]/frame[1]")));
		driver.findElement(By.xpath("//ruffle-embed[@src='button3.swf']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ruffle-embed[@src='button3.swf']")).click();
		
		driver.findElement(By.xpath("//ruffle-embed[@src='button3.swf']")).click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions options = new ChromeOptions();
	     options.addExtensions(new File("C:\\Users\\Miste\\Downloads\\Ruffle.crx"));
	      
	     driver = new ChromeDriver(options);
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe"); 
		
		Logger.getLogger("").setLevel(Level.OFF); 
		
		driver = new ChromeDriver(); 
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); 	
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
