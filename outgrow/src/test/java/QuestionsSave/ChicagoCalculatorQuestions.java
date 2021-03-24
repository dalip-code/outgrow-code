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

		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='text input alpha numeric q1']")));

		WebElement textInputAlphaNumeric_q1 = driver.findElement(
				By.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		textInputAlphaNumeric_q1.sendKeys("abc123");

		WebElement ContinueButton_q1 = driver
				.findElement(By.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/button"));

		ContinueButton_q1.click();

		WebElement textInputNumeric_q2 = driver.findElement(
				By.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));

		textInputNumeric_q2.sendKeys("abc123");

		WebElement ContinueButton_q2 = driver.findElement(By.xpath(
				"//div[@class='slide_1 sec_0_q_1']//button[@class='button_textfield submit-textbox-btnresp ripple-light'][normalize-space()='Continue']"));

		ContinueButton_q2.click();

		WebElement textInputEmail_q3 = driver.findElement(
				By.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));

		textInputEmail_q3.sendKeys("test1@test.com");

		driver.findElement(By.xpath(
				"//div[@class='slide_2 sec_0_q_2']//button[@class='button_textfield submit-textbox-btnresp ripple-light'][normalize-space()='Continue']"))
				.click();

		WebElement textInputPlaces_q4 = driver.findElement(
				By.xpath("//form/div[4]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));

		textInputPlaces_q4.sendKeys("Jalandhar, Punjab, India");

		driver.findElement(By.xpath(
				"//div[@class='slide_3 sec_0_q_3']//button[@class='button_textfield submit-textbox-btnresp ripple-light'][normalize-space()='Continue']"))
				.click();

		Thread.sleep(1500);

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

		System.out.println(q1_answer);
		System.out.println(q2_answer);
		System.out.println(q3_answer);
		System.out.println(q4_answer);

	}

}
