package d3_2_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://www.google.com/");

		WebElement body = driver.findElement(By.tagName("Body"));

		js.executeAsyncScript("arguments[0].style=\"background:\"+arguments[1]", body, "red");
//		js.executeScript("arguments[0].style='background:black'", body);
	}

}
