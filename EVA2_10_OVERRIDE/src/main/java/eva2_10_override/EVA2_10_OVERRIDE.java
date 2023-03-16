package eva2_10_override;

public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona("Juan Perez", 50);
        System.out.println(persona);
        System.out.println(persona2);
        
        
    }
}

class Persona{
    private String Nombre;
    private int Edad;
    
    public Persona(){
        this.Nombre = "-----";
        this.Edad = -1;
    }
    
    public Persona(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad; 
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    
    public int getEdad(){
        return this.Edad;
    }
    
    @Override
    public String toString(){
        String cade = "Datos: \n" +
                "Nombre: " + Nombre + "\n" +
                "Edad: " + Edad;
          return cade;            
    }
}