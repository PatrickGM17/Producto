package Producto;

public class Producto {
    private int codigoProducto;

    private String nombre;

    private double precio;

    public Producto(int codPro, String nombre, double precio) {
        this.codigoProducto = codPro;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodPro() {
        return codigoProducto;
    }

    public void setCodPro(int codPro) {
        this.codigoProducto = codPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
