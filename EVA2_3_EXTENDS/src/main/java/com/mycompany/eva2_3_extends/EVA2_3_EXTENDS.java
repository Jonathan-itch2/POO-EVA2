package com.mycompany.eva2_3_extends;

public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        
        estu.setNombre("Jonathan David");
        estu.setApellido("Salazar Vazquez");
        estu.setEdad(18);
        estu.setNoControl(22550321);
        
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellido: " + estu.getApellido());
        System.out.println("Edad: " + estu.getEdad());
        System.out.println("Numero de control: " + estu.getNoControl());
        
        System.out.println("");
        
        Proveedores prov = new Proveedores();
        
        prov.setNombre("Diego Enrique");
        prov.setApellido("Vazquez Montanez");
        prov.setEdad(44);
        prov.setRfc("112233");
        
        System.out.println("Nombre: " + prov.getNombre());
        System.out.println("Apellido: " + prov.getApellido());
        System.out.println("Edad: " + prov.getEdad());
        System.out.println("RFC: " + prov.getRfc());
    }
}
 