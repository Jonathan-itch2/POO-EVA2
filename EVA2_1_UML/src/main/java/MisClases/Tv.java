package MisClases;

public class Tv {
    private int Volumen;
    private int Canal;
    private boolean Power;
    
    public void setVolumen(int valor){
        Volumen = valor;
    }
    
    public int getVolumen(){
        return Volumen;
    }
    public void setCanal(int valor){
        Canal = valor;
    }
    
    public int getCanal(){
        return Canal;
    }
    public void setPower(boolean valor){
        Power = valor;
    }
    
    public boolean getPower(){
        return Power;
    }
    
    public void imprimirDatos(){
        System.out.println("DATOS DE TV: ");
        System.out.println("Canal: " + getCanal());
        System.out.println("Volumen: " + getVolumen());
        System.out.println("Power: " + getPower());
    }

}
