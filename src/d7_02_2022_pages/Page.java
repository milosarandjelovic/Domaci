package d7_2_2022;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	private WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFullName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement pickGender(String radioValue) {

		return driver.findElement(By.xpath("//*[@name='gender'][@value='" + radioValue + "']"));
	}

	public WebElement setDate() {

		return driver.findElement(By.id("dob"));
	}

	public WebElement email() {

		return driver.findElement(By.id("email"));
	}

	public void setRole(String role) {
		Select selectRole = new Select(driver.findElement(By.id("role")));
		selectRole.selectByValue(role);
		;

	}

	public WebElement developmentsWays(String checkboxValue) {

		return driver.findElement(By.xpath(" //*[@type='checkbox'][@value='" + checkboxValue + "']"));

	}

	public WebElement setComment() {

		return driver.findElement(By.id("comment"));
	}

	public boolean clicable() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public WebElement onClick() {
		this.clicable();
		return driver.findElement(By.id("submit"));
	}

	public boolean check() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("message-element")));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void addPerson(String name, String gender, Date dateOfBirth, String email, String role, String waysOfDev,
			String comment) {
		this.getFullName().sendKeys(name);
		this.pickGender(gender);		
		this.setDate().sendKeys(String.valueOf(dateOfBirth));		
		this.email().sendKeys(email);
		this.setRole(role);
		this.developmentsWays(waysOfDev).click();
		this.setComment().sendKeys(comment);

	}
}
