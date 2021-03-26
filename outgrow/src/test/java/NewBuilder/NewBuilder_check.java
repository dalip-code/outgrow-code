package NewBuilder;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import logicJump.ScreenRecorderUtil;
import outgrowpackage.CommonLib;

public class NewBuilder_check extends CommonLib {

	@BeforeClass
	public static void open_browser() throws Exception {
		CommonLib.LaunchBrowswer();

	}

	@AfterClass
	public static void quit_browser() throws Exception {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

	@Test
	public static void builderCheckCal() throws InterruptedException {

		driver.get("http://app.outgrow.in/login");

		// span[contains(text(),'Please Login to Continue')]

		WebElement email = driver.findElement(By.xpath("//form/div[1]/div/input"));
		WebElement password = driver.findElement(By.xpath("//form/div[2]/div/input"));

		Thread.sleep(2000);

		email.sendKeys("dalip.kumar@venturepact.com");
		password.sendKeys("defaultPassword");

		driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();

		WebDriverWait builder_load = new WebDriverWait(driver, 120);
		builder_load
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//og-content-type/div/div/div[1]/h4")));

		Thread.sleep(3000);
	}
}