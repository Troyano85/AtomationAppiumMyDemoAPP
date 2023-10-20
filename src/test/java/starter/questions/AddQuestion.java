package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ProductSpecificationUI;

public class AddQuestion  implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ProductSpecificationUI.COUNTER.resolveFor(actor).getText();
    }
        public static Question<String>valueCounter(){
            return new AddQuestion();}
}
