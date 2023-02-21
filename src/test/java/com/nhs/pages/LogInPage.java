package com.nhs.pages;

import com.nhs.utilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {


    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }


    @FindBy(id = "inputEmail")
    WebElement userName;

    @FindBy(id = "inputPassword")
    WebElement password;

    @FindBy( xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;



    public  void enterCredentials() throws InterruptedException {
       this.userName.sendKeys(ConfigReader.initializePropertyFile("QA_username"));
       Thread.sleep(3000);
       this.password.sendKeys(ConfigReader.initializePropertyFile("QA_password"));

    }

    public void   clickLogInButton(){
        signInButton.click();
    }







}
