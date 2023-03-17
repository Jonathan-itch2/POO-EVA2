package eva2_13_figuras_abstractas;

public class Circulo extends Figuras {
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
    public double calcularArea(){
        return Math.PI * (Math.pow(Radio, 2));
    }
    
    @Override 
    public double calcularPeri(){
        return Math.PI * (Radio * 2);
    }
}
