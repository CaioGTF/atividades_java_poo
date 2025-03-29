

package b.escola;


public class Escola {

    public static void main(String[] args) {
       Aluno aluno1 = new Aluno("Julia Ferreira", 12, "7 ano");
       Aluno aluno2 = new Aluno("Caio Gabriel", 17, "3 ano");
       Aluno aluno3 = new Aluno("João Vitor", 14, "9 ano");
       
       aluno1.exibirInformacoes();
       aluno2.exibirInformacoes();
       aluno3.exibirInformacoes();
        
       
    }
}
