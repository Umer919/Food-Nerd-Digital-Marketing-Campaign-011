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

public class BookTicketsTest {
	static WebDriver driver = null;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://localhost:8080/ewheelz2.0/");
		driver.get("http://localhost:8080/ewheelz2.0/User.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[1]/frameset[1]/frame[1]")));
		driver.findElement(By.xpath("//ruffle-embed[@src='button4.swf']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ruffle-embed[@src='button4.swf']")).click();
		driver.findElement(By.xpath("//ruffle-embed[@src='button4.swf']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name = 'tgt']")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("datepicker")).sendKeys("11/20/2022");
		
	    driver.findElement(By.xpath("//font[contains(text(),'Book Tickets\n"
	    		+ "Now')]")).click();
	    driver.findElement(By.xpath("//tbody/tr[4]/td[2]/select[1]")).sendKeys("any");
	    driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("12");
	    driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
	    driver.findElement(By.xpath("https://www.business.qld.gov.au/starting-business/planning/market-customer-research/swot-analysis/uses#:~:text=A%20SWOT%20analysis%20will%20help,t%20lose%20your%20competitive%20advantage.")).click();
	    
		
		Thread.sleep(2000);
		
		
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
