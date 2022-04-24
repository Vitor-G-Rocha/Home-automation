package automacaoresidencial;
/**
 *
 * @author Vitor
 */
public class Admin extends Morador{
    
    //Construtor
    public Admin(String _Nome, String _Cpf) {
        super(_Nome, _Cpf); //super invoca o construtor da classe pai
        super.setIsAdmin(true); //Seta morador como ADM
    }  
}