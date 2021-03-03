package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pop_up_image_as_cover extends CommonLib {

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
	public static void test_image_as_cover_chicago_quiz() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-733");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='lf-skip-btn']")).click();

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f61d4597877e5187319aeb3']"))
				.click();

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='scrol-part correct-feedback']//img")));

		WebElement getcssvalue = driver.findElement(By.xpath("//div[@class='scrol-part correct-feedback']//img"));
		String value = getcssvalue.getCssValue("object-fit");
		System.out.println("https://dcompany878.outgrow.us/dcompany878-733");
		System.out.println("object-fit :" + value);
		System.out.println("----****----****----");

	}

	@Test(priority = 2)
	public static void test_image_as_cover_chicago_assessment() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/Copy-of-dcompany878-733-1");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='lf-skip-btn']")).click();

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f61d4597877e5187319aeb3']"))
				.click();

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='rec-image-outer']//img")));

		WebElement getcssvalue = driver.findElement(By.xpath("//div[@class='rec-image-outer']//img"));
		String value = getcssvalue.getCssValue("object-fit");
		System.out.println("https://dcompany878.outgrow.us/Copy-of-dcompany878-733-1");
		System.out.println("object-fit :" + value);
		System.out.println("----****----****----");

	}

	@Test(priority = 3)
	public static void test_image_as_cover_chicago_cal() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/Copy-of-Copy-of-dcompany878-733-1-1");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='lf-skip-btn']")).click();

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f61d4597877e5187319aeb3']"))
				.click();

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='graded-msgbox']//img")));

		WebElement getcssvalue = driver.findElement(By.xpath("//div[@class='graded-msgbox']//img"));
		String value = getcssvalue.getCssValue("object-fit");
		System.out.println("https://dcompany878.outgrow.us/Copy-of-Copy-of-dcompany878-733-1-1");
		System.out.println("object-fit :" + value);
		System.out.println("----****----****----");
	}

}
