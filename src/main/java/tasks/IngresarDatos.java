package tasks;

import model.IniciarSesionTiendaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatos implements Task {

    IniciarSesionTiendaModel modelo;


    public IngresarDatos(IniciarSesionTiendaModel modelo){
        this.modelo=modelo;
    }

    @Step ("El actor inicia sesion en la tienda")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(IniciarSesionTienda.con(modelo.getUsuario(),modelo.getClaveUsuario()));

    }

    public static IngresarDatos en(IniciarSesionTiendaModel modelo){
        return instrumented(IngresarDatos.class,modelo);
    }
}
