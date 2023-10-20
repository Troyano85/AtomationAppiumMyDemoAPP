package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginViewUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Identify  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("bob@example.com").into(LoginViewUI.INPUT_USERNAME),
                SendKeys.of("10203040").into(LoginViewUI.INPUT_PASSWORD),
                Click.on(LoginViewUI.BTN_LOGIN)

        );
    }
    public static Performable writeCredentials(){
        return instrumented(Identify.class);
    }
}
