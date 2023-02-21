package com.nhs.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverHelper {


    public static WebDriver driver;

    private DriverHelper(){}

    public static WebDriver getDriver(){

        if (driver==null || ((RemoteWebDriver) driver).getSessionId()==null ){

            switch (ConfigReader.initializePropertyFile("browser")){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.chromedriver().setup();
                    driver=new FirefoxDriver();
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }
        }

       return driver;


    }






}
