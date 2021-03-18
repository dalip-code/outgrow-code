package outgrowpackage;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class validations_on_fields extends CommonLib {

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
	public static void string_test() {

		String example = "https://dcompany624.outgrow.co/dashboard";
		int a = example.indexOf("y");
		int b = example.indexOf(".");
		String int_added = example.substring(a + 1, b);
		int i = Integer.parseInt(int_added);

		if (i > 0 && i <= 999) {

		}

	}

}
