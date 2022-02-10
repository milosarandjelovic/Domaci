package d7_2_2022;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

public class AddDeleteToCartTest {
	WebDriver driver;
	ShopPage shopPage;
	ProductPage productPage;
	CartPage cartPage;

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		shopPage = new ShopPage(driver);
		productPage = new ProductPage(driver);
		cartPage = new CartPage(driver);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://cms.demo.katalon.com/");
//	driver.manage().window().maximize();

	}

	@Test
	public void cartTest() {

		shopPage.shopButton().click();

		shopPage.productsList().get(0).click();

		productPage.productQuantity().clear();

		productPage.productQuantity().sendKeys("2");

		productPage.AddToCartButton().click();

		productPage.AddToCartMessage();

		Assert.assertTrue(productPage.getAddMessage().contains("added to your"));

		productPage.getViewCartButton().click();

		Assert.assertEquals(cartPage.checkQuantity(), "2");

		cartPage.deleteProductButton().click();

		Assert.assertEquals(cartPage.emptyCartMessageCheck(), true, "No message");

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
