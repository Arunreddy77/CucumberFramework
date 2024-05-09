package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Search = By.xpath("//input[@type='search']");
	
	By Productname = By.xpath("//h4[@class='product-name']");
	By topdeals = By.xpath("//a[.='Top Deals']");
	
	public void searchitem(String name) {
		driver.findElement(Search).sendKeys(name);
	}
	public String getproducttext() {
		return driver.findElement(Productname).getText();
	}
	
	public void topdeals() {
		driver.findElement(topdeals).click();
	}
	
	public String LandingPagetitle() {
		return driver.getTitle();
	}
	
	
}
