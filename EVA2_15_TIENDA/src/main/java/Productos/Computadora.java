package Productos;

import SuperClases.Electronica;

public final class Computadora extends Electronica{
    private double Tamanio;
    private int Memoria;
    private String Procesador;
    private String DD;

    public Computadora() {
        super();
        this.Tamanio = 0;
        this.Memoria = 0;
        this.Procesador = "";
        this.DD = "";
    }

    public Computadora(double Precio, String Nombre, String Unidad, String Fabricante, String Modelo, int Garantia, double Tamanio, int Memoria, String Procesador, String DD) {
        super(Precio, Nombre, Unidad, Fabricante, Modelo, Garantia);
        this.Tamanio = Tamanio;
        this.Memoria = Memoria;
        this.Procesador = Procesador;
        this.DD = DD;
    }

    public double getTamanio() {
        return Tamanio;
    }

    public void setTamanio(double Tamanio) {
        this.Tamanio = Tamanio;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getDD() {
        return DD;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }

    @Override
    public double precioVenta(int cant) {
        if(cant<10){
            return cant * Precio;
        } else {
            return (Precio * 0.80) * cant;
        }
    }

    @Override
    public String toString() {
        String cade = "Datos:  \n"+
                "Precio: " + Precio + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Unidad: " + getUnidad() + "\n" +
                "Fabricante: " + getFabricante() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Garantia: " +getGarantia() + "\n" +
                "Tamanio: " + getTamanio() + "\n" +
                "Memoria: " + getMemoria() + "\n" +
                "Procesador: " + getProcesador() + "\n" +
                "Disco duro: " + getDD();
        
        return cade;
    }

}
