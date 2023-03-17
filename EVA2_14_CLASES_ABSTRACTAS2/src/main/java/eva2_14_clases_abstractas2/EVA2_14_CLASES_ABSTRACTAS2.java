package eva2_14_clases_abstractas2;

public class EVA2_14_CLASES_ABSTRACTAS2 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Jonathan", 18, "22550321");
        
        estudiante.imprimirDatos();
        
        System.out.println("");
        
        estudiante2.imprimirDatos();
    }
}
