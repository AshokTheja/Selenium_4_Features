package Selenium_4_Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element_Screenshot {

	@Test
	public void takeElementScreenshot() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		File firstElement = username.getScreenshotAs(OutputType.FILE);
		File destFile = new File("username.png");
		FileUtils.copyFile(firstElement, destFile);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
