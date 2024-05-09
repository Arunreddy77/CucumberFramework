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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageStepDefinitions {

	public LandingPage lpage;
	public TextContextSetup textcontextsetup;
	public checkoutPage checkoutpage;
	public LandingPageStepDefinitions(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.lpage = textcontextsetup.pageobjectmanager.getLandingPage();	
		this.checkoutpage = textcontextsetup.pageobjectmanager.getcheckoutpage();
	}

	@Given("User is on the Greenkart landing page")
	public void user_is_on_the_greenkart_landing_page() {
		Assert.assertTrue(lpage.LandingPagetitle().contains("GreenKart"));
	}
	@When("^User searced with shortname (.+) and Extracted actual name of product$")
	public void user_searced_with_shortname_and_extracted_actual_name_pf_product(String string) throws InterruptedException {

		lpage.searchitem(string);
		Thread.sleep(2000);
		textcontextsetup.LandingpageText = lpage.getproducttext().split("-")[0].trim();
		System.out.println(textcontextsetup.LandingpageText + "  - Extracted Text");
	}

	@When("added three items of selected product to cart")
	public void Add_3_items_to_cart() throws InterruptedException {
		checkoutpage.additem();
		Thread.sleep(2000);
	}



}
