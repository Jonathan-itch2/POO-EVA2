package eva2_25_has_a_direccion;

public class EVA2_25_HAS_A_DIRECCION {

    public static void main(String[] args) {
        Personas persona = new Personas();
        persona.setNombre("Juan");
        persona.setApellido("Perez Jolote");
        persona.setEdad(19);
        //Para asignar la direccion se dee de crear 
        //un objeto de tipo direccion
        Direccion direccion = new Direccion();
        direccion.setCalle("Industrias");
        direccion.setNumero(11101);
        direccion.setColonia("Complejo industrial Chihuahua");
        direccion.setCp("31135");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        //direccion.imprimriDatos();
        persona.setDireccion(direccion);
        persona.ImprimirDatos();
    }
}

class Direccion{
    private String Calle;
    private int Numero;
    private String Colonia;
    private String Cp;
    private String Ciudad;
    private String Estado;

    public Direccion() {
        this.Calle = "";
        this.Numero = 0;
        this.Colonia = "";
        this.Cp = "";
        this.Ciudad = "";
        this.Estado = "";
    }

    public Direccion(String Calle, int Numero, String Colonia, String Cp, String Ciudad, String Estado) {
        this.Calle = Calle;
        this.Numero = Numero;
        this.Colonia = Colonia;
        this.Cp = Cp;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCp() {
        return Cp;
    }

    public void setCp(String Cp) {
        this.Cp = Cp;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public void imprimriDatos(){
        System.out.println("Direccion: ");
        System.out.println("Calle: " + Calle + " " + "Numero: " + Numero + " " +
                "Colonia: " + Colonia + " " + "\n C.P.: " + Cp + " " + "Ciudad: " + Ciudad + " " +
                "Estado: " + Estado);
    }
}

class Personas{
    private String Nombre;
    private String Apellido;
    private int Edad;
    private Direccion direccion; //Has a (Tiene una) Direccion

    public Personas() {
        this.Nombre = "";
        this.Apellido = "";
        this.Edad = 0;
        this.direccion = null; //NO EXISTE EL OBJETO DIRECCION
    }

    public Personas(String Nombre, String Apellido, int Edad, Direccion direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void ImprimirDatos(){
        System.out.println(Nombre + " " + Apellido + " " + 
                " " + Edad + " Anios");
        if(direccion == null){
            System.out.println("No tiene direccion");
        } else {
            direccion.imprimriDatos();
        }
    }

}
