package testCase.testCardM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sscs.devops.webtest.api.WebTestDataProvider;
import com.sscs.devops.webtest.api.WebTestDriverManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.spi.CDI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.send.SendPageStep_1;

/**
 *
 * @author User
 */
public class Login_CardM {

    JavascriptExecutor jse;
    static List<HashMap<String, String>> hashMaps = new ArrayList<HashMap<String, String>>();
    private static final Logger logger = LoggerFactory.getLogger(Login_CardM.class);
    private final WebTestDataProvider dataProvider = CDI.current().select(WebTestDataProvider.class).get();
    private final WebTestDriverManager driverManager = CDI.current().select(WebTestDriverManager.class).get();

    @Test
    public void test() {

        try {

            HashMap<String, String> maps = new HashMap<String, String>();

//            maps.put("user", "USANES");
//            maps.put("pass", "P@ssw0rd");
//            hashMaps.add(maps);
//            maps = new HashMap<String, String>();
//            maps.put("user", "PORNPIMP");
//            maps.put("pass", "P@ssw0rd");
//            hashMaps.add(maps);
            Map<String, String> map1 = (Map) dataProvider.getInputParameter(0);
//            for (int i = 0; i <= 1; i++) {
//               Thread t1 = new Thread(new MyThread(i));
//                t1.start();
//            TestSelenium myObj = new TestSelenium();
//            myObj.invokeBrowser(i);
//            }
//            int v = 0;
            logger.info("map0  : " + map1);
            ExecutorService es = Executors.newCachedThreadPool();
            List<String> listParameter = dataProvider.getInputParameterNames();
            listParameter.size();
            for (int v = 0; v < listParameter.size(); v++) {

                es.execute(new Thread(new MyThread(v)));
//                Thread t1 = new Thread(new MyThread(v));
//                t1.start();
//                v++;

                map1 = (Map) dataProvider.getInputParameter(v);
                logger.info("map1  : " + map1);
            }

            es.shutdown();
            boolean finished = es.awaitTermination(5, TimeUnit.MINUTES);
            logger.info("ALL THREAD FINISH");
//            WebDriver driver = driverManager.getChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
////        driver.get("https://twitter.com/login");
//            driver.get("https://10.251.50.41:49983/cardm/GSB/html");
//            Map<String, String> map1 = (Map) dataProvider.getInputParameter(0);
//            logger.debug("Value " + map1);
//            String user = map1.get("user");
//            String password = map1.get("password");
////            String keysCardNo = map1.get("keysCardNo");
////            String cardType = map1.get("cardType");
//            logger.debug("start driver....");
//            driver.get("https://www.facebook.com/");
//            RssLoginPage loginpage = PageFactory.initElements(driver, RssLoginPage.class);
//            loginpage.clickDetail();
//            loginpage.clickProcess();
////            loginpage.setId("PIMLADAP");
////            loginpage.setId("KussakornA");
//            loginpage.setId(user);
//            loginpage.setPassword(password);
//            Thread.sleep(5000);
//            loginpage.clickLogin();
//            Thread.sleep(5000);
//            RssHomePage homepage = PageFactory.initElements(driver, RssHomePage.class);
//            homepage.clickSendMenu();
//            Thread.sleep(5000);
//            homepage.clickSendTransMenu();
//            Thread.sleep(5000);
//            MainSendPage sendpage = PageFactory.initElements(driver, MainSendPage.class);
////            sendpage.clickDocType();
////            Thread.sleep(5000);
//            sendpage.clickDocType1(cardType);
//            Thread.sleep(5000);
////            sendpage.sendKeysCardNo("3862057370701");
//            sendpage.sendKeysCardNo(keysCardNo);
//            Thread.sleep(2000);
//            sendpage.clickNextBtn();
//            SendPageStep_1 SendPageStep_1 = PageFactory.initElements(driver, SendPageStep_1.class);
//            String checkStatus = SendPageStep_1.checkStatus();
//            logger.debug("user send checkStatus = " + checkStatus);
////            google.runTest(map1);
////
////            google.testSendKey();
//            dataProvider.setOutputData("#output", checkStatus);
//
//            Thread.sleep(5000);
//            homepage.clickLogout();
//            Thread.sleep(2000);
//            driver.close();
//            driver.quit();
        } catch (Exception e) {
            logger.error("Error ", e);
        } finally {
            logger.debug("Top finish");
        }

    }

