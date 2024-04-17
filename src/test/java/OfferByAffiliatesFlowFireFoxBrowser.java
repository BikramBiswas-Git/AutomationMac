
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

	@Test(groups = { "AffiliateLevel" })
	public void TrackingFirefox() throws InterruptedException {

		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			firefoxDriver.get("https://jgeclhcr.panoramatrack.com/tracking/5/2/?sub2=sub2");
			System.out.println("Paid Event Count is " + eventCount);
			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			Thread.sleep(3000);
			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
//			firefoxDriver.get("https://nysfaspd.panoramatrack.com/tracking/8/8/?sub1=sub1");
//			firefoxDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
//			Thread.sleep(3000);
//			firefoxDriver.findElement(By.xpath("//a[@class='button']")).click();
//			Thread.sleep(2000);

		}

	}

}