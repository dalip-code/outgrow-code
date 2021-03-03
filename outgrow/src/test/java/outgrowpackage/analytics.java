package outgrowpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class analytics extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, IOException {
		CommonLib.LaunchBrowswer();
		CommonLib.login();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

	@BeforeMethod
	public static void Open_siteup_page_browser() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='navbar-brand navbar-logopadding']//img")).click();
		Thread.sleep(10000);
	}

	@Test
	public static void Verify_Analytic_page() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'Analytics')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h6[contains(text(),'Showing analytics for')]")));
		Thread.sleep(10000);
	}


}
