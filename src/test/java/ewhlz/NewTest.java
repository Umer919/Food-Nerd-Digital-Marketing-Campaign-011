package ewhlz;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class NewTest{
	

static WebDriver driver = null; 



	public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe"); 
		
		Logger.getLogger("").setLevel(Level.OFF); 
		
		driver = new ChromeDriver(); 
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); 	
	
		driver.get("http://localhost:8080/ewheelz2.0/");
		
		
	}	
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
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
