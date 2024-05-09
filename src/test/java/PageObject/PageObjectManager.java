package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingpage;
	public OfferPage offerpage;
	public WebDriver driver;
	public checkoutPage checkoutpage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OfferPage getOfferPage() {
		offerpage = new OfferPage(driver);
		return offerpage;
	}
	public checkoutPage getcheckoutpage() {
		checkoutpage = new checkoutPage(driver);
		return checkoutpage;
	}

}
