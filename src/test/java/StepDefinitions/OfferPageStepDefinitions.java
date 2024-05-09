package StepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.OfferPage;
import PageObject.PageObjectManager;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinitions {
	public String OfferpageText = "jbbg yf";
	public TextContextSetup textcontextsetup;
	public PageObjectManager pageobjectmanager;
	
	public OfferPageStepDefinitions(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
	}
	

	
	
	@Then("^User searched for (.+) shortname in deals page$")
	public void user_searched_for_same_shortname_in_deals_page(String sname) {
		
		swtchToOfferpage();
		OfferPage opage = textcontextsetup.pageobjectmanager.getOfferPage();
		System.out.println(sname + " - in child window");
		opage.searchitem(sname);
		OfferpageText = opage.offerproductText();
		System.out.println(OfferpageText + " - in child tab");
		 
	}
	
	public void swtchToOfferpage() {
		//pageobjectmanager = new PageObjectManager(textcontextsetup.driver);
		LandingPage lpage = textcontextsetup.pageobjectmanager.getLandingPage();
//		LandingPage lpage = new LandingPage(textcontextsetup.driver);
		lpage.topdeals();
		textcontextsetup.genericutils.switchTochildWindow();
	
	}
	
	@Then("Validate product name in Landing page and Offer page")
	public void validate_product_name_in_landing_page_and_offer_page() throws InterruptedException {
		System.out.println(OfferpageText + "Assertion Text");
		String Actual = textcontextsetup.LandingpageText;
		String Expected = OfferpageText;
		System.out.println(Actual + " Actual text");
		Thread.sleep(2000);
		//Assert.assertEquals(OfferpageText, textcontextsetup.LandingpageText );
		Assert.assertEquals(Actual, Expected);

	}
	
}
