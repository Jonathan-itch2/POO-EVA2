package eva2_23_polimorfismo_vehiculos;

public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        Automovil auto = new Automovil(0, "Tesla", "X", 2020);
        CambiarVelocidad(auto, 50);
        Bicicleta bici = new Bicicleta(0, "Montania", "X", "Harley");
        CambiarVelocidad(bici, 20);
        //class object --->
        Object obj = auto;
    }

    public static void CambiarVelocidad(DatosVehiculo vehi, int vel) {
        vehi.acelerar(vel);
        vehi.tablero();

    }
}

interface DatosVehiculo {

    public abstract void acelerar(int cambio);

    void tablero();
}

class Vehiculo {

    protected int Velocidad;
    private String Marca;

    public Vehiculo() {
        this.Velocidad = 0;
        this.Marca = "-----";
    }

    public Vehiculo(int Velocidad, String Marca) {
        this.Velocidad = Velocidad;
        this.Marca = Marca;
    }

    //La velocidad se modificara con acelerar
    public int getVelocidad() {
        return Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

}

final class Automovil extends Vehiculo implements DatosVehiculo{
    private String Modelo;
    private int Anio;
    
    public Automovil(){
        super();
        this.Modelo = "-----";
        this.Anio = 0;
    }
    
    public Automovil(int Velocidad, String Marca, String Modelo, int Anio){
        super(Velocidad, Marca);
        this.Modelo = Modelo;
        this.Anio = Anio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }
    
    
    @Override
    public void acelerar(int cambio) {
        int CambioVel = Velocidad + cambio;
        if(CambioVel >= 0){
            Velocidad += cambio; //Velocidad = Velocidad + cambio <--- Acomulador
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del automovil: " + getVelocidad());
    }

}

final class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String Tipo;
    private String Rodada;
    
    public Bicicleta(){
        super();
        this.Tipo = "-----";
        this.Rodada = "-----";
    }
    
    public Bicicleta(int Velocidad, String Marca, String Tipo, String Rodada){
        super(Velocidad, Marca);
        this.Tipo = Tipo;
        this.Rodada = Rodada;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getRodada() {
        return Rodada;
    }

    public void setRodada(String Rodada) {
        this.Rodada = Rodada;
    }
    
    
    @Override
    public void acelerar(int cambio) {
       int CambioVel = Velocidad + cambio;
        if(CambioVel >= 0){
            Velocidad += cambio; //Velocidad = Velocidad + cambio <--- Acomulador
        }
    }

    @Override
    public void tablero() {
         System.out.println("Velocidad de la bicicleta: " + getVelocidad());
    }
    
}
