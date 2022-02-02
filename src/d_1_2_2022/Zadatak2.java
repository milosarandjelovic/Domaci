package d_1_2_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.navigate().to("https://videojs.com/city");
		

		driver.findElement(By.className("vjs-big-play-button")).click();
		
		Thread.sleep(30000);
		
		
		wait.until(ExpectedConditions.attributeContains(By.id("vjs_video_3"), "class", "playing"));
		
		
		System.out.println("Kraj!");

	}

}
