package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.InicarSesionTiendaUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AutenticarseEnTienda implements Task {

    public AutenticarseEnTienda() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InicarSesionTiendaUi.BTN_LOGIN));
    }

    public static AutenticarseEnTienda pulsando(){
        return instrumented(AutenticarseEnTienda.class);
    }
}
