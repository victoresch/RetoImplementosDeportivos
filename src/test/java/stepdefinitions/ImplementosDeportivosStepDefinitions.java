package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.IniciarSesionTiendaModel;
import model.ProductoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ValidarDetalle;
import questions.ValidarHome;
import tasks.AbrirPaginaTienda;
import tasks.AutenticarseEnTienda;
import tasks.IngresarDatos;
import tasks.SeleccionarProducto;

import java.util.List;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;

public class ImplementosDeportivosStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Victor");

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^el usuario tiene sus datos para iniciar sesion$")
    public void elUsuarioTieneSusDatosParaIniciarSesion(List<IniciarSesionTiendaModel> modelo) throws Exception {
        actor.wasAbleTo(AbrirPaginaTienda.en());
        actor.wasAbleTo(IngresarDatos.en(modelo.get(0)));
    }
    @Cuando("^el usuario se autentica en la pagina$")
    public void elUsuarioSeAutenticaEnLaPagina() throws Exception {
        actor.wasAbleTo(AutenticarseEnTienda.pulsando());
    }
    @Entonces("^el usuario se ubica en el home(.*)$")
    public void elUsuarioSeUbicaEnElHome(String mensaje) throws Exception {
        actor.should(eventually(seeThat(ValidarHome.productos(), equalToIgnoringWhiteSpace(mensaje))));
    }

    @Cuando("^selecciona un producto$")
    public void seleccionaUnProducto(List <ProductoModel> modeloProducto) throws Exception {
        System.out.println("nombre del producto: " + modeloProducto.get(0).getNombreProducto());
        actor.wasAbleTo(SeleccionarProducto.deNombre(modeloProducto.get(0)));
    }

    @Entonces("^el puede ver las especificaciones del producto (.*)$")
    public void elPuedeVerLasEspecificacionesDelProducto(String validar) throws Exception {
        actor.should(eventually(seeThat(ValidarDetalle.producto(), containsString(validar))));
    }
}
