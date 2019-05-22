package testpackage.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testcase {
	
	public static void main( String[] args )
    {
	
	System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.get("http://formy-project.herokuapp.com/autocomplete");
	
	WebElement autocomplete = driver.findElement(ById.id("autocomplete"));
	autocomplete.sendKeys("NYC Road Gilboa NY,USA");
	//Implicit Wait
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//Explicit Wait
	
	
	
	
	
	
	//Thread.sleep(1000);
	WebElement pacitem = wait.until(ExpectedConditions.visibilityOfElementLocated(ById.className("pac-item"))); 
			
			//driver.findElement(ById.className("pac-item"));
	pacitem.click();
	//driver.quit();
	
    }
	

}
