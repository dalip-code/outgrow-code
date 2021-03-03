package outgrowpackage;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class saveMechanism extends CommonLib {

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
	public static void save_mechanism_newyork_lead() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4335");

		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(2000);

		// lead

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// skip
		// driver.findElement(By.xpath("//section[2]/div[3]/control/leadform/button")).click();

		Thread.sleep(2000);

		// question 1 : alpha numeric
		WebDriverWait wait_alpha_numeric_q = new WebDriverWait(driver, 30);
		wait_alpha_numeric_q.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'alpha numeric')]")));

		WebElement alpha_numeric = driver
				.findElement(By.xpath("//form/div/div[2]/div/control/textfield/div/div/div[1]/input"));
		alpha_numeric.sendKeys("alpha numeric test 123");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//form/div/div[2]/a/i")).click();

		// question 2: numeric
		WebDriverWait numeric_q = new WebDriverWait(driver, 30);
		numeric_q.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'numeric')]")));

		WebElement numeric = driver
				.findElement(By.xpath("//form/div/div[5]/div/control/textfield/div/div/div[1]/input"));
		numeric.sendKeys("99");

		driver.findElement(By.xpath("//form/div/div[5]/a/i")).click();

		Thread.sleep(1000);

		// question 3
		WebDriverWait emailq = new WebDriverWait(driver, 30);
		emailq.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='email address']")));

		WebElement email_q = driver.findElement(By.xpath("//form/div/div[8]/div/control/textfield/div/div/div/input"));
		email_q.sendKeys("dalip.kumar@venturepact.com");

		driver.findElement(By.xpath("//form/div/div[8]/a/i")).click();

		Thread.sleep(1000);

		// question 4
		WebDriverWait places = new WebDriverWait(driver, 30);
		places.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//form/div/div[11]/div/control/textfield/div/div/div/input")));

		WebElement place_q = driver.findElement(By.xpath("//form/div/div[11]/div/control/textfield/div/div/div/input"));
		Thread.sleep(1000);
		place_q.sendKeys("Jalan");
		Thread.sleep(1000);
		place_q.clear();
		place_q.sendKeys("Jalandhar, Punjab, India");
		Thread.sleep(500);

		driver.findElement(By.xpath("//form/div/div[11]/a/i")).click();

		Thread.sleep(1000);

		// question 5
		WebDriverWait multi_s = new WebDriverWait(driver, 30);
		multi_s.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Multi select with text')]")));

		WebElement multi_s_option1 = driver
				.findElement(By.xpath("//form/div/div[14]/div/control/checkbox/div/div/div[1]/label/span"));
		WebElement multi_s_option2 = driver
				.findElement(By.xpath("//form/div/div[14]/div/control/checkbox/div/div/div[2]/label/span"));
		WebElement multi_s_option3 = driver
				.findElement(By.xpath("//form/div/div[14]/div/control/checkbox/div/div/div[3]/label/span"));
		WebElement multi_s_option4 = driver
				.findElement(By.xpath("//form/div/div[14]/div/control/checkbox/div/div/div[4]/label/span"));

		multi_s_option1.click();
		Thread.sleep(200);
		multi_s_option2.click();
		Thread.sleep(200);
		multi_s_option3.click();
		Thread.sleep(200);
		multi_s_option4.click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//form/div/div[14]/a/i")).click();

		Thread.sleep(1000);

		// question 6
		WebDriverWait multi_s_icon = new WebDriverWait(driver, 30);
		multi_s_icon.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Multi select with icon')]")));

		WebElement multi_s_icon_option1 = driver
				.findElement(By.xpath("//form/div/div[17]/div/control/checkbox/div/div/div[1]/label/span"));
		WebElement multi_s_icon_option2 = driver
				.findElement(By.xpath("//form/div/div[17]/div/control/checkbox/div/div/div[2]/label/span"));
		WebElement multi_s_icon_option3 = driver
				.findElement(By.xpath("//form/div/div[17]/div/control/checkbox/div/div/div[3]/label/span"));
		WebElement multi_s_icon_option4 = driver
				.findElement(By.xpath("//form/div/div[17]/div/control/checkbox/div/div/div[4]/label/span"));

		multi_s_icon_option1.click();
		Thread.sleep(200);
		multi_s_icon_option2.click();
		Thread.sleep(200);
		multi_s_icon_option3.click();
		Thread.sleep(200);
		multi_s_icon_option4.click();
		Thread.sleep(200);

		driver.findElement(By.xpath("//form/div/div[17]/a/i")).click();

		Thread.sleep(1000);

		// question 7
		WebDriverWait single_select_text = new WebDriverWait(driver, 30);
		single_select_text.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Single select with text']")));

		WebElement single_select_field = driver
				.findElement(By.xpath("//form/div/div[20]/div/control/radio-button/div/div/div[1]/label/span"));
		Thread.sleep(1000);
		single_select_field.click();

		Thread.sleep(1000);

		// question 8
		WebDriverWait single_select_icon = new WebDriverWait(driver, 30);
		single_select_icon.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Single select with icon']")));

		WebElement single_select_icon_field = driver
				.findElement(By.xpath("//form/div/div[23]/div/control/radio-button/div/div/div[1]/label/span"));
		Thread.sleep(1000);
		single_select_icon_field.click();

		Thread.sleep(1000);

		// question 9
		WebDriverWait rating = new WebDriverWait(driver, 30);
		rating.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Rating')]")));

		WebElement rating_field = driver
				.findElement(By.xpath("//form/div/div[26]/div/control/rating/div/div/div/div/i[3]"));
		Thread.sleep(1000);
		rating_field.click();

		Thread.sleep(1000);

		// question 10
		WebDriverWait date_picker = new WebDriverWait(driver, 30);
		date_picker
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Date picker')]")));

		Thread.sleep(1000);
		WebElement date_picker_field = driver
				.findElement(By.xpath("//form/div/div[29]/div/control/calendar/div/div/div/div/input[1]"));
		Thread.sleep(1000);
		date_picker_field.sendKeys("01/01/2021");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//form/div/div[29]/a/i")).click();

		Thread.sleep(3000);

		CommonLib.CaptureScreenshotSave_mechanism("New_york_result_page_variable_values");

		Thread.sleep(2000);

		String q1_response = "alpha numeric test 123";
		String q2_response = "99";
		String q3_response = "dalip.kumar@venturepact.com";
		String q4_response = "Jalandhar, Punjab, India";
		String q5_response = "Option 1, Option 2, Option 3, Option 4";
		String q6_response = "Option 1, Option 2, Option 3, Option 4";
		String q7_response = "Option 1";
		String q8_response = "Option 1";
		String q9_response = "3";
		String q10_response = "01/01/2021";

		String q1_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[1]"))
				.getText();
		String q2_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[2]"))
				.getText();
		String q3_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[3]"))
				.getText();
		String q4_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[4]"))
				.getText();
		String q5_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[5]"))
				.getText();
		String q6_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[6]"))
				.getText();
		String q7_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[7]"))
				.getText();
		String q8_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[8]"))
				.getText();
		String q9_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[9]"))
				.getText();
		String q10_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[10]"))
				.getText();

		System.out.println("Question 1: " + q1_response_actual);
		System.out.println("Question 2: " + q2_response_actual);
		System.out.println("Question 3: " + q3_response_actual);
		System.out.println("Question 4: " + q4_response_actual);
		System.out.println("Question 5: " + q5_response_actual);
		System.out.println("Question 6: " + q6_response_actual);
		System.out.println("Question 7: " + q7_response_actual);
		System.out.println("Question 8: " + q8_response_actual);
		System.out.println("Question 9: " + q9_response_actual);
		System.out.println("Question 10: " + q10_response_actual);

		Assert.assertEquals(q1_response_actual, q1_response);
		Assert.assertEquals(q2_response_actual, q2_response);
		Assert.assertEquals(q3_response_actual, q3_response);
		Assert.assertEquals(q4_response_actual, q4_response);
		Assert.assertEquals(q5_response_actual, q5_response);
		Assert.assertEquals(q6_response_actual, q6_response);
		Assert.assertEquals(q7_response_actual, q7_response);
		Assert.assertEquals(q8_response_actual, q8_response);
		Assert.assertEquals(q9_response_actual, q9_response);
		Assert.assertEquals(q10_response_actual, q10_response);

		Thread.sleep(3000);
	}

	@Test
	public static void save_mechanism_venice_lead() throws InterruptedException, IOException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4345");

		WebDriverWait wait_welcome_screen = new WebDriverWait(driver, 30);
		wait_welcome_screen
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='landingBtn']")));

		Thread.sleep(2000);

		// lead

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(500);
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		button.click();

		// skip
		// driver.findElement(By.xpath("//section[2]/div[3]/control/leadform/button")).click();

		Thread.sleep(2000);

		// question 1 : alpha numeric
		WebDriverWait wait_alpha_numeric_q = new WebDriverWait(driver, 30);
		wait_alpha_numeric_q.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Text input alpha numeric')]")));

		WebElement alpha_numeric = driver.findElement(
				By.xpath("//div[1]/form/div[1]/div[4]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		alpha_numeric.sendKeys("alpha numeric test 123");

		Thread.sleep(1000);

		driver.findElement(By
				.xpath("//div[1]/form/div[1]/div[4]/div/div/div[2]/div/div/control/textfield/div/div/div/div/button/i"))
				.click();

		// question 2: numeric
		WebDriverWait numeric_q = new WebDriverWait(driver, 30);
		numeric_q.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Text input numeric')]")));

		WebElement numeric = driver.findElement(
				By.xpath("//div[1]/form/div[2]/div[4]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		numeric.sendKeys("99");

		driver.findElement(By
				.xpath("//div[1]/form/div[2]/div[4]/div/div/div[2]/div/div/control/textfield/div/div/div/div/button/i"))
				.click();

		Thread.sleep(1000);

		// question 3 : text input email
		WebDriverWait emailq = new WebDriverWait(driver, 30);
		emailq.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Text input email address')]")));

		WebElement email_q = driver.findElement(
				By.xpath("//form/div[3]/div[4]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		email_q.sendKeys("dalip.kumar@venturepact.com");

		driver.findElement(
				By.xpath("//form/div[3]/div[4]/div/div/div[2]/div/div/control/textfield/div/div/div/div/button/i"))
				.click();

		Thread.sleep(1000);

		// question 4 : input places
		WebDriverWait places = new WebDriverWait(driver, 30);
		places.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Text input places')]")));

		WebElement place_q = driver.findElement(
				By.xpath("//div[2]/form/div[1]/div[4]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		Thread.sleep(1000);

		place_q.clear();

		place_q.sendKeys("Jalandhar, Punjab, India");

		Thread.sleep(1000);

		place_q.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		// question 5 : Text area
		WebDriverWait multi_s = new WebDriverWait(driver, 30);
		multi_s.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Text area']")));

		WebElement text_area_q = driver.findElement(
				By.xpath("//form/div[2]/div[4]/div/div/div[2]/div/div/control/app-textarea/div/div/div/textarea"));
		text_area_q.sendKeys("this text is for testing purpose text area");
		Thread.sleep(1000);

		driver.findElement(By
				.xpath("//form/div[2]/div[4]/div/div/div[2]/div/div/control/app-textarea/div/div/div/div[2]/button/i"))
				.click();

		Thread.sleep(1000);

		// question 6 : Text area rich text
		WebDriverWait text_rich = new WebDriverWait(driver, 30);
		text_rich.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Text area rich text']")));

		String text_area_data = "simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
		driver.findElement(By.xpath("//div[@aria-label='Rich Text Editor, main']")).sendKeys(text_area_data);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//form/div[3]/div[4]/div/div/div[2]/div/div/control/app-textarea/div/div/div/div/button/i"))
				.click();

		// question 7 : drop down
		WebDriverWait drop_down_q = new WebDriverWait(driver, 30);
		drop_down_q
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='drop down']")));

		driver.findElement(
				By.xpath("//form/div[4]/div[4]/div/div/div[2]/div/div/control/selectbox/div/div/div[2]/button/i"))
				.click();

		Thread.sleep(1000);

		// question 8 : multiselect
		WebDriverWait multi_select = new WebDriverWait(driver, 30);
		multi_select.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Multi select']")));

		WebElement multi_select_option1 = driver.findElement(
				By.xpath("//form/div[5]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"));
		Thread.sleep(500);

		WebElement multi_select_option2 = driver.findElement(
				By.xpath("//form/div[5]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[2]/label/span"));
		Thread.sleep(500);

		WebElement multi_select_option3 = driver.findElement(
				By.xpath("//form/div[5]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[3]/input[2]"));
		Thread.sleep(500);

		multi_select_option1.click();
		multi_select_option2.click();
		multi_select_option3.sendKeys("option 3 for testing purpose");

		driver.findElement(
				By.xpath("//form/div[5]/div[4]/div/div/div[2]/div/div/control/checkbox/div/div/div[4]/button/i"))
				.click();

		Thread.sleep(1000);

		// question 9: single select

		WebDriverWait single_select_q = new WebDriverWait(driver, 30);
		single_select_q.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Single select')]")));

		WebElement single_select = driver.findElement(By.xpath(
				"//form/div[6]/div[4]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[1]/label/span"));
		single_select.click();
		Thread.sleep(500);

		// question 10: numeric slider

		WebDriverWait numeric_slider_q = new WebDriverWait(driver, 30);
		numeric_slider_q.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Numeric slider')]")));

		WebElement next_button = driver.findElement(
				By.xpath("//form/div[7]/div[4]/div/div/div[2]/div/div/control/slider/div/div/div[2]/button/i"));
		next_button.click();
		Thread.sleep(500);

		// question 11: opinion scale

		WebDriverWait numeric_opinion_q = new WebDriverWait(driver, 30);
		numeric_opinion_q.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Opinion scale')]")));

		WebElement opinion_value = driver.findElement(
				By.xpath("//form/div[8]/div[4]/div/div/div[2]/div/div/control/rating/div/div[1]/div[8]/div/label"));
		opinion_value.click();

		Thread.sleep(500);

		driver.findElement(By.xpath("//form/div[8]/div[4]/div/div/div[2]/div/div/control/rating/div/div[2]/button/i"))
				.click();

		// question 12 : rating
		WebDriverWait rating = new WebDriverWait(driver, 30);
		rating.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Rating']")));

		WebElement rating_field = driver.findElement(
				By.xpath("//form/div[9]/div[4]/div/div/div[2]/div/div/control/rating/div/div/div[1]/div/i[3]"));
		Thread.sleep(1000);
		rating_field.click();

		driver.findElement(By.xpath("//form/div[9]/div[4]/div/div/div[2]/div/div/control/rating/div/div/div[2]/button"))
				.click();

		Thread.sleep(1000);

		// question 13: date picker
		WebDriverWait date_picker = new WebDriverWait(driver, 30);
		date_picker
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Date picker')]")));

		Thread.sleep(1000);
		WebElement date_picker_field = driver.findElement(
				By.xpath("//form/div[10]/div[4]/div/div/div[2]/div/div/control/calendar/div/div[1]/div/div/input[1]"));
		Thread.sleep(1000);
		date_picker_field.sendKeys("01/01/2021");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//p[contains(text(),'Date picker')]")).click();

		driver.findElement(
				By.xpath("//form/div[10]/div[4]/div/div/div[2]/div/div/control/calendar/div/div[2]/button/i")).click();

		Thread.sleep(3000);

		CommonLib.CaptureScreenshotSave_mechanism("ss");

		Thread.sleep(2000);

//		String q1_response = "alpha numeric test 123";
//		String q2_response = "99";
//		String q3_response = "dalip.kumar@venturepact.com";
//		String q4_response = "Jalandhar, Punjab, India";
//		String q5_response = "Option 1, Option 2, Option 3, Option 4";
//		String q6_response = "Option 1, Option 2, Option 3, Option 4";
//		String q7_response = "Option 1";
//		String q8_response = "Option 1";
//		String q9_response = "3";
//		String q10_response = "01/01/2021";
//
//		String q1_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[1]"))
//				.getText();
//		String q2_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[2]"))
//				.getText();
//		String q3_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[3]"))
//				.getText();
//		String q4_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[4]"))
//				.getText();
//		String q5_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[5]"))
//				.getText();
//		String q6_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[6]"))
//				.getText();
//		String q7_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[7]"))
//				.getText();
//		String q8_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[8]"))
//				.getText();
//		String q9_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[9]"))
//				.getText();
//		String q10_response_actual = driver.findElement(By.xpath("//result_output/div/div[2]/div[2]/p/span[10]"))
//				.getText();
//
//		System.out.println("Question 1: " + q1_response_actual);
//		System.out.println("Question 2: " + q2_response_actual);
//		System.out.println("Question 3: " + q3_response_actual);
//		System.out.println("Question 4: " + q4_response_actual);
//		System.out.println("Question 5: " + q5_response_actual);
//		System.out.println("Question 6: " + q6_response_actual);
//		System.out.println("Question 7: " + q7_response_actual);
//		System.out.println("Question 8: " + q8_response_actual);
//		System.out.println("Question 9: " + q9_response_actual);
//		System.out.println("Question 10: " + q10_response_actual);
//
//		Assert.assertEquals(q1_response_actual, q1_response);
//		Assert.assertEquals(q2_response_actual, q2_response);
//		Assert.assertEquals(q3_response_actual, q3_response);
//		Assert.assertEquals(q4_response_actual, q4_response);
//		Assert.assertEquals(q5_response_actual, q5_response);
//		Assert.assertEquals(q6_response_actual, q6_response);
//		Assert.assertEquals(q7_response_actual, q7_response);
//		Assert.assertEquals(q8_response_actual, q8_response);
//		Assert.assertEquals(q9_response_actual, q9_response);
//		Assert.assertEquals(q10_response_actual, q10_response);
//
//		Thread.sleep(3000);
	}
}
