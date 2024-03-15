package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Test.BaseComponents.BaseComponentsDemo;

public class AddToCartPage extends BaseComponentsDemo{
	public static WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public boolean verifyCartDetails() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(3000);
		WebElement firstProduct = driver.findElement(By.xpath("//td[text()='"+UserData("firstproduct")+"']"));
		System.out.println(firstProduct.getText());
		WebElement secondProduct = driver.findElement(By.xpath("//td[text()='"+UserData("secondproduct")+"']"));
		System.out.println(firstProduct.getText());
		System.out.println(secondProduct.getText());
		if (firstProduct.isDisplayed() && secondProduct.isDisplayed() ) {
            System.out.println("Element is present on the webpage.");
            return true;
        } else {
            System.out.println("Element is not present on the webpage.");
            return false;
        }
		
	}
	
	

}
