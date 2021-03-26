package logicJump;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import outgrowpackage.CommonLib;

public class logicJump extends CommonLib {

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

	@DataProvider(name = "lj_id_28_mapping_plus_logic_jump_multiple_outcome_off_else_condition")
	public Object[][] createData1() {
		return new Object[][] { { "dalip", "dalip.kumar@venturepact.com" },
				// { "dalip+1", "dalip.kumar+1@venturepact.com" }, { "dalip+2",
				// "dalip.kumar+2@venturepact.com" },
				// { "dalip+3", "dalip.kumar+3@venturepact.com" }, { "dalip+4",
				// "dalip.kumar+4@venturepact.com" }
		};

	}

	@Test(priority = 1)
	public static void lj_id_01_q2_equal_to_option2_jt_outcome1_page() throws InterruptedException, IOException {

		// logic jump on question 2, if q2 equal to option 2, jump to outcome page
		// https://dcompany878.outgrow.co/builder/dcompany878-4277
		driver.get("https://dcompany878.outgrow.us/dcompany878-4277");
		// driver.get("https://livec.rely.co/dcompany878-4277");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 45);

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
		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q1.click();

		// question 2

		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		WebDriverWait wait_outcome = new WebDriverWait(driver, 20);
		wait_outcome
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Outcome 1']")));
		WebElement outcome1_text = driver.findElement(By.xpath("//p[normalize-space()='Outcome 1']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", outcome1_text);

		String actualOutcome1_text = outcome1_text.getText();
		String expectedOutcome1_text = "Outcome 1";
		Assert.assertEquals(actualOutcome1_text, expectedOutcome1_text);

		CommonLib.CaptureScreenshotLogicJump("lj_01_q2_to_outcome_page");

		Thread.sleep(3000);

		// Scripting else condition

		driver.get("https://dcompany878.outgrow.us/dcompany878-4277");
		WebDriverWait wait_welcome_screen_else_c = new WebDriverWait(driver, 30);
		wait_welcome_screen_else_c.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(2000);

		WebElement name1 = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email1 = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button1 = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name1.clear();
		name1.sendKeys("dalip");
		Thread.sleep(500);
		email1.clear();
		email1.sendKeys("dalip.kumar@venturepact.com");
		button1.click();

		// question 1
		WebDriverWait wait_q1_ = new WebDriverWait(driver, 20);
		wait_q1_.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		WebElement option1_q1_ = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q1_.click();

		// question 2

		WebDriverWait wait_q2_ = new WebDriverWait(driver, 20);
		wait_q2_.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		WebElement option1_q2_ = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q2_.click();

		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));

		WebElement q3_text = driver.findElement(By.xpath("//p[normalize-space()='Question title goes here 3']"));
		String actual_q3_text = q3_text.getText();
		String expected_q3_text = "Question title goes here 3";
		Assert.assertEquals(actual_q3_text, expected_q3_text);

