package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	public WebDriver driver;
	public OfferPage( WebDriver driver) {
		this.driver = driver;
	}

	By Search = By.xpath("//input[@type='search']");

	By Productname = By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]");

	public void searchitem(String name) {
		driver.findElement(Search).click();
		driver.findElement(Search).sendKeys(name);
	}
	public String offerproductText() {
		return driver.findElement(Productname).getText();
	}
}
