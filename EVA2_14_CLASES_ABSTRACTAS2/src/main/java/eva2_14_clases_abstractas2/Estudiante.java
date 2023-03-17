package eva2_14_clases_abstractas2;

public class Estudiante extends Persona{
    private String NoControl;
    
    public Estudiante(){
        super();
        this.NoControl = "-----";
    }
    
    public Estudiante(String Nombre, int Edad, String NoControl){
        super(Nombre, Edad);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }
 
    @Override
    public void imprimirDatos() {
        System.out.println("Datos: ");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Numero de control: " + this.NoControl);
    }
    
}
