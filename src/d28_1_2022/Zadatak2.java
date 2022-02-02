package d28_1_2022;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
	
//	Zadatak
//	Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//	Maksimizirati prozor
//	Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//	Dodati red podataka - jedan red u jednoj iteraciji 
//	Kliknite na dugme Add New
//	Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//	Kliknite na zeleno Add dugme
//	Na kraju programa ugasite pretrazivac.


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

		

		for (int i = 0; i < 5; i++) {

			driver.findElement(By.xpath("//*[contains(@class, 'btn btn-info add-new')]")).click();

			System.out.println("Name: ");
			String name = s.next();
			driver.findElement(By.id("name")).sendKeys(name);

			System.out.println("Department: ");
			String department = s.next();
			driver.findElement(By.id("department")).sendKeys(department);

			System.out.println("Phone: ");
			String phone = s.next();
			driver.findElement(By.id("phone")).sendKeys(phone);
			driver.findElement(By.xpath("//a[contains(@class, 'add')][contains(@style, 'inline')]")).click();
		}
		driver.close();
	}

}
