package d7_2_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public String checkQuantity() {
		return driver.findElement(By.xpath("//*[contains(@class,'input-text qty text')]")).getAttribute("value");
	}

	public WebElement deleteProductButton() {
		return driver.findElement(By.className("remove"));
	}

	public boolean emptyCartMessageCheck() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean check;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className("cart-empty")));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
