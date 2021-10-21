package model;

public class ProductoModel {
    String nombreProducto;

    public ProductoModel(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
