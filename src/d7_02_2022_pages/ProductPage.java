package d7_2_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement productQuantity() {
		return driver.findElement(By.className("input-text"));
	}

	public WebElement AddToCartButton() {
		return driver.findElement(By.name("add-to-cart"));
	}

	public void AddToCartMessage() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("woocommerce-message")));

	}

	public String getAddMessage() {
		return driver.findElement(By.className("woocommerce-message")).getText();
	}

	public WebElement getViewCartButton() {
		return driver.findElement(By.xpath("//*[@class='woocommerce-message']/a"));
	}

}
