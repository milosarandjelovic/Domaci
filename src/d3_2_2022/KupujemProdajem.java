package d3_2_2022;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.rmi.CORBA.ValueHandlerMultiFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KupujemProdajem {
	public class Zadatak1 {
		WebDriver driver;
		Actions actions;
		JavascriptExecutor js;
		WebDriverWait wait;

		@BeforeMethod
		public void before() {
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			driver = new ChromeDriver();
			js = (JavascriptExecutor) driver;
			actions = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("https://www.kupujemprodajem.com/index.php");
			driver.manage().window().maximize();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className("kpBoxCloseButton"))).click();
		}

		@Test
		public void checkIfSorted() throws InterruptedException {
			driver.findElement(By.id("searchKeywordsInput")).sendKeys("iphone");
			driver.findElement(By.id("searchKeywordsInput")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"orderSecondSelection\"]/div/div[1]/div[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"/html/body/div[2]/div/div[1]/div[1]/div[1]/form[3]/div[3]/div/div/div[4]/div/div/div/div[10]/div/div[2]/div/div[2]/div/div[1]"))
					.click();
			driver.findElement(By.className("secondarySearchButton")).click();

			List<WebElement> pretraga = driver.findElements(By.xpath("//span[@class='adPrice ']"));

			String[] stringLista = new String[30];

			for (int i = 0; i < pretraga.size(); i++) {
				stringLista[i] = pretraga.get(i).getText();

				stringLista[i] = stringLista[i].replace(',', '.');



			}

			double[] cena = new double[stringLista.length];

			String[] valuta = new String[stringLista.length];

			for (int i = 0; i < stringLista.length; i++) {

				String string = stringLista[i];
				String[] parts = string.split(" ");
				cena[i] = Double.parseDouble(parts[0]);
				valuta[i] = parts[1];

			}
			for (int i = 0; i < stringLista.length; i++) {
				if (!valuta[i].equals("din")) {
					cena[i] = cena[i] * 118;

				}

			}
			boolean poredjanoJe = false;
			for (int i = 0; i < cena.length - 1; i++) {
				if (cena[i] <= cena[i + 1]) {
					poredjanoJe = true;

				} else {
					poredjanoJe = false;
				}
				Assert.assertEquals(poredjanoJe, true, "Nije sortirao,");
			}
		}

		@AfterMethod
		public void afterMethod() {
			driver.quit();
		}

	}
}