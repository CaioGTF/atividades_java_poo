

public class Estoque {
    public static void main(String[] args) {
        ProdutoEstoque p1 = new ProdutoEstoque("Brigadeiro", 3, 45.50);
        p1.atualizarPreco(12.99);
        p1.adicionarEstoque(2);
        
        try{
          p1.removerEstoque(3);   
        } catch( Exception e){
            System.out.println(e.getMessage());
        }
        p1.exibirProduto();

    }
}
