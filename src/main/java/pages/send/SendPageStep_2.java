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
public class SendPageStep_2 {

    WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(SendPageStep_1.class);

    public SendPageStep_2(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/label[3]/input[1]")
    WebElement checkCIF;

    @FindBy(id = "cifNumber")
    WebElement cifInput;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]")
    WebElement receiverList;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/button[3]")
    WebElement verifyReceiver;

    @FindBy(className = "toast-title")
    WebElement checkStatus;

    @FindBy(className = "toast-message")
    WebElement checkStatusDetail;

    @FindBy(id = "custSourceFnameEng")
    WebElement fname;

    @FindBy(id = "custSourceMnameEng")
    WebElement mname;

    @FindBy(id = "custSourceLnameEng")
    WebElement lname;

    @FindBy(id = "custSourceLnameEng2")
    WebElement lname2;

    @FindBy(id = "custSourceDateOfBirth")
    WebElement DOB;

    @FindBy(id = "custSourceAddress1")
    WebElement address;

    @FindBy(id = "custSourceDistrict")
    WebElement state;

    @FindBy(id = "customerSubDistrict")
    WebElement city;

    @FindBy(id = "custSourceNationality")
    WebElement nationality;

    @FindBy(id = "custSourceCountryOfBirth")
    WebElement COB;

    @FindBy(id = "custSourceCity")
    WebElement custSourceCity;

    @FindBy(id = "custSourceDistrict")
    WebElement custSourceDistrict;

    @FindBy(id = "customerSubDistrict")
    WebElement customerSubDistrict;

    @FindBy(id = "custSourceZipcode")
    WebElement custSourceZipcode;

    @FindBy(id = "custSourceMobilePhone")
    WebElement custSourceMobilePhone;

    @FindBy(id = "custSourceEmail")
    WebElement custSourceEmail;

    @FindBy(id = "custSourceCardIssueBy")
    WebElement custSourceCardIssueBy;

    @FindBy(id = "custOccupation")
    WebElement custOccupation;

    @FindBy(id = "custSourceFunds")
    WebElement custSourceFunds;

    @FindBy(id = "custPaymentMethod")
    WebElement custPaymentMethod;

    @FindBy(id = "custBeneRelationship")
    WebElement custBeneRelationship;

    @FindBy(id = "custDestFname")
    WebElement custDestFname;

    @FindBy(id = "custDestMname")
    WebElement custDestMname;

    @FindBy(id = "custDestLname")
    WebElement custDestLname;

    @FindBy(id = "custDestLname2")
    WebElement custDestLname2;

    @FindBy(id = "custDestNationality")
    WebElement custDestNationality;

    @FindBy(id = "custDestCountryOfBirth")
    WebElement custDestCountryOfBirth;

    @FindBy(id = "custDestAddress1")
    WebElement custDestAddress1;

    @FindBy(id = "custDestDistrict")
    WebElement custDestDistrict;

    @FindBy(id = "custDestState")
    WebElement custDestState;

    @FindBy(id = "custDestZipcode")
    WebElement custDestZipcode;

    @FindBy(id = "destinationPrimaryContactCountryCode")
    WebElement destinationPrimaryContactCountryCode;

    @FindBy(id = "custDestMobilePhone")
    WebElement custDestMobilePhone;

