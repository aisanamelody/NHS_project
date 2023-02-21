package com.nhs;

import com.nhs.utilities.DriverHelper;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {

    public WebDriver driver;

    @Before
    public void setUp(){
        driver= DriverHelper.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
