package NewPackage;



import org.testng.annotations.Test;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;






public class AdminTest {
	WebDriver driver = null;
	
  @Test
  
  public void f() throws InterruptedException {
	  driver.get("http://localhost:8080/ewheelz2.0/");
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/ewheelz2.0/AdminLogin.html");
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("umersatti");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Ghostrider");
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
		driver.findElement(By.xpath("")).sendKeys("ghostrider@919");
		
		WebElement element = driver.findElement(By.xpath("<img border=\"0\" name=\"AddRoute\" src=\"Images/Menu/AddRoute0.jpg\" width=\"100\" height=\"20\" onmouseover=\"document['AddRoute'].src='Images/Menu/AddRoute1.jpg'\" onmouseout=\"document['AddRoute'].src='Images/Menu/AddRoute0.jpg'\" xpath=\"1\">"));
		element.click();
		
		driver.wait(10000);
	  
	 
	  
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
