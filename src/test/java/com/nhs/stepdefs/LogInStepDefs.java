package com.nhs.stepdefs;

import com.nhs.pages.LogInPage;
import com.nhs.utilities.ConfigReader;
import com.nhs.utilities.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogInStepDefs {

WebDriver driver= DriverHelper.getDriver();

LogInPage logInPage=new LogInPage(driver);


    @Given("User navigates to NHS url")
    public void user_navigates_to_nhs_url() {
       driver.get(ConfigReader.initializePropertyFile("QA_NHS_URL"));
    }

    @Given("User enters userName and password")
    public void user_enters_user_name_and_password() throws InterruptedException {
        logInPage.enterCredentials();
    }

    @Then("User clicks sign in button")
    public void user_clicks_sign_in_button() {
        logInPage.clickLogInButton();
    }

    @Then("User validates the title is {string}")
    public void user_validates_the_title_is(String expectedTitleName) {

        Assert.assertEquals(expectedTitleName,driver.getTitle());
    }

}
