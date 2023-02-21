package com.nhs.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/nhs/stepdefs",
        dryRun = true,
        tags = ""





)
public class CukesRunner {
}
