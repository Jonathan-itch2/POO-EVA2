package eva2_22_polimorfismo_figuras;

public final class Circulo implements Figuras, MostrarDatos{
    private double Radio;

    public Circulo() {
        this.Radio = 0;
    }

    public Circulo(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(Radio, 2);
    }

    @Override
    public double calcularPeri() {
        return Math.PI * Radio * 2;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Circulo: ");
        System.out.println("Radio: " + Radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPeri());
    }
    
}
