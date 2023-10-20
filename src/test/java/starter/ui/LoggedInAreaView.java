package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInAreaView {

    public static final Target WELCOME_TEXT=Target.the("welcome text")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Products')]"));
}
