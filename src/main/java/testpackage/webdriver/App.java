package testpackage.webdriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


//import org.junit.jupiter.api.Assertions;

//import org.junit.Assert.*;

public class App 
{
	
	
    public static void main( String[] args ) throws InterruptedException
    {
    		
    	System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	
    	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Tools\\chromedriver\\extent.html");
    	
    	// create ExtentReports and attach reporter(s)
    	ExtentReports extent = new ExtentReports();
    			
    	extent.attachReporter(htmlReporter);
    	 
    	// creates a toggle for the given test, adds all log events under it    
    	ExtentTest test = extent.createTest("Fill in Form", "Formy");
    			
    			
    	
    	driver.get("http://formy-project.herokuapp.com/form");

    	FormPage formPage = new FormPage();
    	formPage.submitForm(driver, test);
    	
    	ConfirmationPage confirmationPage = new ConfirmationPage();
    	confirmationPage.waitForAlertBanner(driver);
    	
    	test.log(Status.PASS, "Test Passed");
    	
    	extent.flush();
    	
    	driver.quit();
    	//assertEquals("The form was successfully submitted!", getAlertBannerText);
    	
    	

    	
    	
    	
    	
    }
   	

    	
    	
    	/*
    	WebElement fileUploadFile = driver.findElement(By.id("file-upload-field"));
    	fileUploadFile.sendKeys("teste.txt");
    	
       	
    	WebElement dropdownButton = driver.findElement(By.cssSelector("button.btn.btn-primary.dropdown-toggle"));
    	dropdownButton.click();
    	Thread.sleep(1000);
    	WebElement item = driver.findElement(By.xpath("/html/body/div/div/div/a[3]"));
    	item.click();
    	
//    	
   
    	WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]"));
    	checkBox1.click();
    	Thread.sleep(2000);
    	WebElement checkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
    	checkBox2.click();
    	Thread.sleep(2000);
    	WebElement checkBox3 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
    	checkBox3.click();
    	
    	
    	
    	
    	
    	
    	WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
    	radioButton1.click();
    	Thread.sleep(2000);
    	
    	WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
    	radioButton2.click();
    	Thread.sleep(2000);
    	
    	WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
    	radioButton3.click();
    	
    	
    	WebElement datepicker = driver.findElement(By.id("datepicker"));
    	datepicker.sendKeys("05/09/2019");
    	datepicker.sendKeys(Keys.RETURN);
    	
    	
    	WebElement image = driver.findElement(By.id("image"));
    	
    	WebElement box = driver.findElement(By.id("box"));
    	
    	//Thread.sleep(1000);
    	Actions actions = new Actions(driver);
    	
    	actions.dragAndDrop(image, box).build().perform();
    	
    	
    	
    	
    	WebElement modalButton = driver.findElement(By.id("modal-button"));
    	modalButton.click();
    	Thread.sleep(1000);
    	WebElement closeButton = driver.findElement(By.id("close-button"));
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()", closeButton);
    	
    	
    	
    	
    	
    	WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
    	newTabButton.click();
    	String originalHandle = driver.getWindowHandle();
    	for (String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
    	
    	Thread.sleep(1000);
    	//driver.switchTo().window(originalHandle);
    	
    	
    	WebElement alertButton = driver.findElement(By.id("alert-button"));
    	alertButton.click();
    	
    	Thread.sleep(1000);
    	
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    	
    	*/
    	
    
    	/*
    	Actions actions = new Actions(driver);
    	actions.moveToElement(name);
    	name.sendKeys("Timoteo Junior");
    	WebElement date = driver.findElement(By.id("date"));
    	date.sendKeys("13/07/2019");
    	*/
    	
    	//
    	
    
}
