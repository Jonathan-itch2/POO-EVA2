package eva2_2_herencia;

public class Docente {
    private String Nombre;
    private String Apellido;
    private int Edda;
    private String plaza;

    public Docente(String Nombre, String Apellido, int Edda, String plaza) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edda = Edda;
        this.plaza = plaza;
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

    public int getEdda() {
        return Edda;
    }

    public void setEdda(int Edda) {
        this.Edda = Edda;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    
}
