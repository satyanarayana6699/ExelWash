package ExelWash_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Services {

	WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Menu']")
	WebElement Menu_Button;

	@FindBy(xpath = "//a[normalize-space()='Services']")
	WebElement Services_Option;

	@FindBy(xpath = "//article[@class='style1']//a[@href='washing.html']")
	WebElement click_On_Washing_Icon;

	@FindBy(xpath = "//a[normalize-space()='WASH & fold']")
	WebElement click_On_WASH_and_fold;

	@FindBy(xpath = "//a[contains(@class,'fit')][normalize-space()='Dry Cleaning']")
	WebElement click_On_Dry_Cleaning;

	@FindBy(xpath = "//a[contains(@class,'fit')][normalize-space()='Shoe Laundry']")
	WebElement click_On_Shoe_Laundry;

	@FindBy(xpath = "//a[contains(@class,'fit')][normalize-space()='Saree Rolling']")
	WebElement click_On_Saree_Rolling;

	@FindBy(xpath = "//a[contains(@class,'fit')][normalize-space()='Stain Removal']")
	WebElement click_On_Stain_Removal;

	@FindBy(xpath = "//a[contains(@class,'button fit')][normalize-space()='Steam Ironing']")
	WebElement click_On_Steam_Ironing;

	@FindBy(xpath = "//a[normalize-space()='Carpet & Curtains Cleaning']")
	WebElement click_On_Carpet_and_Curtains_Cleaning;

	@FindBy(xpath = "//a[contains(@class,'button fit')][normalize-space()='Soft Toys Cleaning']")
	WebElement click_On_Soft_Toys_Cleaning;

	public Services(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenuOption() {
		Menu_Button.click();
	}

	public void clickOnServicesOption() throws InterruptedException {
		Services_Option.click();
		Thread.sleep(3000);
	}

	public void clickOnWashingIcon() throws InterruptedException {
		click_On_Washing_Icon.click();
		Thread.sleep(2000);
	}

	public void clickOnWASHandfoldButton() {
		click_On_WASH_and_fold.click();
	}

	public void clickOnDryCleaningButton() {
		click_On_Dry_Cleaning.click();
	}

	public void click_On_Shoe_Laundry_Button() {
		click_On_Shoe_Laundry.click();
	}

	public void click_On_Saree_Rolling_Button() {
		click_On_Saree_Rolling.click();
	}

	public void click_On_Stain_Removal_Button() {
		click_On_Stain_Removal.click();
	}

	public void click_On_Steam_Ironing_Button() {
		click_On_Steam_Ironing.click();
	}

	public void click_On_Carpet_and_Curtains_Cleaning_Button() {
		click_On_Carpet_and_Curtains_Cleaning.click();
	}

	public void click_On_Soft_Toys_Cleaning_Button() {
		click_On_Soft_Toys_Cleaning.click();
	}

}
