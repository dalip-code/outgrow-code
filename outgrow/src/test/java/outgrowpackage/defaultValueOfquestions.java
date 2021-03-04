package outgrowpackage;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class defaultValueOfquestions {

	@BeforeClass
	public static void open_browser() throws InterruptedException, MalformedURLException {
		CommonLib.LaunchBrowswer();
	}

	@AfterClass
	public static void quit_browser() throws InterruptedException {
		CommonLib.closeBrowser();
		CommonLib.quitDriver();
	}

}
