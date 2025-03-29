package primeira_lista.nona_questao;

public class GerenciamentoPaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("João Alberto", 32, "Esquizofrenia");
        Paciente p2 = new Paciente("Caio", 22, "TOC");
        Paciente p3 = new Paciente("Iago", 12, "Boderline");

        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}
