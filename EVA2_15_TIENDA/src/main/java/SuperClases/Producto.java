package SuperClases;

public abstract class Producto {
    protected double Precio;
    private String Nombre;
    private String Unidad;

    public Producto() {
        this.Precio = 0;
        this.Nombre = "";
        this.Unidad = "";
    }

    public Producto(double Precio, String Nombre, String Unidad) {
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.Unidad = Unidad;
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

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }
    
    public abstract double precioVenta(int cant);
    
    public abstract String toString();
    
}
