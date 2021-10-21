package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.InicarSesionTiendaUi;

public class ValidarHome implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(InicarSesionTiendaUi.LABEL_LOGO).viewedBy(actor).asString();
    }
    public static ValidarHome productos(){
        return new ValidarHome();
    }
}
