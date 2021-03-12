package outgrowpackage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import com.google.j2objc.annotations.ReflectionSupport.Level;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonLib {

	public static WebDriver driver = null;

	// code for running selenium tests on browser stack cloud.
	// public static final String USERNAME = "tarun156";
	// public static final String AUTOMATE_KEY = "Vq4cZ9X7qrKGVjcGjvbL";
	// public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +
	// "@hub-cloud.browserstack.com/wd/hub";

	public static void LaunchBrowswer() throws InterruptedException, MalformedURLException {

//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("os", "Windows");
//		caps.setCapability("os_version", "10");
//		caps.setCapability("browser", "Chrome");
//		caps.setCapability("browser_version", "87.0");
//		caps.setCapability("name", "New calc");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("name", "logic jump tests");
//		driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		// BasicConfigurator.configure();
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		WebDriverManager.chromedriver().setup();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		// driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		// ChromeOptions handlingSSL = new ChromeOptions();
		// Using the accept insecure certificate method with true as parameter to accept
		// untrusted certificate
		// handlingSSL.setAcceptInsecureCerts(true);

		// Creating instance of Chrome driver by passing reference of ChromeOptions
		// driver = new ChromeDriver(handlingSSL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		// driver.manage().window().setSize(new Dimension(360, 600));
		driver.manage().deleteAllCookies();
	}

	public static void closeBrowser() throws InterruptedException {
		driver.close();
	}

	public static void quitDriver() throws InterruptedException {
		driver.quit();
	}

	public static void CaptureScreenshotlogin(String filename) throws IOException {

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Login/" + filename + random_no + ".png");
		Files.copy(src, dest);

	}

	public static void CaptureScreenshotreg(String filename) throws IOException {

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Registration/" + filename + random_no + ".png");
		Files.copy(src, dest);

	}

	public static void CaptureScreenshotContents(String filename) throws IOException {

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Content/" + filename + random_no + ".png");
		Files.copy(src, dest);

	}

	public static void CaptureScreenshotLogicJump(String filename) throws IOException {

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/LogicJump/" + filename + random_no + ".png");
		Files.copy(src, dest);

	}

	public static void CaptureScreenshotAssessment_ak(String filename) throws IOException {

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Assessment_AK/" + filename + random_no + ".png");
		Files.copy(src, dest);

	}

	public static void CaptureScreenshotResultPageTable(String filename) throws IOException {

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Result_Page_Table/" + filename + random_no + ".png");
		Files.copy(src, dest);

	}

	public static void CaptureScreenshotSave_mechanism(String filename) throws IOException {

		Random randomLeadGenerator = new Random();
		int random_no = randomLeadGenerator.nextInt(10000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Save_mechanism/" + filename + random_no + ".png");
		Files.copy(src, dest);

	}

	public static void login() throws IOException, InterruptedException {

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

		// JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		// js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// CaptureScreenshotlogin("select company bottom");

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

		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// js.executeScript("window.scrollBy(0,1000)");
		CaptureScreenshotlogin("dashboard bottom");
	}

	public static void login_logout() throws InterruptedException, IOException {

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

		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CaptureScreenshotlogin("select company bottom");

		driver.findElement(By.xpath("//h3[contains(text(),'hello')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='align-center']")));

		String urlDashboard = driver.getCurrentUrl();

		System.out.println(urlDashboard);

		Thread.sleep(3000);

		CaptureScreenshotlogin("dashboard");

		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// js.executeScript("window.scrollBy(0,1000)");
		CaptureScreenshotlogin("dashboard bottom");
		logout();
		CaptureScreenshotlogin("logout");

	}

	public static void logout() throws InterruptedException {
		Thread.sleep(1000);
		WebElement img = driver.findElement(By.xpath("//span[@class='person-img']"));
		WebElement logout_link = driver.findElement(By
				.xpath("//a[@class='hvr-sweep-to-right']//span[@class='name-list-title'][contains(text(),'Logout')]"));
		Actions action = new Actions(driver);

		action.moveToElement(img).moveToElement(logout_link).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Welcome Back')]")));

	}

	public static void scrolling_to_bottom() {
		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrolling_to_top() {
		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

	public static void openNewTab() {
		((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
	}

	public static void switchToNewTab() {
		// openNewTab();
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles();
		java.util.Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler);
	}

}
