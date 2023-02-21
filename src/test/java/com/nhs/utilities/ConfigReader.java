package com.nhs.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public  static Properties property;
    private static  String configPath="configuration.properties";


    public static String  initializePropertyFile(String key){
        property=new Properties();
        try {
            InputStream inputStream= new FileInputStream(configPath);
            property.load(inputStream);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return property.getProperty(key);
    }
}
