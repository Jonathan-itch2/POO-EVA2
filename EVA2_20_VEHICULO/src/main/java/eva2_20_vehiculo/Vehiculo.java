package eva2_20_vehiculo;

public abstract class Vehiculo implements ControlVelocidad{
    protected int Velocidad;
    private String Marca;
    
    public Vehiculo(){
        this.Velocidad = 0;
        this.Marca = "";
    }
    
    public Vehiculo(int Velocidad, String Marca){
        this.Velocidad = Velocidad;
        this.Marca = Marca;
    }
   
    public int getVelocidad(){
        return Velocidad;
    }
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    
    public String getMarca(){
        return Marca;
    }
    
    public abstract void imprimirDatos();
}
