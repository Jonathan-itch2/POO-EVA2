package eva2_13_figuras_abstractas;

public class Triangulo extends Figuras {
    private double Base;
    private double Altura;

    public Triangulo() {
        this.Base = 0;
        this.Altura = 0;
    }

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    @Override 
    public double calcularArea(){
        return (Base*Altura) / 2;
    }
    
    @Override 
    public double calcularPeri(){
        return Base + Altura + Math.sqrt(Math.pow(Base, 2) + Math.pow(Altura, 2));
    }

}