		CommonLib.CaptureScreenshotLogicJump("lj_id_01_2021_q2_to_outcome_page_else_c");

		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public static void lj_id_02_q1_equal_to_option1_jt_outcome1() throws InterruptedException {
		// if question1 question option 1 jump to outcome1

		driver.get("https://dcompany878.outgrow.us/dcompany878-2260");
		// driver.get("https://livec.rely.co/dcompany878-2260");
		WebDriverWait wait_welcome = new WebDriverWait(driver, 20);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//*[@id='option_label_5faa4bb34e6e8879e5b5bd81']"))
				.click();
		// p[contains(text(),'Outcome 1')]

		WebDriverWait wait_outcome1 = new WebDriverWait(driver, 20);
		wait_outcome1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Outcome 1')]")));
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public static void lj_id_03_q1_equal_to_option2_jt_outcome2() throws InterruptedException {
		// if question1 : option 2 jump to outcome2

		driver.get("https://dcompany878.outgrow.us/dcompany878-2260");
		// driver.get("https://livec.rely.co/dcompany878-2260");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 20);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='option_label_5faa4bb34e6e8879e5b5bd7f']")).click();

		WebDriverWait wait_outcome2 = new WebDriverWait(driver, 20);
		wait_outcome2
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Outcome 2')]")));
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public static void lj_id_04_q1_q2_AND_jump_to_result_page_01() throws InterruptedException {
		// if question1 and question 2 condition option1, option1 jump to result page

		driver.get("https://dcompany878.outgrow.us/Copy-of-dcompany878-2426-1");
		// driver.get("https://livec.rely.co/Copy-of-dcompany878-2426-1");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 60);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Calculator heading goes here')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[2]/div/div[3]/control/leadform/button")).click();

		WebDriverWait wait_section1 = new WebDriverWait(driver, 20);
		wait_section1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		Thread.sleep(1000);

		// question 1: option 1
		driver.findElement(
				By.xpath("//div[1]/div[2]/form/div[1]/div[3]/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		Thread.sleep(1000);

		// question 2: option 1
		driver.findElement(
				By.xpath("//div[1]/div[2]/form/div[2]/div[3]/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		Thread.sleep(1000);

		// enter button
		driver.findElement(By.xpath("//button[@class='btn prime-action ripple-light next-new-btn enterBtn']")).click();

		Thread.sleep(1000);

		// wait for result page
		WebDriverWait wait_result_page = new WebDriverWait(driver, 10);
		wait_result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your heading goes here')]")));
		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(1000);

	}

	@Test(priority = 4)
	public static void lj_id_04_q1_q2_AND_jump_to_result_page_02() throws InterruptedException {

		// if question 1 equals option 2 and question 2 equals option 2,jump to result
		// page

		driver.get("https://dcompany878.outgrow.us/Copy-of-dcompany878-2426-1");
		// driver.get("https://livec.rely.co/Copy-of-dcompany878-2426-1");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 60);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Calculator heading goes here')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[2]/div/div[3]/control/leadform/button")).click();

		WebDriverWait wait_section1 = new WebDriverWait(driver, 20);
		wait_section1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		Thread.sleep(1000);

		// question 1: option 2
		driver.findElement(By
				.xpath("//div[1]/div[2]/form/div[1]/div[3]/div/control/radio-button/div/div/div[2]/div[2]/label/span"))
				.click();

		Thread.sleep(1000);

		// question 2: option 2
		driver.findElement(By
				.xpath("//div[1]/div[2]/form/div[2]/div[3]/div/control/radio-button/div/div/div[2]/div[2]/label/span"))
				.click();

		Thread.sleep(1000);

		// enter button
		driver.findElement(By.xpath("//button[@class='btn prime-action ripple-light next-new-btn enterBtn']")).click();

		Thread.sleep(1000);

		// wait for result page
		WebDriverWait wait_result_page = new WebDriverWait(driver, 10);
		wait_result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your heading goes here')]")));
		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(1000);
	}

	@Test(priority = 4)
	public static void lj_id_04_q1_q2_AND_else_condition_jt_section2() throws InterruptedException {
		// if question 1 equals option 2 and question 2 equals option 2,jump to result
		// page

		driver.get("https://dcompany878.outgrow.us/Copy-of-dcompany878-2426-1");
		// driver.get("https://livec.rely.co/Copy-of-dcompany878-2426-1");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 60);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Calculator heading goes here')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[2]/div/div[3]/control/leadform/button")).click();

		WebDriverWait wait_section1 = new WebDriverWait(driver, 20);
		wait_section1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		Thread.sleep(1000);

		// question 1: option 1
		driver.findElement(By
				.xpath("//div[1]/div[2]/form/div[1]/div[3]/div/control/radio-button/div/div/div[1]/div[2]/label/span"))
				.click();

		Thread.sleep(1000);

		// question 2: option 2
		driver.findElement(By
				.xpath("//div[1]/div[2]/form/div[2]/div[3]/div/control/radio-button/div/div/div[2]/div[2]/label/span"))
				.click();

		Thread.sleep(1000);

		// enter button
		driver.findElement(By.xpath("//button[@class='btn prime-action ripple-light next-new-btn enterBtn']")).click();

		Thread.sleep(1000);

		// wait for result page
		WebDriverWait section2 = new WebDriverWait(driver, 10);
		section2.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='Section 2 of 2']")));
		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(1000);

	}

	@Test(priority = 5)
	public static void lj_id_05_ranking_grid_and_condition_01() throws InterruptedException, IOException {
		// https://app.asana.com/0/0/1198901601299662/f

		// logic jump ranking grid and condition

		driver.get("https://dcompany878.outgrow.us/dcompany878-2750");
		// driver.get("https://livec.rely.co/dcompany878-2750");
		WebDriverWait wait_welcome = new WebDriverWait(driver, 30);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='CALCULATOR HEADING GOES HERE']")));
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement submit_button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		submit_button.click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));
		Thread.sleep(1000);

		// option 1 : rank1
		driver.findElement(By.xpath("//rankfield/div/div/div/div[2]/ul/li[1]/label")).click();

		Thread.sleep(1000);

		// option 2 : rank 2
		driver.findElement(By.xpath("//rankfield/div/div/div/div[3]/ul/li[2]/label")).click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 30);
		wait_continue_button.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_01_continuebutton");

		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		wait_welcome.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		WebDriverWait wait_result_page = new WebDriverWait(driver, 30);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP AND CONDITION']")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_01_resultpage");

		String expected_heading = "RANKING GRID LOGIC JUMP AND CONDITION";
		String actual_heading = driver
				.findElement(By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP AND CONDITION']")).getText();
		Assert.assertEquals(actual_heading, expected_heading);

		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(2000);

		CommonLib.scrolling_to_top();

		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public static void lj_id_06_ranking_grid_and_condition_02() throws InterruptedException, IOException {
		// https://app.asana.com/0/0/1198901601299662/f

		// logic jump ranking grid and condition

		driver.get("https://dcompany878.outgrow.us/dcompany878-2750");
		// driver.get("https://livec.rely.co/dcompany878-2750");
		WebDriverWait wait_welcome = new WebDriverWait(driver, 30);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='CALCULATOR HEADING GOES HERE']")));
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement submit_button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		submit_button.click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));
		Thread.sleep(1000);
		// option 1 : rank 2
		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[2]/ul/li[2]/label")).click();

		Thread.sleep(1000);
		// option 2 : rank 1
		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[3]/ul/li[1]/label")).click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 30);
		wait_continue_button.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_02_continuebutton");

		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		WebDriverWait wait_question2 = new WebDriverWait(driver, 30);
		wait_question2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_02_question2");

		driver.findElement(By.xpath("//*[@id='option_label_5fd21a8484ca44000ea26dc4']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 30);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP AND CONDITION']")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_02_resultpage");

		String expected_heading = "RANKING GRID LOGIC JUMP AND CONDITION";
		String actual_heading = driver
				.findElement(By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP AND CONDITION']")).getText();
		Assert.assertEquals(actual_heading, expected_heading);

		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(2000);

		CommonLib.scrolling_to_top();

	}

	@Test(priority = 7)
	public static void lj_id_07_ranking_grid_or_condition_01() throws InterruptedException, IOException {
		// https://app.asana.com/0/0/1198901601299662/f

		// logic jump ranking grid and condition

		// https://dcompany878.rely.co/builder/lj_or_condition
		// https://dcompany878.outgrow.co/builder/lj_or_condition

		driver.get("https://dcompany878.outgrow.us/lj_or_condition");
		// driver.get("https://livec.rely.co/lj_or_condition");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 40);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='CALCULATOR HEADING GOES HERE']")));
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement submit_button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		submit_button.click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));
		Thread.sleep(1000);

		// rank 1 : option 1
		driver.findElement(By.xpath("//rankfield/div/div/div/div[2]/ul/li[1]/label")).click();

		Thread.sleep(1000);

		// rank 2 : option 2
		driver.findElement(By.xpath("//rankfield/div/div/div/div[3]/ul/li[2]/label")).click();

		Thread.sleep(1000);

		// rank 3 : option 4
		driver.findElement(By.xpath("//rankfield/div/div/div/div[5]/ul/li[3]/label")).click();

		Thread.sleep(1000);

		// rank 4: option 3
		driver.findElement(By.xpath("//rankfield/div/div/div/div[4]/ul/li[4]/label")).click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 30);
		wait_continue_button.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_01_continuebutton");

		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		wait_welcome.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		WebDriverWait wait_result_page = new WebDriverWait(driver, 30);
		wait_result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP OR CONDITION']")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_01_resultpage");

