package tasks;

import model.ProductoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.IndexTienda;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {

    ProductoModel modelo;

    public SeleccionarProducto(ProductoModel modelo) {
        this.modelo = modelo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexTienda.LBL_PRODUCTO.of(modelo.getNombreProducto())));
    }
    public static SeleccionarProducto deNombre(ProductoModel nombreProducto) {
        return instrumented(SeleccionarProducto.class, nombreProducto);
    }
}
