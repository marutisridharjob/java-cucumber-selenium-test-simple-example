package com.testingbotdemo.selenium.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.testingbotdemo.selenium.cucumber.definitions"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}