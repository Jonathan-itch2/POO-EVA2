package eva2_15_tienda;

import Productos.*;
public class EVA2_15_TIENDA {

    public static void main(String[] args) {
        Computadora compu = new Computadora(25000, "Computadora", "Pieza", "DELL", "Lenovo", 365, 2.65, 32, "intel 17", "500 GB");
        System.out.println("Precio con rebaja: " + compu.precioVenta(20));
        System.out.println(compu);
        System.out.println(" ");
        
        Playera playera = new Playera(200, "Playera", "Pieza", "Marca generica", "Negro", "Chica", "Polo");
        System.out.println("Precio con rebaja: " + playera.precioVenta(8));
        System.out.println(playera);
    }
}
