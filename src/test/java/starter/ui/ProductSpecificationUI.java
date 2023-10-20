package starter.ui;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductSpecificationUI {


    public static final Target BTN_ADD_TO_CART=Target.the("Add To Cart button")
            .located(AppiumBy.accessibilityId("Add To Cart button"));
    public static final Target COUNTER=Target.the("product counter")
            .located(AppiumBy.accessibilityId("counter amount"));

    public  static final Target PRODUCT_HIGHLIGHTS=Target.the("scroll")
            .located(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".scrollIntoView(new UiSelector().text(\"Product Highlights\"))"));
}


