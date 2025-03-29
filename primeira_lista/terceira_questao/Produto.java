
package p.produtos;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;
    
    public Produto(){
        
    }
    
    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco) throws Exception{
           if (preco < 0) {
              throw new Exception();
        }
        this.preco = preco;
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Categoria: " + categoria);
        System.out.println("--------------------------");
    }
}