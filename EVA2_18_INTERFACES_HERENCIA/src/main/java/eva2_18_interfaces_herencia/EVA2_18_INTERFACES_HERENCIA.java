package eva2_18_interfaces_herencia;

public class EVA2_18_INTERFACES_HERENCIA {

    public static void main(String[] args) {
        
    }
}

interface intA{
    public abstract void A();
}

interface intB{
    void B(); //No es necesario poner public abstract ya que esta por defecto eso
}

interface intC extends intA, intB{
    public abstract void C();
}

class prueba implements intC{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
