package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.PageObjectManager;

public class TextContextSetup {

	public WebDriver driver; 
	public String LandingpageText;
	public WebDriverWait wait;
	public PageObjectManager pageobjectmanager;
	public  TestBase testBase;
	public genericUtils genericutils;
	
	public TextContextSetup() throws IOException {
		testBase = new TestBase();				
		pageobjectmanager  = new PageObjectManager(testBase.WebDriverManager());
		genericutils = new genericUtils(testBase.WebDriverManager());
	}
}
