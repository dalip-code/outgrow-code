package RealTimeResult;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import logicJump.ScreenRecorderUtil;
import outgrowpackage.CommonLib;

public class RealTimeResultTokyo extends CommonLib {

	@BeforeClass
	public static void open_browser() throws Exception {
		CommonLib.LaunchBrowswer();

	}

	@AfterClass
	public static void quit_browser() throws Exception {
		CommonLib.closeBrowser();

		CommonLib.quitDriver();
	}

	@Test(priority = 1)
	public static void RealTimeResultTokyo1()
			throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {

		CommonLib.login();
		CommonLib.openNewTab();
		CommonLib.switchToNewTab();
		driver.navigate().to("https://dcompany878.rely.co/builder/dcompany878-6862");

		Thread.sleep(2000);

		WebDriverWait builder_load = new WebDriverWait(driver, 120);
		builder_load.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("// span[normalize-space()='WELCOME SCREEN']")));

		// click on preview

		driver.findElement(By.xpath("//i[contains(text(),'visibility')]")).click();

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(1));

		// URL copied to clipboard.
		driver.findElement(By.xpath("//i[normalize-space()='library_books']")).click();

		// storing clipboard data in variable.
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting

		Thread.sleep(2000);

		CommonLib.openNewTab();
		CommonLib.switchToNewTab();

		String myText1 = myText.replaceFirst("dcompany878", "livec");

		System.out.println(myText1);

		driver.get(myText1);

		Thread.sleep(2000);

	}

}
