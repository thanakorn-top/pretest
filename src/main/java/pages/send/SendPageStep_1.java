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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author User
 */
public class SendPageStep_1 {

    WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(SendPageStep_1.class);

    public SendPageStep_1(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "toast-title")
    WebElement checkStatus;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div[1]/label[3]/img[1]")
    WebElement riaLogo;

    @FindBy(id = "destinationCountry")
    WebElement destinationCountry;

    @FindBy(id = "destinationState")
    WebElement destinationState;

    @FindBy(id = "destinationCity")
    WebElement destinationCity;

    @FindBy(id = "receiveMethod")
    WebElement receiveMethod;

    @FindBy(id = "purposeOfTxn")
    WebElement purposeOfTxn;

    @FindBy(id = "bankId")
    WebElement bankId;

    @FindBy(id = "typeSendMoney")
    WebElement typeSendMoney;

    @FindBy(id = "currencyFrom")
    WebElement currencyFrom;

    @FindBy(id = "currencyTo")
    WebElement currencyTo;

    @FindBy(id = "bankInfo")
    WebElement bankInput;

    @FindBy(id = "accountType")
    WebElement accountType;

    @FindBy(id = "accountNumber")
    WebElement accountNumber;

    @FindBy(id = "destBankCode")
    WebElement routingNumber;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/p[13]")
    WebElement bankListSelect;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/select[1]")
    WebElement currencyFrom_1;

    @FindBy(id = "currencyTo")
    WebElement currencyTo_1;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement forcalAmount;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement forcalAmount_1;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/i[1]")
    WebElement loadingBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/button[1]")
    WebElement calculateBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
    WebElement amountWarn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/span[1]/span[1]")
    WebElement amountWarn_1;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/div[1]/div[1]/p[1]")
    WebElement warningCalculate;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement closeWarningCalculateBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/button[4]")
    WebElement submitBtn;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[4]/div[1]/div[2]/span[1]/span[2]")
    WebElement accountNumberResp;

    public String checkStatus() {
        logger.debug("checkStatus" + checkStatus);
        logger.debug("checkStatus .getText()" + checkStatus.getText());
        return checkStatus.getText();
    }

    public void selectDestinationCountry(String destinationCountry) {
        Select dropdown = new Select(this.destinationCountry);
        dropdown.selectByVisibleText(destinationCountry);
    }

    public void selectDestinationState(String destinationState) {
        Select dropdown = new Select(this.destinationState);
        dropdown.selectByVisibleText(destinationState);
    }

    public void selectDestinationCity(String destinationCity) {
        Select dropdown = new Select(this.destinationCity);
        dropdown.selectByVisibleText(destinationCity);
    }

    public void selectReceiveMethod(String receiveMethod) {
        Select dropdown = new Select(this.receiveMethod);
        dropdown.selectByVisibleText(receiveMethod);
    }

    public void selectPurposeOfTxn(String purposeOfTxn) {
        Select dropdown = new Select(this.purposeOfTxn);
        dropdown.selectByVisibleText(purposeOfTxn);
    }

    public void selectTypeSendMoney(String typeSendMoney) {
        Select dropdown = new Select(this.typeSendMoney);
        dropdown.selectByVisibleText(typeSendMoney);
    }

    public void selectCurrencyFrom(String currencyFrom) {
        Select dropdown = new Select(this.currencyFrom);
        dropdown.selectByVisibleText(currencyFrom);
    }

    public void selectCurrencyTo(String currencyTo) {
        Select dropdown = new Select(this.currencyTo);
        dropdown.selectByVisibleText(currencyTo);
    }

    public void selectLogo() {
        this.riaLogo.click();
    }

    public void setForcalAmount(String forcalAmount) {
        this.forcalAmount.sendKeys(forcalAmount);
    }

    public void checkLoadBtn() {
        logger.debug("" + loadingBtn);
    }

    public void clickCalculateBtn() {
        this.calculateBtn.click();
    }

    public String checkAmountWarn() {
        logger.debug(this.amountWarn.getText());
        return this.amountWarn.getText();
    }

    public String checkWarnCalculate() {
        logger.debug(this.warningCalculate.getText());
        return this.warningCalculate.getText();
    }

    public void closeWaringBtnClick() {
        this.closeWarningCalculateBtn.click();
    }

    public boolean checkSubmitStatus() {
        return this.submitBtn.isEnabled();
    }

    public void clickNextBtn() {
        this.submitBtn.click();
    }

    public void selectCurrencyFrom_1(String currencyFrom) {
        Select dropdown = new Select(this.currencyFrom_1);
        dropdown.selectByVisibleText(currencyFrom);
    }

    public void selectCurrencyTo_1(String currencyTo) {
        Select dropdown = new Select(this.currencyTo_1);
        dropdown.selectByVisibleText(currencyTo);
    }

    public void setForcalAmount_1(String forcalAmount) {
        this.forcalAmount_1.sendKeys(forcalAmount);
    }

    public String checkAmountWarn_1() {
        logger.debug(this.amountWarn_1.getText());
        return this.amountWarn_1.getText();
    }

    public void selectAccountType(String accountType) {
        Select dropdown = new Select(this.accountType);
        dropdown.selectByVisibleText(accountType);
    }

    public void clickBank() {
        this.bankInput.click();
    }

    public void selectBankFromList() {
        this.bankListSelect.click();
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber.clear();
        this.accountNumber.sendKeys(accountNumber);
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber.clear();
        this.routingNumber.sendKeys(routingNumber);
    }

    public String validateAccountNumber() {
        logger.debug("accountNumber = " + this.accountNumber.getAttribute("value"));
        return this.accountNumber.getAttribute("value");
    }

    public String checkResponseVerifyAccountNumber() {
        logger.debug("this.accountNumberResp.getText() " + this.accountNumberResp.getText());
        if (!this.accountNumberResp.getText().equals("")) {
            return "กรุณาระบุหมายเลขบัญชี";
        } else {
            return "";
        }
    }
}
