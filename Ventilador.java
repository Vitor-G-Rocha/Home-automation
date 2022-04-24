package automacaoresidencial;

/**
 *
 * @author Vitor
 */
public class Ventilador implements Dispositivo{
    private String estado = "Desligado";
    
    @Override
    public void ligar() { System.out.println("Ligando!"); estado = "Ligado"; }
    
    @Override
    public void desligar() { System.out.println("Desligando!"); estado = "Desligado";}
    
    @Override
    public String toString() { return "Ventilador"; }
    
    @Override
    public String getEstado() {
        return estado;
    }  
}
