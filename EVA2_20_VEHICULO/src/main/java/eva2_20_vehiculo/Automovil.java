package eva2_20_vehiculo;

public class Automovil extends Vehiculo{
    private String Modelo;
    private String Placas;
    
    public Automovil(){
        super();
        this.Modelo = "";
        this.Placas = "";
    }
    
    public Automovil(int Velocidad, String Marca, String Modelo, String Placas){
        super(Velocidad, Marca);
        this.Modelo = Modelo;
        this.Placas = Placas;
    }
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    
    public String setModelo(){
        return Modelo;
    }
    
    public void setPlacas(String Placas){
        this.Placas = Placas;
    }
    
    public String getPlacas(){
        return Placas;
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
        } else {
            System.out.println("Velocidad: " + Velocidad);
        }
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Automovil: ");
        System.out.println("Modelo: " + Modelo);
        System.out.println("Marca: " + getMarca());
        System.out.println("Placas: " + Placas);
    }
    
}
