package eva2_8_super;

public class EVA2_8_SUPER {

    public static void main(String[] args) {
        Animal animal = new Animal("asdasd", 10);
        Mamifero mamifero = new Mamifero("negro", "Juan", 10);
        Canes can = new Canes();
    }
}

class Animal{
    private String Nombre;
    private int Peso;
    
    public Animal(){
        System.out.println("ITS ALIVE!!");
    }
    
    public Animal(String Nombre, int Peso){
        this.Nombre = Nombre;
        this.Peso = Peso;
        System.out.println("ITS ALIVE!!");
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
    
    public void Respirar(){
        System.out.println("Estoy respirando!!");
    }
}

class Mamifero extends Animal{
    private String colorPelo;

    public Mamifero() {
        //super --> apuntador a la superclase
        //lo primero al llamar a un constructor es llamar
        //esl constructor de la clase
        super();
        System.out.println("Soy un mamifero!!");
    }

    public Mamifero(String colorPelo, String Nombre, int Peso) {
        super(Nombre, Peso); //llamada al cosntructor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero constructor 2");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

}

class Canes extends Mamifero{
    public Canes(){
        super();
        System.out.println("Soy un can");
    }
}