package outgrowpackage;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TriggerRedirect extends CommonLib {

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
	public static void TriggerRedirect_chicago()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		CommonLib.login();
		CommonLib.openNewTab();
		CommonLib.switchToNewTab();
		driver.navigate().to("https://dcompany878.outgrow.co/builder/dcompany878-6363");

		Thread.sleep(2000);

		WebDriverWait builder_load = new WebDriverWait(driver, 30);
		builder_load.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("// span[normalize-space()='WELCOME SCREEN']")));

		// URL copied to clipboard.
		driver.findElement(By.xpath("//i[normalize-space()='library_books']")).click();

		// storing clipboard data in variable.
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();

		driver.get(myText);

		Thread.sleep(5000);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(1));

		Thread.sleep(5000);

		driver.switchTo().window(newTb.get(0));

		Thread.sleep(5000);

	}
}
