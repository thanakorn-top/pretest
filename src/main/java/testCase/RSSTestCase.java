package testCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testCase.unitTest.RIA.send.Case_0001_2;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class RSSTestCase {

    public static InternetExplorerDriver driver = null;
    @FindBy(id = "username")
    WebElement idBox;

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        System.out.println("100");
        initialize();
//        Case_0001_2 case01 = new Case_0001_2(driver);
//        case01.test();
        int x = 0;
        System.out.println("100" + x);

//
//        driverdown();
    }

    public static void initialize()  {
//        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
////        driver.get("https://twitter.com/login");
//        driver.get("https://10.50.16.116/RSS/#/login");
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        System.out.println("100");
        caps.setCapability("ignoreZoomSetting", true);
//driver = new InternetExplorerDriver(caps);
        System.out.println("101");
        System.setProperty("webdriver.ie.driver", "D:/selenium/IEDriverServer_x64_3.150.1/IEDriverServer.exe");
        System.out.println("102");
//        System.setProperty("webdriver.chrome.dreption {\n" +
//"        iver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
        try {
            driver = new InternetExplorerDriver(caps);
//        driver = new ChromeDriver();
            System.out.println("103");
            driver.manage().window().maximize();
            System.out.println("104");
            driver.manage().deleteAllCookies();
            System.out.println("105");
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            System.out.println("106");
//        driver.get("https://twitter.com/login");
            driver.get("https://www.google.com/");
//        driver.get("https://10.251.50.41:49983/cardm/GSB/html");
            System.out.println("clickๅ");
            driver.findElement(By.name("q")).sendKeys("BrowserStack");
            System.out.println("click2");
//        Thread.sleep(3000);
//        WebElement b1 = driver.findElement(By.id("infoBlockIDImage"));
//        Thread.sleep(3000);
//        b1.click();
//          System.out.println("click1");
//        Thread.sleep(3000);
//        WebElement b2= driver.findElement(By.id("overridelink"));
//        Thread.sleep(3000);
//        b2.click();
//        System.out.println("click2");
//        Thread.sleep(3000);
            driverdown();
//        driver.get("https://10.50.16.116/RSS/#/login");
        } catch (Exception e) {
            System.out.println("e " + e);
        }

    }

    public void setId(String Id) {
        idBox.sendKeys(Id);
    }

    public static void driverdown() {
        driver.quit();
    }
}
