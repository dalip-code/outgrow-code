package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class defaultValueOfquestions extends CommonLib{

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
	public static void chicag0_default_values() throws InterruptedException {
		driver.get("https://dcompany878.outgrow.us/dcompany878-6340");

		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(2000);

	}

}
