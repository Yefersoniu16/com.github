package com.githud.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/login_githud.feature"},
        glue = {"com.githud.stepdefinitions"},

        snippets = SnippetType.CAMELCASE)
public class LoginPage {
}
