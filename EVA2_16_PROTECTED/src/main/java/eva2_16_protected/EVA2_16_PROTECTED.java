package eva2_16_protected;

public class EVA2_16_PROTECTED {

    public static void main(String[] args) {
        SuperClase objSuper = new SuperClase();
        
        objSuper.dato = 100;
        
        subClase objSub = new subClase();
        objSub.imprimirDato();
    }
}

class SuperClase{
    protected int dato;
}

class subClase extends SuperClase{
    public void imprimirDato(){
        System.out.println("El valor de dato es: " + dato);
    }
}