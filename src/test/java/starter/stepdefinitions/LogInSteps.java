package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.LoggedInQuestions;
import starter.task.Identify;
import starter.task.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LogInSteps {


    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("John is at the home of the app and agrees to log in")
    public void johnIsAtTheHomeOfTheAppAndAgreesToLogIn() {
      theActorCalled("John").attemptsTo(
              NavigateTo.enterLogin()
      );

    }
    @When("he sends his credentials")
    public void heSendsHisCredentials() {

        theActorInTheSpotlight().attemptsTo(Identify.writeCredentials());
    }
    @Then("He looks at the welcome message")
    public void heLooksAtTheWelcomeMessage() {
        String expectedWelcomeText="Products";
        theActorInTheSpotlight().should(
                seeThat("the welcome text", LoggedInQuestions.value(),equalTo(expectedWelcomeText))
        );

    }






}
