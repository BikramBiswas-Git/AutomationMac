
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Test.BaseComponents.BaseComponentsDemo;

public class OfferByAffiliatesFlowChromeBrowser extends BaseComponentsDemo

{

	static WebDriver firefoxDriver = InitializeChromeDriver();
//	
	// Extent Report
	private ExtentReports extent;
	private ExtentTest test;

	@Test
	public void TrackingFirefox() throws InterruptedException {

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/43/77/");
			
			if(i%3==0) {
			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert = driver.switchTo().alert();
			// Accept the alert (click on OK)
			alert.accept();
			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
			}
			
			
			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/43/3/");
			if(i%3==0) {
			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert2 = driver.switchTo().alert();
			// Accept the alert (click on OK)
			alert2.accept();
			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
			}

			
			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/5/2/");
			if(i%2==0) {
			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert3 = driver.switchTo().alert();
			// Accept the alert (click on OK)
			alert3.accept();
			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
			}
			
			
			firefoxDriver.get("https://stagesecure.panoramatrack.com/tracking/5/123/");
			if(i%5==0) {
			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Alert alert4 = driver.switchTo().alert();
			// Accept the alert (click on OK)
			alert4.accept();
			Thread.sleep(2000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
			}

			
			
			
		}

	}

}