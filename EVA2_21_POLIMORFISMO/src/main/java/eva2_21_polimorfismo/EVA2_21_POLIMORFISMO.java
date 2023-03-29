package eva2_21_polimorfismo;

public class EVA2_21_POLIMORFISMO {

    public static void main(String[] args) {
      Estudiante estu = new Estudiante("Juan", "Perez", 19, 22550345);
      Docente docente = new Docente();
      docente.setNombre("Martina");
      docente.setApellido("Leal");
      docente.setEdad(25);
      docente.setPlaza("Quimica");
      
      //PUEDO TRATAR A LOS OBJETOS DE LA SUBCLASE 
      //COMO OBJETOS DE LA SUPERCLASE 
      //AL REVES NO SE PUEDE 
      //ESTOY ASIGNANDO UN OBJETO DE TIPO ESTUDIANTE 
      //A UNA VARIABLE DE TIPO PERSONA
      Persona perso = estu;
      //ESTOY GENERALIZANDO (SIMPLIFICANDO)
      Persona perso2 = docente;
      Persona perso3 = new Persona();
      //Es imposible convertir una persona en un estudiante 
      //no podemos agregar cosas, simplemente ocultamos
      //propiedades
      Estudiante estu2 = perso3;
    }
}
