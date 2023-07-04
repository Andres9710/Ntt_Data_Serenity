package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPage {
    public static final Target button_checkout = Target.the("Choose a button check out").located(By.id("checkout"));
}
