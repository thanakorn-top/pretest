/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCase.unitTest.RIA.cancel;

import com.sscs.devops.webtest.api.WebTestDataProvider;
import com.sscs.devops.webtest.api.WebTestDriverManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.spi.CDI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.cancel.CancelTransaction;
import pages.common.RssHomePage;
import pages.common.RssLoginPage;
import pages.send.MainSendPage;
import pages.send.SendPageStep_1;
import pages.send.SendPageStep_2;

/**
 *
 * @author User
 */
public class Case_0001_3 {

    private static final Logger logger = LoggerFactory.getLogger(testCase.unitTest.RIA.send.Case_0001_1.class);
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
            logger.debug("Value map1" + map1);
            String user = map1.get("user");
            String password = map1.get("password");
            String receiveCode = map1.get("receiveCode");

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
            homepage.clickCancelMenu();
            Thread.sleep(5000);
            homepage.clickCancelTranMenu();
            Thread.sleep(5000);

            CancelTransaction cancelPage = PageFactory.initElements(driver, CancelTransaction.class);

            cancelPage.selectLogo();
            Thread.sleep(2000);
            cancelPage.inputReceiveCode(receiveCode);
            Thread.sleep(2000);

            String validate = cancelPage.validateReceiveCode();
            if (validate.equals("")) {
                dataProvider.setOutputData("#output", "ไม่สามารถกรอกตัวอักษรได้");
            } else {
                dataProvider.setOutputData("#output", "");
            }

            Thread.sleep(5000);
            homepage.clickLogout();
            driver.close();
            driver.quit();
        } catch (Exception e) {
            logger.error("Error ", e);
        } finally {
            logger.debug("Top finish");
        }

    }
}
