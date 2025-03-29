package primeira_lista.decima_questao;

public class RestaurantePedido {
    public static void main(String[] args) {
            Pedido pedido1 = new Pedido(101, "Pizza de Calabresa, Suco de Laranja", 45.90);
            Pedido pedido2 = new Pedido(102, "Hambúrguer, Batata Frita, Refrigerante", 39.50);
            Pedido pedido3 = new Pedido(103, "Sushi Combo, Chá Verde", 72.00);
            
            pedido1.exibirInformacoes();
            pedido2.exibirInformacoes();
            pedido3.exibirInformacoes();


    }
}
