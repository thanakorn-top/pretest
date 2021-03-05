package testCase.unitTest.RIA.send;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.common.RssLoginPage;
import pages.common.RssHomePage;

public class RssHomepageTestCase {

    WebDriver driver;

    public RssHomepageTestCase(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        try {
            RssHomePage homepage = PageFactory.initElements(driver, RssHomePage.class);
//            homepage.clickReport();
//            Thread.sleep(5000);
            homepage.clickProfile();
            Thread.sleep(5000);

            homepage.clickProfileMenu();
            Thread.sleep(5000);
            homepage.clickLogout();
            Thread.sleep(3000);

//            
//            
//            homepage.clickProcess();
//            Thread.sleep(5000);
            System.out.println("HOMEPAGE CASE PASS ");
        } catch (Exception e) {
            System.out.println("HOMEPAGE CASE FAIL ");
        }

    }
}
