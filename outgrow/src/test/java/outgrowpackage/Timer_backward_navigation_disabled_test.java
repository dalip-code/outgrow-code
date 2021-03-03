package outgrowpackage;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Timer_backward_navigation_disabled_test extends CommonLib {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

	public static void backward_navigation_timer_on_questions_common() throws InterruptedException {

		// web driver wait
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 1')]")));

		// check css property for q1
		WebElement getelement_q1 = driver
				.findElement(By.xpath("//a[@class='prev ripple-light a-disable a-disable-new']"));
		String q1_slider = getelement_q1.getCssValue("pointer-events");
		String q1_opacity = getelement_q1.getCssValue("opacity");
		System.out.println("pointer events for question 1 :" + q1_slider);
		System.out.println("opacity for question 1:" + q1_opacity);
		System.out.println("----****----****----");

		driver.findElement(By.xpath(
				"//a[@id='5f65be60a76d530a367d958a']//i[@class='material-icons'][contains(text(),'keyboard_arrow_right')]"))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));

		// check css property for q2
		WebElement getelement_q2 = driver
				.findElement(By.xpath("//a[@class='prev ripple-light a-disable a-disable-new']"));
		String q2_slider = getelement_q2.getCssValue("pointer-events");
		String q2_opacity = getelement_q2.getCssValue("opacity");
		System.out.println("pointer events for question 2 :" + q2_slider);
		System.out.println("opacity for question 2:" + q2_opacity);
		System.out.println("----****----****----");

		driver.findElement(By.xpath(
				"//a[@id='5f65be60a76d530a367d9591']//i[@class='material-icons'][contains(text(),'keyboard_arrow_right')]"))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		wait4.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 3')]")));

		// check css property for q3
		WebElement getelement_q3 = driver
				.findElement(By.xpath("//a[@class='prev ripple-light a-disable a-disable-new']"));
		String q3_slider = getelement_q3.getCssValue("pointer-events");
		String q3_opacity = getelement_q3.getCssValue("opacity");
		System.out.println("pointer events for question 3 :" + q3_slider);
		System.out.println("opacity for question 3:" + q3_opacity);
		System.out.println("----****----****----");

	}

	public static void skip_third_go_to_result_page() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='material-icons done-icons']")).click();

		WebDriverWait wait5 = new WebDriverWait(driver, 30);
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'THIS IS THE PAGE HEADING')]")));
		Thread.sleep(2000);
		CommonLib.scrolling_to_bottom();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public static void backward_navigation_timer_on_questions() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-930");

		// web driver wait
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(5000);

		// click on skip button
		driver.findElement(By.xpath("//button[@class='lf-skip-btn']")).click();

		backward_navigation_timer_on_questions_common();
		skip_third_go_to_result_page();

	}

	@Test(priority = 2)
	public static void backward_navigation_timer_on_questions_redo() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-930");

		// web driver wait
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(5000);

		// click on skip button
		driver.findElement(By.xpath("//button[@class='lf-skip-btn']")).click();

		backward_navigation_timer_on_questions_common();

		driver.findElement(By.xpath("//i[@class='material-icons'][contains(text(),'replay')]")).click();
		System.out.print("\n\n\n");
		System.out.println("****----****----Redo working----****----****");
		System.out.print("\n\n\n");

		backward_navigation_timer_on_questions_common();
		skip_third_go_to_result_page();
	}

	@Test(priority = 3)
	public static void backward_navigation_timer_on_questions_logic_jump() throws InterruptedException {

		driver.get("https://dcompany878.outgrow.us/dcompany878-930");

		// web driver wait
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'BUTTON TEXT')]")));
		Thread.sleep(5000);

		// click on skip button
		driver.findElement(By.xpath("//button[@class='lf-skip-btn']")).click();

		backward_navigation_timer_on_questions_common();

		driver.findElement(By.xpath(
				"//label[@class='control control--radio blink-border defaultOptionImage']//span[@id='option_label_5f65913b52e0ff018522c6e9']"));

		WebDriverWait Question2 = new WebDriverWait(driver, 30);
		Question2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Question title goes here 2')]")));
		Thread.sleep(5000);
	}

}
