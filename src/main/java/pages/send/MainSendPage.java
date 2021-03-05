/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages.send;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author User
 */
public class MainSendPage {

    WebDriver driver;

    public MainSendPage(WebDriver driver) {
        this.driver = driver;
    }

//    @FindBy(id = "custSourceCardType")
//    WebElement docTypeList;
    @FindBy(id = "custSourceCardType")
    WebElement docTypeList;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/input[1]")
    WebElement cardNo;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/input[1]")
    WebElement passportNo;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[4]/button[1]")
    WebElement nextBtn;
    @FindBy(className = "toast-message")
    WebElement errorDialog;

    public void clickDocType1(String cardType) {
        Select dropdown = new Select(docTypeList);
        dropdown.selectByVisibleText(cardType);
    }

    public void clickDocType() {
        docTypeList.click();
    }

    public void clickNextBtn() {
        nextBtn.click();
    }

    public void sendKeysCardNo(String cardNo) {
        this.cardNo.sendKeys(cardNo);
    }

    public void sendKeysPassportNo(String cardNo) {
        this.passportNo.sendKeys(cardNo);
    }

    public String getResponse() {
        return errorDialog.getText();
    }
}
