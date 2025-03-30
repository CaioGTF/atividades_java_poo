public class ProdutoEstoque {
    private String nome;
    private int quantidade;
    private double precoUnitario;

  
    public ProdutoEstoque() {}

    public ProdutoEstoque(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;  
        this.precoUnitario = precoUnitario;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    
    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Adicione uma quantidade válida ao estoque.");
        } else {
            this.quantidade += quantidade; 
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        }
    }

    public void removerEstoque(int quantidade) throws Exception {
        if (quantidade <= 0) {
            throw new Exception("Quantidade inválida para remoção.");
        }
        if (quantidade > this.quantidade) {
            throw new Exception("Estoque insuficiente.");
        }
        this.quantidade -= quantidade; 
        System.out.println(quantidade + " unidades removidas do estoque.");
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco == precoUnitario) {
            System.out.println("Você colocou o mesmo preço.");
        } else {
            precoUnitario = novoPreco;
            System.out.println("Novo preço unitário atualizado para R$ " + novoPreco);
        }
    }

    public void exibirProduto() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("-----------------------------------");
    }
}
