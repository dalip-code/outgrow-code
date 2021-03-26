package QuestionsSave;

import java.awt.Desktop.Action;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import logicJump.ScreenRecorderUtil;
import outgrowpackage.CommonLib;

public class ChicagoCalculatorQuestions extends CommonLib {

	@BeforeClass
	public static void open_browser() throws Exception {
		CommonLib.LaunchBrowswer();
		// ScreenRecorderUtil.startRecord("open_browser");
	}

	@AfterClass
	public static void quit_browser() throws Exception {
		CommonLib.closeBrowser();
		// ScreenRecorderUtil.stopRecord();
		CommonLib.quitDriver();
	}

	public static void questions_attempt() throws InterruptedException {
		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='text input alpha numeric q1']")));

		// question 1: text input alpha numeric question 1
		WebElement textInputAlphaNumeric_q1 = driver.findElement(
				By.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		textInputAlphaNumeric_q1.sendKeys("abc123");

		WebElement ContinueButton_q1 = driver
				.findElement(By.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/button"));

		ContinueButton_q1.click();

		// question 2: text input numeric question 2
		WebElement textInputNumeric_q2 = driver.findElement(
				By.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));

		textInputNumeric_q2.sendKeys("abc123");

		WebElement ContinueButton_q2 = driver.findElement(By.xpath(
				"//div[@class='slide_1 sec_0_q_1']//button[@class='button_textfield submit-textbox-btnresp ripple-light'][normalize-space()='Continue']"));

		ContinueButton_q2.click();

		// question 3: text input email question 3
		WebElement textInputEmail_q3 = driver.findElement(
				By.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));

		textInputEmail_q3.sendKeys("test1@test.com");

		driver.findElement(By.xpath(
				"//div[@class='slide_2 sec_0_q_2']//button[@class='button_textfield submit-textbox-btnresp ripple-light'][normalize-space()='Continue']"))
				.click();