    @FindBy(id = "custDestEmail")
    WebElement custDestEmail;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/button[3]")
    WebElement verifyReceiverBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[6]/div[2]/div[1]/textarea[1]")
    WebElement custDestMessage;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]/span[1]")
    WebElement cifResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/span[1]")
    WebElement fnameResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[3]/span[1]/span[1]")
    WebElement lnameResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/span[1]")
    WebElement DOBResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/span[2]")
    WebElement DOBemptyResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[6]/div[1]/div[1]/span[1]/span[1]")
    WebElement addressResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[2]/div[1]/span[1]/span[1]")
    WebElement nationalityResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[5]/div[2]/div[1]/span[1]/span[1]")
    WebElement custSourceCityResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[5]/div[3]/div[1]/span[1]/span[1]")
    WebElement custSourceDistrictResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[5]/div[4]/div[1]/span[1]/span[1]")
    WebElement customerSubDistrictResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[6]/div[2]/div[1]/span[1]/span[1]")
    WebElement custSourceZipcodeResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[6]/div[3]/div[1]/div[2]/span[1]/span[1]")
    WebElement custSourceMobilePhoneResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[6]/div[4]/span[1]")
    WebElement custSourceEmailResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[8]/div[1]/div[1]/span[1]/span[1]")
    WebElement custOccupationResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[8]/div[2]/div[1]/span[1]/span[1]")
    WebElement custSourceFundsResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[8]/div[3]/div[1]/span[1]/span[1]")
    WebElement custPaymentMethodResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[8]/div[4]/div[1]/span[1]/span[1]")
    WebElement custBeneRelationshipResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[3]/div[1]/div[1]/span[1]/span[1]")
    WebElement custDestFnameResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[3]/div[3]/div[1]/span[1]/span[1]")
    WebElement custDestLnameResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/div[1]/div[1]/span[1]/span[1]")
    WebElement custDestNationalityResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/div[4]/div[1]/span[1]/span[1]")
    WebElement custDestAddress1Resp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/div[4]/div[1]/span[1]/span[1]")
    WebElement custDestDistrictResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/div[4]/div[1]/span[1]/span[1]")
    WebElement custDestSubDistrictResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[4]/div[4]/div[1]/span[1]/span[1]")
    WebElement custDestZipcodeResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[5]/div[4]/div[1]/div[1]/span[1]/span[1]")
    WebElement destinationPrimaryContactCountryCodeResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[5]/div[4]/div[1]/div[2]/span[1]/span[1]")
    WebElement custDestMobilePhoneResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[6]/div[1]/div[1]/span[1]")
    WebElement custDestEmailResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[5]/div[3]/div[1]/span[1]/span[1]")
    WebElement statedResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[5]/div[4]/div[1]/span[1]/span[1]")
    WebElement cityResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/span[1]/button[1]")
    WebElement showCalendarDOB;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/button[1]/strong[1]")
    WebElement yearOnCalendarDOB;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/button[1]/strong[1]")
    WebElement monthOnCalendarDOB;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/button[1]")
    WebElement in1997DOB;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/button[1]")
    WebElement onMayDOB;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/button[1]/span[1]")
    WebElement at07thDOB;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")
    WebElement calendarDOBToday;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/button[2]")
    WebElement clearDOBButton;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/span[1]/button[1]")
    WebElement showCalendarDOE;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/button[1]/strong[1]")
    WebElement yearOnCalendarDOE;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/button[1]/strong[1]")
    WebElement monthOnCalendarDOE;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/button[1]")
    WebElement in2020DOE;

        @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/button[1]")
    WebElement in2019DOE;
    
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/button[1]/span[1]")
    WebElement onDecDOE;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/button[1]/span[1]")
    WebElement at07thDOE;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")
    WebElement calendarDOEToday;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/button[2]")
    WebElement clearDOEButton;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/span[1]")
    WebElement DOEResp;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[4]/div[1]/span[2]")
    WebElement DOEResp1;

    public void clickDOBCalendar() {
        showCalendarDOB.click();
    }

    public void clickDOBExitMonth() {
        monthOnCalendarDOB.click();
    }

    public void clickDOBExitYear() {
        yearOnCalendarDOB.click();
    }

    public void clickDOBYear() {
        in1997DOB.click();
    }

    public void clickDOBMonth() {
        onMayDOB.click();
    }

    public void clickDOBDay() {
        at07thDOB.click();
    }

    public void clickDOBToday() {
        calendarDOBToday.click();
    }

    public void clickDOBClear() {
        clearDOBButton.click();
    }

    public void clickDOECalendar() {
        showCalendarDOE.click();
    }

    public void clickDOEExitMonth() {
        monthOnCalendarDOE.click();
    }

    public void clickDOEExitYear() {
        yearOnCalendarDOE.click();
    }

    public void clickDOEYear() {
        in2020DOE.click();
    }

    public void clickDOEMonth() {
        onDecDOE.click();
    }

    public void clickDOEDay() {
        at07thDOE.click();
    }
    public void clickDOEYearExp() {
        in2019DOE.click();
    }

    public void clickDOEMonthExp() {
        onDecDOE.click();
    }

    public void clickDOEDayExp() {
        at07thDOE.click();
    }
    public void clickDOEToday() {
        calendarDOEToday.click();
    }

    public void clickDOEClear() {
        clearDOEButton.click();
    }

    public void checkCif() {
        this.checkCIF.click();
    }

    public void inputCIF(String cif) {
        this.cifInput.clear();
        this.cifInput.sendKeys(cif);
    }

    public void selectReceiver(String receiver) {
        Select dropdown = new Select(this.receiverList);
        dropdown.selectByVisibleText(receiver);
    }

    public void verifyReceiver() {
        logger.debug("click verifyReceiver");
        this.verifyReceiver.click();
    }

    public String checkResponseVerifyReceiver() {
        return this.checkStatus.getText() + "" + this.checkStatusDetail.getText();
    }

    public String validateCif() {
        logger.debug("validateCif = " + this.cifInput.getAttribute("value"));
        return this.cifInput.getAttribute("value");
    }

    public String checkResponseVerifyCif() {
        if (this.cifResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ CIF Number";
        } else {
            return "";
        }

    }

    public void inputFName(String fname) {
        this.fname.clear();
        this.fname.sendKeys(fname);
    }

    public String validateFName() {
        logger.debug("validateCif = " + this.fname.getAttribute("value"));
        return this.fname.getAttribute("value");
    }

    public String checkResponseVerifyFname() {

        if (this.fnameResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ ชื่อจริง (ภาษาอังกฤษ)";
        } else {
            return "";
        }
    }

    public void inputMName(String mname) {
        this.mname.clear();
        this.mname.sendKeys(mname);
    }

    public String validateMName() {
        logger.debug("validateMname = " + this.mname.getAttribute("value"));
        return this.mname.getAttribute("value");
    }

    public void inputLName(String lname) {
        this.lname.clear();
        this.lname.sendKeys(lname);
    }

    public String checkResponseVerifyLname() {
        if (this.lnameResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ นามสกุล (ภาษาอังกฤษ)";
        } else {
            return "";
        }
    }

    public String validateLName() {
        logger.debug("validateLName = " + this.lname.getAttribute("value"));
        return this.lname.getAttribute("value");
    }

    public void inputLName2(String lname2) {
        this.lname2.clear();
        this.lname2.sendKeys(lname2);

    }

    public String validateLName2() {
        logger.debug("validateLname2 = " + this.lname2.getAttribute("value"));
        return this.lname2.getAttribute("value");
    }

    public void inputDOB(String DOB) {
        this.DOB.clear();
        this.DOB.sendKeys(DOB);
    }

    public String checkResponseVerifyDOB() {
        logger.debug("this.DOBResp.getText() " + this.DOBResp.getText());
        if (!this.DOBResp.getText().equals("")) {
            return this.DOBResp.getText();
        } else {
            return "";
        }
    }

    public String checkResponseVerifyDOBEmpty() {
        logger.debug("this.DOBResp.getText() " + this.DOBemptyResp.getText());
        if (!this.DOBemptyResp.getText().equals("")) {
            return this.DOBemptyResp.getText();
        } else {
            return "";
        }
    }

    public String checkResponseVerifyDOE() {
        logger.debug("this.DOEResp.getText() " + this.DOEResp.getText());
        if (!this.DOEResp.getText().equals("")) {
            return this.DOEResp.getText();
        } else {
            return "";
        }
    }

    public String checkResponseVerifyDOE1() {
        logger.debug("this.DOEResp.getText() " + this.DOEResp1.getText());
        if (!this.DOEResp1.getText().equals("")) {
            return this.DOEResp1.getText();
        } else {
            return "";
        }
    }

    public void inputAddress(String address) {
        this.address.clear();
        this.address.sendKeys(address);
        logger.debug("input address " + this.address.getAttribute("value"));
    }

    public String checkResponseVerifyAddress() {
        if (this.addressResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ ที่อยู่";
        } else {
            return "";
        }
    }

    public String validateAddress() {
        logger.debug("validateAddress = " + this.address.getAttribute("value"));
        return this.address.getAttribute("value");
    }

    public void inputState(String state) {
        this.state.clear();
        this.state.sendKeys(state);
        logger.debug("input address " + this.state.getAttribute("value"));
    }

    public Object validateState() {
        logger.debug("validateState = " + this.state.getAttribute("value"));
        return this.state.getAttribute("value");
    }

    public void inputCity(String city) {
        this.city.clear();
        this.city.sendKeys(city);
        logger.debug("input address " + this.city.getAttribute("value"));
    }

    public Object validateCity() {
        logger.debug("validateCity = " + this.city.getAttribute("value"));
        return this.city.getAttribute("value");
    }

    public void inputPostCode(String postCode) {
        this.custSourceZipcode.clear();
        this.custSourceZipcode.sendKeys(postCode);
        logger.debug("input address " + this.custSourceZipcode.getAttribute("value"));
    }

    public String checkResponseVerifyPostCode() {
        if (this.custSourceZipcodeResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ ที่อยู่";
        } else {
            return "";
        }
    }

    public String validatePostCode() {
        logger.debug("validatePostCode = " + this.custSourceZipcode.getAttribute("value"));
        return this.custSourceZipcode.getAttribute("value");
    }

    public void inputPhoneNo(String phoneNo) {
        this.custSourceMobilePhone.clear();
        this.custSourceMobilePhone.sendKeys(phoneNo);
        logger.debug("input phoneNo " + this.custSourceMobilePhone.getAttribute("value"));
    }

    public String checkResponseVerifyPhoneNo() {

        if (this.custSourceMobilePhoneResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ เบอร์โทรศัพท์";
        } else {
            return "";
        }
    }

    public String validatePhoneNo() {
        logger.debug("validatePhoneNo = " + this.custSourceMobilePhone.getAttribute("value"));
        return this.custSourceMobilePhone.getAttribute("value");
    }

    public void inputEmail(String email) {
        this.custSourceEmail.clear();
        this.custSourceEmail.sendKeys(email);
        logger.debug("input email " + this.custSourceEmail.getAttribute("value"));
    }

    public Object validateEmail() {
        logger.debug("validateEmail = " + this.custSourceEmail.getAttribute("value"));
        return this.custSourceEmail.getAttribute("value");
    }

    public String checkResponseVerifyEmail() {
        if (!this.custSourceEmailResp.getText().equals("")) {
            return "กรุณาระบุรูปแบบอีเมล์ให้ถูกต้อง Ex. abc@mail.com";
        } else {
            return "";
        }
    }

    public void inputJob(String job) {
        this.custOccupation.clear();
        this.custOccupation.sendKeys(job);
        logger.debug("input custOccupation " + this.custOccupation.getAttribute("value"));

    }

    public Object validateJob() {
        logger.debug("validateJob = " + this.custOccupation.getAttribute("value"));
        return this.custOccupation.getAttribute("value");
    }

    public String checkResponseVerifyJob() {

        if (this.custOccupationResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ อาชีพ";
        } else {
            return "";
        }

    }

    public void inputSource(String source) {
        this.custSourceFunds.clear();
        this.custSourceFunds.sendKeys(source);
        logger.debug("input custSourceFunds " + this.custSourceFunds.getAttribute("value"));
    }

    public String checkResponseVerifySource() {
        if (this.custSourceFundsResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ แหล่งที่มาของเงิน";
        } else {
            return "";
        }

    }

    public Object validateSource() {
        logger.debug("validateSource = " + this.custSourceFunds.getAttribute("value"));
        return this.custSourceFunds.getAttribute("value");
    }

    public void inputReceiverFName(String receiverFname) {
        this.custDestFname.clear();
        this.custDestFname.sendKeys(receiverFname);
        logger.debug("input custDestFname " + this.custDestFname.getAttribute("value"));

    }

    public Object validateReceiverFName() {

        logger.debug("validateCuseDestFname = " + this.custDestFname.getAttribute("value"));
        return this.custDestFname.getAttribute("value");
    }

    public String checkResponseVerifyReceiverFname() {
        logger.debug("this.custDestFnameResp " + this.custDestFnameResp.getText());
        if (this.custDestFnameResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ ชื่อจริง (ภาษาอังกฤษ)";
        } else {
            return "";
        }

    }

    public void inputCustDestMname(String custDestMname) {
        this.custDestMname.clear();
        this.custDestMname.sendKeys(custDestMname);
        logger.debug("input custDestMname " + this.custDestMname.getAttribute("value"));
    }

    public Object validateCustDestMname() {
        logger.debug("validateCustDestMname = " + this.custDestMname.getAttribute("value"));
        return this.custDestMname.getAttribute("value");
    }

    public void inputReceiverLName(String receiverLname) {
        this.custDestLname.clear();
        this.custDestLname.sendKeys(receiverLname);
        logger.debug("input custDestLname " + this.custDestLname.getAttribute("value"));

    }

    public Object validateReceiverLName() {

        logger.debug("validateCustDestLname = " + this.custDestLname.getAttribute("value"));
        return this.custDestLname.getAttribute("value");
    }

    public String checkResponseVerifyReceiverLname() {
        logger.debug("this.custDestLnameResp " + this.custDestLnameResp.getText());
        if (this.custDestLnameResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ นามสกุล (ภาษาอังกฤษ)";
        } else {
            return "";
        }

    }

    public void inputReceiverLName2(String custDestLname2) {
        this.custDestLname2.clear();
        this.custDestLname2.sendKeys(custDestLname2);
        logger.debug("input custDestLname2 " + this.custDestLname2.getAttribute("value"));
    }

    public Object validateReceiverLName2() {
        logger.debug("validateCustDestLname2 = " + this.custDestLname2.getAttribute("value"));
        return this.custDestLname2.getAttribute("value");
    }

    public void inputReceiverAddress(String custDestAddress) {
        this.custDestAddress1.clear();
        this.custDestAddress1.sendKeys(custDestAddress);
        logger.debug("input custDestAddress1 " + this.custDestAddress1.getAttribute("value"));
    }

    public String checkResponseVerifyReceiverAddress() {

        logger.debug("this.custDestAddress1 " + this.custDestAddress1Resp.getText());
        if (this.custDestAddress1Resp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ ที่อยู่";
        } else {
            return "";
        }
    }

    public Object validateReceiverAddress() {
        logger.debug("validateCustDestAddress = " + this.custDestAddress1.getAttribute("value"));
        return this.custDestAddress1.getAttribute("value");
    }

    public void inputReceiverDistrict(String custDestDistrict) {
        this.custDestDistrict.clear();
        this.custDestDistrict.sendKeys(custDestDistrict);
        logger.debug("input custDestAddress1 " + this.custDestDistrict.getAttribute("value"));
    }

    public String checkResponseVerifyReceiverDistrict() {

        logger.debug("this.custDestDistrict " + this.custDestDistrictResp.getText());
        if (this.custDestDistrictResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ รัฐ";
        } else {
            return "";
        }
    }

    public Object validateReceiverDistrict() {
        logger.debug("validateCustDestDistrict = " + this.custDestDistrict.getAttribute("value"));
        return this.custDestDistrict.getAttribute("value");
    }

    public void inputReceiverSubDistrict(String custDestSubDistrict) {
        this.custDestState.clear();
        this.custDestState.sendKeys(custDestSubDistrict);
        logger.debug("input custDestAddress1 " + this.custDestState.getAttribute("value"));
    }

    public Object validateReceiverSubDistrict() {
        logger.debug("validateCustDestSubDistrict = " + this.custDestState.getAttribute("value"));
        return this.custDestState.getAttribute("value");

    }

    public String checkResponseVerifyReceiverSubDistrict() {
        logger.debug("this.custDestSubDistrict " + this.custDestSubDistrictResp.getText());
        if (this.custDestSubDistrictResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ รัฐ";
        } else {
            return "";
        }
    }

    public void inputReceiverPostCode(String custDestPostCode) {
        this.custDestZipcode.clear();
        this.custDestZipcode.sendKeys(custDestPostCode);
        logger.debug("input custDestAddress1 " + this.custDestZipcode.getAttribute("value"));
    }

    public Object validateReceiverPostCode() {

        logger.debug("validateCustDestPostCode = " + this.custDestZipcode.getAttribute("value"));
        return this.custDestZipcode.getAttribute("value");
    }

    public void inputDestinationPrimaryContactCountryCode(String destinationPrimaryContactCountryCode) {
        this.destinationPrimaryContactCountryCode.clear();
        this.destinationPrimaryContactCountryCode.sendKeys(destinationPrimaryContactCountryCode);
        logger.debug("input custDestAddress1 " + this.destinationPrimaryContactCountryCode.getAttribute("value"));
    }

    public Object validateDestinationPrimaryContactCountryCode() {
        logger.debug("validateDestinationPrimaryContactCountryCode = " + this.destinationPrimaryContactCountryCode.getAttribute("value"));
        return this.destinationPrimaryContactCountryCode.getAttribute("value");
    }

    public String checkResponseVerifyDestinationPrimaryContactCountryCode() {
        logger.debug("this.destinationPrimaryContactCountryCodeResp " + this.destinationPrimaryContactCountryCodeResp.getText());
        if (this.destinationPrimaryContactCountryCodeResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ รหัส";
        } else {
            return "";
        }
    }

    public void inputCustDestMobilePhone(String custDestMobilePhone) {
        this.custDestMobilePhone.clear();
        this.custDestMobilePhone.sendKeys(custDestMobilePhone);
        logger.debug("input custDestMobilePhone " + this.custDestMobilePhone.getAttribute("value"));
    }

    public Object validateCustDestMobilePhone() {
        logger.debug("custDestMobilePhone = " + this.custDestMobilePhone.getAttribute("value"));
        return this.custDestMobilePhone.getAttribute("value");
    }

    public String checkResponseVerifyCustDestMobilePhone() {
        if (this.custDestMobilePhoneResp.getText().equals("กรุณาระบุ")) {
            return "กรุณาระบุ เบอร์โทรศัพท์";
        } else {
            return "";
        }
    }
