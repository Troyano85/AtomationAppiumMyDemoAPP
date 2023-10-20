package starter.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login/login.feature",glue = "starter/stepdefinitions",
        snippets =CucumberOptions.SnippetType.CAMELCASE)

public class logInRunner {
}