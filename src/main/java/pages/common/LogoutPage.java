package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

//	WebElement idBox = driver.findElement(By.id("username"));
//	WebElement passwordBox = driver.findElement(By.id("password"));
//	WebElement signInButton = driver.findElement(By.id("login"));
    //a[@class='nav-link text-center']//img
    @FindBy(css = "div.css-1dbjc4n.r-13awgt0.r-12vffkv div.css-1dbjc4n.r-13awgt0.r-12vffkv div.r-1d2f490.r-u8s1d.r-zchlnj.r-ipm5af.r-184en5c div.css-1dbjc4n.r-aqfbo4.r-1p0dtai.r-1d2f490.r-12vffkv.r-1xcajam.r-zchlnj:nth-child(2) div.css-1dbjc4n.r-12vffkv div.css-1dbjc4n.r-12vffkv div.css-1dbjc4n.r-1p0dtai.r-1adg3ll.r-1d2f490.r-bnwqim.r-zchlnj.r-ipm5af div.r-1oszu61.r-1phboty.r-1yadl64.r-1p0dtai.r-deolkf.r-1adg3ll.r-eqz5dr.r-1d2f490.r-crgep1.r-ifefl9.r-bcqeeo.r-t60dpp.r-bnwqim.r-zchlnj.r-ipm5af.r-417010 div.css-1dbjc4n.r-1pz39u2.r-16y2uox.r-1wbh5a2 div.css-1dbjc4n.r-1awozwy.r-1kihuf0.r-18u37iz.r-1pi2tsx.r-1777fci.r-1pjcn9w.r-fxte16.r-1xcajam.r-ipm5af.r-9dcw1g:nth-child(2) div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-1ylenci.r-1jgb5lz.r-pm9dpa.r-1ye8kvj.r-1rnoaur.r-d9fdf6.r-1sxzll1.r-13qz1uu:nth-child(2) div.css-1dbjc4n.r-18u37iz.r-13qz1uu:nth-child(4) div.css-18t94o4.css-1dbjc4n.r-urgr8i.r-42olwf.r-sdzlij.r-1phboty.r-rs99b7.r-16y2uox.r-1w2pmg.r-1vuscfd.r-1dhvaqw.r-1ny4l3l.r-1fneopy.r-o7ynqc.r-6416eg.r-lrvibr:nth-child(2) > div.css-901oao.r-1awozwy.r-jwli3a.r-6koalj.r-18u37iz.r-16y2uox.r-1qd0xha.r-a023e6.r-vw2c0b.r-1777fci.r-eljoum.r-dnmrzs.r-bcqeeo.r-q4m81j.r-qvutc0")
    WebElement logoutBtn;

    public void clickLogout() {
        logoutBtn.click();
    }

}
