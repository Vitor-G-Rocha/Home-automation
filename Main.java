package automacaoresidencial;

/**
 *
 * @author Vitor
 */
public class Main {     
    public static void main(String[] args) { //Main
        //Parte 4
        String nome = "Vitor Rocha";
        String cpf = "43644288097"; //<- Cpf gerado valido   
        
        TelaLogin telaL = new TelaLogin();       //Tela de login        
        Residencia resi2 = new Residencia(new Admin(nome, cpf), "Residencia Java 2"); //Criando residencia   
                
        resi2.addComodo("Sala"); //Adicionando ambiente sala
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Televisao()); //Adicionando os dispositivos
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Ventilador());
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Lampada());  
        /*resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Lampada());
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Lampada());
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Lampada());
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Lampada());
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Lampada());
        resi2.getListaComodosObj().get(0).addInterfaceDispositivo(new Lampada());*/        
        
        //Tela login
        telaL.setResiObj(resi2);        //Passa a referencia do objeto resi2 para a classe TelaLogin
        telaL.setjTextFieldLogin(resi2.getListaMoradoresObj().get(0).getCpf()); //Seta campo jTextFieldLogin com o cpf
        telaL.setVisible(true);        
        
    }
}