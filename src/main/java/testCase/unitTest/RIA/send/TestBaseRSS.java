package testCase.unitTest.RIA.send;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBaseRSS {

	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://192.168.2.58/RSS/#/login");
	}

	@AfterSuite
	public void driverdown() {
		driver.quit();
	}
}
