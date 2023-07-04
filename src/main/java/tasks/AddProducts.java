package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static userinterfaces.CartPage.choose_a_view_cart;
import static userinterfaces.ConfirmPage.button_checkout;
import static userinterfaces.FormPage.*;
import static userinterfaces.InventoryPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {
    private String name,lastname,code_zip;
    public AddProducts(){
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(choose_first_articule),
                Click.on(choose_second_articule)
        );

        try {
            Thread.sleep(3000); // Espera de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        name ="Andy";
        lastname="Llumiquinga";
        code_zip="171475";
        actor.attemptsTo(
                Click.on(choose_a_view_cart),
                Click.on(button_checkout),
                Enter.theValue(name).into(input_first_name),
                Enter.theValue(lastname).into(input_last_name),
                Enter.theValue(code_zip).into(input_zip_code),
                Click.on(button_continue),
                Click.on(button_finish)
        );
    }

    public static AddProducts add() {

        return instrumented(AddProducts.class);
    }

}
