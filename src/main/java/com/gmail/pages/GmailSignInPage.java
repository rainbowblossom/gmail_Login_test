package com.gmail.pages;

import com.gmail.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(GmailSignInPage.class.getName());
    public GmailSignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id= "identifierId")
    WebElement usernameLink;

    @CacheLookup
   // @FindBy(xpath = "//span[contains(text(),'Next')]")
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextButton;

    @CacheLookup
    @FindBy(css= "input[name='password']")
    WebElement passwordLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='OyEIQ uSvLId']//span")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(css = ".o6cuMc")
    WebElement errorMessage2;

    public void enterUserName(String username){
        sendTextToElement(usernameLink, username);
        log.info( "Enter username in username field" + usernameLink.toString());
    }
    public void clickOnNextButton(){
        clickOnElement(nextButton);
        log.info( "Click on the next button" + nextButton.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passwordLink, password);
        log.info( "Enter password in password field" + passwordLink.toString());
    }
    public String verifyErrorMessage(){
        log.info("Verify error message" + errorMessage.toString());
        return errorMessage.getText();

    }
    public String verifyErrorMessage2(){
        log.info("Verify error message" + errorMessage2.toString());
        return errorMessage2.getText();

    }
}

