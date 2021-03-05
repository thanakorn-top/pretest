package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RssHomePage {

    WebDriver driver;

    public RssHomePage(WebDriver driver) {
        this.driver = driver;
    }

//	WebElement idBox = driver.findElement(By.id("username"));
//	WebElement passwordBox = driver.findElement(By.id("password"));
//	WebElement signInButton = driver.findElement(By.id("login"));
    //a[@class='nav-link text-center']//img
    @FindBy(xpath = "/html[1]/body[1]/div[3]/nav[1]/div[1]/ul[2]/li[3]/a[1]/img[1]")
    WebElement logout;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/a[7]/div[1]")
    WebElement profile;

    @FindBy(css = "div.css-1dbjc4n.r-13awgt0.r-12vffkv div.css-1dbjc4n.r-13awgt0.r-12vffkv div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 header.css-1dbjc4n.r-obd0qt.r-16y2uox.r-1g40b8q:nth-child(3) div.css-1dbjc4n.r-o96wvk div.css-1dbjc4n.r-aqfbo4.r-1pi2tsx.r-1xcajam.r-ipm5af div.css-1dbjc4n.r-1pi2tsx.r-1wtj0ep.r-1rnoaur.r-utggzx.r-o96wvk div.css-1dbjc4n.r-15d164r.r-1x0uki6:nth-child(2) div.css-1dbjc4n > div.css-18t94o4.css-1dbjc4n.r-1awozwy.r-sdzlij.r-6koalj.r-18u37iz.r-1ny4l3l.r-1sp51qo.r-o7ynqc.r-6416eg")
    WebElement profileMenu;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement sendMenu;
    @FindBy(css = "div.header.ng-scope:nth-child(3) nav.navbar.navbar-expand-md.navbar-light.rounded.fixed-top.animated.fadeInDown.ng-scope div.navbar-collapse.col-align-center.bg-white.collapse.navbar-toggleable-md:nth-child(3) ul.navbar-nav.navbar-nav-left.mr-auto.mt-md-0:nth-child(1) li.nav-item.dropdown.ng-scope.show:nth-child(2) ul.dropdown-menu.show li.ng-scope:nth-child(1) > a.dropdown-item.ng-binding")
    WebElement sendTransMenu;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement cancelMenu;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
    WebElement cancelTransMenu;

    @FindBy(linkText = "รายงาน")
    WebElement menu;

    @FindBy(css = "div.css-1dbjc4n.r-13awgt0.r-12vffkv div.css-1dbjc4n.r-13awgt0.r-12vffkv div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 main.css-1dbjc4n.r-1habvwh.r-16y2uox.r-1wbh5a2:nth-child(4) div.css-1dbjc4n.r-150rngu.r-16y2uox.r-1wbh5a2.r-rthrr5 div.css-1dbjc4n.r-aqfbo4.r-16y2uox div.css-1dbjc4n.r-1oszu61.r-1niwhzg.r-18u37iz.r-16y2uox.r-1wtj0ep.r-2llsf.r-13qz1uu div.css-1dbjc4n.r-aqfbo4.r-zso239.r-1hycxz:nth-child(2) div.css-1dbjc4n.r-1pi2tsx div.css-1dbjc4n.r-gtdqiz.r-1hycxz:nth-child(2) div.css-1dbjc4n.r-1adg3ll div.css-1dbjc4n div.css-1dbjc4n.r-1l5qxre.r-m611by div.css-1dbjc4n.r-1awozwy.r-aqfbo4.r-14lw9ot.r-18u37iz.r-1h3ijdo.r-15d164r.r-1vsu8ta.r-1xcajam.r-ipm5af.r-1hycxz.r-136ojw6:nth-child(1) div.css-1dbjc4n.r-1oszu61.r-1iusvr4.r-18u37iz.r-16y2uox div.css-1dbjc4n.r-13awgt0.r-eqz5dr.r-bnwqim.r-8fdsdq div.r-1oszu61.r-1phboty.r-1yadl64.r-deolkf.r-6koalj.r-13awgt0.r-eqz5dr.r-crgep1.r-ifefl9.r-bcqeeo.r-t60dpp.r-bnwqim.r-417010 form.r-1oszu61.r-1phboty.r-1yadl64.r-deolkf.r-6koalj.r-13awgt0.r-eqz5dr.r-crgep1.r-ifefl9.r-bcqeeo.r-t60dpp.r-bnwqim.r-417010 div.css-1dbjc4n.r-1wbh5a2:nth-child(1) div.css-1dbjc4n.r-e84r5y.r-42olwf.r-sdzlij.r-1phboty.r-rs99b7.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-1777fci div.css-1dbjc4n.r-18u37iz div.css-901oao.r-hkyrab.r-6koalj.r-16y2uox.r-1qd0xha.r-a023e6.r-16dba41.r-ad9z0x.r-bcqeeo.r-qvutc0:nth-child(2) > input.r-30o5oe.r-1niwhzg.r-17gur6a.r-1yadl64.r-deolkf.r-homxoj.r-poiln3.r-7cikom.r-1ny4l3l.r-1sp51qo.r-1lrr6ok.r-1dz5y72.r-1ttztb7.r-13qz1uu")
    WebElement searchBox;

    public void clickLogout() {
        this.logout.click();
    }

    public void clickReport() {
        this.menu.click();
    }

    public void clickProfile() {
        this.profile.click();
    }

    public void clickProfileMenu() {
        this.profileMenu.click();
    }

    public void enterSearchKey(String searchKey) {
        System.out.println("search key = " + searchKey);
        this.searchBox.sendKeys(searchKey);
    }

    public void actionSearch() {
        this.searchBox.sendKeys(Keys.ENTER);
    }

    public void clickSendMenu() {
        this.sendMenu.click();
    }

    public void clickSendTransMenu() {
        this.sendTransMenu.click();
    }

    public void clickCancelMenu() {
        this.cancelMenu.click();
    }

    public void clickCancelTranMenu() {
        this.cancelTransMenu.click();
    }

}
