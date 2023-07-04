package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/ ")
public class HomePage extends PageObject {

    public static final Target input_name = Target.the("Input of user").located(By.id("user-name"));
    public static final Target input_password = Target.the("Input of password").located(By.id("password"));
    public static final Target button_choose = Target.the("Click og button").located(By.id("login-button"));
}
