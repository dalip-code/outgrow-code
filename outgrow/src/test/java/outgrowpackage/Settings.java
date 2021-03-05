package outgrowpackage;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Settings extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, IOException {
		CommonLib.LaunchBrowswer();
		CommonLib.login();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

	@BeforeMethod
	public static void Open_siteup_page_browser() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='navbar-brand navbar-logopadding']//img")).click();
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public static void Verfiytooltip() throws InterruptedException {
		// calculator
		WebElement calculator = driver.findElement(By.xpath("//h3[contains(text(),'Numerical Calculator')]"));
		Actions action_cal = new Actions(driver);
		action_cal.moveToElement(calculator).build().perform();
		Thread.sleep(500);

		// quiz
		WebElement quiz = driver.findElement(By.xpath("// h3[contains(text(),'Outcome Quiz')]"));
		Actions action_quiz = new Actions(driver);
		action_quiz.moveToElement(quiz).build().perform();
		Thread.sleep(500);

		// assessment
		WebElement assessment = driver.findElement(By.xpath("// h3[contains(text(),'Assessment')]"));
		Actions action_assessment = new Actions(driver);
		action_assessment.moveToElement(assessment).build().perform();
		Thread.sleep(500);

		// poll
		WebElement poll = driver.findElement(By.xpath("// h3[contains(text(),'Poll')]"));
		Actions action_poll = new Actions(driver);
		action_poll.moveToElement(poll).build().perform();
		Thread.sleep(500);

		// ecomm recommendations
		WebElement recommendation = driver.findElement(By.xpath("//h3[contains(text(),'eCommerce Recommendation')]"));
		Actions action_recommendation = new Actions(driver);
		action_recommendation.moveToElement(recommendation).build().perform();
		Thread.sleep(500);

		WebElement chatbot = driver.findElement(By.xpath("// h3[contains(text(),'Chatbot')]"));
		Actions action_chatbot = new Actions(driver);
		action_chatbot.moveToElement(chatbot).build().perform();
		Thread.sleep(500);

		WebElement giveaway = driver.findElement(By.xpath("//h3[contains(text(),'Giveaway')]"));
		Actions action_giveaway = new Actions(driver);
		action_giveaway.moveToElement(giveaway).build().perform();
		Thread.sleep(500);

		WebElement form = driver.findElement(By.xpath("//h3[contains(text(),'Form')]"));
		Actions action_form = new Actions(driver);
		action_form.moveToElement(form).build().perform();
		Thread.sleep(500);

	}

	@Test(priority = 2)
	public static void add_folder() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='arrn']//a[contains(text(),'Add Folder')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inputCollectionName']")));

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		driver.findElement(By.xpath("//input[@id='inputCollectionName']")).sendKeys("New folder " + random_no);
		driver.findElement(By.xpath("//button[@id='btnAddFolder']")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Folder created Successfully!')]")));

		String folderExpectedMsg = "Folder created Successfully!";
		String folderActualMsg = driver.findElement(By.xpath("//span[contains(text(),'Folder created Successfully!')]"))
				.getText();
		Assert.assertEquals(folderActualMsg, folderExpectedMsg);
		System.out.println("assertion passed for success message for adding new folder");
		Thread.sleep(1500);
	}

	@Test(priority = 3)
	public static void VerifyBillingSettingPage() throws InterruptedException {
		WebElement img = driver.findElement(By.xpath("//span[@class='person-img']"));
		WebElement logout_link = driver.findElement(By.xpath(
				"//a[@class='hvr-sweep-to-right']//span[@class='name-list-title'][contains(text(),'Billing & Settings')]"));
		Actions action = new Actions(driver);

		action.moveToElement(img).moveToElement(logout_link).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='col-md-8 col-sm-8 col-xs-6 np']//h6[contains(text(),'Subscription')]")));
		Thread.sleep(1000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);

	}

	@Test(priority = 4)
	public static void VerifyTeamSettingPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//li[@id='teamSet']//h6[contains(text(),'Team Settings')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='col-md-8 col-sm-10 col-xs-12 np']//h6[contains(text(),'Team Settings')]")));
		Thread.sleep(1000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);
	}

	@Test(priority = 5)
	public static void VerifyMyAccountPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//li[@id='accSet']//h6[contains(text(),'My Account')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='col-md-8 col-sm-10 col-xs-12 np']//h6[contains(text(),'My Account')]")));
		Thread.sleep(1000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(3000);

		// update the account details
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.clear();
		name.sendKeys("Dalip name updated");

		Thread.sleep(2000);

		WebElement button_save = driver.findElement(By.xpath("//button[@id='saveBasicDetails']"));
		button_save.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Basic Details Updated!')]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='toast']//i[@class='material-icons'][contains(text(),'clear')]"))
				.click();

		Thread.sleep(1000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);

	}

	@Test(priority = 6)
	public static void VerifyManagecompanyPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//li[@id='compSet']//h6[contains(text(),'Manage Companies')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='companyLists']//h6[contains(text(),'Companies')]")));
		Thread.sleep(1000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);

	}

	@Test(priority = 7)
	public static void VerifyGdprPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//div[@id='lgScrSideNavbar']//h6[contains(text(),'GDPR')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h6[contains(text(),'General Data Protection Regulation')]")));
		Thread.sleep(2000);

//		Actions action = new Actions(driver);
//		WebElement go1 = driver.findElement(By.xpath("//span[@class='onoffswitch-inner']"));
//		action.moveToElement(go1).click().build().perform();
//		
//		//CommonLib.scrolling_to_bottom();
//		Thread.sleep(5000);
		// Assigned elsewhere
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.document.getElementById('myonoffswitch22').click()");

		Thread.sleep(5000);

	}

	@Test(priority = 8)
	public static void VerifyApiKeyPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//li[@id='apiKey']//h6[contains(text(),'API Key')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@class='col-md-8 col-sm-10 col-xs-12 np api-keyoutr']//h6[contains(text(),'API Key')]")));
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);

	}

	@Test(priority = 9)
	public static void VerifyGlobalWebhookPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//li[@id='gwebhook']//h6[contains(text(),'Global Webhook')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='w100']//h6[contains(text(),'Global Webhook')]")));
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);

	}

	@Test(priority = 10)
	public static void VerifyCustomDomainPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//li[@id='customDomain']//h6[contains(text(),'Custom Domain')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[@class='CD-heading']")));
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);

	}

	@Test(priority = 11)
	public static void VerifyEmailSettingPage() throws InterruptedException {
		VerifyBillingSettingPage();

		driver.findElement(By.xpath("//li[@id='email-settings']//h6[contains(text(),'Email Settings')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h6[contains(text(),'Email Gateway settings')]")));
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='emailSettings']//a[contains(text(),'Email Notification')]")).click();

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		CommonLib.scrolling_to_bottom();
		Thread.sleep(1000);
	}

	// @Test(priority = 12)
	public static void Verify_Analytic_page() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'Analytics')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h6[contains(text(),'Showing analytics for')]")));
		Thread.sleep(6000);
	}

}
