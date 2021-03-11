package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class custom_product extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

	@BeforeMethod
	public static void Open_siteup_page_browser() throws InterruptedException {
		driver.get("https://dcompany878.outgrow.us/dcompany878-2560");

	}

	@Test
	public static void product_stripe() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='icon_prefix0']")).clear();
		driver.findElement(By.xpath("//input[@id='icon_prefix0']")).sendKeys("DALIP KUMAR");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='icon_prefix1']")).clear();
		driver.findElement(By.xpath("//input[@id='icon_prefix1']")).sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'BUTTON TEXT')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		driver.findElement(By.xpath("//form/div/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"))
				.sendKeys("123");

		driver.findElement(By.xpath("//button[@class='button_textfield submit-textbox-btnresp ripple-light']")).click();

		driver.findElement(By.xpath("//section/div/div/ul/li[1]/div[1]/div/label/div[2]/div[2]/a[1]")).click();

		Thread.sleep(3000);

		String hding = driver.findElement(By.xpath("//*[@id='container']/section/span[2]/div/div/main/div/header/h1"))
				.getText();
		System.out.println(hding);

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// set the text
		jsExecutor
				.executeScript("document.getElementById('//input[@id='60420592841cd47f8ea5e854']').value='4242424242'");

		Thread.sleep(3000);

		/*
		 * 
		 * WebDriverWait wait3 = new WebDriverWait(driver, 10); wait3.until(
		 * ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//span[contains(text(),'Product Title 1')]"))); Thread.sleep(3000);
		 * CommonLib.scrolling_to_bottom();
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/temp/one-page-card-new/div[2]/div[2]/div/div[1]/div/div/div[2]/section/div/div/div/form/div[2]/div[3]/div/div/div[2]/div/div/control/custom_html/custom-products/section/div/div/ul/li[1]/div[1]/div/label/div[2]/div[2]/a[2]"
		 * )) .click(); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//li[@class='ecom-card ecom-flipped']//div[@class='ecom-back']//a[@class='ecom-buy button--aylen'][contains(text(),'Buy Now')]"
		 * )) .click();
		 * 
		 * WebDriverWait wait4 = new WebDriverWait(driver, 10);
		 * wait4.until(ExpectedConditions.visibilityOfElementLocated( By.xpath(
		 * "//*[@id=\"container\"]/section/span[2]/div/div/main/form/nav/div/div/div/button"
		 * )));
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div[2]/section/span[2]/div/div/main/form/div/div/div/div/div/div[1]/div[2]/fieldset/div[1]/div[1]/span/span[1]/div/div[1]/input"
		 * )) .sendKeys("4242424242424242");
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"06185360-d88c-11ea-b98d-513651c4353f\"]")).sendKeys("0424");
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"06187a70-d88c-11ea-b98d-513651c4353f\"]")).sendKeys("123");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"container\"]/section/span[2]/div/div/main/form/nav/div/div/div/button"
		 * )) .click();
		 * 
		 * Thread.sleep(3000);
		 */
	}

}
