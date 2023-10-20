package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsViewUI {

    public static final Target IMG_PRODUCT=Target.the("img producto")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[2]/android.view" +
                    ".ViewGroup[1]/android.widget.ImageView"));


}
