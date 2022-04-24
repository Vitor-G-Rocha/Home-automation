package automacaoresidencial;

import java.util.ArrayList;
/**
 *
 * @author Vitor
 */
public class Residencia {         
     private ArrayList<Morador> listaMoradoresObj = new ArrayList(); //Lista do tipo Morador     
     private ArrayList<Comodo> listaComodosObj = new ArrayList();   //Lista do tipo Comodo  
     private String nomeResidencia;
     
     //Construtor
     public Residencia(Morador _Morador, String _nomeResidencia) { 
         this.listaMoradoresObj.add(_Morador); //Primeiro registrado é ADM   
         this.nomeResidencia = _nomeResidencia;
     }  
     
     public void addComodo(String _Comodo) {        
         try {           
            this.listaComodosObj.add(new Comodo(_Comodo)); //Instanciando outro obj comodo            
        } catch (Exception ex) {  
             System.out.println("Exception> " + ex);
        }         
     }  
     
     public void addMorador(String _Nome, String _Cpf) {        
         try {             
            this.listaMoradoresObj.add(new Morador(_Nome, _Cpf)); //Instanciando outro obj morador na lista          
        } catch (Exception ex) {  
             System.out.println("Exception> " + ex);
        }         
     }
    //Getters and Setters
    public ArrayList<Morador> getListaMoradoresObj() {
        return listaMoradoresObj;
    }

    public void setListaMoradoresObj(ArrayList<Morador> listaMoradoresObj) {
        this.listaMoradoresObj = listaMoradoresObj;
    }
    
    public ArrayList<Comodo> getListaComodosObj() {
        return listaComodosObj;
    }

    public void setListaComodosObj(ArrayList<Comodo> listaComodosObj) {
        this.listaComodosObj = listaComodosObj;
    }   

    public String getNomeResidencia() {
        return nomeResidencia;
    }

    public void setNomeResidencia(String nomeResidencia) {
        this.nomeResidencia = nomeResidencia;
    }   
}