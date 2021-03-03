package outgrowpackage;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class result_table extends CommonLib {

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
	public static void result_table_id_01_desktop_chicago() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4292");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		driver.findElement(By.xpath("//form/div[1]/div[4]/a/i")).click();

		// question 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//form/div[2]/div[4]/a/i")).click();

		// question 3
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[3]/div[4]/a/i")).click();

		// question 4
		WebDriverWait wait_q4 = new WebDriverWait(driver, 20);
		wait_q4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 4']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[4]/div[4]/a")).click();

		Thread.sleep(1000);

		WebElement td_data = driver.findElement(By.xpath("//table/tbody/tr[1]/td[13]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", td_data);

		CommonLib.CaptureScreenshotResultPageTable("result_table_id_01_desktop_chicago");

		Thread.sleep(3000);
	}

	@Test
	public static void result_table_id_01_mobile_chicago() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4292");
		driver.manage().window().setSize(new Dimension(360, 600));
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		driver.findElement(By.xpath("//form/div[1]/div[4]/a/i")).click();

		// question 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//form/div[2]/div[4]/a/i")).click();

		// question 3
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[3]/div[4]/a/i")).click();

		// question 4
		WebDriverWait wait_q4 = new WebDriverWait(driver, 20);
		wait_q4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 4']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[4]/div[4]/a")).click();

		Thread.sleep(1000);

		WebElement td_data = driver.findElement(By.xpath("//table/tbody/tr[1]/td[13]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", td_data);

		CommonLib.CaptureScreenshotResultPageTable("result_table_id_01_mobile_chicago");

		Thread.sleep(3000);

	}

	 @Test
	public static void result_table_id_02_desktop_paris() throws IOException, InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4305");

		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		WebElement last_q = driver.findElement(By.xpath("//strong[normalize-space()='Question title goes here 6']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", last_q);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(2000);

		WebElement td_data = driver.findElement(By.xpath("//table/tbody/tr[1]/td[13]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", td_data);

		CommonLib.CaptureScreenshotResultPageTable("result_table_id_01_desktop_paris");

		Thread.sleep(2000);

	}

	@Test
	public static void result_table_id_02_mobile_paris() throws IOException, InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4305");
		driver.manage().window().setSize(new Dimension(320, 650));
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		WebElement last_q = driver.findElement(By.xpath("//strong[normalize-space()='Question title goes here 6']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", last_q);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(2000);

		WebElement td_data = driver.findElement(By.xpath("//table/tbody/tr[8]/td[13]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", td_data);

		CommonLib.CaptureScreenshotResultPageTable("result_table_id_01_desktop_paris");

		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public static void paris_result_page_table_title_padding_desktop() throws IOException, InterruptedException {

		// https://dcompany878.outgrow.co/builder/dcompany878-4765
		//

		driver.get("https://dcompany878.outgrow.us/dcompany878-4765");

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		WebElement last_q = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here 3')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", last_q);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(2000);

		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[contains(text(),'This is the page heading')]")));

		WebElement getcssvalue_table_padding = driver.findElement(By.xpath("//span[@class='table-title']"));

		String actual_value_table_padding_left = getcssvalue_table_padding.getCssValue("padding-left");
		String actual_value_table_padding_right = getcssvalue_table_padding.getCssValue("padding-right");

		String expected_value_table_padding_left = "20px";
		String expected_value_table_padding_right = "20px";

		Assert.assertEquals(actual_value_table_padding_left, expected_value_table_padding_left);
		Assert.assertEquals(actual_value_table_padding_right, expected_value_table_padding_right);

		CommonLib.CaptureScreenshotResultPageTable("result_page_table_title_padding");

		Thread.sleep(1000);

	}

	@Test(priority = 6)
	public static void paris_result_page_table_title_padding_tab() throws IOException, InterruptedException {

		// https://dcompany878.outgrow.co/builder/dcompany878-4765
		//

		driver.get("https://dcompany878.outgrow.us/dcompany878-4765");
		driver.manage().window().setSize(new Dimension(768, 1024));

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		WebElement last_q = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here 3')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", last_q);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(2000);

		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[contains(text(),'This is the page heading')]")));

		WebElement getcssvalue_table_padding = driver.findElement(By.xpath("//span[@class='table-title']"));

		String actual_value_table_padding_left = getcssvalue_table_padding.getCssValue("padding-left");
		String actual_value_table_padding_right = getcssvalue_table_padding.getCssValue("padding-right");

		String expected_value_table_padding_left = "20px";
		String expected_value_table_padding_right = "20px";

		Assert.assertEquals(actual_value_table_padding_left, expected_value_table_padding_left);
		Assert.assertEquals(actual_value_table_padding_right, expected_value_table_padding_right);

		CommonLib.CaptureScreenshotResultPageTable("result_page_table_title_padding");

		Thread.sleep(1000);

	}

	@Test(priority = 7)
	public static void paris_result_page_table_title_padding_mobile() throws IOException, InterruptedException {

		// https://dcompany878.outgrow.co/builder/dcompany878-4765
		//

		driver.get("https://dcompany878.outgrow.us/dcompany878-4765");
		driver.manage().window().setSize(new Dimension(360, 600));

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		WebElement last_q = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here 3')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", last_q);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(2000);

		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[contains(text(),'This is the page heading')]")));

		WebElement getcssvalue_table_padding = driver.findElement(By.xpath("//span[@class='table-title']"));

		String actual_value_table_padding_left = getcssvalue_table_padding.getCssValue("padding-left");
		String actual_value_table_padding_right = getcssvalue_table_padding.getCssValue("padding-right");

		String expected_value_table_padding_left = "20px";
		String expected_value_table_padding_right = "20px";

		Assert.assertEquals(actual_value_table_padding_left, expected_value_table_padding_left);
		Assert.assertEquals(actual_value_table_padding_right, expected_value_table_padding_right);

		CommonLib.CaptureScreenshotResultPageTable("result_page_table_title_padding");

		Thread.sleep(1000);

	}

}
