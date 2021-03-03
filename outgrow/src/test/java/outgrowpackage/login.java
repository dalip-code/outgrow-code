package outgrowpackage;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login extends CommonLib {
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
		driver.get("https://app.outgrow.co/login");
	}

	@Test
	public static void test_01_login_title_test() throws InterruptedException, IOException {

		CommonLib.CaptureScreenshotlogin("Login page");
		String actualTitle = driver.getTitle();
		String ExpectedTitle = "Outgrow | Login";
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.println(driver.getCurrentUrl());
		System.out.println("assertion passed for Login page title");

	}

	@Test
	public static void test_02_login_validate_email_test() throws InterruptedException, IOException {

		WebElement email = driver.findElement(By.xpath("//input[@id='login_email']"));
		email.sendKeys("user");

		String expectedEmailValidation1 = "Invalid Email.";
		String actualEmailValidation1 = driver.findElement(By.xpath("//p[contains(text(),'Invalid Email.')]"))
				.getText();

		driver.findElement(By.xpath("//div[@class='form-group input-danger-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();
		Assert.assertEquals(actualEmailValidation1, expectedEmailValidation1);

		CommonLib.CaptureScreenshotlogin("email_validation_for_wrong_email_one_");
		driver.findElement(By.xpath("//div[@class='form-group input-danger-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		Thread.sleep(3000);
		System.out.println("assertion passed for wrong email validation");

		email.clear();
		email.sendKeys("user@gmail.com");

		driver.findElement(By.xpath("//div[@class='form-group input-success-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		CommonLib.CaptureScreenshotlogin("email_validation_correct_email_two");
		Thread.sleep(3000);
		System.out.println("assertion passed for correct email validation");

	}

	@Test
	public static void test_03_login_validate_password_test() throws InterruptedException, IOException {

		WebElement password = driver.findElement(By.xpath("//input[@id='login_password']"));
		password.sendKeys("Passwor");

		String expectedPasswordValidation1 = "Min 8 characters are required.";
		String actualPasswordValidation1 = driver
				.findElement(By.xpath("//p[contains(text(),'Min 8 characters are required.')]")).getText();
		Assert.assertEquals(actualPasswordValidation1, expectedPasswordValidation1);

		CommonLib.CaptureScreenshotlogin("password_validation_wrong_password_one");
		Thread.sleep(1500);
		System.out.println("assertion passed for Password validation one");

		password.clear();
		password.sendKeys("Password");

		driver.findElement(By.xpath("//div[@class='form-group input-success-msg']//span[@class='input-icon-msg']"))
				.isDisplayed();

		CommonLib.CaptureScreenshotlogin("Password_validation_correct_password_two");
		Thread.sleep(1500);
		System.out.println("assertion passed for Password validation two");

	}

	@Test
	public static void test_04_login_validate_email_and_password_together_show_password_test()
			throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.xpath("//input[@id='login_email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='login_password']"));

		email.sendKeys("user@gmail.com");
		password.sendKeys("password");

		driver.findElement(By.xpath("//div[@class='slide-outer slide-1']//div[1]//div[1]//span[2]")).isDisplayed();

		driver.findElement(By.xpath("//div[@class='form-outer']//div[2]//div[1]//span[2]")).isDisplayed();

		CommonLib.CaptureScreenshotlogin("email_password_correct_details");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//span[@class='mdi mdi-eye-off-outline password-on ng-star-inserted']")).click();
		CommonLib.CaptureScreenshotlogin("show_password_");

		Thread.sleep(1500);

	}

	@Test
	public static void test_05_login_forgot_password_test() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//a[@class='forgot-link']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Forgot Password')]")));

		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String ExpectedTitle = "Outgrow | Forget Password";
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.println(driver.getCurrentUrl());
		System.out.println("assertion passed for forgot page title");
		System.out.println("------------------------");

		String ExpectedHeading1 = "Forgot Password";
		String ActualHeading1 = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Password')]")).getText();
		Assert.assertEquals(ActualHeading1, ExpectedHeading1);
		System.out.println("assertion passed for heading 1");
		System.out.println("------------------------");

		String ExpectedHeading2 = "No strings attached and no credit card required.";
		String ActualHeading2 = driver
				.findElement(By.xpath("//span[contains(text(),'No strings attached and no credit card required.')]"))
				.getText();
		Assert.assertEquals(ActualHeading2, ExpectedHeading2);
		System.out.println("assertion passed for heading 2");
		CommonLib.CaptureScreenshotlogin("forgot_password");
		System.out.println("------------------------");

	}

	@Test
	public static void test_06_login_validate_login_success_test() throws InterruptedException, IOException {

		WebElement email = driver.findElement(By.xpath("//input[@id='login_email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='login_password']"));

		email.sendKeys("dalip.kumar@venturepact.com");
		password.sendKeys("defaultPassword");

		driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();

		Thread.sleep(1500);

		// locate login button and hit enter
		driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Select Your Account')]")));

		CommonLib.CaptureScreenshotlogin("select_company");

		driver.findElement(By.xpath("//h3[contains(text(),'hello')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='align-center']")));

		Thread.sleep(2000);

		String urlDashboard = driver.getCurrentUrl();
		System.out.println(urlDashboard);

		Thread.sleep(2000);
		CommonLib.CaptureScreenshotlogin("dashboard");
		CommonLib.logout();
	}

	//@Test
	public static void test_07_login_validate_login_logout_success_test() throws InterruptedException, IOException {
		CommonLib.login_logout();
	}

}
