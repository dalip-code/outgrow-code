package outgrowpackage;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class engagements extends CommonLib {

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
	public static void engagement_check_chicago()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		CommonLib.login();
		CommonLib.openNewTab();
		CommonLib.switchToNewTab();
		driver.navigate().to("https://dcompany878.outgrow.co/builder/dcompany878-6503");

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

	@Test(dependsOnMethods = "engagement_check_chicago")
	public static void engagement_clicked_on_url() throws InterruptedException {
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
		button.click();

		// wait for question 1
		WebDriverWait waitq1 = new WebDriverWait(driver, 20);
		waitq1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		// question 1: option 2
		WebElement q1_option2 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		q1_option2.click();

		// question 2: option 2
		WebElement q2_option2 = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"));
		q2_option2.click();

		Thread.sleep(2000);

		// result page
		String resultpage_a = driver.findElement(By.xpath("//p[normalize-space()='THIS IS THE PAGE HEADING']"))
				.getText();
		String resultpage_e = "THIS IS THE PAGE HEADING";

		Assert.assertEquals(resultpage_a, resultpage_e);

		// click on cta
		driver.findElement(By.xpath("//p[contains(text(),'Click on URL')]")).click();
		driver.switchTo().window(newTb.get(2));
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(newTb.get(1));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='mobile-top-menu']//li[3]//a[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()='User Details']")).click();

		Thread.sleep(3000);

		String click_on_url_text_a = driver
				.findElement(By.xpath("//og-user-details/div[2]/div[1]/table/tbody/tr/td[6]")).getText();
		System.out.println(click_on_url_text_a);

		String click_on_url_text_e = "Clicked on URL";

		Assert.assertEquals(click_on_url_text_a, click_on_url_text_e);

	}

	@Test(dependsOnMethods = "engagement_check_chicago")
	public static void engagement_none()
			throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(2));

		driver.close();

		driver.switchTo().window(newTb.get(1));

		Thread.sleep(2000);

		// URL copied to clipboard.
		driver.findElement(By.xpath("//i[normalize-space()='library_books']")).click();

		// storing clipboard data in variable.
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting

		Thread.sleep(2000);

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();

		driver.get(myText);

		driver.findElement(By.xpath("//strong[contains(text(),'CALCULATOR HEADING GOES HERE')]")).isDisplayed();

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

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

		// question 1: option 2
		WebElement q1_option2 = driver.findElement(By.xpath(
				"//form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label/span"));
		q1_option2.click();

		// question 2: option 2
		WebElement q2_option2 = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"));
		q2_option2.click();

		Thread.sleep(2000);

		// result page
		String resultpage_a = driver.findElement(By.xpath("//p[normalize-space()='THIS IS THE PAGE HEADING']"))
				.getText();
		String resultpage_e = "THIS IS THE PAGE HEADING";

		Assert.assertEquals(resultpage_a, resultpage_e);

		driver.switchTo().window(newTb.get(1));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

		String click_on_url_text_a = driver
				.findElement(By.xpath("//og-user-details/div[2]/div[1]/table/tbody/tr/td[6]")).getText();
		System.out.println(click_on_url_text_a);

		String click_on_url_text_e = "None";

		Assert.assertEquals(click_on_url_text_a, click_on_url_text_e);

	}

	@Test(dependsOnMethods = "engagement_check_chicago")
	public static void engagement_pdf()
			throws HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(2));

		driver.close();

		driver.switchTo().window(newTb.get(1));

		Thread.sleep(2000);

		// URL copied to clipboard.
		driver.findElement(By.xpath("//i[normalize-space()='library_books']")).click();

		// storing clipboard data in variable.
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting

		Thread.sleep(2000);

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();

		driver.get(myText);

		driver.findElement(By.xpath("//strong[contains(text(),'CALCULATOR HEADING GOES HERE')]")).isDisplayed();

		WebElement name = driver.findElement(By.xpath("//input[@id='icon_prefix0']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='icon_prefix1']"));
		WebElement button = driver.findElement(By.xpath("//button[@id='landingBtn']"));

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

		// question 1: option 2
		WebElement q1_option1 = driver.findElement(By.xpath(
				"// form/div[1]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[1]/div[2]/label/span\r\n"
						+ ""));
		q1_option1.click();

		// question 2: option 2
		WebElement q2_option2 = driver.findElement(By
				.xpath("//form/div[2]/div[3]/div/div/div[2]/div/div/control/radio-button/div/div/div[2]/div[2]/label"));
		q2_option2.click();

		Thread.sleep(2000);

		// result page
		String resultpage_a = driver.findElement(By.xpath("//p[normalize-space()='THIS IS THE PAGE HEADING']"))
				.getText();
		String resultpage_e = "THIS IS THE PAGE HEADING";

		Assert.assertEquals(resultpage_a, resultpage_e);

		driver.findElement(By.xpath("//p[normalize-space()='Save as PDF']")).click();

		driver.switchTo().window(newTb.get(1));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

		String click_on_url_text_a = driver
				.findElement(By.xpath("//og-user-details/div[2]/div[1]/table/tbody/tr/td[6]")).getText();
		System.out.println(click_on_url_text_a);

		String click_on_url_text_e = "Clicked on Save as pdf";

		Assert.assertEquals(click_on_url_text_a, click_on_url_text_e);
	}
}
