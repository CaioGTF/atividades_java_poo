package primeira_lista.decima_questao;

public class Pedido {
    private int numeroPedido;
    private String descricaoItens;
    private double valorTotal;

    public Pedido() {}

    public Pedido(int numeroPedido, String descricaoItens, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.descricaoItens = descricaoItens;
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }
    public String getDescricaoItens(){
        return descricaoItens;
    }
    public void setDescricaoItens(String descricaoItens){
        this.descricaoItens = descricaoItens;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public void exibirInformacoes(){
        System.out.println("Numero do pedido: "+ numeroPedido);
        System.out.println("Descrição dos itens: "+ descricaoItens);
        System.out.println("Valor total: "+ valorTotal);
    }
}

