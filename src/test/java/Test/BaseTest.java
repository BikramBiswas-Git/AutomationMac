package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.util.Assert;

import Test.AbstractComponent.AbstractComponent;
import Test.BaseComponents.BaseComponentsDemo;
import Pages.LoginPage;
import Pages.SignUpPage;




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
	SignUpPage SignUpObj = new SignUpPage(driver);
	LoginPage LoginObj = new LoginPage(driver);

	@Test(priority = 1)
	public void SignUpTest() throws InterruptedException {
		String succesMessage = SignUpObj.SigningUp();
		assertEquals(succesMessage, "This user already exist.");	
	}
	
	@Test(priority = 2)
	public void LoginTest() throws InterruptedException {
		boolean result=LoginObj.Login();
		assertEquals(result, true);
			
	}

}