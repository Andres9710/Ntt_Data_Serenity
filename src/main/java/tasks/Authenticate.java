package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class Authenticate implements Task {

    private String user,password;
    public Authenticate (String user, String password){
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        password = "secret_sauce";
        actor.attemptsTo(
                Enter.theValue(user).into(input_name),
                Enter.theValue(password).into(input_password),
                Click.on(button_choose)
        );
    }

    public static Authenticate insert(String user, String password) {
        return instrumented(Authenticate.class, user,password);
    }


}
