package automacaoresidencial;
/**
 *
 * @author Vitor
 */
public class Morador {
    private String nome;
    private String cpf;
    private boolean isAdmin;
    
    //Construtor
    public Morador(String _Nome, String _Cpf) {
        this.nome = _Nome;
        this.cpf = _Cpf;
        this.isAdmin = false;
    }   
    
    @Override //Sobrescrita do metodo toString()
    public String toString() {       
        return this.nome + " " + ValidaCpf.imprimeCPF(this.cpf);
    }
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    } 

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }   
}