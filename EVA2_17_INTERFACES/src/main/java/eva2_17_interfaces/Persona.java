package eva2_17_interfaces;

public class Persona implements MostrarDatos{
    private String Nombre;
    private int Edad;

    public Persona() {
    }

    public Persona(String Nombre, int Edad) {
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

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }
    
    
}
