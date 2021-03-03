package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Conditional_Messaging extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();
	}
 
	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}


	@Test(priority = 1)
	public static void condition1() throws InterruptedException {
		// score 0
		
		driver.get("https://komaldhillon28.outgrow.us/komaldhillon28-5780");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Button text')]")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='gdrp-accept']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Button text')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2a96']"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2aa5']"))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2ab4']"))
				.click();

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your heading goes here')]")));

		CommonLib.scrolling_to_bottom();
		Thread.sleep(3000);

		String expectedResult1 = "You have scored 0/3. ZERO";
		String ActualResult1 = driver.findElement(By.xpath("//p[contains(text(),'You have scored')]")).getText();
		Assert.assertEquals(ActualResult1, expectedResult1);
	}

	@Test(priority = 2)
	public static void condition2() throws InterruptedException {
		
		driver.get("https://komaldhillon28.outgrow.us/komaldhillon28-5780");
		// score 1

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Button text')]")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Button text')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2a98']"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2aa5']"))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2ab4']"))
				.click();

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your heading goes here')]")));

		CommonLib.scrolling_to_bottom();
		Thread.sleep(3000);

		String expectedResult1 = "You have scored 1/3. ONE";
		String ActualResult1 = driver.findElement(By.xpath("//p[contains(text(),'You have scored')]")).getText();
		Assert.assertEquals(ActualResult1, expectedResult1);
	}

	@Test(priority = 3)
	public static void condition3() throws InterruptedException {
		// score 2
		
		driver.get("https://komaldhillon28.outgrow.us/komaldhillon28-5780");

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Button text')]")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Button text')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2a98']"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2aa7']"))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2ab4']"))
				.click();

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your heading goes here')]")));

		CommonLib.scrolling_to_bottom();
		Thread.sleep(3000);

		String expectedResult1 = "You have scored 2/3. TWO";
		String ActualResult1 = driver.findElement(By.xpath("//p[contains(text(),'You have scored')]")).getText();
		Assert.assertEquals(ActualResult1, expectedResult1);

	}

	@Test(priority = 4)
	public static void condition4() throws InterruptedException {
		// score 3
		
		driver.get("https://komaldhillon28.outgrow.us/komaldhillon28-5780");

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Button text')]")));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Button text')]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2a98']"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2aa7']"))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border']//span[@id='option_label_5f2cd6b6b1a33c60aadc2ab6']"))
				.click();

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your heading goes here')]")));

		CommonLib.scrolling_to_bottom();
		Thread.sleep(3000);

		String expectedResult1 = "You have scored 3/3. THREE";
		String ActualResult1 = driver.findElement(By.xpath("//p[contains(text(),'You have scored')]")).getText();
		Assert.assertEquals(ActualResult1, expectedResult1);

	}

}
