package d_1_2_2022;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.udemy.com/courses/search/?src=ukw&q=slksd");
		
		driver.findElement(By.xpath("//*[@class='links-and-language-selector']//button")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("language-list--multi-column--1ZNPI")));

		System.out.println("Kraj!");

	}

}
