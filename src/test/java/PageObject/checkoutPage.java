package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkoutPage {
	public WebDriver driver;
	public checkoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By cartbag = By.xpath("//img[@alt='Cart']");
	By proceedtoCheck = By.xpath("//button[.='PROCEED TO CHECKOUT']");
	By EnterPromoCode = By.xpath("//input[@type='text']");
	By Apply = By.xpath("//button[.='Apply']");
	By PlaceOrder = By.xpath("//button[.='Place Order']");
	By AddItem = By.xpath("//a[@class='increment']");
	By productText = By.xpath("//p[@class='product-name']");
	By AddToCart = By.xpath("//button[.='ADD TO CART']");
		
	public String productText() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(productText).getText();
	}
	public void checkoutitems() {

		driver.findElement(Apply).click();
		driver.findElement(PlaceOrder).click();
	}
	
	public boolean verifyPromobtm() {
		return driver.findElement(Apply).isDisplayed();
	}
	
	public boolean verifyplaceorder() {
		return driver.findElement(PlaceOrder).isDisplayed();
	}
	
	public void additem() {
		for(int i=0; i<2; i++) {
		driver.findElement(AddItem).click();
		}
		driver.findElement(AddToCart).click();
		driver.findElement(cartbag).click();
		driver.findElement(proceedtoCheck).click();
	}
}



