package Selenium_4_Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_NewTab {

	@Test
	public void open_NewTab() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://the-internet.herokuapp.com/");

		Thread.sleep(5000);
		driver.quit();

	}

}
