package eva2_20_vehiculo;

public class EVA2_20_VEHICULO {

    public static void main(String[] args) {
       Automovil auto = new Automovil(0, "Toyota", "Corola", "123sfhgj");
       
       auto.Acelerar(20);
       auto.Acelerar(10);
       auto.imprimirDatos();
       auto.imprimriVel();
       System.out.println("");
       auto.Detener();
       auto.imprimriVel();
       
       System.out.println("");
       
       Bicicleta bici = new Bicicleta();
       
       bici.setColor("Rojo");
       bici.setMarca("Yamaha");
       bici.setTipo("Carrera");
       
       bici.Acelerar(15);
       bici.Acelerar(5);
       bici.imprimirDatos();
       bici.imprimriVel();
       System.out.println("");
       bici.Detener();
       bici.imprimriVel();
    }
}
