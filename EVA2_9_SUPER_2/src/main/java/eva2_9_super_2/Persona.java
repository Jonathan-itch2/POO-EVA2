package eva2_9_super_2;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;

    public Persona() {
        Nombre = "---";
        Apellido = "---";
        Edad = 0;
    }

    public Persona(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void imprimirDatos(){
        System.out.println("DATOS: ");
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Apellido:" + this.Apellido);
        System.out.println("Edad: " + this.Edad);
    }
 
}
