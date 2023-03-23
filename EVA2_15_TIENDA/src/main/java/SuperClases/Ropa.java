package SuperClases;

public abstract class Ropa extends Producto{
    private String Marca;
    private String Color;

    public Ropa() {
        super();
        this.Marca = "";
        this.Color = "";
    }

    public Ropa(double Precio, String Nombre, String Unidad, String Marca, String Color) {
        super(Precio, Nombre, Unidad);
        this.Marca = Marca;
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
