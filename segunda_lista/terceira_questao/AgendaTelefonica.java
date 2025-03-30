

public class AgendaTelefonica {
    public static void main(String[] args) {
        Contato c1 = new Contato("Jamie", "984456484", "jamie@hotmail.com");
        Contato c2 = new Contato("Carol", "8888887754338", "carolbiazin.com");
        Contato c3 = new Contato("Ju Barbosa", "5550125", "jubarbosa@gmail.com");


        c1.validarEmail();
        c1.alterarEmail("jamiemascovits@gmail.com");
        c1.alterarTelefone("9989898");
        c1.exibirContato();
    }
}
