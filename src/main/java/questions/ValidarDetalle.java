package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.DetalleProducto;
import ui.InicarSesionTiendaUi;

public class ValidarDetalle implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(DetalleProducto.BTN_BACK).viewedBy(actor).asString();
    }
    public static ValidarDetalle producto(){
        return new ValidarDetalle();
    }
}
