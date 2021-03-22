package outgrowpackage;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDownloadingOfPdf {

	@Test
	public static void chicago_chrome_download_pdf() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		String downloadFilePathLocation = System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilePathLocation);
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dcompany878.outgrow.us/dcompany878-6186");
		driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']")).click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//form/div/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span")));

		driver.findElement(By.xpath(
				"//form/div/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"))
				.click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Download pdf']")));

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[normalize-space()='Download pdf']")).click();

		Thread.sleep(5000);

		File downloadedFile = new File(downloadFilePathLocation + "\\Dalip's #6186 Calculator.pdf");
		Thread.sleep(5000);

		Assert.assertTrue(downloadedFile.exists());

		// downloadedFile.delete();

		driver.close();

		driver.quit();

	}

	//@Test
	public static void chicago_moziila_downloadPdf() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		FirefoxProfile profile = new FirefoxProfile();
		String downloadFilePathLocation = System.getProperty("user.dir");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", true);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		WebDriver driver = new FirefoxDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dcompany878.outgrow.us/dcompany878-6186");
		driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']")).click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//form/div/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span")));

		driver.findElement(By.xpath(
				"//form/div/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"))
				.click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Download pdf']")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[normalize-space()='Download pdf']")).click();

		Thread.sleep(2000);

		File downloadedFile = new File(downloadFilePathLocation + "\\Dalip's #6186 Calculator.pdf");
		Thread.sleep(2000);

		Assert.assertTrue(downloadedFile.exists());

		downloadedFile.delete();

		driver.close();

	}
}
