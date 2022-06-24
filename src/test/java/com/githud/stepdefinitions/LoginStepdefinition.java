package com.githud.stepdefinitions;

import com.githud.questions.VerifyLogin;
import com.githud.tasks.PageLogin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepdefinition {
    @Before
    public void setThetago() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Yeferson");
    }

    @Given("^i want to open the page$")
    public void iWantToOpenThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://github.com/"));

    }

    @When("^I want to login$")
    public void iWantToLogin() {
        theActorInTheSpotlight().attemptsTo(PageLogin.startSection());
    }

    @Then("^successful login$")
    public void successfulLogin() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyLogin.veification()
        ));
    }
}
