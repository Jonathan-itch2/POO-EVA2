package eva2_19_interfaces_figuras;


//No se pueen instanciar las interfaces 
//son como un contrato: estoy obligado a implementar
//solo metodos abstractos y constantes
public interface Figuras {
    public abstract double calcularArea();
    double calcularPeri();
}
