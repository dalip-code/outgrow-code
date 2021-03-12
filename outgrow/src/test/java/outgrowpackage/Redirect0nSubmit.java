package outgrowpackage;

import java.net.MalformedURLException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Redirect0nSubmit extends CommonLib {

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
	public static void Chicago_redirect_on_submit() throws InterruptedException {
		driver.get("https://dcompany878.outgrow.us/dcompany878-6279");
		WebDriverWait wait_wcs = new WebDriverWait(driver, 30);
		wait_wcs.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='landingBtn']")).click();

		wait_wcs.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"))
				.click();

		Thread.sleep(2000);

		// hold all window handles in array list
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		String url_newtab_e = "https://outgrow.co/";
		wait_wcs.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Start Free Trial']")));
		String url_newtab_a = driver.getCurrentUrl();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(url_newtab_a, url_newtab_e);
		driver.switchTo().window(newTb.get(0));
		// switch to parent window
		// driver.switchTo().window(newTb.get(0));
		// System.out.println("Page title of parent window: " + driver.getTitle());

		Thread.sleep(5000);

	}

}
