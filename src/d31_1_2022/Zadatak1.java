package d31_1_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://s.bootsnipp.com/iframe/Dq2X");
		
		for (int i = 4; i >=0; i--) {
			driver.findElement(By.xpath("//*[(@class= 'col-md-12')]//button")).click();

			boolean elementDeleted;

			try {
				WebElement e = driver.findElement(By.xpath("//div[@class='col-md-12']/div/button"));
				elementDeleted = true;
			} catch (Exception e2) {
				elementDeleted = false;
			}

			if (elementDeleted) {
				System.out.println("Element is there.");
			} else {
				System.out.println("Element is not there.");
			}	
		}
		
		
		
		
		
		
		
	}

}
