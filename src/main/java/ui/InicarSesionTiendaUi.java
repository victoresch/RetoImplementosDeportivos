package ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicarSesionTiendaUi {

    public static final Target LBL_USERNAME =Target.the("Correo usuario").locatedBy("//input[@id='user-name']");
    public static final Target LBL_PASSWORD=Target.the("Contraseña usuario").locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN =Target.the("Boton iniciar sesion").locatedBy("//input[@id='login-button']");
    public static final Target LABEL_LOGO = Target.the("Label de logo").locatedBy("//span[@class='title']");
}
