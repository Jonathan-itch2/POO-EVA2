package Productos;

import SuperClases.Ropa;
public final class Playera extends Ropa{
    private String Talla;
    private String Tipo;

    public Playera() {
        super();
        this.Talla = "";
        this.Tipo = "";
    }

    public Playera(double Precio, String Nombre, String Unidad, String Marca, String Color, String Talla, String Tipo) {
        super(Precio, Nombre, Unidad, Marca, Color);
        this.Talla = Talla;
        this.Tipo = Tipo;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public double precioVenta(int cant) {
        if(cant<5){
            return cant * Precio;
        } else {
            return (Precio * 0.80) * cant;
        }
    }

    @Override
    public String toString() {
        String cade = "Datos:  \n"+
                "Precio: " + Precio + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Unidad: " + getUnidad() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Color: " + getColor() + "\n" +
                "Talla: " +getTalla() + "\n" +
                "Tipo: " + getTipo() + "\n";
        
        return cade;
    }
    
    
 
}
