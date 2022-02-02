package d31_1_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"driver-lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
			
			List<WebElement> theList = driver.findElements(By.xpath("//div[@class='col-md-12']//button"));
			
			
			for (int i = 1; i <= theList.size(); i++) {
				driver.findElement(By.xpath("//div[@class='col-md-12']/div/button")).click();
				
				List<WebElement> newList = driver.findElements(By.xpath("//div[@class='col-md-12']//button"));
				
				if(theList.size()==i+newList.size()) {
					System.out.println("Element deleted.");
				} else {
					System.out.println("Element not deleted.");
				}
			}
		
		
		
		
		
		
		
	}

}
