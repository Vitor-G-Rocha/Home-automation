package automacaoresidencial;

/**
 *
 * @author Vitor
 */
public class Televisao implements Dispositivo{    
    private String estado = "Desligado";
    
    @Override
    public void ligar() { System.out.println("Ligando!"); estado = "Ligado"; }
    
    @Override
    public void desligar() { System.out.println("Desligando!"); estado = "Desligado"; }
    
    @Override
    public String toString() { return "Televisão"; }
    
    @Override
    public String getEstado() {
        return estado;
    }   
}
