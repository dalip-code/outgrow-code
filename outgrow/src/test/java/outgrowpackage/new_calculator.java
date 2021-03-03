package outgrowpackage;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class new_calculator extends CommonLib {

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
	public static void calculator_chicago() throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {
		driver.get("http://app.outgrow.co/login");
		WebElement email = driver.findElement(By.xpath("//input[@id='login_email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='login_password']"));

		email.sendKeys("dalip.kumar@venturepact.com");
		password.sendKeys("defaultPassword");

		CaptureScreenshotlogin("credentials");
		driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Select Your Account')]")));

		CaptureScreenshotlogin("select_company");

//		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
//		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		CaptureScreenshotlogin("select company bottom");

		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'dcompany')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		driver.findElement(By.xpath("//h3[contains(text(),'dcompany')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='align-center']")));

		String urlDashboard = driver.getCurrentUrl();

		System.out.println(urlDashboard);

		Thread.sleep(6000);

		CaptureScreenshotlogin("dashboard");
		driver.findElement(By.xpath("//h3[normalize-space()='Numerical Calculator']")).click();

		WebDriverWait wait_cal = new WebDriverWait(driver, 30);
		wait_cal.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//h3[contains(text(),'Select a design layout and build your Calculator f')]")));

		driver.findElement(By.xpath(
				"//div[@class='col-md-6 col-sm-6 col-xs-12 temp-demo-outer one-page-card-new']//button[@type='button'][normalize-space()='Use Layout']"))
				.click();

		WebDriverWait wait_builder = new WebDriverWait(driver, 60);
		wait_builder.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@class='active'][contains(text(),'Build')]")));

		String builder_url = driver.getCurrentUrl();
		System.out.println(builder_url);

		Thread.sleep(3000);

		Actions action = new Actions(driver);
		WebElement go1 = driver.findElement(By.xpath("//button[@class='btn btn-basic my-custom-dropdown']"));
		WebElement go2 = driver.findElement(By.xpath("//button[@class='btn btn-basic']"));
		action.moveToElement(go1).moveToElement(go2).click().build().perform();

		driver.findElement(By.xpath("//button[@class='btn btn-basic']")).click();
		Thread.sleep(10000);

		WebDriverWait wait_modal = new WebDriverWait(driver, 60);
		wait_modal.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Your Calculator Is Now LIVE')]")));

		String text = driver.findElement(By.xpath("//div[contains(text(),'Your Calculator Is Now LIVE')]")).getText();
		System.out.println(text);

		driver.findElement(
				By.xpath("//div[@id='publish-upgrade']//i[@class='material-icons'][normalize-space()='close']"))
				.click();

		// text copied to clipboard.
		driver.findElement(By.xpath("//i[normalize-space()='library_books']")).click();

		// storing clipboard data in variable.
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting

		System.out.println(myText);
		// the
	//	driver.navigate().to(myText);

		Thread.sleep(5000);
	}
	
	

}
