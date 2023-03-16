package eva2_9_super_2;

                    //Proveedores is-a Persona
public class Proveedores extends Persona{
    private String rfc;

    public Proveedores() {
        super();
    }

    public Proveedores(String Nombre, String Apellido, int Edad, String rfc) {
        super(Nombre, Apellido, Edad);
        this.rfc = rfc;
    }
    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
