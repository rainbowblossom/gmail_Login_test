package com.gmail.pages;

import com.gmail.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GmailPage extends Utility{
    private static final Logger log = LogManager.getLogger(GmailPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//img[@class='gb_wc']")
    WebElement gmailLogo;


    public void verifyGmailLogo(){
        log.info("verify gmail logo" + gmailLogo.toString());
        verifyThatElementIsDisplayed(gmailLogo);

    }
}
