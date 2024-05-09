package StepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.checkoutPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckoutPageStepDefinitions {
	
	public checkoutPage checkoutpage;
	public TextContextSetup textcontextsetup;
	public LandingPage landingpage;
	
	public CheckoutPageStepDefinitions(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.checkoutpage = textcontextsetup.pageobjectmanager.getcheckoutpage();
		this.landingpage = textcontextsetup.pageobjectmanager.getLandingPage();
	}

	
	
	@Then("^User proceeeds to checkout and validate the (.+) items in product page.$")
	public void user_proceed_to_checkout_and_validate(String name) throws InterruptedException {
//		String actual = checkoutpage.productText();
//		String expected = landingpage.getproducttext();
//		System.out.println("Actual - "+actual+" Expected - "+expected);
//		Assert.assertEquals(actual, expected);
		Assert.assertTrue(checkoutpage.verifyPromobtm());
		Assert.assertTrue(checkoutpage.verifyplaceorder());
		
	}

	@Then("verify user has ability to enter promo code and place the order.")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws InterruptedException {
		checkoutpage.checkoutitems();
		
	}

	

}
