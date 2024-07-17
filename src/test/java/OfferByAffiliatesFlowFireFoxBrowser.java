
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

	WebDriver firefoxDriver = InitializeChromeDriver();
//	
	// Extent Report
	private ExtentReports extent;
	private ExtentTest test;

	int baseCount = 0;
	int eventCount = 0;

	@Test
	public void TrackingFirefox() throws InterruptedException {

		for (int i = 40; i < 55; i++) {
			System.out.println(i);
			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/5/2/");

			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert = driver.switchTo().alert();

			// Accept the alert (click on OK)
			alert.accept();

			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);

			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/5/123/");

			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert1 = driver.switchTo().alert();

			// Accept the alert (click on OK)
			alert1.accept();

			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);

			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/5/3/");

			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert2 = driver.switchTo().alert();

			// Accept the alert (click on OK)
			alert2.accept();

			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
			
			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/43/123/");

			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert3 = driver.switchTo().alert();

			// Accept the alert (click on OK)
			alert3.accept();

			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
			
			
			
			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/43/46/");

			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert4 = driver.switchTo().alert();

			// Accept the alert (click on OK)
			alert4.accept();

			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
//			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/"+i+"/46/");
			

		}

	}

}