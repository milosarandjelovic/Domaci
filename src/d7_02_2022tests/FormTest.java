package d7_2_2022;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest {
	WebDriver driver;
	Page page;

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		page = new Page(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/tag/Desktop/form.html");
		driver.manage().window().maximize();

	}

	@Test
	public void formTest() throws IOException, InterruptedException {
		File file = new File("data/FormData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetForm = wb.getSheet("form");

		for (int i = 1; i <= 6; i++) {
			String name = sheetForm.getRow(i).getCell(0).getStringCellValue();
			String gender = sheetForm.getRow(i).getCell(1).getStringCellValue();
			Date birthDate = sheetForm.getRow(i).getCell(2).getDateCellValue();
			// String s = String.valueOf(birthDate);
			String email = sheetForm.getRow(i).getCell(3).getStringCellValue();
			String role = sheetForm.getRow(i).getCell(4).getStringCellValue();
			String waysOfDev = sheetForm.getRow(i).getCell(5).getStringCellValue();
			String comment = sheetForm.getRow(i).getCell(6).getStringCellValue();
			page.addPerson(name, gender, birthDate, email, role, waysOfDev, comment);
			Thread.sleep(1000);
			page.onClick().click();
			Thread.sleep(2000);
			Assert.assertEquals(page.check(), true);
			driver.navigate().refresh();
		}

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