		// text input places question 4
		WebElement textInputPlaces_q4 = driver.findElement(
				By.xpath("//form/div[4]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));

		textInputPlaces_q4.sendKeys("Jalandhar, Punjab, India");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//section/div/div/div/form/div[4]/div[4]/a/i")).click();

		Thread.sleep(1500);

		// text area question 5
		WebElement textArea_q5 = driver.findElement(By.xpath("//app-textarea/div/div/div/textarea"));
		textArea_q5.sendKeys(
				"simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");

		Thread.sleep(500);

		driver.findElement(By.xpath(
				"//div[@class='material-textarea']//button[@class='button_textfield submit-textbox-btnresp ripple-light'][normalize-space()='Continue']"))
				.click();

		// drop down question 6 next button : option 1

		driver.findElement(By.xpath("//form/div[6]/div[4]/a/i")).click();

		Thread.sleep(2000);

		// question 7 : multi select : option 1 and option 2
		driver.findElement(By.xpath("//checkbox/div/div/div[1]/label/span")).click();
		driver.findElement(By.xpath("//checkbox/div/div/div[2]/label/span")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		Thread.sleep(1000);

		// question 8 : single select
		driver.findElement(By.xpath("//radio-button/div/div/div[2]/div[2]/label/span")).click();
		Thread.sleep(1000);

		// question 9 : Numeric slider : value 50

		WebElement slider = driver.findElement(By.xpath("//slider/div/div/div[1]/div/div[1]/input"));

		// Using Action Class
		Actions move = new Actions(driver);
		move.moveToElement(slider).clickAndHold().moveByOffset(1, 50).release().perform();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//form/div[9]/div[4]/a")).click();

		Thread.sleep(1000);

		// question 10: opinion scale
		driver.findElement(By.xpath("//rating/div/div/div[7]/div/label/span")).click();

		Thread.sleep(1000);

		// question 11: rating 4 star

		driver.findElement(By.xpath("//form/div[11]/div[4]/a/i")).click();
		Thread.sleep(1000);

		// question 12 : date picker
		driver.findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']")).sendKeys("02/28/2021");
		driver.findElement(By.xpath("//form/div[12]/div[4]/a/i")).click();
		Thread.sleep(1000);

		// question 13 : file upload
		WebElement file_upload_q13 = driver.findElement(By.xpath("//form/div[13]/div[4]/a"));
		file_upload_q13.click();

		Thread.sleep(3000);

		// question 14 : Ranking grid
		driver.findElement(By.xpath(
				"//form/div[14]/div[3]/div/div/div[2]/div/div/control/rankfield/div/div/div/div[2]/ul/li[1]/label"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//form/div[14]/div[3]/div/div/div[2]/div/div/control/rankfield/div/div/div/div[3]/ul/li[2]/label"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		Thread.sleep(5000);

	}

	public static void check_analytics_data() throws InterruptedException {

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(1));

		driver.findElement(By.xpath("//div[@class='mobile-top-menu']//li[3]//a[1]")).click();

		driver.findElement(By.xpath("//span[normalize-space()='User Details']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Leads']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//tbody/tr[1]/td[21]/span[1]/a[1]")).click();

		String q1_answer = driver
				.findElement(By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[1]/div[2]/h6[2]"))
				.getText();

		String q2_answer_s = driver
				.findElement(By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[2]/div[2]/h6[2]"))
				.getText();

		int q2_answer = Integer.parseInt(q2_answer_s);

		String q3_answer = driver
				.findElement(By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[3]/div[2]/h6[2]"))
				.getText();

		String q4_answer = driver
				.findElement(By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[4]/div[2]/h6[2]"))
				.getText();

		String q5_answer = driver
				.findElement(By.xpath("//h6[contains(text(),'simply dummy text of the printing and typesetting ')]"))
				.getText();

		String q6_answer = driver
				.findElement(By.xpath("//og-user-details-popup/div/div[2]/div/div/div[6]/div[2]/h6[2]")).getText();

		String q7_answer = driver
				.findElement(By.xpath("//og-user-details-popup/div/div[2]/div/div/div[7]/div[2]/h6[2]")).getText();

		String q8_answer = driver
				.findElement(By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[8]/div[2]/h6[2]"))
				.getText();

		String q9_answer_s = driver
				.findElement(By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[9]/div[2]/h6[2]"))
				.getText();

		int q9_answer = Integer.parseInt(q9_answer_s);

		String q10_answer_s = driver
				.findElement(By.xpath("//og-user-details-popup/div/div[2]/div/div/div[10]/div[2]/h6[2]")).getText();

		int q10_answer = Integer.parseInt(q10_answer_s);

		String q11_answer = driver
				.findElement(By.xpath("//og-user-details-popup/div/div[2]/div/div/div[11]/div[2]/h6[2]")).getText();

		String q12_answer = driver
				.findElement(
						By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[12]/div[2]/h6[2]"))
				.getText();

		String q13_answer = driver
				.findElement(By.xpath("//og-user-details-popup/div/div[2]/div/div/div[13]/div[2]/h6[2]")).getText();

		String q14_answer = driver
				.findElement(By.xpath("//og-user-details-popup/div/div[2]/div/div/div[14]/div[2]/h6[2]")).getText();

		WebElement graph_title = driver

				.findElement(By.xpath("//og-user-details-popup/div/div[2]/div/div/div[14]/div[2]/h6[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", graph_title);

		Thread.sleep(2000);

		System.out.println("Question 1 : " + q1_answer);
		System.out.println("\n");
		System.out.println("Question 2 : " + q2_answer);
		System.out.println("\n");
		System.out.println("Question 3 : " + q3_answer);
		System.out.println("\n");
		System.out.println("Question 4 : " + q4_answer);
		System.out.println("\n");
		System.out.println("Question 5 : " + q5_answer);
		System.out.println("\n");
		System.out.println("Question 6 : " + q6_answer);
		System.out.println("\n");
		System.out.println("Question 7 : " + q7_answer);
		System.out.println("\n");
		System.out.println("Question 8 : " + q8_answer);
		System.out.println("\n");
		System.out.println("Question 9 : " + q9_answer);
		System.out.println("\n");
		System.out.println("Question 10 : " + q10_answer);
		System.out.println("\n");
		System.out.println("Question 11 : " + q11_answer);
		System.out.println("\n");
		System.out.println("Question 12 : " + q12_answer);
		System.out.println("\n");
		System.out.println("Question 13 : " + q13_answer);
		System.out.println("\n");
		System.out.println("Question 14 : " + q14_answer);
		System.out.println("\n");

		String textInputAlphaNumeric_q1_e = "abc123";
		int textInputNumeric_q2_e = 123;
		String textEmail_q3_e = "test1@test.com";
		String textInputPlaces_q4_e = "Jalandhar, Punjab, India";
		String textArea_q5_e = "simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
		String dropDown_q6_e = "Option 1";
		String multiSelect_q7_e = "Option 1, Option 2";
		String singleSelect_q8_e = "Option 2";
		int numericSlider_q9_e = 51;
		int opinionScale_q10_e = 7;
		String rating_q11_e = "Not Answered";
		String datePicker_q12_e = "02/28/2021";
		String fileUpload_q13_e = "Not Answered";
		String rankingGrid_q14_e = "Option 1, Option 2";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(q1_answer, textInputAlphaNumeric_q1_e, "Q1: text input alpha numeric value not matched");

		soft.assertEquals(q2_answer, textInputNumeric_q2_e, "Q2: text input numeric value not matched");

		soft.assertEquals(q3_answer, textEmail_q3_e, "Q3: text input email value not matched");

		soft.assertEquals(q4_answer, textInputPlaces_q4_e, "Q4: text input places value not matched");

		soft.assertEquals(q5_answer, textArea_q5_e, "Q5: text area value not matched");

		soft.assertEquals(q6_answer, dropDown_q6_e, "Q6: drop down value not matched");

		soft.assertEquals(q7_answer, multiSelect_q7_e, "Q7: Multiselect value not matched");

		soft.assertEquals(q8_answer, singleSelect_q8_e, "Q8: single select value not matched");

		soft.assertEquals(q9_answer, numericSlider_q9_e, "Q9:numeric slider value not matched");

		soft.assertEquals(q10_answer, opinionScale_q10_e, "Q10: opinion scale value not matched");

		soft.assertEquals(q11_answer, rating_q11_e, "Q11: rating value not matched");

		soft.assertEquals(q12_answer, datePicker_q12_e, "Q12: Date picker value not matched");

		soft.assertEquals(q13_answer, fileUpload_q13_e, "Q13: file upload value not matched");

		soft.assertEquals(q14_answer, rankingGrid_q14_e, "Q14: Ranking grid value not matched");

		soft.assertAll();

	}

	@Test(priority = 1)
	public static void ChicagoCalculatorQuestionsCheck()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		CommonLib.login();
		CommonLib.openNewTab();
		CommonLib.switchToNewTab();
		driver.navigate().to("https://dcompany878.outgrow.co/builder/dcompany878-6753");

		Thread.sleep(2000);

		WebDriverWait builder_load = new WebDriverWait(driver, 120);
		builder_load.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("// span[normalize-space()='WELCOME SCREEN']")));

		// URL copied to clipboard.
		driver.findElement(By.xpath("//i[normalize-space()='library_books']")).click();

		// storing clipboard data in variable.
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting

		Thread.sleep(1000);

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();

		driver.get(myText);

		Thread.sleep(1000);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(1));

		Thread.sleep(2000);

//		driver.switchTo().window(newTb.get(0));
//
//		Thread.sleep(2000);

	}

	@Test(dependsOnMethods = "ChicagoCalculatorQuestionsCheck", priority = 2)
	public static void FillQuestionsChicagoCalculator() throws InterruptedException {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(2));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[contains(text(),'CALCULATOR HEADING GOES HERE')]")).isDisplayed();
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
		questions_attempt();
		check_analytics_data();
	}

}
