package eva2_7_this;

public class EVA2_7_THIS {

    public static void main(String[] args) {
            //Imprimir();
            //this no se puede usar en un contexto estatico
    }
    public void imprimir(){
        //Tambien es visible this
    }
}

//this es una referencia a una instancia de la clase
//todos los objetos tienen this
//this existe solamente dentro del objeto

class Persona{
    private String Nombre;
    
    public Persona(String Nombre){
        this.Nombre = Nombre;
        //this.Nombre es el atributo de la clase 
        //Nombre es la variable del (parametro) declarado en el parametro
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre es: " + this.Nombre);
    }
    
}
