package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import ui.InicarSesionTiendaUi;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesionTienda implements Task {

    private String usuario;
    private String claveUsuario;


    public IniciarSesionTienda(String Usuario, String clave) {
        this.usuario = Usuario;
        this.claveUsuario = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(InicarSesionTiendaUi.LBL_USERNAME),
                Enter.theValue(claveUsuario).into(InicarSesionTiendaUi.LBL_PASSWORD)
        );
    }

    public static IniciarSesionTienda con(String usuario, String clave) {
        return instrumented(IniciarSesionTienda.class, usuario, clave);
    }
}
