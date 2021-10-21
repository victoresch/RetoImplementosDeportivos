package ui;

import net.serenitybdd.screenplay.targets.Target;

public class IndexTienda {
    public static final Target LBL_PRODUCTO =Target.the("nombre producto").locatedBy("//div[contains(text(),'{0}')]");
}
