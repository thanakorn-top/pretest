package testCase.unitTest.RIA.send;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.common.RssLoginPage;
import pages.common.RssHomePage;
import pages.send.MainSendPage;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sscs.devops.webtest.api.WebTestDataProvider;
import com.sscs.devops.webtest.api.WebTestDriverManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.spi.CDI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.send.SendPageStep_1;

/**
 *
 * @author User
 */
public class Case_0002_1 {

    private static final Logger logger = LoggerFactory.getLogger(Case_0001_1.class);
    private final WebTestDataProvider dataProvider = CDI.current().select(WebTestDataProvider.class).get();
    private final WebTestDriverManager driverManager = CDI.current().select(WebTestDriverManager.class).get();

    @Test
    public void test() {

        try {
            WebDriver driver = driverManager.getChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//        driver.get("https://twitter.com/login");
            driver.get("https://10.50.16.116/RSS/#/login");
            Map<String, String> map1 = (Map) dataProvider.getInputParameter(0);
            logger.debug("Value " + map1);
            String user = map1.get("user");
            String password = map1.get("password");
            String keysCardNo = map1.get("keysCardNo");
            String cardType = map1.get("cardType");
            logger.debug("start driver....");
//            driver.get("https://www.facebook.com/");

            RssLoginPage loginpage = PageFactory.initElements(driver, RssLoginPage.class);
            loginpage.clickDetail();
            loginpage.clickProcess();
//            loginpage.setId("PIMLADAP");
//            loginpage.setId("KussakornA");
            loginpage.setId(user);
            loginpage.setPassword(password);
            Thread.sleep(5000);
            loginpage.clickLogin();
            Thread.sleep(5000);
            RssHomePage homepage = PageFactory.initElements(driver, RssHomePage.class);
            homepage.clickSendMenu();
            Thread.sleep(5000);
            homepage.clickSendTransMenu();
            Thread.sleep(5000);
            MainSendPage sendpage = PageFactory.initElements(driver, MainSendPage.class);
            sendpage.clickDocType1(cardType);
            Thread.sleep(2000);
            
//            MainSendPage sendpage1 = PageFactory.initElements(driver, MainSendPage.class);
            sendpage.sendKeysPassportNo(keysCardNo);
            Thread.sleep(2000);
            sendpage.clickNextBtn();
            
            SendPageStep_1 SendPageStep_1 = PageFactory.initElements(driver, SendPageStep_1.class);
            String checkStatus = SendPageStep_1.checkStatus();
            logger.debug("user send checkStatus = " + checkStatus);
//            google.runTest(map1);
//
//            google.testSendKey();
            dataProvider.setOutputData("#output", checkStatus);

            Thread.sleep(5000);
            homepage.clickLogout();
            Thread.sleep(2000);
            driver.close();
            driver.quit();
        } catch (Exception e) {
            logger.error("Error ", e);
        } finally {
            logger.debug("Top finish");
        }

    }

}
