package Selenium_4_Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_Locators {

	// below();
	// toLeftof();
	// toRightof();
	// above();
	// near();

	@Test(description = "Find Test 5")
	public void Releative_Locators() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		//driver.findElement(RelativeLocator.withTagName("li").toLeftof(By.id("pid6")).below(By.id("pid1")));
		driver.quit();
	}

}
