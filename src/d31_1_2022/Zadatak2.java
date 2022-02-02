package d31_1_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://geodata.solutions/");
		Select country = new Select(driver.findElement(By.id("countryId")));
		country.selectByVisibleText("Bahamas");
		
		Select state = new Select(driver.findElement(By.id("stateId")));
		state.selectByVisibleText("Long Island");
		
		Select city = new Select(driver.findElement(By.id("cityId")));
		city.selectByVisibleText("Clarence Town");
	}
	
	
	
	
	
	
}
