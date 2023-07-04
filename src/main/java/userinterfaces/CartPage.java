package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target choose_a_view_cart = Target.the("Choose a view cart").located(By.id("shopping_cart_container"));
}
