package eva2_19_interfaces_figuras;

public class EVA2_19_INTERFACES_FIGURAS {

    public static void main(String[] args) {
        //NO SE PUEDE INSTANIAR
        //Figuras figu = new Figuras();   
        //MostrarDatos mostrar = new MostrarDatos();
        
        Circulo circulo = new Circulo(20);
        circulo.imprimirDatos();
        System.out.println("");
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(20);
        triangulo.setAltura(20);
        triangulo.imprimirDatos();
    }
}
