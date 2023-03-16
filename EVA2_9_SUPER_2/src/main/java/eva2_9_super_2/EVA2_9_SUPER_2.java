package eva2_9_super_2;

public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.imprimirDatos();
        
        System.out.println("");
        
        Docente docente = new Docente("Ruben Alonzo", "Hernandez Chavez", 41, "asdf1");
        docente.imprimirDatos();
        System.out.println("Plaza" + docente.getPlaza());
        
        System.out.println("");
        
        Proveedores proveedor = new Proveedores("Diego", "Vazquez", 44, "wrwqrwqr123");
        proveedor.imprimirDatos();
        System.out.println("Rfc: " + proveedor.getRfc());
        
    }
}
