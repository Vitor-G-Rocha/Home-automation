package automacaoresidencial;

import java.util.ArrayList;
/**
 *
 * @author Vitor
 */
public class Comodo {
    private String tipo;    
    //private ArrayList<Dispositivo> listaDispositivosObj = new ArrayList();
    private ArrayList<Dispositivo> ListaInterfaceDispositivos = new ArrayList();   
    
    //Construtor   
    public Comodo(String _Tipo) {
        this.tipo = _Tipo;       
    }   

    /*public void addDispositivos(String aDispositivo) {       
        this.listaDispositivosObj.add(new Dispositivo(aDispositivo)); //Instanciando outro obj dispositivo       
    }*/
    
    //Lista Dispositivos Interface
    public void addInterfaceDispositivo(Dispositivo aDispositivo) {       
        this.ListaInterfaceDispositivos.add(aDispositivo);      
    }
    
    @Override //Sobrescrita do metodo toString()
    public String toString(){
        return "*Comodo: " + this.tipo;
    }
    
    //Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }   

    /*public ArrayList<Dispositivo> getListaDispositivosObj() {
        return listaDispositivosObj;
    }

    public void setListaDispositivosObj(ArrayList<Dispositivo> listaDispositivosObj) {
        this.listaDispositivosObj = listaDispositivosObj;
    }*/
    
     public ArrayList<Dispositivo> getListaInterfaceDispositivos() {
        return ListaInterfaceDispositivos;
    }

    public void setListaInterfaceDispositivos(ArrayList<Dispositivo> ListaDispositivos) {
        this.ListaInterfaceDispositivos = ListaDispositivos;
    }    
}