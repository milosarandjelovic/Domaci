package d7_2_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
	private WebDriver driver;

	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement shopButton() {
		return driver.findElement(By.xpath("//*[contains(@class,'page_item page-item-7 current_page_item')]/a"));
	}

	public List<WebElement> productsList() {
		return driver.findElements(By.xpath("//*[contains(@class,'products columns-3')]/li/div/a[1]"));
	}
}
