package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target input_first_name = Target.the("Input of user").located(By.id("first-name"));
    public static final Target input_last_name = Target.the("Input of password").located(By.id("last-name"));
    public static final Target input_zip_code = Target.the("Input of zip_code").located(By.id("postal-code"));
    public static final Target button_continue = Target.the("Click on continue button").located(By.id("continue"));
    public static final Target button_finish = Target.the("Click on finish button").located(By.id("finish"));
}
