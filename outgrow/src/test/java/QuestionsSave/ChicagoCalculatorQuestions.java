package QuestionsSave;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

		String q2_answer = driver
				.findElement(By.xpath("//og-user-details/og-user-details-popup/div/div[2]/div/div/div[2]/div[2]/h6[2]"))
				.getText();

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

		System.out.println(q1_answer);
		System.out.println(q2_answer);
		System.out.println(q3_answer);
		System.out.println(q4_answer);
		System.out.println(q5_answer);
		System.out.println(q6_answer);
		System.out.println(q7_answer);
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
				"simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

		Thread.sleep(500);

		driver.findElement(By.xpath(
				"//div[@class='material-textarea']//button[@class='button_textfield submit-textbox-btnresp ripple-light'][normalize-space()='Continue']"))
				.click();

		// drop down question 6 next button

		driver.findElement(By.xpath("//form/div[6]/div[4]/a/i")).click();

		Thread.sleep(2000);

		// question 7 : multi select
		driver.findElement(By.xpath("//checkbox/div/div/div[1]/label/span")).click();
		driver.findElement(By.xpath("//checkbox/div/div/div[2]/label/span")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();
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

		Thread.sleep(2000);

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();

		driver.get(myText);

		Thread.sleep(2000);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(1));

		Thread.sleep(2000);

		driver.switchTo().window(newTb.get(0));

		Thread.sleep(2000);

	}

	@Test(dependsOnMethods = "ChicagoCalculatorQuestionsCheck", priority = 2)
	public static void FillQuestionsChicagoCalculator() throws InterruptedException {

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(2));

		Thread.sleep(2000);

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
