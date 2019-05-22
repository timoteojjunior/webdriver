package testpackage.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class FormPage {
	
public static void submitForm(WebDriver driver, ExtentTest test) {
		
    	WebElement firstName = driver.findElement(By.id("first-name"));
    	firstName.sendKeys("Timoteo");
    	test.log(Status.INFO, "FirstName Filled");
    	driver.findElement(By.id("last-name")).sendKeys("Junior");
    	test.log(Status.INFO, "Last Name  Filled");
    	driver.findElement(By.id("job-title")).sendKeys("QA Eng");
    	test.log(Status.INFO, "Job Title Filled");
    	driver.findElement(By.id("radio-button-3")).click();
    	driver.findElement(By.id("checkbox-1")).click();
    	driver.findElement(By.cssSelector("option[value='2']")).click();
    	driver.findElement(By.id("datepicker")).sendKeys("05/22/2019");
    	driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
    	driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    	test.log(Status.INFO, "Filled the rest");
}
 

}
