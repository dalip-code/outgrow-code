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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assessment_answer_key extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

	@BeforeMethod
	public static void resizing() throws InterruptedException {
		CommonLib.resizeToNormalWindow();
	}

	@Test(priority = 1, enabled = true)
	public static void paris_assessment_ak() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4011");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		String q1_expected = "Question title goes here q1";
		String q2_expected = "Question title goes here q2";
		String q3_expected = "Question title goes here q3";
		String q4_expected = "Question title goes here q4";
		String q5_expected = "Question title goes here q5";
		String q6_expected = "Question title goes here q6";

		String q1_feeback_expected = "Correct: Type your correct message here q1";
		String q2_feeback_expected = "Incorrect: Type your incorrect message here q2";
		String q3_feeback_expected = "Correct: Type your correct message here q3";
		String q4_feeback_expected = "Correct: Type your correct message here q4";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		driver.findElement(By.xpath("//label[@id='option_label_5fe34418d63bb3439aed82b7']")).click();

		Thread.sleep(2000);

		String q1_feedback_actual = driver
				.findElement(By.xpath("//p[normalize-space()='Correct: Type your correct message here q1']")).getText();
		Assert.assertEquals(q1_feedback_actual, q1_feeback_expected);

		Boolean status_tick_expected = true;
		Boolean status_tick_actual = driver
				.findElement(By.xpath("//li[@class='ada_focus graded-tick']//div[@class='check']")).isDisplayed();
		Assert.assertEquals(status_tick_actual, status_tick_expected);
		Thread.sleep(5000);

		// question 2

		WebDriverWait waitq2 = new WebDriverWait(driver, 20);
		waitq2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q2')]")));

		String q2_actual = driver.findElement(By.xpath("//p[normalize-space()='Question title goes here q2']"))
				.getText();
		Assert.assertEquals(q2_actual, q2_expected);

		driver.findElement(By.xpath("//label[@id='option_label_5fe34418d63bb3439aed82be']")).click();

		Thread.sleep(2000);

		String q2_feedback_actual = driver
				.findElement(By.xpath("//p[normalize-space()='Incorrect: Type your incorrect message here q2']"))
				.getText();
		Assert.assertEquals(q2_feedback_actual, q2_feeback_expected);

		Thread.sleep(5000);

		// question 3

		WebDriverWait waitq3 = new WebDriverWait(driver, 20);
		waitq3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q3')]")));

		String q3_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q3')]"))
				.getText();
		Assert.assertEquals(q3_actual, q3_expected);

		driver.findElement(By.xpath("//*[@id='option_label_5fe34418d63bb3439aed82c9']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id='option_label_5fe34418d63bb3439aed82c7']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

		Thread.sleep(1000);

		String q3_feedback_actual = driver
				.findElement(By.xpath("//p[normalize-space()='Correct: Type your correct message here q3']")).getText();
		Assert.assertEquals(q3_feedback_actual, q3_feeback_expected);

		Boolean tick1_expected = true;
		Boolean tick2_expected = true;
		Boolean tick3_expected = true;

		Boolean tick1_actual = driver
				.findElement(By.xpath("//section[contains(@class,'sec_0_q_2 slide_2')]//li[1]//div[1]")).isDisplayed();
		Assert.assertEquals(tick1_actual, tick1_expected);

		Boolean tick2_actual = driver
				.findElement(By.xpath("//section[contains(@class,'sec_0_q_2 slide_2')]//li[2]//div[1]")).isDisplayed();
		Assert.assertEquals(tick2_actual, tick2_expected);

		Boolean tick3_actual = driver
				.findElement(By.xpath("//section[contains(@class,'sec_0_q_2 slide_2')]//li[3]//div[1]")).isDisplayed();
		Assert.assertEquals(tick3_actual, tick3_expected);

		Thread.sleep(5000);

		// question 4

		WebDriverWait waitq4 = new WebDriverWait(driver, 20);
		waitq4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q4')]")));

		String q4_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q4')]"))
				.getText();
		Assert.assertEquals(q4_actual, q4_expected);

		driver.findElement(By.xpath("//li[@class='ada_focus']//label[@id='option_label_5fe34418d63bb3439aed82c9']"))
				.click();

		String q4_feedback_actual = driver
				.findElement(By.xpath("//p[normalize-space()='Correct: Type your correct message here q4']")).getText();
		Assert.assertEquals(q4_feedback_actual, q4_feeback_expected);

		Boolean status_tick_expected_q4 = true;
		Boolean status_tick_actual_q4 = driver
				.findElement(By.xpath("//section[contains(@class,'sec_0_q_3 slide_3')]//li[1]//div[1]")).isDisplayed();
		Assert.assertEquals(status_tick_actual_q4, status_tick_expected_q4);

		Thread.sleep(2000);

		// question 5
		WebDriverWait waitq5 = new WebDriverWait(driver, 20);
		waitq5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q5')]")));

		String q5_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q5')]"))
				.getText();
		Assert.assertEquals(q5_actual, q5_expected);

		driver.findElement(By.xpath(
				"//section[contains(@class,'sec_0_q_4 slide_4')]//button[contains(@type,'button')][normalize-space()='Next']"))
				.click();

		Thread.sleep(1000);

		// question 6

		WebDriverWait waitq6 = new WebDriverWait(driver, 20);
		waitq6.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q6')]")));

		String q6_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q6')]"))
				.getText();
		Assert.assertEquals(q6_actual, q6_expected);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(1000);
		String result_actual = "3";
		String result_expected = driver.findElement(By.xpath("//span[@class='fr-deletable var-tag']")).getText();
		Assert.assertEquals(result_actual, result_expected);

		Thread.sleep(1500);

		WebElement element = driver.findElement(By.xpath("//div[@class='GQ-text']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		driver.findElement(By.xpath("//div[@class='GQ-text']")).click();

		CommonLib.CaptureScreenshotAssessment_ak("assessment_paris_ak1");

		Thread.sleep(3000);

		String q1_result = driver.findElement(By.xpath("//*[@id='graded-graph']/div/div/div/div/div[1]/div[1]/span"))
				.getText();
		System.out.println(q1_result);

		WebElement lastelement = driver
				.findElement(By.xpath("//*[@id='graded-graph']/div/div[2]/div/div/div[6]/div[1]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastelement);
		Thread.sleep(2000);

		CommonLib.CaptureScreenshotAssessment_ak("assessment_paris_ak2");
		Thread.sleep(2000);

	}

	@Test(priority = 2, enabled = true)
	public static void paris_result_page_box_border() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/automate_box_border_paris");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(1000);
		WebElement graph_title = driver.findElement(By.xpath("//span[@class='graph-title']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", graph_title);

		Thread.sleep(1000);
		WebElement getcssvalue = driver.findElement(By.xpath("//div[@class='result-v2-box2']"));
		String actual_value = getcssvalue.getCssValue("border-top");

		System.out.println(actual_value);

		String expected_value = "3px solid rgb(103, 221, 40)";
		Assert.assertEquals(actual_value, expected_value);

	}

	@Test(priority = 3, enabled = true)
	public static void paris_result_text_bold() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/automate_box_border_paris");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(1000);
		WebElement graph_title = driver.findElement(By.xpath("//span[@class='graph-title']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", graph_title);

		Thread.sleep(1000);
		WebElement getcssvalue = driver.findElement(By.xpath(
				"//*[@id='graded-graph']/div/div[2]/section/div/div/div/control/result_output/div/div[2]/div[1]/p"));
		String actual_value = getcssvalue.getCssValue("font-family");

		System.out.println(actual_value);

		String expected_value = "cerapro-Bold";
		Assert.assertEquals(actual_value, expected_value);

	}

	@Test(priority = 4, enabled = true)
	public static void paris_result_fontweight_heading_desktop() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/automate_box_border_paris");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(1000);

		// desktop code

		WebElement getcssvalue_desktop = driver
				.findElement(By.xpath("//b[normalize-space()='This is the page heading']"));
		String actual_value_font_weight_desktop = getcssvalue_desktop.getCssValue("font-weight");
		String actual_value_font_size_desktop = getcssvalue_desktop.getCssValue("font-size");

		System.out.println(actual_value_font_weight_desktop);
		System.out.println(actual_value_font_size_desktop);

		String expected_value_font_weight_desktop = "700";
		String expected_value_font_size_desktop = "32px";

		Assert.assertEquals(actual_value_font_size_desktop, expected_value_font_size_desktop);
		Assert.assertEquals(actual_value_font_weight_desktop, expected_value_font_weight_desktop);
		System.out.println("**********----------**********----------");

	}

	@Test(priority = 5, enabled = true)
	public static void paris_result_fontweight_heading_tab() throws InterruptedException, IOException {

		driver.manage().window().setSize(new Dimension(768, 1024));
		driver.get("https://dcompany878.outgrow.us/automate_box_border_paris");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(1000);

		// desktop code

		WebElement getcssvalue_tab = driver.findElement(By.xpath("//b[normalize-space()='This is the page heading']"));
		String actual_value_font_weight_tab = getcssvalue_tab.getCssValue("font-weight");
		String actual_value_font_size_tab = getcssvalue_tab.getCssValue("font-size");

		System.out.println(actual_value_font_weight_tab);
		System.out.println(actual_value_font_size_tab);

		String expected_value_font_weight_tab = "700";
		String expected_value_font_size_tab = "28px";

		Assert.assertEquals(actual_value_font_size_tab, expected_value_font_size_tab);
		Assert.assertEquals(actual_value_font_weight_tab, expected_value_font_weight_tab);

		System.out.println("**********----------**********----------");

	}

	@Test(priority = 6, enabled = true)
	public static void paris_result_fontweight_heading_mobile() throws InterruptedException, IOException {

		driver.manage().window().setSize(new Dimension(320, 700));
		driver.get("https://dcompany878.outgrow.us/automate_box_border_paris");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(2000);

		WebElement getcssvalue_mobile = driver
				.findElement(By.xpath("//b[normalize-space()='This is the page heading']"));
		String actual_value_font_weight_mobile = getcssvalue_mobile.getCssValue("font-weight");
		String actual_value_font_size_mobile = getcssvalue_mobile.getCssValue("font-size");

		System.out.println(actual_value_font_size_mobile);
		System.out.println(actual_value_font_weight_mobile);

		String expected_value_font_size_mobile = "26px";
		String expected_value_font_weight_mobile = "700";

		Assert.assertEquals(actual_value_font_size_mobile, expected_value_font_size_mobile);
		Assert.assertEquals(expected_value_font_weight_mobile, expected_value_font_weight_mobile);

		System.out.println("**********----------**********----------");
	}

	@Test(priority = 7, enabled = true)
	public static void paris_result_lead_text_center_desktop() throws InterruptedException, IOException {

		// https://app.asana.com/0/0/1199108650602940/f
		driver.get("https://dcompany878.outgrow.us/lead_text_align_center");
		driver.manage().window().maximize();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(2000);

		WebElement lead_text = driver.findElement(By.xpath("//p[normalize-space()='How can we get in touch?']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lead_text);

		WebElement getcssvalue_desktop = driver
				.findElement(By.xpath("//p[normalize-space()='How can we get in touch?']"));
		String actual_value_text_align_desktop = getcssvalue_desktop.getCssValue("text-align");

		System.out.println(actual_value_text_align_desktop);

		String expected_value_text_align_desktop = "center";

		Assert.assertEquals(actual_value_text_align_desktop, expected_value_text_align_desktop);

		System.out.println("**********----------**********----------");

		Thread.sleep(2000);
	}

	@Test(priority = 8, enabled = true)
	public static void paris_result_lead_text_center_tab() throws InterruptedException, IOException {

		// https://app.asana.com/0/0/1199108650602940/f
		driver.get("https://dcompany878.outgrow.us/lead_text_align_center");
		driver.manage().window().setSize(new Dimension(768, 1024));
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(2000);

		WebElement lead_text = driver.findElement(By.xpath("//p[normalize-space()='How can we get in touch?']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lead_text);

		WebElement getcssvalue_tab = driver.findElement(By.xpath("//p[normalize-space()='How can we get in touch?']"));
		String actual_value_text_align_tab = getcssvalue_tab.getCssValue("text-align");

		System.out.println(actual_value_text_align_tab);

		String expected_value_text_align_tab = "center";

		Assert.assertEquals(actual_value_text_align_tab, expected_value_text_align_tab);

		System.out.println("**********----------**********----------");

		Thread.sleep(2000);
	}

	@Test(priority = 9, enabled = true)
	public static void paris_result_lead_text_center_mobile() throws InterruptedException, IOException {

		// https://app.asana.com/0/0/1199108650602940/f
		driver.get("https://dcompany878.outgrow.us/lead_text_align_center");
		driver.manage().window().setSize(new Dimension(360, 600));
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

		button.click();

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);

		Thread.sleep(2000);

		submit.click();

		WebDriverWait wait_resultpage = new WebDriverWait(driver, 20);
		wait_resultpage.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		Thread.sleep(2000);

		WebElement lead_text = driver.findElement(By.xpath("//p[normalize-space()='How can we get in touch?']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lead_text);

		WebElement getcssvalue_mobile = driver
				.findElement(By.xpath("//p[normalize-space()='How can we get in touch?']"));
		String actual_value_text_align_mobile = getcssvalue_mobile.getCssValue("text-align");

		System.out.println(actual_value_text_align_mobile);

		String expected_value_text_align_mobile = "center";

		Assert.assertEquals(actual_value_text_align_mobile, expected_value_text_align_mobile);

		System.out.println("**********----------**********----------");

		Thread.sleep(2000);
	}

	@Test(priority = 10, enabled = true)
	public static void paris_multiselect_exact_validation() throws InterruptedException, IOException {

		// https://app.asana.com/0/0/1199207766473685/f
		driver.get("https://dcompany878.outgrow.us/exact_range_validation_paris");

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

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

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement question2 = driver.findElement(By.xpath("//p[normalize-space()='Question title goes here 2']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question2);

		Thread.sleep(2000);

		WebElement option1 = driver
				.findElement(By.xpath("//form/section[2]/div/div/div/div/control/checkbox/div/ul/li[1]/label"));
		WebElement option2 = driver
				.findElement(By.xpath("//form/section[2]/div/div/div/div/control/checkbox/div/ul/li[2]/label"));
		WebElement option3 = driver
				.findElement(By.xpath("//form/section[2]/div/div/div/div/control/checkbox/div/ul/li[3]/label"));

		option1.click();
		option2.click();

		Thread.sleep(1000);

		WebElement NextButton = driver.findElement(By.xpath("//form/section[2]/div/div/div/div/div[2]/button"));
		NextButton.click();

		WebElement validationMessage = driver
				.findElement(By.xpath("//form/section[2]/div/div/div/div/control/checkbox/div/div"));
		Boolean status_display_actual = validationMessage.isDisplayed();
		Boolean status_display_expected = true;
		Assert.assertEquals(status_display_actual, status_display_expected);
		String message_actual = validationMessage.getText();
		String message_expected = "Please make 3 selections to move forward.";
		Assert.assertEquals(message_actual, message_expected);
		CommonLib.CaptureScreenshotAssessment_ak("Exact_validation1");

		Thread.sleep(2000);

		option3.click();

		NextButton.click();

		WebElement scrollup = driver
				.findElement(By.xpath("//form/section[1]/div/div/div/div/control/radio-button/div/ul/li[2]/label"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollup);

		CommonLib.CaptureScreenshotAssessment_ak("Exact_validation2");

		WebElement feedbackbox = driver.findElement(By.xpath("//form/section[2]/div/div/div[1]/div"));
		Boolean status_display_feedback_box_a = feedbackbox.isDisplayed();
		Boolean status_display_feedback_box_e = true;
		Assert.assertEquals(status_display_feedback_box_a, status_display_feedback_box_e);

		WebElement feedbackMessage = driver.findElement(By.xpath("//form/section[2]/div/div/div[1]/div/span"));
		Boolean feedbackMessage_actual_status = feedbackMessage.isDisplayed();
		Boolean feedbackMessage_expected_status = true;
		Assert.assertEquals(feedbackMessage_actual_status, feedbackMessage_expected_status);
		String feedbackmessage_actual = feedbackMessage.getText();

		String feedbackmessage_expected = "Correct: Type your correct message here q2";
		Assert.assertEquals(feedbackmessage_actual, feedbackmessage_expected);

		Thread.sleep(2000);

	}

	@Test(priority = 11, enabled = true)
	public static void paris_multiselect_range_validation() throws InterruptedException, IOException {

		// https://app.asana.com/0/0/1199207766473685/f
		driver.get("https://dcompany878.outgrow.us/exact_range_validation_paris");

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

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

		String q1_expected = "Question title goes here q1";

		// question 1

		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here q1')]")));

		String q1_actual = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here q1')]"))
				.getText();
		Assert.assertEquals(q1_actual, q1_expected);

		WebElement question3 = driver.findElement(By.xpath("//p[normalize-space()='Question title goes here q3']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", question3);

		Thread.sleep(2000);

		WebElement option1 = driver
				.findElement(By.xpath("//form/section[3]/div/div/div/div/control/checkbox/div/ul/li[1]/label"));
		WebElement option2 = driver
				.findElement(By.xpath("//form/section[3]/div/div/div/div/control/checkbox/div/ul/li[2]/label"));
		WebElement option3 = driver
				.findElement(By.xpath("//form/section[3]/div/div/div/div/control/checkbox/div/ul/li[3]/label"));
		WebElement option4 = driver
				.findElement(By.xpath("//form/section[3]/div/div/div/div/control/checkbox/div/ul/li[4]/label"));

		option1.click();
		option2.click();
		option3.click();
		option4.click();
		Thread.sleep(1000);

		WebElement NextButton = driver.findElement(By.xpath("//form/section[3]/div/div/div/div/div[2]/button"));
		NextButton.click();

		WebElement validationMessage = driver
				.findElement(By.xpath("//form/section[3]/div/div/div/div/control/checkbox/div/div"));
		Boolean status_display_actual = validationMessage.isDisplayed();
		Boolean status_display_expected = true;
		Assert.assertEquals(status_display_actual, status_display_expected);
		String message_actual = validationMessage.getText();
		String message_expected = "Select 1-3 options to move forward.";
		Assert.assertEquals(message_actual, message_expected);

		CommonLib.CaptureScreenshotAssessment_ak("Range validation1");

		Thread.sleep(2000);

		option4.click();
		Thread.sleep(1000);
		option3.click();
		Thread.sleep(2000);

		NextButton.click();
		Thread.sleep(1000);

		WebElement scrollup = driver.findElement(By.xpath("//form/section[2]/div/div/div/div/div[2]/button"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollup);

		Thread.sleep(2000);

		CommonLib.CaptureScreenshotAssessment_ak("Range_validation2");

		WebElement feedbackbox = driver.findElement(By.xpath("//form/section[3]/div/div/div[1]/div"));
		Boolean status_display_feedback_box_a = feedbackbox.isDisplayed();
		Boolean status_display_feedback_box_e = true;
		Assert.assertEquals(status_display_feedback_box_a, status_display_feedback_box_e);

		WebElement feedbackMessage = driver.findElement(By.xpath("//form/section[3]/div/div/div[1]/div/span/p"));
		Boolean feedbackMessage_actual_status = feedbackMessage.isDisplayed();
		Boolean feedbackMessage_expected_status = true;
		Assert.assertEquals(feedbackMessage_actual_status, feedbackMessage_expected_status);
		String feedbackmessage_actual = feedbackMessage.getText();

		String feedbackmessage_expected = "Incorrect: Type your incorrect message here q3";
		Assert.assertEquals(feedbackmessage_actual, feedbackmessage_expected);

	}

	@Test(priority = 12, enabled = true)
	public static void assessment_section_component_color() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4776");
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

		WebElement getcssvalue_ak_icon = driver
				.findElement(By.xpath("//a[@aria-label='Answers']//*[local-name()='svg']//*[name()='path'][1]"));

		String actual_value_ak_icon = getcssvalue_ak_icon.getCssValue("fill");

		String expected_value_ak_icon = "rgb(153, 46, 199)";

		Assert.assertEquals(actual_value_ak_icon, expected_value_ak_icon);

		Thread.sleep(1000);

	}

	@Test(priority = 13, enabled = true)
	public static void assessment_sub_heading_font() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4788");

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		driver.findElement(By.xpath("//form/section[1]/div/div/div/div/control/radio-button/div/ul/li[1]/label"))
				.click();
		Thread.sleep(1000);

		WebElement last_q = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here 3')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", last_q);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[contains(text(),'This is the page heading')]")));

		Thread.sleep(1000);

		WebElement getcssvalue_sub_heading = driver.findElement(By.xpath("//p[normalize-space()='condition 1']"));

		String actual_value_sub_heading_font = getcssvalue_sub_heading.getCssValue("font-family");
		System.out.println(actual_value_sub_heading_font);

		String expected_value_sub_heading_font = "\"Clear Sans\"";

		Assert.assertEquals(actual_value_sub_heading_font, expected_value_sub_heading_font);

	}

	@Test(priority = 14, enabled = true)
	public static void assessment_lead_with_result_thanku_desktop() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4797");

		// question 1
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		Thread.sleep(1000);

		WebElement last_q = driver.findElement(By.xpath("//p[contains(text(),'Question title goes here 3')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", last_q);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[contains(text(),'This is the page heading')]")));

		Thread.sleep(1000);

		WebElement lead_form = driver.findElement(By.xpath("//p[contains(text(),'How can we get in touch?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lead_form);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement submit_button = driver
				.findElement(By.xpath("//a[@class='btn prime-action ripple-light leadform-btn']"));
		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		submit_button.click();

		WebDriverWait thank_you_msg = new WebDriverWait(driver, 20);
		thank_you_msg.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Thank You For Submitting!')]")));

		Thread.sleep(1000);

		WebElement getcssvalue_thank_box = driver
				.findElement(By.xpath("//div[@class='lf-submitted  lead-submitted new-thankyou']"));

		String actual_value_width_thankyou_box = getcssvalue_thank_box.getCssValue("width");
		String actual_value_height_thankyou_box = getcssvalue_thank_box.getCssValue("height");
		String actual_value_padding_left = getcssvalue_thank_box.getCssValue("padding-left");
		String actual_value_padding_right = getcssvalue_thank_box.getCssValue("padding-right");
		String actual_value_padding_top = getcssvalue_thank_box.getCssValue("padding-top");
		String actual_value_padding_bottom = getcssvalue_thank_box.getCssValue("padding-bottom");
		String actual_value_text_align = getcssvalue_thank_box.getCssValue("text-align");

		String expected_value_width_thankyou_box = "742px";
		String expected_value_height_thankyou_box = "239px";
		String expected_value_padding_left = "25px";
		String expected_value_padding_right = "25px";
		String expected_value_padding_top = "25px";
		String expected_value_padding_bottom = "25px";
		String expected_value_text_align = "center";

		Assert.assertEquals(actual_value_width_thankyou_box, expected_value_width_thankyou_box);
		Assert.assertEquals(actual_value_height_thankyou_box, expected_value_height_thankyou_box);
		Assert.assertEquals(actual_value_padding_left, expected_value_padding_left);
		Assert.assertEquals(actual_value_padding_right, expected_value_padding_right);
		Assert.assertEquals(actual_value_padding_top, expected_value_padding_top);
		Assert.assertEquals(actual_value_padding_bottom, expected_value_padding_bottom);
		Assert.assertEquals(actual_value_text_align, expected_value_text_align);

	}

	@Test(priority = 15, invocationCount = 1)
	public static void functionality_ak_paris_15() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-5183");
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(
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
		Thread.sleep(500);
		button.click();

		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		// question 1 : option 1
		driver.findElement(By.xpath("//form/section[1]/div/div/div/div/control/radio-button/div/ul/li[1]/label"))
				.click();

		Thread.sleep(5000);

		// question 2 : option 2
		driver.findElement(By.xpath("//form/section[2]/div/div/div/div/control/radio-button/div/ul/li[2]/label"))
				.click();

		Thread.sleep(5000);

		WebElement scroll_down = driver.findElement(By.xpath("//p[normalize-space()='New Question 6']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_down);

		// question 6 : option 1, option 2, option 3, option 4, option 5, option 6,
		// option 7
		// option 1
		driver.findElement(By.xpath("//form/section[6]/div/div/div/div/control/checkbox/div/ul/li[1]/label")).click();

		Thread.sleep(500);

		// option 2
		driver.findElement(By.xpath("//form/section[6]/div/div/div/div/control/checkbox/div/ul/li[2]/label")).click();

		Thread.sleep(500);

		// option 3
		driver.findElement(By.xpath("//form/section[6]/div/div/div/div/control/checkbox/div/ul/li[3]/label")).click();

		Thread.sleep(500);

		// option 4
		driver.findElement(By.xpath("//form/section[6]/div/div/div/div/control/checkbox/div/ul/li[4]/label")).click();

		Thread.sleep(500);

		// option 5
		driver.findElement(By.xpath("//form/section[6]/div/div/div/div/control/checkbox/div/ul/li[5]/label")).click();

		Thread.sleep(500);

		// option 6
		driver.findElement(By.xpath("//form/section[6]/div/div/div/div/control/checkbox/div/ul/li[6]/label")).click();

		Thread.sleep(500);

		// option 7
		driver.findElement(By.xpath("//form/section[6]/div/div/div/div/control/checkbox/div/ul/li[7]/label")).click();

		Thread.sleep(500);

		// submit button
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		// result Page
		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//b[normalize-space()='This is the page heading']")));

		// question 1
		String ak_q1_user_response_left_e = "Option 1";
		String ak_q1_result_right_e = "Correct";

		// question 2
		String ak_q2_user_response_left_e = "Option 2";
		String ak_q2_cr_left_e = "Option 1";
		String ak_q2_result_right_e = "Incorrect";

		// question 3
		String ak_q3_user_response_left_e = "Not Answered";
		String ak_q3_cr_left_e = "Option 1";
		String ak_q3_result_right_e = "Incorrect";

		// question 4
		String ak_q4_user_response_left_e = "Not Answered";
		String ak_q4_cr_left_e = "Option 1";
		String ak_q4_result_right_e = "Incorrect";

		// question 5
		String ak_q5_user_response_left_e = "Not Answered";
		String ak_q5_cr_left_e = "Option 1";
		String ak_q5_result_right_e = "Incorrect";

		// question 6
		String ak_q6_user_response_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 7";
		String ak_q6_cr_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 10";
		String ak_q6_result_right_e = "Incorrect";

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//section/div/div[1]/graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/a/div"))
				.click();

		Thread.sleep(2000);

		WebElement scroll_down_2 = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[5]/div[2]/p/p"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_down_2);

		String ak_q1_user_response_left_a = driver
				.findElement(
						By.xpath("//section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div[2]/div/span"))
				.getText();

		String ak_q1_result_right_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div[1]/span"))
				.getText();

		String ak_q2_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/span"))
				.getText();

		String ak_q2_cr_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/span/span"))
				.getText();

		String ak_q2_result_right_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[2]/div[1]/span"))
				.getText();

		String ak_q3_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[3]/div[2]/div/span/i"))
				.getText();

		String ak_q3_cr_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[3]/div[2]/span/span"))
				.getText();

		String ak_q3_result_right_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/span"))
				.getText();

		String ak_q4_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[4]/div[2]/div/span/i"))
				.getText();

		String ak_q4_cr_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[4]/div[2]/span/span"))
				.getText();

		String ak_q4_result_right_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[4]/div[1]/span"))
				.getText();

		String ak_q5_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[5]/div[2]/div/span/i"))
				.getText();

		String ak_q5_cr_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[5]/div[2]/span/span"))
				.getText();

		String ak_q5_result_right_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[5]/div[1]/span"))
				.getText();

		String ak_q6_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[6]/div[2]/div/span"))
				.getText();

		String ak_q6_cr_left_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[6]/div[2]/span/span"))
				.getText();

		String ak_q6_result_right_a = driver.findElement(By.xpath(
				"//graded-result-v2/div/section/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div[6]/div[1]/span"))
				.getText();

		// question1
		Assert.assertEquals(ak_q1_user_response_left_a, ak_q1_user_response_left_e);
		Assert.assertEquals(ak_q1_result_right_a, ak_q1_result_right_e);

		// question 2
		Assert.assertEquals(ak_q2_user_response_left_a, ak_q2_user_response_left_e);
		Assert.assertEquals(ak_q2_cr_left_a, ak_q2_cr_left_e);
		Assert.assertEquals(ak_q2_result_right_a, ak_q2_result_right_e);

		// question 3
		Assert.assertEquals(ak_q3_user_response_left_a, ak_q3_user_response_left_e);
		Assert.assertEquals(ak_q3_cr_left_a, ak_q3_cr_left_e);
		Assert.assertEquals(ak_q3_result_right_a, ak_q3_result_right_e);

		// question 4
		Assert.assertEquals(ak_q4_user_response_left_a, ak_q4_user_response_left_e);
		Assert.assertEquals(ak_q4_cr_left_a, ak_q4_cr_left_e);
		Assert.assertEquals(ak_q4_result_right_a, ak_q4_result_right_e);

		// question 5
		Assert.assertEquals(ak_q5_user_response_left_a, ak_q5_user_response_left_e);
		Assert.assertEquals(ak_q5_cr_left_a, ak_q5_cr_left_e);
		Assert.assertEquals(ak_q5_result_right_a, ak_q5_result_right_e);

		// question 6
		Assert.assertEquals(ak_q6_user_response_left_a, ak_q6_user_response_left_e);
		Assert.assertEquals(ak_q6_cr_left_a, ak_q6_cr_left_e);
		Assert.assertEquals(ak_q6_result_right_a, ak_q6_result_right_e);

		Thread.sleep(2000);

	}

	@Test(priority = 16)
	public static void functionality_ak_chicago_16() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-5172");
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(
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

		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		// question 1 : option 1
		driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"))
				.click();

		// wait for question 2
		WebDriverWait waitq2 = new WebDriverWait(driver, 20);
		waitq2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		// question 2 : option 2
		driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"))
				.click();

		// wait for question 3
		WebDriverWait waitq3 = new WebDriverWait(driver, 20);
		waitq3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath("//section/div/div/div/form/div[3]/div[4]/a/i")).click();

		// wait for question 4
		WebDriverWait waitq4 = new WebDriverWait(driver, 20);
		waitq4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'New Question 4')]")));

		driver.findElement(By.xpath("//section/div/div/div/form/div[4]/div[4]/a/i")).click();

		// wait for question 5
		WebDriverWait waitq5 = new WebDriverWait(driver, 20);
		waitq5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'New Question 5')]")));

		driver.findElement(By.xpath("//section/div/div/div/form/div[5]/div[4]/a/i")).click();

		// wait for question 6
		WebDriverWait waitq6 = new WebDriverWait(driver, 20);
		waitq6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'New Question 6')]")));

		// question 6 : option 1, option 2, option 3, option 4, option 5, option 6,
		// option 7
		// option 1
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"))
				.click();

		Thread.sleep(500);

		// option 2
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label/span"))
				.click();

		Thread.sleep(500);

		// option 3
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[3]/label/span"))
				.click();

		Thread.sleep(500);

		// option 4
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[4]/label/span"))
				.click();

		Thread.sleep(500);

		// option 5
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[5]/label/span"))
				.click();

		Thread.sleep(500);

		// option 6
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[6]/label/span"))
				.click();

		Thread.sleep(500);

		// option 7
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[7]/label/span"))
				.click();

		Thread.sleep(500);

		// submit button
		driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[11]/button"))
				.click();

		Thread.sleep(1000);

		// result Page
		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'THIS IS THE PAGE HEADING')]")));

		WebElement scroll_to_accordion = driver.findElement(
				By.xpath("//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/a/div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_accordion);

		// question 1
		String ak_q1_user_response_left_e = "Option 1";
		String ak_q1_result_right_e = "Correct";

		// question 2
		String ak_q2_user_response_left_e = "Option 2";
		String ak_q2_cr_left_e = "Option 1";
		String ak_q2_result_right_e = "Incorrect";

		// question 3
		String ak_q3_user_response_left_e = "Not Answered";
		String ak_q3_cr_left_e = "Option 1";
		String ak_q3_result_right_e = "Incorrect";

		// question 4
		String ak_q4_user_response_left_e = "Not Answered";
		String ak_q4_cr_left_e = "Option 1";
		String ak_q4_result_right_e = "Incorrect";

		// question 5
		String ak_q5_user_response_left_e = "Not Answered";
		String ak_q5_cr_left_e = "Option 1";
		String ak_q5_result_right_e = "Incorrect";

		// question 6
		String ak_q6_user_response_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 7";
		String ak_q6_cr_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 10";
		String ak_q6_result_right_e = "Incorrect";

		driver.findElement(
				By.xpath("//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/a/div"))
				.click();

		Thread.sleep(1000);

		WebElement scroll_to_bet_accordion = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/p/p"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_bet_accordion);

		// question 1
		String ak_q1_user_response_left_a = driver.findElement(By.xpath(
				"//section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/span"))
				.getText();

		String ak_q1_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/span"))
				.getText();

		// question 2
		String ak_q2_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/div/span"))
				.getText();

		String ak_q2_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/span/span"))
				.getText();

		String ak_q2_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/span"))
				.getText();

		// question 3
		String ak_q3_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[1]/div/span/i"))
				.getText();

		String ak_q3_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[1]/span/span"))
				.getText();

		String ak_q3_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[2]/span"))
				.getText();

		// question 4
		String ak_q4_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[1]/div/span/i"))
				.getText();

		String ak_q4_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[1]/span/span"))
				.getText();

		String ak_q4_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[2]/span"))
				.getText();

		// question 5
		String ak_q5_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/div/span/i"))
				.getText();

		String ak_q5_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/span/span"))
				.getText();

		String ak_q5_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[2]/span"))
				.getText();

		// question 6
		String ak_q6_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[1]/div/span"))
				.getText();

		String ak_q6_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[1]/span/span"))
				.getText();

		String ak_q6_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[2]/span"))
				.getText();

		Thread.sleep(2000);

		// question1
		Assert.assertEquals(ak_q1_user_response_left_a, ak_q1_user_response_left_e);
		Assert.assertEquals(ak_q1_result_right_a, ak_q1_result_right_e);
		// question 2
		Assert.assertEquals(ak_q2_user_response_left_a, ak_q2_user_response_left_e);
		Assert.assertEquals(ak_q2_cr_left_a, ak_q2_cr_left_e);
		Assert.assertEquals(ak_q2_result_right_a, ak_q2_result_right_e);

		// question 3
		Assert.assertEquals(ak_q3_user_response_left_a, ak_q3_user_response_left_e);
		Assert.assertEquals(ak_q3_cr_left_a, ak_q3_cr_left_e);
		Assert.assertEquals(ak_q3_result_right_a, ak_q3_result_right_e);

		// question 4
		Assert.assertEquals(ak_q4_user_response_left_a, ak_q4_user_response_left_e);
		Assert.assertEquals(ak_q4_cr_left_a, ak_q4_cr_left_e);
		Assert.assertEquals(ak_q4_result_right_a, ak_q4_result_right_e);

		// question 5
		Assert.assertEquals(ak_q5_user_response_left_a, ak_q5_user_response_left_e);
		Assert.assertEquals(ak_q5_cr_left_a, ak_q5_cr_left_e);
		Assert.assertEquals(ak_q5_result_right_a, ak_q5_result_right_e);

		// question 6
		Assert.assertEquals(ak_q6_user_response_left_a, ak_q6_user_response_left_e);
		Assert.assertEquals(ak_q6_cr_left_a, ak_q6_cr_left_e);
		Assert.assertEquals(ak_q6_result_right_a, ak_q6_result_right_e);

	}

	@Test(priority = 17)
	public static void functionality_ak_madrid_17() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-5189");
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Button Text']")));

		Thread.sleep(1000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='Button Text']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		Thread.sleep(3000);
		// question 1 : option 1
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/radio-button/div/div/div[1]/div[2]/label/span"))
				.click();

		// wait for question 2
		WebDriverWait waitq2 = new WebDriverWait(driver, 20);
		waitq2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		Thread.sleep(3000);

		// question 2 : option 2
		driver.findElement(By.xpath("//form/div[2]/div[3]/div/control/radio-button/div/div/div[2]/div[2]/label/span"))
				.click();

		Thread.sleep(2000);
		// submit section 1

		driver.findElement(By.xpath("//form/div[6]/div[2]/button[2]")).click();

		// wait for question 6
		WebDriverWait waitq4 = new WebDriverWait(driver, 20);
		waitq4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 6']")));

		// question 6 : option 1, option 2, option 3, option 4, option 5, option 6,
		// option 7
		// option 1
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/checkbox/div/div/div[1]/label/span")).click();

		Thread.sleep(500);

		// option 2
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/checkbox/div/div/div[2]/label/span")).click();

		Thread.sleep(500);

		// option 3
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/checkbox/div/div/div[3]/label/span")).click();

		Thread.sleep(500);

		// option 4
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/checkbox/div/div/div[4]/label/span")).click();

		Thread.sleep(500);

		// option 5
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/checkbox/div/div/div[5]/label/span")).click();

		Thread.sleep(500);

		// option 6
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/checkbox/div/div/div[6]/label/span")).click();

		Thread.sleep(500);

		// option 7
		driver.findElement(By.xpath("//form/div[1]/div[3]/div/control/checkbox/div/div/div[7]/label/span")).click();

		Thread.sleep(500);

		// submit button
		driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();

		Thread.sleep(1000);

		// result Page
		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Your heading goes here']")));

		WebElement scroll_to_accordion = driver.findElement(
				By.xpath("//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/a/div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_accordion);

		// question 1
		String ak_q1_user_response_left_e = "Option 1";
		String ak_q1_result_right_e = "Correct";

		// question 2
		String ak_q2_user_response_left_e = "Option 2";
		String ak_q2_cr_left_e = "Option 1";
		String ak_q2_result_right_e = "Incorrect";

		// question 3
		String ak_q3_user_response_left_e = "Not Answered";
		String ak_q3_cr_left_e = "Option 1";
		String ak_q3_result_right_e = "Incorrect";

		// question 4
		String ak_q4_user_response_left_e = "Not Answered";
		String ak_q4_cr_left_e = "Option 1";
		String ak_q4_result_right_e = "Incorrect";

		// question 5
		String ak_q5_user_response_left_e = "Not Answered";
		String ak_q5_cr_left_e = "Option 1";
		String ak_q5_result_right_e = "Incorrect";

		// question 6
		String ak_q6_user_response_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 7";
		String ak_q6_cr_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 10";
		String ak_q6_result_right_e = "Incorrect";

		driver.findElement(
				By.xpath("//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/a/div"))
				.click();

		Thread.sleep(1000);

		WebElement scroll_to_bet_accordion = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/p/p"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_bet_accordion);

		// question 1
		String ak_q1_user_response_left_a = driver.findElement(By.xpath(
				"//section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/span"))
				.getText();

		String ak_q1_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/span"))
				.getText();

		// question 2
		String ak_q2_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/div/span"))
				.getText();

		String ak_q2_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/span/span"))
				.getText();

		String ak_q2_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/span"))
				.getText();

		// question 3
		String ak_q3_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[1]/div/span/i"))
				.getText();

		String ak_q3_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[1]/span/span"))
				.getText();

		String ak_q3_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[2]/span"))
				.getText();

		// question 4
		String ak_q4_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[1]/div/span/i"))
				.getText();

		String ak_q4_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[1]/span/span"))
				.getText();

		String ak_q4_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[2]/span"))
				.getText();

		// question 5
		String ak_q5_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/div/span/i"))
				.getText();

		String ak_q5_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/span/span"))
				.getText();

		String ak_q5_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[2]/span"))
				.getText();

		// question 6
		String ak_q6_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[1]/div/span"))
				.getText();

		String ak_q6_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[1]/span/span"))
				.getText();

		String ak_q6_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[2]/span"))
				.getText();

		Thread.sleep(2000);

		// question1
		Assert.assertEquals(ak_q1_user_response_left_a, ak_q1_user_response_left_e);
		Assert.assertEquals(ak_q1_result_right_a, ak_q1_result_right_e);
		// question 2
		Assert.assertEquals(ak_q2_user_response_left_a, ak_q2_user_response_left_e);
		Assert.assertEquals(ak_q2_cr_left_a, ak_q2_cr_left_e);
		Assert.assertEquals(ak_q2_result_right_a, ak_q2_result_right_e);

		// question 3
		Assert.assertEquals(ak_q3_user_response_left_a, ak_q3_user_response_left_e);
		Assert.assertEquals(ak_q3_cr_left_a, ak_q3_cr_left_e);
		Assert.assertEquals(ak_q3_result_right_a, ak_q3_result_right_e);

		// question 4
		Assert.assertEquals(ak_q4_user_response_left_a, ak_q4_user_response_left_e);
		Assert.assertEquals(ak_q4_cr_left_a, ak_q4_cr_left_e);
		Assert.assertEquals(ak_q4_result_right_a, ak_q4_result_right_e);

		// question 5
		Assert.assertEquals(ak_q5_user_response_left_a, ak_q5_user_response_left_e);
		Assert.assertEquals(ak_q5_cr_left_a, ak_q5_cr_left_e);
		Assert.assertEquals(ak_q5_result_right_a, ak_q5_result_right_e);

		// question 6
		Assert.assertEquals(ak_q6_user_response_left_a, ak_q6_user_response_left_e);
		Assert.assertEquals(ak_q6_cr_left_a, ak_q6_cr_left_e);
		Assert.assertEquals(ak_q6_result_right_a, ak_q6_result_right_e);

	}

	@Test(priority = 18)
	public static void functionality_ak_stockholm_18() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-5195");
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Button text']")));

		Thread.sleep(1000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Button text']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		// question 1 : option 1
		driver.findElement(By.xpath(
				"//form/div[1]/div[2]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/div[2]"))
				.click();

		// wait for question 2
		WebDriverWait waitq2 = new WebDriverWait(driver, 20);
		waitq2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		// question 2 : option 2
		driver.findElement(By.xpath(
				"//form/div[2]/div[2]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/div[2]"))
				.click();

		// wait for question 3
		WebDriverWait waitq3 = new WebDriverWait(driver, 20);
		waitq3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath("//form/div[3]/div[3]/div[2]/a/i")).click();

		// wait for question 4
		WebDriverWait waitq4 = new WebDriverWait(driver, 20);
		waitq4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 4')]")));

		driver.findElement(By.xpath("//form/div[4]/div[3]/div[2]/a/i")).click();

		// wait for question 5
		WebDriverWait waitq5 = new WebDriverWait(driver, 20);
		waitq5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		driver.findElement(By.xpath("//form/div[5]/div[3]/div[2]/a/i")).click();

		// wait for question 6
		WebDriverWait waitq6 = new WebDriverWait(driver, 20);
		waitq6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'New Question 6')]")));

		// question 6 : option 1, option 2, option 3, option 4, option 5, option 6,
		// option 7
		// option 1
		driver.findElement(
				By.xpath("//form/div[6]/div[2]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"))
				.click();

		Thread.sleep(500);

		// option 2
		driver.findElement(
				By.xpath("//form/div[6]/div[2]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label/span"))
				.click();

		Thread.sleep(500);

		// option 3
		driver.findElement(
				By.xpath("//form/div[6]/div[2]/div/div/div[2]/div/div/control/checkbox/div/div/div[3]/label/span"))
				.click();

		Thread.sleep(500);

		// option 4
		driver.findElement(
				By.xpath("//form/div[6]/div[2]/div/div/div[2]/div/div/control/checkbox/div/div/div[4]/label/span"))
				.click();

		Thread.sleep(500);

		// option 5
		driver.findElement(
				By.xpath("//form/div[6]/div[2]/div/div/div[2]/div/div/control/checkbox/div/div/div[5]/label/span"))
				.click();

		Thread.sleep(500);

		// option 6
		driver.findElement(
				By.xpath("//form/div[6]/div[2]/div/div/div[2]/div/div/control/checkbox/div/div/div[6]/label/span"))
				.click();

		Thread.sleep(500);

		// option 7
		driver.findElement(
				By.xpath("//form/div[6]/div[2]/div/div/div[2]/div/div/control/checkbox/div/div/div[7]/label/span"))
				.click();

		Thread.sleep(500);

		WebElement scroll_to_submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_submit);

		// submit button
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(1000);

		// result Page
		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Your heading goes here']")));

		WebElement scroll_to_accordion = driver.findElement(
				By.xpath("//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/a/div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_accordion);

		// question 1
		String ak_q1_user_response_left_e = "Option 1";
		String ak_q1_result_right_e = "Correct";

		// question 2
		String ak_q2_user_response_left_e = "Option 2";
		String ak_q2_cr_left_e = "Option 1";
		String ak_q2_result_right_e = "Incorrect";

		// question 3
		String ak_q3_user_response_left_e = "Not Answered";
		String ak_q3_cr_left_e = "Option 1";
		String ak_q3_result_right_e = "Incorrect";

		// question 4
		String ak_q4_user_response_left_e = "Not Answered";
		String ak_q4_cr_left_e = "Option 1";
		String ak_q4_result_right_e = "Incorrect";

		// question 5
		String ak_q5_user_response_left_e = "Not Answered";
		String ak_q5_cr_left_e = "Option 1";
		String ak_q5_result_right_e = "Incorrect";

		// question 6
		String ak_q6_user_response_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 7";
		String ak_q6_cr_left_e = "Option 1, Option 2, Option 3, Option 4, Option 5, Option 6, Option 10";
		String ak_q6_result_right_e = "Incorrect";

		driver.findElement(
				By.xpath("//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/a/div"))
				.click();

		Thread.sleep(1000);

		WebElement scroll_to_bet_accordion = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/p/p"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_bet_accordion);

		// question 1
		String ak_q1_user_response_left_a = driver.findElement(By.xpath(
				"//section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/span"))
				.getText();

		String ak_q1_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/span"))
				.getText();

		// question 2
		String ak_q2_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/div/span"))
				.getText();

		String ak_q2_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/span/span"))
				.getText();

		String ak_q2_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/span"))
				.getText();

		// question 3
		String ak_q3_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[1]/div/span/i"))
				.getText();

		String ak_q3_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[1]/span/span"))
				.getText();

		String ak_q3_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[3]/div[2]/span"))
				.getText();

		// question 4
		String ak_q4_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[1]/div/span/i"))
				.getText();

		String ak_q4_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[1]/span/span"))
				.getText();

		String ak_q4_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[4]/div[2]/span"))
				.getText();

		// question 5
		String ak_q5_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/div/span/i"))
				.getText();

		String ak_q5_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[1]/span/span"))
				.getText();

		String ak_q5_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[5]/div[2]/span"))
				.getText();

		// question 6
		String ak_q6_user_response_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[1]/div/span"))
				.getText();

		String ak_q6_cr_left_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[1]/span/span"))
				.getText();

		String ak_q6_result_right_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[6]/div[2]/span"))
				.getText();

		Thread.sleep(2000);

		// question1
		Assert.assertEquals(ak_q1_user_response_left_a, ak_q1_user_response_left_e);
		Assert.assertEquals(ak_q1_result_right_a, ak_q1_result_right_e);
		// question 2
		Assert.assertEquals(ak_q2_user_response_left_a, ak_q2_user_response_left_e);
		Assert.assertEquals(ak_q2_cr_left_a, ak_q2_cr_left_e);
		Assert.assertEquals(ak_q2_result_right_a, ak_q2_result_right_e);

		// question 3
		Assert.assertEquals(ak_q3_user_response_left_a, ak_q3_user_response_left_e);
		Assert.assertEquals(ak_q3_cr_left_a, ak_q3_cr_left_e);
		Assert.assertEquals(ak_q3_result_right_a, ak_q3_result_right_e);

		// question 4
		Assert.assertEquals(ak_q4_user_response_left_a, ak_q4_user_response_left_e);
		Assert.assertEquals(ak_q4_cr_left_a, ak_q4_cr_left_e);
		Assert.assertEquals(ak_q4_result_right_a, ak_q4_result_right_e);

		// question 5
		Assert.assertEquals(ak_q5_user_response_left_a, ak_q5_user_response_left_e);
		Assert.assertEquals(ak_q5_cr_left_a, ak_q5_cr_left_e);
		Assert.assertEquals(ak_q5_result_right_a, ak_q5_result_right_e);

		// question 6
		Assert.assertEquals(ak_q6_user_response_left_a, ak_q6_user_response_left_e);
		Assert.assertEquals(ak_q6_cr_left_a, ak_q6_cr_left_e);
		Assert.assertEquals(ak_q6_result_right_a, ak_q6_result_right_e);

	}

	@Test(priority = 19)
	public static void functionality_ak_venice_19() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-5201");
		WebDriverWait wait_q1 = new WebDriverWait(driver, 20);
		wait_q1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(1000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(500);
		button.click();

		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		// question 1 : option 1
		driver.findElement(By
				.xpath("//form/div[1]/div[4]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[1]/label"))
				.click();

		// wait for question 2
		WebDriverWait waitq2 = new WebDriverWait(driver, 20);
		waitq2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		// question 2 : option 2
		driver.findElement(By
				.xpath("//form/div[2]/div[4]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[1]/label"))
				.click();

		// wait for question 3
		WebDriverWait waitq3 = new WebDriverWait(driver, 20);
		waitq3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		// next button
		driver.findElement(
				By.xpath("//form/div[3]/div[4]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/button"))
				.click();

		// wait for question 4
		WebDriverWait waitq4 = new WebDriverWait(driver, 20);
		waitq4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 4')]")));

		// next button
		driver.findElement(
				By.xpath("//form/div[4]/div[4]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/button"))
				.click();

		// wait for question 5
		WebDriverWait waitq5 = new WebDriverWait(driver, 20);
		waitq5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 5')]")));

		driver.findElement(
				By.xpath("//form/div[5]/div[4]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/button"))
				.click();

		// wait for question 6
		WebDriverWait waitq6 = new WebDriverWait(driver, 20);
		waitq6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'New Question 6')]")));

		// question 6 : option 1, option 2, option 3, option 4, option 5, option 6,
		// option 7
		// option 1
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"))
				.click();

		Thread.sleep(500);

		// option 2
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label/span"))
				.click();

		Thread.sleep(500);

		// option 3
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[3]/label/span"))
				.click();

		Thread.sleep(500);

		// option 4
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[4]/label/span"))
				.click();

		Thread.sleep(500);

		// option 5
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[5]/label/span"))
				.click();

		Thread.sleep(500);

		// option 6
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[6]/label/span"))
				.click();

		Thread.sleep(500);

		// option 7
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[7]/label/span"))
				.click();

		Thread.sleep(500);

		WebElement scroll_to_submit = driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[11]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_submit);

		// submit button
		driver.findElement(
				By.xpath("//form/div[6]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[11]/button"))
				.click();

		Thread.sleep(1000);

		// result Page
		WebDriverWait result_page = new WebDriverWait(driver, 20);
		result_page.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your heading goes here')]")));

		WebElement scroll_to_accordion = driver.findElement(By.xpath("//div[contains(text(),'Answer Key')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_accordion);

		// question 1
		String ak_q1_result_e = "Correct";

		// question 2
		String ak_q2_result_e = "Incorrect";

		// question 3
		String ak_q3_result_e = "Incorrect";

		// question 4
		String ak_q4_result_e = "Incorrect";

		// question 5
		String ak_q5_result_e = "Incorrect";

		// question 6
		String ak_q6_result_e = "Incorrect";

		// click on accordion.
		driver.findElement(By.xpath("//div[contains(text(),'Answer Key')]")).click();

		Thread.sleep(1000);

		WebElement scroll_to_bet_accordion = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[5]/div[2]/p/p"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll_to_bet_accordion);

		Thread.sleep(2000);

		// Question 1
		String ak_q1_result_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/span"))
				.getText();

		// Question 2
		String ak_q2_result_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/span"))
				.getText();

		// Question 3
		String ak_q3_result_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/div[1]/span"))
				.getText();

		// Question 4
		String ak_q4_result_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[4]/div[1]/span"))
				.getText();

		// Question 5
		String ak_q5_result_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[5]/div[1]/span"))
				.getText();

		// Question 6
		String ak_q6_result_a = driver.findElement(By.xpath(
				"//graded-result/div/section/div[3]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[5]/div[1]/span"))
				.getText();

		Assert.assertEquals(ak_q1_result_a, ak_q1_result_e);
		Assert.assertEquals(ak_q2_result_a, ak_q2_result_e);
		Assert.assertEquals(ak_q3_result_a, ak_q3_result_e);
		Assert.assertEquals(ak_q4_result_a, ak_q4_result_e);
		Assert.assertEquals(ak_q5_result_a, ak_q5_result_e);
		Assert.assertEquals(ak_q6_result_a, ak_q6_result_e);

	}

}
