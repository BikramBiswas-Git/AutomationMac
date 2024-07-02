
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Test.BaseComponents.BaseComponentsDemo;

public class OfferByAffiliatesFlowFireFoxBrowser extends BaseComponentsDemo

{
	public OfferByAffiliatesFlowFireFoxBrowser() {
		// Default constructor
	}

	WebDriver firefoxDriver = InitializeFirefoxDriver();
//	
	// Extent Report
	private ExtentReports extent;
	private ExtentTest test;

	int baseCount = 0;
	int eventCount = 0;
	@Test
	public  void TrackingFirefox() throws InterruptedException {
		
		for(int i=0;i<50;i++) {
			System.out.println(i);
			firefoxDriver.get("https://lb1.stagingit.net/tracking/5/2/");
			
			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert = driver.switchTo().alert();
	        
	        // Accept the alert (click on OK)
	        alert.accept();
	        
			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
		
			
		}
		

	}

}