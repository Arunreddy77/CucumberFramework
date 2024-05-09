package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import Utils.TextContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	public TextContextSetup textcontextsetup;
	
	public Hooks(TextContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
	}
	
	@After
	public void AfterScenario() throws IOException {
		textcontextsetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void Addscreenshot(Scenario scenario) throws IOException {
		WebDriver driver = textcontextsetup.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
}
