package automacaoresidencial;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class LoginController {
    
    public boolean efetuarLogin(String cpf) {
        if(!ValidaCpf.isCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "Cpf Inválido", "Aviso!", JOptionPane.ERROR_MESSAGE);            
            return false;
        } 
        JOptionPane.showMessageDialog(null, "Cpf válido", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        return true;        
    }
}