		String expected_heading = "RANKING GRID LOGIC JUMP OR CONDITION";
		String actual_heading = driver
				.findElement(By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP OR CONDITION']")).getText();
		Assert.assertEquals(actual_heading, expected_heading);

		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(2000);

		CommonLib.scrolling_to_top();

		Thread.sleep(2000);

	}

	@Test(priority = 8)
	public static void lj_id_08_ranking_grid_or_condition_02() throws InterruptedException, IOException {
		// https://app.asana.com/0/0/1198901601299662/f

		// logic jump ranking grid and condition

		driver.get("https://dcompany878.outgrow.us/lj_or_condition");
		// driver.get("https://livec.rely.co/lj_or_condition");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 30);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='CALCULATOR HEADING GOES HERE']")));
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement submit_button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		submit_button.click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));
		Thread.sleep(1000);

		// rank 1 : option 3
		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[4]/ul/li[1]/label")).click();

		Thread.sleep(1000);

		// rank 2 : option 2
		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[3]/ul/li[2]/label")).click();

		Thread.sleep(1000);

		// rank 3 : option 4
		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[5]/ul/li[3]/label")).click();

		Thread.sleep(1000);

		// rank 4 : option 1
		driver.findElement(By.xpath("//rankfield/div/div/div/div[2]/ul/li[4]/label")).click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 30);
		wait_continue_button.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_02_continuebutton");

		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		WebDriverWait wait_question2 = new WebDriverWait(driver, 30);
		wait_question2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_02_question2");

		driver.findElement(By.xpath("//*[@id='option_label_5fd21a8484ca44000ea26dc4']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 30);
		wait_result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP OR CONDITION']")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_and_condition_02_resultpage");

		String expected_heading = "RANKING GRID LOGIC JUMP OR CONDITION";
		String actual_heading = driver
				.findElement(By.xpath("//p[normalize-space()='RANKING GRID LOGIC JUMP OR CONDITION']")).getText();
		Assert.assertEquals(actual_heading, expected_heading);

		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(2000);

		CommonLib.scrolling_to_top();

	}

	@Test(priority = 9)
	public static void lj_id_09_ranking_grid_outcome_01() throws InterruptedException, IOException {

		// https://dcompany878.rely.co/builder/lj_ranking_grid_outcome

		// logic jump ranking grid and condition

		driver.get("https://dcompany878.outgrow.us/lj_ranking_grid_outcome");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 30);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='QUIZ HEADING GOES HERE']")));
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement submit_button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		submit_button.click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[2]/ul/li[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[3]/ul/li[2]/label")).click();

		Thread.sleep(1000);
		WebDriverWait wait_continue_button = new WebDriverWait(driver, 30);
		wait_continue_button.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_outcome_01_continuebutton");

		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		wait_welcome.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		WebDriverWait wait_result_page = new WebDriverWait(driver, 30);
		wait_result_page
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Outcome 1']")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_oucome_01_resultpage");

		String expected_heading = "Outcome 1";
		String actual_heading = driver.findElement(By.xpath("//p[normalize-space()='Outcome 1']")).getText();
		Assert.assertEquals(actual_heading, expected_heading);

		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(2000);

		CommonLib.scrolling_to_top();

		Thread.sleep(3000);

	}

	@Test(priority = 10)
	public static void lj_id_10_ranking_grid_outcome_02() throws InterruptedException, IOException {

		// https://app.asana.com/0/0/1198901601299662/f

		// logic jump ranking grid and condition

		driver.get("https://dcompany878.outgrow.us/lj_ranking_grid_outcome");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 30);
		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='QUIZ HEADING GOES HERE']")));
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement submit_button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		submit_button.click();

		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[2]/ul/li[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//rankfield/div/div[1]/div/div[3]/ul/li[1]/label")).click();

		Thread.sleep(1000);
		WebDriverWait wait_continue_button = new WebDriverWait(driver, 30);
		wait_continue_button.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_outcome_02_continuebutton");

		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		wait_welcome.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 30);
		wait_result_page
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Outcome 1']")));
		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("ranking_grid_oucome_02_resultpage");

		String expected_heading = "Outcome 1";
		String actual_heading = driver.findElement(By.xpath("//p[normalize-space()='Outcome 1']")).getText();
		Assert.assertEquals(actual_heading, expected_heading);

		Thread.sleep(1000);

		CommonLib.scrolling_to_bottom();

		Thread.sleep(2000);

		CommonLib.scrolling_to_top();

		Thread.sleep(3000);

	}

	// @Test(priority = 11)
	public static void lj_id_11_text_area_simple_4point5sprint() throws InterruptedException {

		// https://app.asana.com/0/0/1194733670910938/f

		// builder link : http://daliplive.outgrow.in/builder/daliplive-33

		// content link : http://livec.outgrow.in/daliplive-33

		driver.get("https://livec.outgrow.in/daliplive-33");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 20);
		wait_welcome.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[contains(text(),'BUTTON TEXT')]")).click();

		// question 1
		/* ----------------------------------------------------- */

		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'single select 1')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Option 1')] [1]")).click();
		Thread.sleep(1000);

		// question 2
		/* ----------------------------------------------------- */

		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'text area 2')]")));
		driver.findElement(By.xpath("//textarea[@id='5f9e2c25b91e75000ebf92e7']")).sendKeys("1");

		driver.findElement(By.xpath("//button[@class='button_textfield submit-textbox-btnresp ripple-light']")).click();
		Thread.sleep(1000);

		// result page wait
		/* ----------------------------------------------------- */

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'THIS IS THE PAGE HEADING')]")));
		Thread.sleep(1000);
		CommonLib.scrolling_to_bottom();

		// refresh button
		driver.findElement(By.xpath("//a[@id='refresh-button']")).click();
		Thread.sleep(1000);

		// question 1 after refresh
		/* ----------------------------------------------------- */

		WebDriverWait wait_q1_refresh = new WebDriverWait(driver, 20);
		wait_q1_refresh.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'single select 1')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Option 1')] [1]")).click();

		// question 2 after refresh
		/* ----------------------------------------------------- */

		WebDriverWait wait_q2_refresh = new WebDriverWait(driver, 20);
		wait_q2_refresh
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'text area 2')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='5f9e2c25b91e75000ebf92e7']")).click();
		Thread.sleep(1000);

		// question 3 after refresh
		/* ----------------------------------------------------- */

		WebDriverWait wait_q3_refresh = new WebDriverWait(driver, 20);
		wait_q3_refresh.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'text area rich text 3')]")));
		Thread.sleep(1000);

	}

	// @Test(priority = 12)
	public static void lj_id_12_text_area_rich_text_4point5sprint() throws InterruptedException {

		// https://app.asana.com/0/0/1194733670910938/f

		// builder link : http://daliplive.outgrow.in/builder/Copy-of-daliplive-33-1

		// content link : https://livec.outgrow.in/Copy-of-daliplive-33-1

		// https://drive.google.com/file/d/13SK6sNwJAoDK67RNZ7O6t8Szk_ZJz3LB/view

		driver.get("https://livec.outgrow.in/Copy-of-daliplive-33-1");

		WebDriverWait wait_welcome = new WebDriverWait(driver, 20);
		wait_welcome.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'BUTTON TEXT')]")).click();

		// question 1
		/* ----------------------------------------------------- */

		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Option 1')] [1]")).click();
		Thread.sleep(1000);

		// question 2
		/* ----------------------------------------------------- */

		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'text area 2')]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='5f9e7d79e94661000e832e85']")).click();
		Thread.sleep(1000);

		// question 3
		/* ----------------------------------------------------- */

		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'text area rich text 3')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ckeditor[@id='5f9e7d79e94661000e832e8e']/div[2]")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='button_textfield submit-textbox-btnresp ripple-light']")).click();
		Thread.sleep(1000);

		// Result page
		/* ----------------------------------------------------- */

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'THIS IS THE PAGE HEADING')]")));
		Thread.sleep(1000);
		CommonLib.scrolling_to_bottom();

		// refresh button

		driver.findElement(By.xpath("//a[@id='refresh-button']")).click();
		Thread.sleep(1000);

		// question 1 after refresh
		/* ----------------------------------------------------- */

		WebDriverWait wait_q1_refresh = new WebDriverWait(driver, 20);
		wait_q1_refresh.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'single select 1')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Option 1')] [1]")).click();

		// question 2 after refresh
		/* ----------------------------------------------------- */

		WebDriverWait wait_q2_refresh = new WebDriverWait(driver, 20);
		wait_q2_refresh
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'text area 2')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='5f9e7d79e94661000e832e85']")).click();
		Thread.sleep(1000);

		// question 3 after refresh
		/* ----------------------------------------------------- */

		WebDriverWait wait_q3_refresh = new WebDriverWait(driver, 20);
		wait_q3_refresh.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'text area rich text 3')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='5f9e7d79e94661000e832e8e']")).click();

		// question 4 after refresh
		/* ----------------------------------------------------- */

		WebDriverWait wait_q4_refresh = new WebDriverWait(driver, 20);
		wait_q4_refresh.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'single select  4')]")));

	}

	@Test(priority = 13)
	public static void lj_id_13_lj_on_q3_result2_equal_to_5() throws InterruptedException {

		// Result 2 = 5 jump to result page
		// https://dcompany878.outgrow.co/builder/and_or_condition
		// https://dcompany878.outgrow.us/and_or_condition
		driver.get("https://dcompany878.outgrow.us/and_or_condition");
		// driver.get("https://livec.rely.co/and_or_condition");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
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

		// question 1 : option 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q1.click();

		// question 2 : option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		WebElement option2_q2 = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"));
		option2_q2.click();

		// question 3 : option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		WebDriverWait wait_result = new WebDriverWait(driver, 10);
		wait_result.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'THIS IS THE PAGE HEADING')]")));

		String q1_response = "Result: 5";
		String q2_response = "Result: 5";
		String q3_response = "Result: 0";

		String q1_response_actual = driver
				.findElement(By.xpath("//div[1]/div/control/result_output/div/div[2]/div[1]/p/b/span")).getText();
		String q2_response_actual = driver
				.findElement(By.xpath("//div[1]/div[2]/div/control/result_output/div/div[2]/div[1]/p/b/span"))
				.getText();
		String q3_response_actual = driver
				.findElement(By.xpath("//div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p/b/span"))
				.getText();

		Assert.assertEquals(q1_response_actual, q1_response);
		Assert.assertEquals(q2_response_actual, q2_response);
		Assert.assertEquals(q3_response_actual, q3_response);

		Thread.sleep(2000);

	}

	@Test(priority = 14)
	public static void lj_id_14_lj_on_q3_result2_equal_to_3() throws InterruptedException {
		// else condition
		// result 2 = 3

		driver.get("https://dcompany878.outgrow.us/and_or_condition");
		// driver.get("https://livec.rely.co/and_or_condition");
		WebDriverWait wait_welcome_screen_ = new WebDriverWait(driver, 30);
		wait_welcome_screen_.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(2000);
		WebElement name_ = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email_ = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button_ = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name_.clear();
		name_.sendKeys("dalip");
		Thread.sleep(500);
		email_.clear();
		email_.sendKeys("dalip.kumar@venturepact.com");
		button_.click();

		// question 1 : option 1
		WebDriverWait wait_q1_ = new WebDriverWait(driver, 20);
		wait_q1_.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		WebElement option1_q1_ = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q1_.click();

		// question 2 : option 1
		WebDriverWait wait_q2_ = new WebDriverWait(driver, 20);
		wait_q2_.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		WebElement option2_q2_ = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"));
		option2_q2_.click();

		// question 3 : option 1
		WebDriverWait wait_q3_ = new WebDriverWait(driver, 20);
		wait_q3_.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		WebElement option1_q3_ = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q3_.click();

		WebDriverWait wait_q4_ = new WebDriverWait(driver, 10);
		wait_q4_.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//form/div[4]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span")));

	}

	@Test(priority = 15)
	public static void lj_id_15_lj_on_q6_result3_is_equal_to_5_jump_to_outgrow() throws InterruptedException {

		// Result 1 = 11, Result 3 =5, jump to outgrow
		driver.get("https://dcompany878.outgrow.us/and_or_condition");
		// driver.get("https://livec.rely.co/and_or_condition");
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
		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option1_q1.click();

		// question 2

		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		WebElement option2_q2 = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"));
		option2_q2.click();

		// question 3

		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		// question 4

		WebDriverWait wait_q4 = new WebDriverWait(driver, 20);
		wait_q4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 4')]")));

		WebElement option2_q4 = driver.findElement(By.xpath(
				"//form/div[4]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q4.click();

		// question 5

		WebDriverWait wait_q5 = new WebDriverWait(driver, 20);
		wait_q5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		WebElement option2_q5 = driver.findElement(By.xpath(
				"//form/div[5]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q5.click();

		// question 6 : option 1

		WebDriverWait wait_q6 = new WebDriverWait(driver, 20);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		WebElement option1_q6 = driver.findElement(By.xpath(
				"//form/div[6]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q6.click();

		WebDriverWait wait_result = new WebDriverWait(driver, 20);
		wait_result.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='position']")));

		String actual_text_outgrow = "Boost Your Marketing with Interactive Content";

		String expected_text_outgrow = driver.findElement(By.xpath("//h1[@class='position']")).getText();

		Assert.assertEquals(actual_text_outgrow, expected_text_outgrow);

		String expected_outgrow = "https://outgrow.co/";
		String actual_outgrow_url = driver.getCurrentUrl();

		Assert.assertEquals(actual_outgrow_url, expected_outgrow);

		Thread.sleep(2000);

	}

	@Test(priority = 16)
	public static void lj_id_16_lj_on_q6_result1_is_equal_to_12_jump_to_outgrow() throws InterruptedException {

		// Result 1 = 12, Result 3 =6, jump to outgrow
		driver.get("https://dcompany878.outgrow.us/and_or_condition");
		// driver.get("https://livec.rely.co/and_or_condition");
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
		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option1_q1.click();

		// question 2

		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		WebElement option2_q2 = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"));
		option2_q2.click();

		// question 3

		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		// question 4

		WebDriverWait wait_q4 = new WebDriverWait(driver, 20);
		wait_q4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 4')]")));

		WebElement option2_q4 = driver.findElement(By.xpath(
				"//form/div[4]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q4.click();

		// question 5

		WebDriverWait wait_q5 = new WebDriverWait(driver, 20);
		wait_q5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		WebElement option2_q5 = driver.findElement(By.xpath(
				"//form/div[5]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q5.click();

		// question 6

		WebDriverWait wait_q6 = new WebDriverWait(driver, 20);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		WebElement option2_q6 = driver.findElement(By.xpath(
				"//form/div[6]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q6.click();

		WebDriverWait wait_result = new WebDriverWait(driver, 20);
		wait_result.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='position']")));

		String actual_text_outgrow = "Boost Your Marketing with Interactive Content";

		String expected_text_outgrow = driver.findElement(By.xpath("//h1[@class='position']")).getText();

		Assert.assertEquals(actual_text_outgrow, expected_text_outgrow);

		String expected_outgrow = "https://outgrow.co/";
		String actual_outgrow_url = driver.getCurrentUrl();

		Assert.assertEquals(actual_outgrow_url, expected_outgrow);

		Thread.sleep(2000);

	}

	@Test(priority = 17)
	public static void lj_id_17_lj_on_q6_result3_is_equal_to_3_jump_to_result_page() throws InterruptedException {

		// Result 1 = 11, Result 3 =5, jump to outgrow
		driver.get("https://dcompany878.outgrow.us/and_or_condition");
		// driver.get("https://livec.rely.co/and_or_condition");
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

		// question 1 : option 2
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));
		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option1_q1.click();

		// question 2 : option 2

		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		WebElement option2_q2 = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"));
		option2_q2.click();

		// question 3 : option 2

		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		// question 4 : option 1

		WebDriverWait wait_q4 = new WebDriverWait(driver, 20);
		wait_q4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 4')]")));

		WebElement option2_q4 = driver.findElement(By.xpath(
				"//form/div[4]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option2_q4.click();

		// question 5 : option 1

		WebDriverWait wait_q5 = new WebDriverWait(driver, 20);
		wait_q5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		WebElement option1_q5 = driver.findElement(By.xpath(
				"//form/div[5]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q5.click();

		// question 6 : option 1

		WebDriverWait wait_q6 = new WebDriverWait(driver, 20);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		WebElement option1_q6 = driver.findElement(By.xpath(
				"//form/div[6]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q6.click();

		WebDriverWait wait_result = new WebDriverWait(driver, 20);
		wait_result.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'THIS IS THE PAGE HEADING')]")));

		Thread.sleep(2000);
	}

	/* line break for different content */

	@Test(priority = 18)
	public static void lj_id_18_lj_on_q3_result2_is_3() throws InterruptedException {

		// Result 2 = 3
		// logic jump on question 3
		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
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

		// question 1 : option 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q1.click();

		// question 2: option 1
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option1_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q2.click();

		// question 3: option 1
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option1_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q3.click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[2]/div/control/result_output/div/div[2]/div[1]/p")));

		Thread.sleep(2000);

		WebElement scroll_r2 = driver.findElement(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[2]/div/control/result_output/div/div[2]/div[1]/p"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_r2);

		Thread.sleep(2000);
	}

	@Test(priority = 19)
	public static void lj_id_19_lj_on_q3_result2_equal_to_4() throws InterruptedException {

		// Result 2 = 4
		// logic jump on question 3
		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
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

		// question 1 : option 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q1.click();

		// question 2: option 1
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option1_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q2.click();

		// question 3: option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		WebDriverWait wait_q5 = new WebDriverWait(driver, 10);
		wait_q5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		Thread.sleep(2000);
	}

	@Test(priority = 20)
	public static void lj_id_20_lj_on_q3_result2_equal_to_5() throws InterruptedException {

		// Result 2 = 5
		// logic jump on question 3
		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

		Thread.sleep(1000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option1_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		WebDriverWait wait_q5 = new WebDriverWait(driver, 10);
		wait_q5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		Thread.sleep(2000);

	}

	@Test(priority = 21)
	public static void lj_id_21_lj_on_q3_result2_greater_than_5() throws InterruptedException {

		// Result 2 = 5
		// logic jump on question 3
		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");

		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option2_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		WebDriverWait wait_q6 = new WebDriverWait(driver, 10);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		Thread.sleep(2000);

	}

	@Test(priority = 22)
	public static void lj_id_22_lj_on_q6_result3_equal_to_3_01() throws InterruptedException {

		// jump on question 6
		// result 3 = 3

		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 2
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option2_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		WebDriverWait wait_q6 = new WebDriverWait(driver, 10);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		// option 1
		WebElement option1_q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"));
		option1_q6.click();

		Thread.sleep(1000);

		// option 2
		WebElement option2_q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label/span"));
		option2_q6.click();

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 5);
		wait_continue_button.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]")));

		Thread.sleep(2000);

		WebElement scroll_r3 = driver.findElement(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_r3);

		Thread.sleep(2000);

	}

	@Test(priority = 23)
	public static void lj_id_23_lj_on_q6_result3_equal_to_3_02() throws InterruptedException {

		// jump on question 6
		// result 3 = 3

		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 2
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option2_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		WebDriverWait wait_q6 = new WebDriverWait(driver, 10);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		// option 3
		WebElement option3_q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[3]/input[2]"));
		option3_q6.sendKeys("This is other option");

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 5);
		wait_continue_button.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]")));

		Thread.sleep(2000);

		WebElement scroll_r3 = driver.findElement(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_r3);

		Thread.sleep(2000);

	}

	@Test(priority = 24)
	public static void lj_id_24_lj_on_q6_result3_equal_to_3_03() throws InterruptedException {

		// jump on question 6
		// result 3 = 3

		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 2
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option2_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 1
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option1_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q3.click();

		// wait for question 5
		WebDriverWait wait_q5 = new WebDriverWait(driver, 10);
		wait_q5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		// question 5: option 3
		WebElement option2_q5 = driver.findElement(By.xpath(
				"//form/div[5]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q5.click();

		Thread.sleep(1000);

		// wait for question 6
		WebDriverWait wait_q6 = new WebDriverWait(driver, 10);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		// question 6: option 1
		WebElement option1_q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"));
		option1_q6.click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 5);
		wait_continue_button.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]")));

		Thread.sleep(2000);

		WebElement scroll_r3 = driver.findElement(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_r3);

		Thread.sleep(2000);

	}

	@Test(priority = 25)
	public static void lj_id_25_lj_on_q6_result3_equal_to_1() throws InterruptedException {

		// jump on question 6
		// result 3 = 1

		// https://dcompany878.outgrow.co/builder/logic_jump_and_or_condition_calculator

		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 2
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option2_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		// wait for question 6
		WebDriverWait wait_q6 = new WebDriverWait(driver, 10);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		// question 6 :option 1
		WebElement option3_q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"));
		option3_q6.click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 5);
		wait_continue_button.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]")));

		Thread.sleep(2000);

		WebElement scroll_r3 = driver.findElement(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_r3);

		Thread.sleep(2000);

	}

	@Test(priority = 26)
	public static void lj_id_26_lj_on_q6_result3_equal_to_2_01() throws InterruptedException {

		// Result 3 = 2
		// logic jump on question 6

		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 2
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option2_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 1
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option1_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option1_q3.click();

		// wait for question 5
		WebDriverWait wait_q5 = new WebDriverWait(driver, 10);
		wait_q5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		// question 5: option 1
		WebElement option2_q5 = driver.findElement(By.xpath(
				"//form/div[5]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"));
		option2_q5.click();

		Thread.sleep(1000);

		// wait for question 6
		WebDriverWait wait_q6 = new WebDriverWait(driver, 10);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		// question 6: option 1
		WebElement option1_q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"));
		option1_q6.click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 5);
		wait_continue_button.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]")));

		Thread.sleep(2000);

		WebElement scroll_r3 = driver.findElement(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_r3);

		Thread.sleep(2000);

	}

	@Test(priority = 27)
	public static void lj_id_27_lj_on_q6_result3_equal_to_2_02() throws InterruptedException {

		// Result 3 = 2
		// logic jump on question 6

		driver.get("https://dcompany878.outgrow.us/logic_jump_and_or_condition_calculator");
		// driver.get("https://livec.rely.co/logic_jump_and_or_condition_calculator");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// question 1 : option 2
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));
		WebElement option2_q1 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q1.click();

		// question 2: option 2
		WebDriverWait wait_q2 = new WebDriverWait(driver, 20);
		wait_q2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		WebElement option2_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q2.click();

		// question 3: option 2
		WebDriverWait wait_q3 = new WebDriverWait(driver, 20);
		wait_q3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));
		WebElement option2_q3 = driver.findElement(By.xpath(
				"//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		option2_q3.click();

		// wait for question 6
		WebDriverWait wait_q6 = new WebDriverWait(driver, 10);
		wait_q6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 6')]")));

		// question 6 :option 2
		WebElement option3_q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label/span"));
		option3_q6.click();

		Thread.sleep(1000);

		WebDriverWait wait_continue_button = new WebDriverWait(driver, 5);
		wait_continue_button.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		WebDriverWait wait_result_page = new WebDriverWait(driver, 20);
		wait_result_page.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]")));

		Thread.sleep(2000);

		WebElement scroll_r3 = driver.findElement(By.xpath(
				"//numeric-result/section/div[2]/div/div[2]/div/div[1]/div[3]/div/control/result_output/div/div[2]/div[1]/p[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_r3);

		Thread.sleep(2000);

	}

	@Test(priority = 28)
	public static void lj_id_28_mapping_plus_logic_jump_multiple_outcome_off()
			throws InterruptedException, IOException {
		// when mapping plus logic jump implemented, it will work according to logic
		// jump

		driver.get("https://dcompany878.outgrow.us/dcompany878-5583");
		// driver.get("https://livec.rely.co/dcompany878-5583");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		// question 1 : option 1
		driver.findElement(By
				.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		// question 2: option 1
		driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));

		// question 3 : option 1
		driver.findElement(By
				.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		// jump to outcome 2 as per logic jump.
		wait_welcome_screen
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Outcome 2']")));

		String outcome_name_a = driver.findElement(By.xpath("//p[normalize-space()='Outcome 2']")).getText();

		String outcome_description_a = driver
				.findElement(By.xpath("//p[contains(text(),'Outcome 2 description will come here')]")).getText();

		String outcome_name_e = "Outcome 2";
		String outcome_description_e = "Outcome 2 description will come here";

		Assert.assertEquals(outcome_name_a, outcome_name_e);
		Assert.assertEquals(outcome_description_a, outcome_description_e);

		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("lj_id_28_mapping_plus_logic_jump_multiple_outcome_off");

		Thread.sleep(1000);

	}

	@Test(priority = 28, dataProvider = "lj_id_28_mapping_plus_logic_jump_multiple_outcome_off_else_condition")

	public static void lj_id_28_mapping_plus_logic_jump_multiple_outcome_off_else_condition(String n1, String n2)

			throws InterruptedException, IOException {
		// when mapping plus logic jump implemented, it will work according to logic
		// jump

		driver.get("https://dcompany878.outgrow.us/dcompany878-5583");
		// driver.get("https://livec.rely.co/dcompany878-5583");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys(n1);
		Thread.sleep(500);
		email.clear();
		email.sendKeys(n2);
		button.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		// question 1 : option 1
		driver.findElement(By
				.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		// question 2: option 1
		driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));

		// question 3 : option 2
		driver.findElement(By
				.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"))
				.click();

		// jump to question 4 as per logic jump else condition.
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 4']")));

		CommonLib.CaptureScreenshotLogicJump("lj_id_28_mapping_plus_logic_jump_multiple_outcome_off_else_condition");

		Thread.sleep(1000);

	}

	@Test(priority = 29, dataProvider = "lj_id_28_mapping_plus_logic_jump_multiple_outcome_off_else_condition")

	public static void lj_id_29_mapping_plus_logic_jump_multiple_outcome_on(String n1, String n2)
			throws InterruptedException, IOException {
		// when mapping plus logic jump implemented, it will work according to logic
		// outcome will be shown according to mapping.
		// https://dcompany878.outgrow.co/builder/Copy-of-dcompany878-5583-1
		driver.get("https://dcompany878.outgrow.us/Copy-of-dcompany878-5583-1");
		// driver.get("https://livec.rely.co/dcompany878-5583");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys(n1);
		Thread.sleep(500);
		email.clear();
		email.sendKeys(n2);
		button.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		// question 1 : option 1
		driver.findElement(By
				.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 2']")));

		// question 2: option 1
		driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 3']")));

		// question 3 : option 1
		driver.findElement(By
				.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='t1-result-disclaimer']//result_disclaimer")));

		// outcome 1
		WebElement outcome1 = driver.findElement(
				By.xpath("//outcome-result/section/div[1]/div/div/div[1]/div/div/div[1]/div/div[1]/div/div/div/h1/p"));
		String outcome1_value_e = outcome1.getText();
		String outcome1_value_a = "Outcome 1";

		WebElement outcome2 = driver.findElement(
				By.xpath("//outcome-result/section/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div/div/h1/p"));
		String outcome2_value_e = outcome2.getText();
		String outcome2_value_a = "Outcome 2";

		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(outcome1_value_a, outcome1_value_e);
		softAssertion.assertEquals(outcome2_value_a, outcome2_value_e);

		Thread.sleep(1000);

		CommonLib.CaptureScreenshotLogicJump("lj_id_29_mapping_plus_logic_jump_multiple_outcome_on");

		Thread.sleep(1000);

		softAssertion.assertAll();

	}

	@Test(priority = 30)
	public static void lj_id_30_chicago_poll_op1ORop2_jump_to_result_page() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-6170");
		// driver.get("https://livec.rely.co/dcompany878-5583");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 40);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// wait for question 1 to appear.
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div[1]/div[3]/div/div/div[1]/div/p")));

		// click on question 1
		driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/div[2]"))
				.click();

		// jump to result page
		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Of participants agree with you!')]")));

		Thread.sleep(2000);

		driver.manage().deleteAllCookies();

	}

	@Test(priority = 31)
	public static void lj_id_31_chicago_poll_else_op1ORop2_jump_to_result_page() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-6170");
		// driver.get("https://livec.rely.co/dcompany878-5583");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// wait for question 1 to appear.
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div[1]/div[3]/div/div/div[1]/div/p")));

		// scroll to option 5

		WebElement scroll_option5 = driver.findElement(By
				.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[5]/div[2]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_option5);

		// click on option 5
		driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[5]/div[2]/label/div[2]"))
				.click();

		// move to question 2
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div[2]/div[3]/div/div/div[1]/div/p")));

		Thread.sleep(2000);

	}

	@Test(priority = 32)
	public static void lj_id_32_backward_jump() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-6225");
		// driver.get("https://livec.rely.co/dcompany878-5583");
		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Button Text']")));
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Button Text']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		// question 1
		WebElement option1_q1 = driver.findElement(
				By.xpath("//form/div[1]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label"));
		WebElement option2_q1 = driver.findElement(
				By.xpath("//form/div[1]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label"));
		option1_q1.click();
		option2_q1.click();

		WebElement submit_q1 = driver.findElement(
				By.xpath("//form/div[1]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[5]/button/i"));
		submit_q1.click();

		// question 2

		Thread.sleep(2000);
		WebElement option1_q2 = driver.findElement(By.xpath(
				"//form/div[2]/div[4]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span[2]"));
		option1_q2.click();

		WebElement submit_q2 = driver
				.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']"));
		submit_q2.click();

		Thread.sleep(2000);

		// question 3

		WebElement option1_q3 = driver.findElement(
				By.xpath("//form/div[3]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"));
		WebElement option2_q3 = driver.findElement(
				By.xpath("//form/div[3]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label/span"));
		option1_q3.click();
		option2_q3.click();

		WebElement submit_q3 = driver.findElement(
				By.xpath("//form/div[3]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[4]/button"));
		submit_q3.click();

		wait_welcome_screen.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		Thread.sleep(2000);

	}
}