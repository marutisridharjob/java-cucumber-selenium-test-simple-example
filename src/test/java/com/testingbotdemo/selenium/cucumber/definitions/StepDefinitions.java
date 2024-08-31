package com.testingbotdemo.selenium.cucumber.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import com.testingbotdemo.selenium.cucumber.drivers.TestingBotDriver;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    WebDriver driver = TestingBotDriver.getDriver();

    @Given("I open Google")
    public void i_open_google() {
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        driver.findElement(By.name("q")).sendKeys(query);
        driver.findElement(By.name("btnK")).submit();
    }

    @Then("I should see results")
    public void i_should_see_results() {
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }
}