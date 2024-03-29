package Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Test.AbstractComponent.AbstractComponent;
import Test.BaseComponents.BaseComponentsDemo;
import Test.Pages.SignUpPage;
import Test.Pages.SignUpPage;

public class BaseTest extends BaseComponentsDemo

{
	public BaseTest() {
		// Default constructor
	}

	WebDriver driver = InitializeDriver();
	// Extent Report
	private ExtentReports extent;
	private ExtentTest test;

	// Page Objects
	SignUpPage SignUp = new SignUpPage(driver);

	@Test(priority = 1)
	public void SignUpPageTest() throws InterruptedException {
		SignUp.SigningUp();
	}

}
