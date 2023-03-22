package eva2_17_interfaces;

public abstract class Producto implements MostrarDatos {
    private double Precio;
    private String Nombre;

    public Producto() {
    }

    public Producto(double Precio, String Nombre) {
        this.Precio = Precio;
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