    public void invokeBrowser(int i) {
        try {

            DesiredCapabilities DesireCaps = new DesiredCapabilities();
            String[] phantomJsArgs = {"--ignore-ssl-errors=true"};
            DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "D:\\selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
            DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomJsArgs);
            WebDriver driver = new PhantomJSDriver(DesireCaps);
//            WebDriver driver =null;

//            System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32_1\\chromedriver.exe");
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
//            options.addArguments("--ignore-ssl-errors=yes");
//            options.addArguments("--ignore-certificate-errors");
//            WebDriver driver = new ChromeDriver(options);
////        
//            WebDriver driver = new ChromeDriver();   
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("https://10.251.50.41:49983/cardm/GSB/html");
//             driver.get("https://hrslip.s/scs.co.th/HRSlip/#/login");
//             driver.get("https://www.google.com/");
            logger.info("driver title : " + driver.getTitle());
            logger.info("driver url : " + driver.getCurrentUrl());
//            driver.get("https://www.google.com/");
//            driver.findElement(By.name("q")).sendKeys("find " + i);
//            driver.findElement(By.id("details-button")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.id("proceed-link")).click();
//            Thread.sleep(2000);
            Map<String, String> map1 = (Map) dataProvider.getInputParameter(i);
            driver.switchTo().frame("mainframe");
            Thread.sleep(2000);
            driver.findElement(By.name("NET_ID")).sendKeys(map1.get("user"));
            Thread.sleep(2000);
            driver.findElement(By.name("PIN_NO")).sendKeys(map1.get("password"));
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            driver.switchTo().frame(0);
//             driver.switchTo().frame("mainframe");

            LocalDateTime myDateObj1 = LocalDateTime.now();
            DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

            String formattedDate1 = myDateObj1.format(myFormatObj1);
            logger.info("click login :" + map1.get("user") + " at :" + formattedDate1);

            List<WebElement> list = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/table[4]/tbody[1]/tr[1]/td[1]/map[1]/area[1]"));
//               logger.info(" driver "+driver.findElements(By.xpath("/html[1]/body[1]/form[1]/table[4]/tbody[1]/tr[1]/td[1]/map[1]/area[1]")));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", list.get(0));

            LocalDateTime myDateObj2 = LocalDateTime.now();
            DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

            String formattedDate2 = myDateObj2.format(myFormatObj2);
            logger.info("login :" + map1.get("user") + "success at :" + formattedDate2);
//int total = .size();
//                  logger.info("size "+total);

            Thread.sleep(2000);

            String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window
// Switch to new window opened
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            driver.switchTo().frame("topframe");
            List<WebElement> list1 = driver.findElements(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[2]/tbody[1]/tr[1]/td[2]/span[1]/a[2]"));
            executor.executeScript("arguments[0].click();", list1.get(0));
            Thread.sleep(2000);
            logger.info("logout :" + map1.get("user") + " success");
//            LocalDate s = LocalDate.now(); // Create a date object
//             logger.info(s); // Display the current date

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

            String formattedDate = myDateObj.format(myFormatObj);
            logger.info("After formatting: " + i + " " + formattedDate);

            driver.quit();
//            searchCourse();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    static class MyThread implements Runnable {

        int i1 = 0;

        private MyThread(int i) {
            i1 = i;
        }

        @Override
        public void run() {
            Login_CardM myObj = new Login_CardM();
            myObj.invokeBrowser(i1);
        }

    }

}
