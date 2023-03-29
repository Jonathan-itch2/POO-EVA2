package eva2_20_vehiculo;

public class Bicicleta extends Vehiculo{
    private String Tipo;
    private String Color;

    public Bicicleta() {
        super();
    }

    public Bicicleta(int Velocidad, String Marca, String Tipo, String Color) {
        super(Velocidad, Marca);
        this.Tipo = Tipo;
        this.Color = Color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public void Acelerar(int acelera) {
        Velocidad += acelera;
    }

    @Override
    public void Detener() {
        Velocidad = 0;
    }

    @Override
    public void imprimriVel() {
        if(Velocidad == 0){
            System.out.println("Velocidad: Detenido");
        } else{
            System.out.println("Velocidad: " + Velocidad);
        }
    }
    
    @Override 
    public void imprimirDatos(){
        System.out.println("Bicicleta: ");
        System.out.println("Tipo: " + Tipo);
        System.out.println("Marca: " + getMarca());
        System.out.println("Color: " + Color);
    }
    
}
