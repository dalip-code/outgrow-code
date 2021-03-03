package outgrowpackage;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class views_and_leads_creation extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();

	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}


	// views generation
	@Test
	public static void views() throws InterruptedException, MalformedURLException {

		int number = 0;

		while (number < 100) {

			Thread.sleep(2000);

			// open live link
			driver.get("https://dcompany878.outgrow.us/dcompany878-6094");

			// web driver wait
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

			Thread.sleep(500);

			number = number + 1;

			if (number == 100) {
				System.out.println("reached 100 views");
			}

			else if (number == 200) {
				System.out.println("reached 200 views");
			}

			else if (number == 300) {
				System.out.println("reached 300 views");
			}

			else if (number == 400) {
				System.out.println("reached 400 views");
			}

			else if (number == 500) {
				System.out.println("reached 500 views");
			}

			else if (number == 600) {
				System.out.println("reached 600 views");
			}

			else if (number == 700) {
				System.out.println("reached 700 views");
			}

			else if (number == 800) {
				System.out.println("reached 800 views");
			}

			else if (number == 900) {
				System.out.println("reached 900 views");
			}
		}

		

	}

	@Test
	public static void Lead_generation() throws InterruptedException, MalformedURLException {

	
		int number = 0;

		while (number < 100) {

			// open live link
			driver.get("https://dcompany878.outgrow.us/dcompany878-6094");

			// web driver wait
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='BUTTON TEXT']")));

			Thread.sleep(500);

			Random randomLeadGenerator = new Random();
			int randomInt = randomLeadGenerator.nextInt(10000);

			Thread.sleep(500);

			driver.findElement(By.xpath("//input[@id='icon_prefix0']")).clear();

			driver.findElement(By.xpath("//input[@id='icon_prefix0']")).sendKeys("username" + randomInt);

			Thread.sleep(500);

			driver.findElement(By.xpath("//input[@id='icon_prefix1']")).clear();

			driver.findElement(By.xpath("//input[@id='icon_prefix1']")).sendKeys("username" + randomInt + "@gmail.com");

			Thread.sleep(500);

			driver.findElement(By.xpath("//span[contains(text(),'BUTTON TEXT')]")).click();

			number = number + 1;

			if (number == 10) {
				System.out.println("reached 10 leads");
			}

			else if (number == 20) {
				System.out.println("reached 20 leads");
			}

			else if (number == 30) {
				System.out.println("reached 30 leads");
			}

			else if (number == 40) {
				System.out.println("reached 40 leads");
			}

			else if (number == 50) {
				System.out.println("reached 50 leads");
			}

			else if (number == 60) {
				System.out.println("reached 60 leads");
			}

			else if (number == 70) {
				System.out.println("reached 70 leads");
			}

			else if (number == 80) {
				System.out.println("reached 80 leads");
			}

			else if (number == 90) {
				System.out.println("reached 90 leads");
			}

			else if (number == 100) {
				System.out.println("reached 100 leads");
			}

		}

		

	}
}
