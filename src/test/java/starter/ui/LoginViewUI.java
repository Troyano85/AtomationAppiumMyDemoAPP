package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginViewUI {

    public static final Target  INPUT_USERNAME=Target.the("input user name")
            .located(AppiumBy.accessibilityId("Username input field"));
    public static final Target INPUT_PASSWORD=Target.the("input password")
            .located(AppiumBy.accessibilityId("Password input field"));
    public static final Target BTN_LOGIN=Target.the("button login")
            .located(AppiumBy.accessibilityId("Login button"));
}
