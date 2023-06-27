package ExelWash_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='Menu']")
	WebElement Menu_Button;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement Login_Option;

	@FindBy(xpath = "//input[@placeholder='Enter Username']")
	WebElement Email_Address;

	@FindBy(xpath = "//body/div[@class='container']/input[2]")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement click_On_Login_Button;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMenu() {
		Menu_Button.click();
	}

	public void clickOnLoginOption() throws InterruptedException {
		Login_Option.click();
		Thread.sleep(3000);

	}

	public void enterEmail(String arg1) {
		Email_Address.sendKeys(arg1);
	}

	public void enterPasswrod(String arg1) {
		password.sendKeys(arg1);
	}

	public void clickOnLoginButton() {
		click_On_Login_Button.click();
	}

}