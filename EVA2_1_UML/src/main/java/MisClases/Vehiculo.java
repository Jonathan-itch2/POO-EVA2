package MisClases;

public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int Anio;
    
    public void setMarca(String valor){
        Marca = valor;
    }
    
    public String getMarca(){
        return Marca;
    }
    public void setModelo(String valor){
        Modelo = valor;
    }
    
    public String getModelo(){
        return Modelo;
    }
    public void setAnio(int valor){
        Anio = valor;
    }
    
    public int getAnio(){
        return Anio;
    }
    
    public void imprimirDatos(){
        System.out.println("DATOS DE VEHICULO: ");
        System.out.println("Modelo: " + getMarca());
        System.out.println("Modleo: " + getModelo());
        System.out.println("Anio: " + getAnio());
    }
}
