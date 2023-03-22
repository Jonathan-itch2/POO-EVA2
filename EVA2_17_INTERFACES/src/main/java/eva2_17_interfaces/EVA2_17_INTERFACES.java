package eva2_17_interfaces;


public class EVA2_17_INTERFACES {

    public static void main(String[] args) {
        Persona perso = new Persona("Juan Perez", 50);
        perso.imprimirDatos();
        
        Computadora compu = new Computadora(25000, "Computadora", "Intel 17", 12);
        compu.imprimirDatos();
    }
}
