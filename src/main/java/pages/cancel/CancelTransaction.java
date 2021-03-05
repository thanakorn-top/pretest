/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages.cancel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author User
 */
public class CancelTransaction {

    WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(CancelTransaction.class);

    public CancelTransaction(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[3]/img[1]")
    WebElement riaLogo;

    @FindBy(id = "receiveCode")
    WebElement receiveCode;

    @FindBy(className = "toast-message")
    WebElement status;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
    WebElement findBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")
    WebElement errorDialog;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/button[1]")
    WebElement cancelErrorDialogBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/button[1]")
    WebElement cancelTransBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/div[6]/div[1]/div[3]/div[1]/div[2]/button[1]")
    WebElement confilrmCancelTransBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/textarea[1]")
    WebElement reasonForCancel;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/button[2]")
    WebElement confirm;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/span[1]/span[1]")
    WebElement reasonForCancelResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/div[1]/div[2]/h5[1]")
    WebElement confirmResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/div[1]/div[3]/button[1]")
    WebElement confirmRespBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[3]/button[1]")
    WebElement cancelReasonForCancelBtn;

    public void selectLogo() {
        this.riaLogo.click();
    }

    public void inputReceiveCode(String receiveCode) {
        this.receiveCode.clear();
        this.receiveCode.sendKeys(receiveCode);
    }

    public void findTransaction() {
        this.findBtn.click();
    }

    public String getErrorDialog() {
        return this.errorDialog.getText();
    }

    public void clickCancelErrorDialog() {
        this.cancelErrorDialogBtn.click();
    }

    public String checkStatus() {
        logger.debug("checkStatus" + status);
        logger.debug("checkStatus .getText()" + status.getText());
        return status.getText();
    }

    public String validateReceiveCode() {
        logger.debug("receiveCode = " + this.receiveCode.getAttribute("value"));
        return this.receiveCode.getAttribute("value");
    }

    public boolean checkCancleTransBtn() {
        logger.debug("checkStatus" + cancelTransBtn.isEnabled());
        logger.debug("checkStatus .getText()" + status.getText());
        return cancelTransBtn.isEnabled();
    }

    public void clickCancelTransBtn() {
        this.cancelTransBtn.click();
    }

    public void clickConfirmCancelTransBtn() {
        this.confilrmCancelTransBtn.click();
    }

    public void inputReasonForCancel(String reason) {
        this.reasonForCancel.clear();
        this.reasonForCancel.sendKeys(reason);
    }

    public String validateReasonForCancel() {
        logger.debug("reasonForCancel = " + this.reasonForCancel.getAttribute("value"));
        return this.reasonForCancel.getAttribute("value");
    }

    public void clickConfirm() {
        this.confirm.click();
    }

    public String checkResponseVerifyReasonForCancel() {
        logger.debug("reasonForCancelResp.getText() " + reasonForCancelResp.getText());
        if (!this.reasonForCancelResp.getText().equals("")) {
            return "กรุณาระบุ เหตุผลที่ยกเลิก";
        } else {
            return "";
        }
    }

    public String checkConfirmResp() {
        logger.debug("reasonForCancel = " + this.confirmResp.getText());
        return this.confirmResp.getText();
    }

    public void clickConfirmResp() {
        this.confirmRespBtn.click();
    }

    public void clickCancelReasonConfirm() {
        this.cancelReasonForCancelBtn.click();
    }
}
