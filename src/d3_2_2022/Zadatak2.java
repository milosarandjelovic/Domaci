package d3_2_2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://www.wikipedia.org/");
		
		List <WebElement> languages = driver.findElements(By.xpath("//*[@id='www-wikipedia-org']/div[2]//a"));
		

		for (int i = 0; i < languages.size(); i++) {
			js.executeScript("window.open(arguments[0])", languages.get(i));
		}
		
		
			

	}

}
