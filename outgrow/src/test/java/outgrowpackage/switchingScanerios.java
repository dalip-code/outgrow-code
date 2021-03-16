package outgrowpackage;

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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import logicJump.ScreenRecorderUtil;

public class switchingScanerios extends CommonLib {

	@BeforeClass
	public static void open_browser() throws Exception {
		CommonLib.LaunchBrowswer();
		// ScreenRecorderUtil.startRecord("open_browser");
	}

	@AfterClass
	public static void quit_browser() throws Exception {
		CommonLib.closeBrowser();
		// ScreenRecorderUtil.stopRecord();
		CommonLib.quitDriver();
	}

	@Test(priority = 1)
	public static void switchingOutcomeToEcomm()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		CommonLib.login();

		String currentUrl = driver.getCurrentUrl();

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();
		driver.navigate().to(currentUrl);

		WebDriverWait dashboardLoadCheck = new WebDriverWait(driver, 60);
		dashboardLoadCheck.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//i[@class='la la-calculator unchecked-icons']")));

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

		String errorMessage_a = driver
				.findElement(By.xpath("//span[contains(text(),'Something went wrong. Try reloading the page, or c')]"))
				.getText();

		String errroMessage_e = "Something went wrong. Try reloading the page, or contact the support team";

		System.out.println(errorMessage_a);

		if (errorMessage_a == errroMessage_e) {

			SoftAssert soft = new SoftAssert();

			soft.assertTrue(false);
			soft.assertAll();
			System.out.println("failed");
		}

	}

}
