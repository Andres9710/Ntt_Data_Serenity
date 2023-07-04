package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {
    public static final Target choose_first_articule = Target.the("Choose a first articule").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target choose_second_articule = Target.the("Choose a second articule").located(By.id("add-to-cart-sauce-labs-bike-light"));

}
