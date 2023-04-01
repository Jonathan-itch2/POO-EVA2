package eva2_22_polimorfismo_figuras;

public final class Triangulo implements Figuras, MostrarDatos{
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
    public double calcularArea() {
        return (Base * Altura) / 2;
    }

    @Override
    public double calcularPeri() {
        return Base + Altura + Math.hypot(Base, Altura);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Triangulo: ");
        System.out.println("Base: " + Base);
        System.out.println("Altura: " + Altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPeri());
    }
    
}
