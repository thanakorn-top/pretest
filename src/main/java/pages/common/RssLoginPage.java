package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RssLoginPage {

    WebDriver driver;

    public RssLoginPage(WebDriver driver) {
        this.driver = driver;
    }

//	WebElement idBox = driver.findElement(By.id("username"));
//	WebElement passwordBox = driver.findElement(By.id("password"));
//	WebElement signInButton = driver.findElement(By.id("login"));
    //a[@class='nav-link text-center']//img
    @FindBy(id = "username")
    WebElement idBox;

    @FindBy(id = "password")
    WebElement passwordBox;

    @FindBy(id = "login")
    WebElement signInButton;

    @FindBy(id = "details-button")
    WebElement detailButton;

    @FindBy(id = "proceed-link")
    WebElement advanceButton;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    WebElement errorDialog;
    

    public void setId(String Id) {
        idBox.sendKeys(Id);
    }

    public void setPassword(String Password) {
        passwordBox.sendKeys(Password);
    }

    public void clickLogin() {
        signInButton.click();
    }

    public void clickDetail() {
        detailButton.click();
    }

    public void clickProcess() {
        advanceButton.click();
    }

    public void checkError() {
//        driver.switchTo().activeElement();
//        errorDialog = driver.findElement(By.linkText("ปิดหน้าต่าง"));
        errorDialog.click();
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        driver.findElement(By.cssSelector("btn btn-danger")).click();
    }

}
