package outgrowpackage;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class live_contents extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

	@Test(priority = 1)
	public static void stockholm_poll() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2377");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Poll heading goes here')]")));
		String expected_title = "Poll heading stockholm";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Stockholm poll");
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public static void stockholm_survey() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2373");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Survey heading goes here')]")));
		String expected_title = "Survey heading stockholm";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Stockholm survey");
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public static void stockholm_assessment() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2370");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Assessment heading goes here')]")));
		String expected_title = "Assessment heading stockholm";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Stockholm assessment");
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public static void stockholm_outcome() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2366");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Quiz heading goes here')]")));
		String expected_title = "Outcome heading stockholm";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Stockholm outcome");
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public static void stockholm_calculator() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2362");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Calculator heading goes here')]")));
		String expected_title = "Calculator heading stockholm";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Stockholm calculator");
		Thread.sleep(2000);
		System.out.println("********************************");

	}

	@Test(priority = 6)
	public static void Venice_survey() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2355");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Survey heading goes here')]")));
		String expected_title = "Survey heading venice";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Venice survey");
		Thread.sleep(2000);

	}

	@Test(priority = 7)
	public static void Venice_poll() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2354");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Poll heading goes here')]")));
		String expected_title = "Poll heading venice";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Venice poll");
		Thread.sleep(2000);

	}

	@Test(priority = 8)
	public static void Venice_assessment() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2353");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Assessment heading goes here')]")));
		String expected_title = "Assessment heading venice";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Venice assessment");
		Thread.sleep(2000);

	}

	@Test(priority = 9)
	public static void Venice_outcome() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2351");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Quiz heading goes here')]")));
		String expected_title = "Outcome heading venice";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Venice outcome");
		Thread.sleep(2000);

	}

	@Test(priority = 10)
	public static void Venice_calculator() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2348");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Calculator heading goes here')]")));
		String expected_title = "Calculator heading venice";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Venice calculator");
		Thread.sleep(2000);
		System.out.println("********************************");
	}

	@Test(priority = 11)
	public static void Newyork_survey() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2345");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Survey heading goes here')]")));
		String expected_title = "Survey heading newyork";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Newyork survey");
		Thread.sleep(2000);
	}

	@Test(priority = 12)
	public static void Newyork_chatbot() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2342");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Chatbot heading goes here')]")));
		String expected_title = "Chatbot heading newyork";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Newyork chatbot");
		Thread.sleep(2000);

	}

	@Test(priority = 13)
	public static void Newyork_outcome() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2338");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Quiz heading goes here')]")));
		String expected_title = "Outcome heading newyork";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Newyork outcome");
		Thread.sleep(2000);

	}

	@Test(priority = 14)
	public static void Newyork_calculator() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-2333");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Calculator heading goes here')]")));
		String expected_title = "Calculator heading newyork";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(actual_title);
		Thread.sleep(5000);
		CommonLib.CaptureScreenshotContents("Newyork calculator");
		Thread.sleep(2000);
		System.out.println("********************************");
	}

}

//https://prnt.sc/w3vahs
