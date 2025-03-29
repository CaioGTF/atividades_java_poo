

public class LojaVirtual {
     public static void main(String[] args) {
        Produto p1 = new Produto("Livro - Aprendendo Java", -12.55, "Livro");
        Produto p2 = new Produto("Batom", 40, "Maquiagem e beleza");
        Produto p3 = new Produto("Bote Salva-vidas", 20, "Vida marinha");
        
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}
