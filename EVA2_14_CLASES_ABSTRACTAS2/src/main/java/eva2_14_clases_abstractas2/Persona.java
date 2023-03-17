package eva2_14_clases_abstractas2;

public abstract class Persona {
    private String Nombre;
    private int Edad;
    
    public Persona(){
        this.Nombre = "-----";
        this.Edad = 0;
    }
    
    public Persona(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    //LOS METODOS ABSTRACTOS PUEDEN COEXISTIR COM
    //METODOS NORMALES
    public abstract void imprimirDatos();
}
