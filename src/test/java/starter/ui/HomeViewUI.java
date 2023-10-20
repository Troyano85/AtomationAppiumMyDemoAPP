package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeViewUI {
  public static final Target BTN_MENU=Target.the("menu button")
          .located(By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView"));

  public static final Target LOGIN_IN=Target.the("login in")
          .located(AppiumBy.accessibilityId("menu item log in"));

}
