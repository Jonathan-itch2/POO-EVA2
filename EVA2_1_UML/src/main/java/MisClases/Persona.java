package MisClases;

public class Persona {
    private int ID;
    private String Nombre;
    private int Edad;
    
    public void setID(int valor){
        ID = valor;
    }
    
    public int getID(){
        return ID;
    }
    public void setNombre(String valor){
        Nombre = valor;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setEdad(int valor){
        Edad = valor;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public void imprimirDatos(){
        System.out.println("DATOS DE PERSONA: ");
        System.out.println("ID: " + getID());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }
}
