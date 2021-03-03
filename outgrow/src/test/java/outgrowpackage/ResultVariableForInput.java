package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ResultVariableForInput extends CommonLib {

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
	public static void ResultVariableForInputChicago() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-6242");
		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Question title goes here 1']")));

		// question 1 : option 1
		driver.findElement(By
				.xpath("//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label"))
				.click();

		// question 2 : option 1
		driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span"))
				.click();

		// question 3 : option 1
		driver.findElement(
				By.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/checkbox/div/div/div[1]/label/span"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='submit-checkbox-img ripple-light enterBtn']")).click();

		Thread.sleep(3000);

		// question 4

		WebElement q4 = driver.findElement(
				By.xpath("//form/div[4]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		String value_q4_a = q4.getAttribute("value");

		driver.findElement(By.xpath("//form/div[4]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/button"))
				.click();

		Thread.sleep(3000);

		// question 5

		WebElement q5 = driver.findElement(
				By.xpath("//form/div[5]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		String value_q5_a = q5.getAttribute("value");

		driver.findElement(By.xpath("//form/div[5]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/button"))
				.click();

		Thread.sleep(3000);

		// question 6

		WebElement q6 = driver.findElement(
				By.xpath("//form/div[6]/div[3]/div/div/div[2]/div/div/control/textfield/div/div/div/input"));
		String value_q6_a = q6.getAttribute("value");

		Thread.sleep(3000);

		String value_q4_e = "6";
		String value_q5_e = "60";
		String value_q6_e = "180";

		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(value_q4_a, value_q4_e);
		softAssertion.assertEquals(value_q5_a, value_q5_e);
		softAssertion.assertEquals(value_q6_a, value_q6_e);
		softAssertion.assertAll();
	}

}
