package Selenium_4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_Location {

	@Test
	public void getLocation() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement Logo = driver.findElement(
				By.xpath("//img[@src='/webres_5faa8393a82311.28834036/themes/default/images/login/logo.png']"));

		System.out.println("Height: " + Logo.getRect().getHeight());
		System.out.println("Width: " + Logo.getRect().getWidth());

		System.out.println("X Location: " + Logo.getRect().getX());
		System.out.println("Y Location: " + Logo.getRect().getY());

		Thread.sleep(4000);
		driver.quit();
	}

}
