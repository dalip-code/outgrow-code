package outgrowpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signup extends CommonLib {

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
		driver.get("https://app.outgrow.co/signup");
	}

	@Test(priority = 1)
	public static void test_01_signup_title_test() throws InterruptedException, IOException {

		CaptureScreenshotreg("Registration page");
		String actualTitle = driver.getTitle();
		String ExpectedTitle = "Outgrow | Signup";
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.println(driver.getCurrentUrl());
		System.out.println("assertion passed for signup page title");

	}

	@Test(priority = 2)
	public static void test_02_signup_logo_isdisplayed_test() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//img[@class='login-logo rs-hide ng-tns-c31-0']")).isDisplayed();
		System.out.println("assertion passed for logo");

	}

	@Test(priority = 3)
	public static void test_03_signup_field_label__test() throws InterruptedException {

		String emailexpectedLabel = "WORK EMAIL ADDRESS";
		String emailActualLabel = driver.findElement(By.xpath("//label[contains(text(),'Work Email Address')]"))
				.getText();
		Assert.assertEquals(emailActualLabel, emailexpectedLabel);
		System.out.println("assertion passed for email label");

		String passwordexpectedLabel = "PASSWORD";
		String passwordActualLabel = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getText();
		Assert.assertEquals(passwordActualLabel, passwordexpectedLabel);
		System.out.println("assertion passed for password label");

		String companyexpectedLabel = "COMPANY NAME";
		String companyActualLabel = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]")).getText();
		Assert.assertEquals(companyActualLabel, companyexpectedLabel);
		System.out.println("assertion passed for company label");

	}

	@Test(priority = 4)
	public static void test_04_signup_heading_test() throws InterruptedException {

		String heading1expectedLabel = "Start your 7 day free trial";
		String heading1ActualLabel = driver
				.findElement(By.xpath("//h1[contains(text(),'Start your 7 day free trial')]")).getText();
		Assert.assertEquals(heading1ActualLabel, heading1expectedLabel);
		System.out.println("assertion passed for heading1");

		String heading2expectedLabel = "No strings attached and no credit card required.";
		String heading2ActualLabel = driver
				.findElement(By.xpath("//span[contains(text(),'No strings attached and no credit card required.')]"))
				.getText();
		Assert.assertEquals(heading2ActualLabel, heading2expectedLabel);
		System.out.println("assertion passed for heading2");

	}

	@Test(priority = 5)
	public static void test_05_signup_validate_email_test() throws InterruptedException, IOException {

		WebElement email = driver.findElement(By.xpath("//input[@id='signup_email']"));
		email.sendKeys("user");

		String expectedEmailValidation1 = "Invalid Email.";
		String actualEmailValidation1 = driver.findElement(By.xpath("//p[contains(text(),'Invalid Email.')]"))
				.getText();
		Assert.assertEquals(actualEmailValidation1, expectedEmailValidation1);

		CommonLib.CaptureScreenshotreg("email_validation_for_wrong_email_one_");
		driver.findElement(By.xpath("//div[@class='form-group input-danger-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		Thread.sleep(3000);
		System.out.println("assertion passed for wrong email validation");

		email.clear();
		email.sendKeys("user@gmail.com");

		driver.findElement(By.xpath("//div[@class='form-group input-success-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		CommonLib.CaptureScreenshotreg("email_validation_correct_email_two");
		Thread.sleep(3000);
		System.out.println("assertion passed for correct email validation");

	}

	@Test(priority = 6)
	public static void test_06_signup_validate_password_test() throws InterruptedException, IOException {

		WebElement password = driver.findElement(By.xpath("//input[@id='signup_password']"));
		password.sendKeys("Password@");

		String expectedPasswordValidation1 = "Password must be 8 characters long, Maximum 48 Characters, should contain at least 1 uppercase, 1 lowercase, 1 numeric & 1 special character.";
		String actualPasswordValidation1 = driver
				.findElement(By.xpath("//p[contains(text(),'Password must be 8 characters long, Maximum 48 Cha')]"))
				.getText();
		Assert.assertEquals(actualPasswordValidation1, expectedPasswordValidation1);

		CommonLib.CaptureScreenshotreg("password_validation_wrong_password_one");
		Thread.sleep(3000);
		System.out.println("assertion passed for Password validation one");

		password.clear();
		password.sendKeys("Password@123");

		driver.findElement(By.xpath("//div[@class='form-group input-success-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		CommonLib.CaptureScreenshotreg("Password_validation_correct_password_two");
		Thread.sleep(3000);
		System.out.println("assertion passed for Password validation two");

	}

	@Test(priority = 7)
	public static void test_07_signup_validate_client_Side_company_test() throws InterruptedException, IOException {

		// special character in company name
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("company#");
		driver.findElement(
				By.xpath("//div[@class='form-group signup-field input-danger-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();
		String expectedCompanyValidation1 = "Please remove any special characters. Minimum 2 characters are required.";
		String actualCompanyValidation1 = driver
				.findElement(By.xpath("//p[contains(text(),'Please remove any special characters. Minimum 2 ch')]"))
				.getText();
		Assert.assertEquals(actualCompanyValidation1, expectedCompanyValidation1);
		CommonLib.CaptureScreenshotreg("company_validation_one_");
		Thread.sleep(2000);
		System.out.println("assertion passed for company validation one");
		System.out.println("-------------------------------------------");

		// valid company name
		company.clear();
		company.sendKeys("company");
		driver.findElement(
				By.xpath("//div[@class='form-group signup-field input-success-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();
		CommonLib.CaptureScreenshotreg("company_validation_two_");
		Thread.sleep(2000);
		System.out.println("assertion passed for company validation two");
		System.out.println("-------------------------------------------");

		// valid company name
		company.clear();
		company.sendKeys("c");
		driver.findElement(
				By.xpath("//div[@class='form-group signup-field input-danger-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();
		String expectedCompanyValidation3 = "Minimum 2 characters.";
		String actualCompanyValidation3 = driver.findElement(By.xpath("//p[contains(text(),'Minimum 2 characters.')]"))
				.getText();
		Assert.assertEquals(actualCompanyValidation3, expectedCompanyValidation3);
		System.out.println("assertion passed for company validation three");
		System.out.println("-------------------------------------------");
		Thread.sleep(2000);

		// valid company name with spaces
		Random randomLeadGenerator = new Random();
		int randomInt = randomLeadGenerator.nextInt(10000);

		WebElement email = driver.findElement(By.xpath("//input[@id='signup_email']"));
		email.sendKeys("user" + randomInt + "@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='signup_password']"));
		password.sendKeys("Password@123");

		company.clear();
		company.sendKeys("c   ");

		driver.findElement(By.xpath("//div[@class='slide-outer slide-1']//div[1]//div[1]//span[2]")).isDisplayed();

		driver.findElement(By.xpath("//div[@class='form-outer']//div[2]//div[1]//span[2]")).isDisplayed();

		driver.findElement(
				By.xpath("//div[@class='form-group signup-field input-success-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		driver.findElement(By.xpath("//span[contains(text(),'GET STARTED')]")).click();

		String expectedCompanyValidation4 = "Company Name must be minimum of 2 characters";
		String actualCompanyValidation4 = driver.findElement(By.xpath("//span[@id='server-error-msg']")).getText();
		Assert.assertEquals(actualCompanyValidation4, expectedCompanyValidation4);
		System.out.println("assertion passed for company validation four");
		System.out.println("-------------------------------------------");
		Thread.sleep(2000);

	}

	@Test(priority = 8)
	public static void test_08_signup_validate_server_Side_duplicate_email_test()
			throws InterruptedException, IOException {

		// duplicate email id

		WebElement email = driver.findElement(By.xpath("//input[@id='signup_email']"));
		email.sendKeys("dalip.kumar@venturepact.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='signup_password']"));
		password.sendKeys("Password@123");

		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.clear();
		company.sendKeys("new company");

		driver.findElement(By.xpath("//div[@class='slide-outer slide-1']//div[1]//div[1]//span[2]")).isDisplayed();

		driver.findElement(By.xpath("//div[@class='form-outer']//div[2]//div[1]//span[2]")).isDisplayed();

		driver.findElement(
				By.xpath("//div[@class='form-group signup-field input-success-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		driver.findElement(By.xpath("//span[contains(text(),'GET STARTED')]")).click();

		String expectedCompanyValidation4 = "Email is already registered with us, please log in!";
		String actualCompanyValidation4 = driver.findElement(By.xpath("//span[@id='server-error-msg']")).getText();
		Assert.assertEquals(actualCompanyValidation4, expectedCompanyValidation4);
		System.out.println("assertion passed for company validation duplicate email");
		System.out.println("-------------------------------------------");
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public static void test_09_signup_account_creation_test() throws InterruptedException, IOException {

		Random randomLeadGenerator = new Random();
		int randomInt = randomLeadGenerator.nextInt(100000);

		WebElement email = driver.findElement(By.xpath("//input[@id='signup_email']"));
		String email_value = "user" + randomInt + "@test.com";
		email.sendKeys(email_value);
		System.out.println(email_value);

		WebElement password = driver.findElement(By.xpath("//input[@id='signup_password']"));
		String password_value = "Password@" + randomInt;
		password.sendKeys(password_value);
		System.out.println(password_value);

		WebElement companyName = driver.findElement(By.xpath("//input[@id='company']"));
		String companyName_value = "Company" + randomInt;
		companyName.clear();
		companyName.sendKeys(companyName_value);
		System.out.println(companyName_value);

		CommonLib.CaptureScreenshotreg("Signup_form");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'GET STARTED')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//h2[contains(text(),\"Hey! I'm going to help you get started with 2 quic\")]")));

		System.out.println(driver.getCurrentUrl());
		CommonLib.CaptureScreenshotreg("Signup_redirection");

		Thread.sleep(3000);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='opt-outer mr15']//img")));
		CommonLib.CaptureScreenshotreg("Signup_redirection2_");
		driver.findElement(By.xpath("//div[@class='opt-outer mr15']//img")).click();

		driver.findElement(
				By.xpath("//li[@class='active']//a[@class='link-btn-filled'][contains(text(),'Select Content')]"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@class='active'][contains(text(),'Build')]")));

		CommonLib.CaptureScreenshotreg("builder");
		CommonLib.logout();
		CommonLib.CaptureScreenshotreg("logout");
		
	}

	@Test(priority = 10, enabled = true)
	public static void duplicate_company_name() throws InterruptedException {

		Random randomLeadGenerator = new Random();
		int randomInt = randomLeadGenerator.nextInt(100000);

		WebElement email = driver.findElement(By.xpath("//input[@id='signup_email']"));
		String email_value = "user" + randomInt + "@test.com";
		email.sendKeys(email_value);
		System.out.println(email_value);

		WebElement password = driver.findElement(By.xpath("//input[@id='signup_password']"));
		String password_value = "Password@" + randomInt;
		password.sendKeys(password_value);
		System.out.println(password_value);

		WebElement companyName = driver.findElement(By.xpath("//input[@id='company']"));
		String companyName_value = "dcompany";
		companyName.clear();
		companyName.sendKeys(companyName_value);
		System.out.println(companyName_value);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'GET STARTED')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//h2[contains(text(),\"Hey! I'm going to help you get started with 2 quic\")]")));

		System.out.println(driver.getCurrentUrl());

		String company_plus_int = driver.getCurrentUrl();

		int a = company_plus_int.indexOf("y");
		int b = company_plus_int.indexOf(".");
		String added_to_url = company_plus_int.substring(a + 1, b);

		int i = Integer.parseInt(added_to_url);

		System.out.println(i);

		if (i > 0 && i <= 999) {

			Thread.sleep(3000);
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='opt-outer mr15']//img")));

			driver.findElement(By.xpath("//div[@class='opt-outer mr15']//img")).click();

			driver.findElement(
					By.xpath("//li[@class='active']//a[@class='link-btn-filled'][contains(text(),'Select Content')]"))
					.click();

			WebDriverWait wait3 = new WebDriverWait(driver, 60);
			wait3.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//a[@class='active'][contains(text(),'Build')]")));

			CommonLib.logout();

			Thread.sleep(3000);

		} else {

			String aa = "abc";
			String bb = "pqr";
			Assert.assertEquals(aa, bb);

		}
	}

}
