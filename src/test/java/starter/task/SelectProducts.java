package starter.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import starter.ui.ProductSpecificationUI;
import starter.ui.ProductsViewUI;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsViewUI.IMG_PRODUCT),
                Scroll.to(ProductSpecificationUI.PRODUCT_HIGHLIGHTS));
       actor.attemptsTo(Click.on(ProductSpecificationUI.BTN_ADD_TO_CART));

    }

    public static Performable buy() {
        return instrumented(SelectProducts.class);
    }
}