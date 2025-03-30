

public class GerenciadorCursos {
    public static void main(String[] args) {
        Curso c1 = new Curso("Pedagogia para idiotas", "Temporário", 42, 50);
        c1.inscreverAluno();
        try {
            c1.atualizarCargaHoraria(30);
            c1.cancelarInscricao();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        c1.exibirInformacoes();
    }    
}
