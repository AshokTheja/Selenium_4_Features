package Selenium_4_Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_NewWindow {

	@Test
	public void Open_NewWidnow() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://the-internet.herokuapp.com/");

		Thread.sleep(3000);
		driver.quit();

	}

}
