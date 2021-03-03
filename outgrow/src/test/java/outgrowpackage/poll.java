package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class poll extends CommonLib {

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
	public static void chicago_poll() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-4075");
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//span[normalize-space()='BUTTON TEXT']"));

		name.clear();
		name.sendKeys("dalip");
		Thread.sleep(1000); 
		email.clear();
		email.sendKeys("dalip.kumar@venturepact.com");
		Thread.sleep(1000);
		button.click();

		// question 1 : option 2

		WebDriverWait wait_q1 = new WebDriverWait(driver, 30);
		wait_q1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='t1-ques-head']//div//p[contains(text(),'Question title goes here q1')]")));
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span[2]"))
				.click();

		// question 2 : option 3

		WebDriverWait wait_q2 = new WebDriverWait(driver, 30);
		wait_q2.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='t1-ques-head']//div//p[contains(text(),'Question title goes here q2')]")));
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[3]/div[2]/label/span[2]"))
				.click();

		Thread.sleep(1000);

		// question 3 : option 5

		WebDriverWait wait_q3 = new WebDriverWait(driver, 30);
		wait_q3.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='t1-ques-head']//div//p[contains(text(),'Question title goes here q3')]")));
		Thread.sleep(1000);

		WebElement element = driver.findElement(By
				.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[5]/div[2]/label"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		driver.findElement(By
				.xpath("//form/div[3]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[5]/div[2]/label"))
				.click();

		Thread.sleep(1000);

		String poll_expected_text1 = "Of participants agree with you! ";
		String poll_actual_text1 = driver.findElement(By.xpath("//div[@class='small-top-sec header']//p[1]")).getText();
		Assert.assertEquals(poll_actual_text1, poll_expected_text1);
		System.out.println(poll_actual_text1);

		Thread.sleep(2000);

		String poll_expected_text2 = "Of participants agree with you! ";
		String poll_actual_text2 = driver.findElement(By.xpath("//div[@class='small-bot-sec']//p[1]")).getText();
		Assert.assertEquals(poll_actual_text2, poll_expected_text2);
		
//		WebElement element_q1 = driver.findElement(By
//				.xpath("//h6[@class='question-title']//p[contains(text(),'Question title goes here q1')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		Thread.sleep(5000);
		
		

		

	}
}