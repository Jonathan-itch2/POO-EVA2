package eva2_22_polimorfismo_figuras;


//No se pueen instanciar las interfaces 
//son como un contrato: estoy obligado a implementar
//solo metodos abstractos y constantes
public interface Figuras {
    public abstract double calcularArea();
    double calcularPeri();
}
