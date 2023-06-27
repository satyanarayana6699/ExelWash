package ExelWash_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='Menu']")
	WebElement Menu_Button;

	@FindBy(xpath = "//div[@class='inner']//ul//li//a[@href='index.html'][normalize-space()='Home']")
	WebElement Home_Option;

	@FindBy(xpath = "/html/body/div[2]/a/span[1]/img")
	WebElement click_On_ExelWash_Icon;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMenuOption() throws InterruptedException {
		Menu_Button.click();
		Thread.sleep(3000);

	}

	public void clickOnHomeOption() throws InterruptedException {
		Home_Option.click();
		Thread.sleep(3000);
	}

	public void clickOnExelWashIcon() {
		click_On_ExelWash_Icon.click();
	}

}
