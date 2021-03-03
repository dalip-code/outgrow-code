package outgrowpackage;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Progress_later extends CommonLib {

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
	public static void Open_siteup_page_browser() throws InterruptedException {
		driver.get("https://livec.rely.co/CALCULATOR-FALLBACK");

	}
	
	

	@Test(priority = 2)
	public static void logic_jump_single_condition_question_first_to_third_question()
			throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {

		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));

		driver.findElement(By.xpath("//span[contains(text(),'BUTTON TEXT')]")).click();

		driver.findElement(
				By.xpath("//div[@class='gdpr-popup']//a[@class='gdrp-accept'][contains(text(),'Accept and Close')]"))
				.click();

		driver.findElement(
				By.xpath("//div[@class='check-comp ng-untouched ng-pristine ng-valid']//div[1]//div[2]//label[1]"))
				.click();

		driver.findElement(By.xpath("//input[@id='5f71c198b91c24000e1d61f7']")).sendKeys("123");

		driver.findElement(By.xpath("//button[@class='button_textfield submit-textbox-btnresp ripple-light']")).click();

		WebElement calculator = driver.findElement(
				By.xpath("//div[@class='result-branding page_1 Questionnaire']//div[@class='stickyfooter']"));
		Actions action_cal = new Actions(driver);
		action_cal.moveToElement(calculator).build().perform();

		WebElement pop_up_text = driver.findElement(By
				.xpath("//div[@class='result-branding page_1 Questionnaire']//span[contains(text(),'Save Progress')]"));
		Actions action = new Actions(driver);

		action.moveToElement(pop_up_text).click().build().perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("dalip.kumar@venturepact.com");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//button[@class='submit-checkbox ']")).click();

		Thread.sleep(3000);

		// text copied to clipboard.
		driver.findElement(By.xpath("//button[contains(text(),'Get Sharable Link')]")).click(); 
		
		// storing clipboard data in variable.
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting
		
																													// the
		driver.navigate().to(myText);

		Thread.sleep(12000);

	}
}
