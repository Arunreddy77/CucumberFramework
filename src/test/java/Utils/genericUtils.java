package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {	
//code reuseability class
	public WebDriver driver;
	
	public genericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchTochildWindow() {
		Set<String> whandles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<>(whandles);
		// Switch to the window by index
		String desiredWindowHandle = handlesList.get(1);
		driver.switchTo().window(desiredWindowHandle);
	}
}
