package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class miscallneous extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}
 
	@Test
	public static void continue_sumit_button_ss_chicago() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4819");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='landingBtn']")).click();

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		WebElement other_option_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/input"));

		Thread.sleep(1000);
		other_option_q1.sendKeys("question 1 single select");

		WebElement continue_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/button"));

		continue_q1.isDisplayed();

		Thread.sleep(1000);

		continue_q1.click();

		// question 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 30);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		WebElement other_option_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/input"));

		Thread.sleep(1000);
		other_option_q2.sendKeys("question 2 single select");

		WebElement continue_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/button"));

		continue_q2.isDisplayed();

		Thread.sleep(1000);

		continue_q2.click();

		// question 3
		WebDriverWait wait_q3 = new WebDriverWait(driver, 30);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));

		WebElement other_option_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/input"));

		Thread.sleep(1000);
		other_option_q3.sendKeys("question 3 single select");

		WebElement submit_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/button"));

		submit_q3.isDisplayed();

		Thread.sleep(1000);

		submit_q3.click();

		// outcome 1
		WebDriverWait wait_outcome1 = new WebDriverWait(driver, 30);
		wait_outcome1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Outcome 1']")));

		Thread.sleep(2000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(2000);

	}

	@Test
	public static void continue_sumit_button_ss_stockholm() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4825");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Button text']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Button text']")).click();

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		WebElement next_q1 = driver.findElement(By.xpath("//form/div[1]/div[3]/div[2]/a/i"));

		next_q1.click();

		// question 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 30);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		WebElement other_option_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[2]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/input"));

		Thread.sleep(1000);
		other_option_q2.sendKeys("question 2 single select");

		WebElement continue_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[2]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/button"));

		continue_q2.isDisplayed();

		Thread.sleep(1000);

		continue_q2.click();

		// question 3
		WebDriverWait wait_q3 = new WebDriverWait(driver, 30);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));

		WebElement other_option_q3 = driver.findElement(By.xpath(
				"//section/div/div/div[2]/form/div/div[2]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/input"));

		Thread.sleep(1000);
		other_option_q3.sendKeys("question 3 single select");

		WebElement submit_q3 = driver.findElement(By.xpath(
				"//section/div/div/div[2]/form/div/div[2]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/div[2]/button"));

		submit_q3.isDisplayed();

		Thread.sleep(1000);

		submit_q3.click();

		// outcome 1
		WebDriverWait wait_outcome1 = new WebDriverWait(driver, 30);
		wait_outcome1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Outcome 1']")));

		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(1000);

	}

}
