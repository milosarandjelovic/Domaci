package d28_1_2022;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

//	Zadatak 
//	Maksimizirati prozor
//	Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//	Od korisnika ucitati broj na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//	I izvrsite akciju klik na odgovarajuci element
//	Na kraju programa ugasite pretrazivac.

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://s.bootsnipp.com/iframe/WaXlr");

		List<WebElement> rateStars = driver.findElements(By.xpath("//*[@class='form-group']/button"));

		System.out.println("With how many stars would you rate your ability to use the computer and access internet?");
		int i = s.nextInt();

		rateStars.get(i - 1).click();

		driver.close();

	}

}
