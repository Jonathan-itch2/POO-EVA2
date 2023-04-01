package eva2_24_colections;

import java.util.ArrayList;

public class EVA2_24_COLECTIONS {

    public static void main(String[] args) {
       ArrayList miArreglo = new ArrayList();
       miArreglo.add(new Persona());
       miArreglo.add(new Vehiculo());
       miArreglo.add(new Perro());
      
       ArrayList<Integer> miArreglo2 = new ArrayList<Integer>();
       miArreglo2.add(100);
       miArreglo2.add(200);
       miArreglo2.add(300);
       miArreglo2.add(400);
       System.out.println(miArreglo2);
    }
}

class Persona{
    
}
class Vehiculo{
    
} 
class Perro{
    
}