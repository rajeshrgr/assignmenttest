package com.assignment.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty" }, features = "src/test/resources/features/test1.feature", glue = {
        "com.assignment.test" })
public class TestRunner {

}
