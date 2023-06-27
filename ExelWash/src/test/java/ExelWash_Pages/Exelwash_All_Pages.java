package ExelWash_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exelwash_All_Pages {

	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void login_page_Functionality() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://exelwash.com");

		driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		Thread.sleep(2000);

		// login_page

		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("test");
		driver.findElement(By.xpath("//body/div[@class='container']/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	@Test(priority = 0)
	public void Sign_up_page_Functionality() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://exelwash.com");

		driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		Thread.sleep(2000);

		// Sign_Up_Page

		driver.findElement(By.xpath("//a[@class='two']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("test");
		driver.findElement(By.xpath("//form[@class='modal-content']//input[@placeholder='Enter Password']"))
				.sendKeys("123");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();

	}

	@Test(priority = 2)
	public void Services_Functionality() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://exelwash.com");

		driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		Thread.sleep(2000);

		// Services
		driver.findElement(By.xpath("//a[normalize-space()='Services']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//article[@class='style1']//a[@href='washing.html']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='WASH & fold']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'fit')][normalize-space()='Dry Cleaning']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'fit')][normalize-space()='Shoe Laundry']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'fit')][normalize-space()='Saree Rolling']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'fit')][normalize-space()='Stain Removal']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'button fit')][normalize-space()='Steam Ironing']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Carpet & Curtains Cleaning']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@class,'button fit')][normalize-space()='Soft Toys Cleaning']"))
				.click();
		
		//driver.close();
		driver.quit();

	}
	
}
