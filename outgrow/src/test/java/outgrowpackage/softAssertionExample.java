package outgrowpackage;

import java.awt.Point;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertionExample extends CommonLib {

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
	public static void testsoftAssertion() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/exact_range_validation_paris");
		Thread.sleep(20000);
		SoftAssert soft = new SoftAssert();

		String assessment_heading_a = "ASSESMENT HEADING GOES HERE";
		String assessment_heading_e = driver
				.findElement(By.xpath("//strong[contains(text(),'ASSESSMENT HEADING GOES HERE')]")).getText();
		soft.assertEquals(assessment_heading_a, assessment_heading_e, "heading not matched");

		soft.assertAll();

	}

	@Test
	public static void swicthing_tabs() throws InterruptedException {

		driver.findElement(By.xpath("//header/nav[1]/ul[1]/div[1]/div[1]/li[4]/a[1]"));

	}
}
