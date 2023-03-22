
package eva2_17_interfaces;

public class Computadora extends Producto{
    private String Procesador;
    private int Memoria;

    public Computadora() {
        super();
        this.Procesador = "";
        this.Memoria = 0;
    }

    public Computadora(double Precio, String Nombre, String Procesador, int Memoria) {
        super(Precio, Nombre);
        this.Procesador = Procesador;
        this.Memoria = Memoria;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Procesador: " + getProcesador());
        System.out.println("Memoria: " + getMemoria());
    }
}
