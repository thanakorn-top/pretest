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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.send.SendPageStep_1;
import pages.send.SendPageStep_2;

/**
 *
 * @author User
 */
public class Case_0030_1 {

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
            logger.debug("Value map1" + map1);
            String user = map1.get("user");
            String password = map1.get("password");
            String keysCardNo = map1.get("keysCardNo");
            String cardType = map1.get("cardType");
            String destinationCountry = map1.get("destinationCountry");
            String destinationCity = map1.get("destinationCity");
            String destinationState = map1.get("destinationState");
            String receiveMethod = map1.get("receiveMethod");
            String purposeOfTxn = map1.get("purposeOfTxn");
            String typeSendMoney = map1.get("typeSendMoney");
            String currencyFrom = map1.get("currencyFrom");
            String currencyTo = map1.get("currencyTo");
            String forcalAmount = map1.get("forcalAmount");

            Map<String, String> map2 = (Map) dataProvider.getInputParameter(1);
            logger.debug("Value map2" + map2);
            String cif = map2.get("CIF");
            String receiver = map2.get("receiver");
            String fname = map2.get("fname");
            String lname = map2.get("lname");
            String city = map2.get("city");

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
            if (cardType.equals("บัตรประชาชน")) {
                sendpage.sendKeysCardNo(keysCardNo);
            } else {
                sendpage.sendKeysPassportNo(keysCardNo);
            }
//            MainSendPage sendpage1 = PageFactory.initElements(driver, MainSendPage.class);
            Thread.sleep(2000);
            sendpage.clickNextBtn();

            SendPageStep_1 SendPageStep_1 = PageFactory.initElements(driver, SendPageStep_1.class);

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0, 500);");

            Thread.sleep(1000);
            SendPageStep_1.selectLogo();
            Thread.sleep(1000);
            jse.executeScript("scroll(0, 100);");

            Thread.sleep(8000);
            SendPageStep_1.selectDestinationCountry(destinationCountry);
            Thread.sleep(5000);
            SendPageStep_1.selectDestinationState(destinationState);
            Thread.sleep(5000);
            SendPageStep_1.selectDestinationCity(destinationCity);
            Thread.sleep(5000);
            SendPageStep_1.selectReceiveMethod(receiveMethod);
            Thread.sleep(2000);
            SendPageStep_1.selectPurposeOfTxn(purposeOfTxn);
            Thread.sleep(2000);
            SendPageStep_1.selectTypeSendMoney(typeSendMoney);
            Thread.sleep(2000);
            if (typeSendMoney.equals("จำนวนเงินที่ส่งไม่รวมค่าธรรมเนียม")) {
                SendPageStep_1.setForcalAmount(forcalAmount);
                Thread.sleep(1000);
                SendPageStep_1.selectCurrencyFrom(currencyFrom);
                Thread.sleep(2000);
                SendPageStep_1.selectCurrencyTo(currencyTo);
                Thread.sleep(2000);
            } else {
                SendPageStep_1.setForcalAmount_1(forcalAmount);
                Thread.sleep(1000);
                SendPageStep_1.selectCurrencyFrom_1(currencyFrom);
                Thread.sleep(2000);
                SendPageStep_1.selectCurrencyTo_1(currencyTo);
                Thread.sleep(2000);
            }

            SendPageStep_1.clickCalculateBtn();
            Thread.sleep(5000);

            SendPageStep_1.clickNextBtn();
            Thread.sleep(3000);
            SendPageStep_2 SendPageStep_2 = PageFactory.initElements(driver, SendPageStep_2.class);

            SendPageStep_2.inputCity(city);
            Thread.sleep(1000);
            SendPageStep_2.selectReceiver(receiver);
            Thread.sleep(1000);
            SendPageStep_2.verifyReceiver();
            Thread.sleep(1000);
            SendPageStep_2 SendPageStep_2_1 = PageFactory.initElements(driver, SendPageStep_2.class);
            String respVerify = SendPageStep_2_1.checkResponseVerifyReceiver();
            logger.debug("respVerify " + respVerify);
            Thread.sleep(5000);
            homepage.clickLogout();
            Thread.sleep(2000);
            dataProvider.setOutputData("#output", respVerify);
            driver.close();
            driver.quit();
        } catch (Exception e) {
            logger.error("Error ", e);
        } finally {
            logger.debug("Top finish");
        }

    }

}
