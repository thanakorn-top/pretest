/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCase.unitTest.RIA.send;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.common.RssLoginPage;
import pages.common.RssHomePage;
import pages.common.LogoutPage;

/**
 *
 * @author User
 */
public class LogoutTestCase {

    WebDriver driver;

    public LogoutTestCase(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        try {
            LogoutPage logoutPage = PageFactory.initElements(driver, LogoutPage.class);
            logoutPage.clickLogout();
            Thread.sleep(5000);      
        } catch (Exception e) {
        }

    }

}
