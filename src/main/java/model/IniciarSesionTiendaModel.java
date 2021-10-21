package model;

public class IniciarSesionTiendaModel {

    String usuario;
    String claveUsuario;

    public IniciarSesionTiendaModel(String correoUsuario,String claveUsuario){
        this.usuario =correoUsuario;
        this.claveUsuario=claveUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }
}
