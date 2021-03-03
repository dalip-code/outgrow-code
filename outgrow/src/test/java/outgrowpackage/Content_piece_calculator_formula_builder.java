package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Content_piece_calculator_formula_builder extends CommonLib {

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
		driver.get("https://komaldhillon28.outgrow.us/komaldhillon28-5758");

	}

	@Test
	public static void addition_result1() throws InterruptedException {
		// button[@id='landingBtn']

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@class='gdpr-popup']//a[@class='gdrp-accept'][contains(text(),'Accept and Close')]"))
				.click();
		Thread.sleep(2000);
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

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f27db570c7336156c81a767']"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f27db570c7336156c81a770']"))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f27db570c7336156c81a779']"))
				.click();

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 4')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f27db570c7336156c81a780']"))
				.click();

		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		wait6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f27dfa058469715a97be48d']"))
				.click();

		Thread.sleep(2000);

		String expectedResult1 = "Result: 8";
		String ActualResult1 = driver.findElement(By.xpath("//span[contains(text(),'Result: 8')]")).getText();
		Assert.assertEquals(ActualResult1, expectedResult1);

		CommonLib.scrolling_to_bottom();
		Thread.sleep(2000);
	}

	@Test
	public static void average_result2() throws InterruptedException {
		// button[@id='landingBtn']

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

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

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f27db570c7336156c81a765']"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f27db570c7336156c81a76e']"))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f27db570c7336156c81a779']"))
				.click();

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 4')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f27db570c7336156c81a780']"))
				.click();

		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		wait6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f27dfa058469715a97be48d']"))
				.click();

		Thread.sleep(2000);

		String expectedResult2 = "Result: 0.80";
		String ActualResult2 = driver.findElement(By.xpath("//span[contains(text(),'Result: 0.80')]")).getText();
		Assert.assertEquals(ActualResult2, expectedResult2);
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(2000);
	}

}
