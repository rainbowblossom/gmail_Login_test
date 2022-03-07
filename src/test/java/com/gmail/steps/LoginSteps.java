package com.gmail.steps;

import com.gmail.pages.GmailPage;
import com.gmail.pages.GmailSignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {


    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new GmailSignInPage().enterUserName(username);
    }

    @And("^I click on next button$")
    public void iClickOnNextButton() {
        new GmailSignInPage().clickOnNextButton();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws InterruptedException {
        Thread.sleep(3000);
        new GmailSignInPage().enterPassword(password);
       //new GmailSignInPage().clickOnNextButton();
    }

    @And("^I can see \"([^\"]*)\"$")
    public void iCanSee(String errorMessage) throws InterruptedException {
        Thread.sleep(3000);
        String expectedMessage = errorMessage;
        String actualMessage = new GmailSignInPage().verifyErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(3000);
    }

    @Then("^I am able to login gmail account$")
    public void iAmAbleToLoginGmailAccount() {
        System.out.println("I have login successfully");
    }


    @And("^I verify that gmail logo is displayed$")
    public void iVerifyThatGmailLogoIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        new GmailPage().verifyGmailLogo();

    }

    @Then("^I can see error message \"([^\"]*)\"$")
    public void iCanSeeErrorMessage(String errorMessage2) throws InterruptedException {
        Thread.sleep(3000);
        String expectedMessage = errorMessage2;
        String actualMessage = new GmailSignInPage().verifyErrorMessage2();
        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(3000);
    }
}

