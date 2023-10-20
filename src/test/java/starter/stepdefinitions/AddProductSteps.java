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
import starter.task.SelectProducts;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AddProductSteps {


    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user logged in and is on the products page")
    public void theUserLoggedInAndIsOnTheProductsPage() {
        theActorCalled("user").attemptsTo(
                NavigateTo.enterLogin(), Identify.writeCredentials()
        );
    }
    @When("the user selects the product to add it to the cart")
    public void theUserSelectsTheProductToAddItToTheCart() {
        theActorInTheSpotlight().attemptsTo(
                SelectProducts.buy()
        );
    }
    @Then("the user must see the product added to the shopping cart")
    public void theUserMustSeeTheProductAddedToTheShoppingCart() {
        String expectedCounterText="1";
        theActorInTheSpotlight().should(
                seeThat("the counter text", LoggedInQuestions.value(),equalTo(expectedCounterText)));

    }


}
