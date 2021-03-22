package outgrowpackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import logicJump.ScreenRecorderUtil;

public class switchingScanerios extends CommonLib {

	@BeforeClass
	public static void open_browser() throws Exception {
		CommonLib.LaunchBrowswer();
		ScreenRecorderUtil.startRecord("open_browser");
	}

	@AfterClass
	public static void quit_browser() throws Exception {
		CommonLib.closeBrowser();
		ScreenRecorderUtil.stopRecord();
		CommonLib.quitDriver();
	}

	public static void login_to_new_tab_dashboard() throws IOException, InterruptedException {

		CommonLib.login();

		String currentUrl = driver.getCurrentUrl();

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();
		driver.navigate().to(currentUrl);

		WebDriverWait dashboardLoadCheck = new WebDriverWait(driver, 60);
		dashboardLoadCheck.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@class='hvr-underline-from-left active']")));

		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public static void switchingOutcomeToEcomm_chicago()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		login_to_new_tab_dashboard();

		// click on outcome quiz
		driver.findElement(By.xpath("//i[@class='la la-check-circle unchecked-icons']")).click();

		driver.findElement(By.xpath("//og-templates/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/button"))
				.click();

		WebDriverWait builder_load = new WebDriverWait(driver, 120);
		builder_load.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("// span[normalize-space()='WELCOME SCREEN']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(2000);

		WebElement lastelement = driver.findElement(By.xpath("//div[normalize-space()='CHANGE LAYOUT']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastelement);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-basic2 w100']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'ECOMMERCE RECOMMENDATION')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Switch Anyway')]")).click();

		WebDriverWait wait_for_switching_text = new WebDriverWait(driver, 120);
		wait_for_switching_text.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]")));

		Boolean switching_text = driver
				.findElement(
						By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='mobile-top-menu']//li[2]")).click();

		System.out.println(switching_text);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(4000);

		WebElement switched_layout = driver.findElement(By.xpath("//div[normalize-space()='CHANGE LAYOUT']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", switched_layout);

		String content_change_text_a = driver
				.findElement(By.xpath("//global_settings/div[2]/div[5]/div[5]/div[3]/div[2]/button/div")).getText();

		Thread.sleep(4000);

		String content_change_text_e = "eCommerce Recommendation";

		if (content_change_text_a.equals(content_change_text_e)) {

			System.out.println(content_change_text_a);

			System.out.println("passed");
			String a = "abc";
			String b = "abc";
			Assert.assertEquals(a, b);

		} else {

			System.out.println("else condition run");
			String a = "abc";
			String b = "pqr";
			Assert.assertEquals(a, b);
		}
	}

	@Test(priority = 2)
	public static void switchingSurveyToEcomm_chicago()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		login_to_new_tab_dashboard();

		// click on survey
		driver.findElement(By.xpath("//og-content-type/div/div/div[2]/div[8]/div/label/div[1]/h3/i")).click();

		driver.findElement(By.xpath("//og-templates/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/button"))
				.click();

		WebDriverWait builder_load = new WebDriverWait(driver, 120);
		builder_load.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("// span[normalize-space()='WELCOME SCREEN']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(2000);

		WebElement lastelement = driver.findElement(By.xpath("//div[normalize-space()='CHANGE LAYOUT']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastelement);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-basic2 w100']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'ECOMMERCE RECOMMENDATION')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Switch Anyway')]")).click();

		WebDriverWait wait_for_switching_text = new WebDriverWait(driver, 120);
		wait_for_switching_text.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]")));

		Boolean switching_text = driver
				.findElement(
						By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='mobile-top-menu']//li[2]")).click();

		System.out.println(switching_text);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(4000);

