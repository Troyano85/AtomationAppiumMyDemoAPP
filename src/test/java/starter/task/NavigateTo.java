package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.HomeViewUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeViewUI.BTN_MENU),
                Click.on(HomeViewUI.LOGIN_IN)
        );
    }
    public static Performable enterLogin(){
        return instrumented(NavigateTo.class);
    }

}