//custDestEmail

    public void inputReceiverEmail(String receiverEmail) {
        this.custDestEmail.clear();
        this.custDestEmail.sendKeys(receiverEmail);
        logger.debug("input custDestEmail " + this.custDestEmail.getAttribute("value"));
    }

    public String checkResponseVerifyReceiverEmail() {
        if (!this.custDestEmailResp.getText().equals("")) {
            return "กรุณาระบุรูปแบบอีเมล์ให้ถูกต้อง Ex. abc@mail.com";
        } else {
            return "";
        }
    }

    public Object validateReceiverEmail() {
        logger.debug("custDestEmail = " + this.custDestEmail.getAttribute("value"));
        return this.custDestEmail.getAttribute("value");
    }

    public void inputReceiverMessage(String message) {
        this.custDestMessage.clear();
        this.custDestMessage.sendKeys(message);
        logger.debug("input custDestMessage " + this.custDestMessage.getAttribute("value"));
    }

    public Object validateReceiverMessage() {
        logger.debug("custDestMessage = " + this.custDestMessage.getAttribute("value"));
        return this.custDestMessage.getAttribute("value");
    }

    public boolean checkVerifyReceiverBtn() {
        return verifyReceiverBtn.isEnabled();
    }

    public String checkResponseVerifyCustDestState() {
        if (!this.statedResp.getText().equals("")) {
            return "กรุณาระบุเขต/อำเภอ";
        } else {
            return "";
        }
    }

    public String checkResponseVerifyCustDestCity() {
        if (!this.cityResp.getText().equals("")) {
            return "กรุณาระบุแขวง/ตำบล";
        } else {
            return "";
        }
    }
}