		WebElement switched_layout = driver.findElement(By.xpath("//div[normalize-space()='CHANGE LAYOUT']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", switched_layout);

		String content_change_text_a = driver
				.findElement(By.xpath("//global_settings/div[2]/div[5]/div[5]/div[3]/div[2]/button/div")).getText();

		Thread.sleep(4000);

		String content_change_text_e = "eCommerce Recommendation";

		if (content_change_text_a.equals(content_change_text_e)) {

			System.out.println(content_change_text_a);

			WebElement scrollUpdisplay = driver.findElement(By.xpath("//span[normalize-space()='Display Settings']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollUpdisplay);

			Thread.sleep(2000);

			System.out.println("passed");
			String a = "abc";
			String b = "abc";
			Assert.assertEquals(a, b);

		} else {

			System.out.println("else condition run");
			String a = "abc";
			String b = "pqr";
			Assert.assertEquals(a, b);
		}
	}

	// @Test(priority = 3)
	public static void switchingCalculatorToAssessment_chicago()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		login_to_new_tab_dashboard();

		// click on outcome quiz
		driver.findElement(By.xpath("//i[@class='la la-calculator unchecked-icons']")).click();

		driver.findElement(By.xpath("//og-templates/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/button"))
				.click();

		WebDriverWait builder_load = new WebDriverWait(driver, 120);
		builder_load.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("// span[normalize-space()='WELCOME SCREEN']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(2000);

		WebElement lastelement = driver.findElement(By.xpath("//div[normalize-space()='CHANGE LAYOUT']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastelement);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-basic2 w100']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'ASSESSMENT')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Switch Anyway')]")).click();

		WebDriverWait wait_for_switching_text = new WebDriverWait(driver, 120);
		wait_for_switching_text.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]")));

		Boolean switching_text = driver
				.findElement(
						By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]"))
				.isDisplayed();

		System.out.println(switching_text);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(4000);

		String assessment_text_a = driver
				.findElement(By.xpath("//global_settings/div[2]/div[5]/div[5]/div[3]/div[2]/button/div")).getText();

		String assessment_text_e = "Assessment";

		Thread.sleep(4000);

		if (assessment_text_a.equals(assessment_text_e)) {

			System.out.println(assessment_text_a);

			System.out.println("passed");
			String a = "abc";
			String b = "abc";
			Assert.assertEquals(a, b);

		} else {

			System.out.println("else condition run");
			String a = "abc";
			String b = "pqr";
			Assert.assertEquals(a, b);
		}

	}

	// @Test(priority = 4)
	public static void switchingCalculatorToOutcome_chicago()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		login_to_new_tab_dashboard();

		// click on outcome quiz
		driver.findElement(By.xpath("//i[@class='la la-calculator unchecked-icons']")).click();

		driver.findElement(By.xpath("//og-templates/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/button"))
				.click();

		WebDriverWait builder_load = new WebDriverWait(driver, 120);
		builder_load.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("// span[normalize-space()='WELCOME SCREEN']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(2000);

		WebElement lastelement = driver.findElement(By.xpath("//div[normalize-space()='CHANGE LAYOUT']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastelement);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-basic2 w100']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'OUTCOME QUIZ')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Switch Anyway')]")).click();

		WebDriverWait wait_for_switching_text = new WebDriverWait(driver, 120);
		wait_for_switching_text.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]")));

		Boolean switching_text = driver
				.findElement(
						By.xpath("//span[contains(text(),\"Awesome, we're taking you to the builder to create\")]"))
				.isDisplayed();

		System.out.println(switching_text);

		driver.findElement(By.xpath("//i[normalize-space()='edit']")).click();

		Thread.sleep(4000);

		WebElement switched_layout = driver.findElement(By.xpath("//div[normalize-space()='CHANGE LAYOUT']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", switched_layout);

		String content_change_text_a = driver
				.findElement(By.xpath("//global_settings/div[2]/div[5]/div[5]/div[3]/div[2]/button/div")).getText();

		Thread.sleep(4000);

		String content_change_text_e = "Outcome Quiz";

		if (content_change_text_a.equals(content_change_text_e)) {

			System.out.println(content_change_text_a);

			System.out.println("passed");
			String a = "abc";
			String b = "abc";
			Assert.assertEquals(a, b);

		} else {

			System.out.println("else condition run");
			String a = "abc";
			String b = "pqr";
			Assert.assertEquals(a, b);
		}

	}

}
