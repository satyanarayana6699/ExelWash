package ExelWash_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up_Page {
	
	WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='Menu']")
	WebElement Menu_Button;
	
	@FindBy(xpath = "//a[@class='two']")
	WebElement Sign_Up_Option;

	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement Email_Address;

	@FindBy(xpath = "//form[@class='modal-content']//input[@placeholder='Enter Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement confirmpassword;
	
	//@FindBy(xpath = "//button[normalize-space()='Sign Up']")
	//WebElement clickOnSignUpButton;
	
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement confirmpassword2;

	public Sign_Up_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenu(){
		Menu_Button.click();
	}

	
	public void clickOnSignUpOption() {
		Sign_Up_Option.click();
	}

	public void enterEmail(String arg1) {
		Email_Address.sendKeys(arg1);
	}

	public void enterPasswrod(String arg1) {
		password.sendKeys(arg1);
	}
	
	public void enterconfirmPasswrod(String arg1) {
		confirmpassword.sendKeys(arg1);
	}
	
	//public void clickOnSignUpButton() {
		//clickOnSignUpButton.click();
	//}
	
	public void enterconfirmPasswrod2() {
		confirmpassword2.sendKeys(Keys.ENTER);
	}
}
