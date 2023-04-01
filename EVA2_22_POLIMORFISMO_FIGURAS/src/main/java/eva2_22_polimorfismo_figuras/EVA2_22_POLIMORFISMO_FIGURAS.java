package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        /*Circulo[] circulo = new Circulo[10];
        //Un arreglo en Java va desde el arreglo 0 al N-1
        //N es la cantidad dde elemntos de arreeglo
        circulo[0] = new Circulo();
        circulo[0].calcularArea();
        
        for (int i = 0; i < circulo.length; i++) {
            circulo[i] = new Circulo(); //CREAMOS CADA UNO DE LOS OBJETOS
            circulo[i].imprimirDatos();
        }
        */
        
        Figuras[] figuras;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas figuras quieres capturar?");
        int cant = input.nextInt();
        
        System.out.println("Cantidad: " + cant);
        figuras = new Figuras[cant]; //creamos el arreglo 
                                     //con la cantidad
                                     //que quiere el usuario
                                     
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Captura el tipo de figura: ");
            System.out.println("1. Circulo, 2. Triangulo");
            int figu = input.nextInt();
            if (figu == 1){
                Circulo circulo = new Circulo();
                figuras[i] = circulo;
                System.out.println("Introduce el radio: ");
                circulo.setRadio(input.nextDouble());
            } else {
                Triangulo triangulo = new Triangulo();
                figuras[i] = triangulo;
                System.out.println("Introduce la base: ");
                triangulo.setBase(input.nextDouble());
                System.out.println("Introduce la altura: ");
                triangulo.setAltura(input.nextDouble());
            }
        }
        
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo){
                //System.out.println("Circulo");
                Circulo circulo = (Circulo)figuras[i]; //casting
                circulo.imprimirDatos();
                //System.out.println("Area: " + figuras[i].calcularArea());
                //System.out.println("Primetro: " + figuras[i].calcularPeri());
            } else {
                //System.out.println("Triangulo");
                Triangulo triangulo = (Triangulo)figuras[i]; //casting 
                triangulo.imprimirDatos();
                //System.out.println("Area: " + figuras[i].calcularArea());
                //System.out.println("Primetro: " + figuras[i].calcularPeri());
            }
        }
    }
}
