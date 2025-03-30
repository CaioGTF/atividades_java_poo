public class Conta {

    public static void main(String[] args) {
         try {
             ContaCorrente c1 = new ContaCorrente("123", 55.60, "Caio");
             ContaCorrente c2 = new ContaCorrente("456", 10000, "Júlia");
             ContaCorrente c3 = new ContaCorrente("789", 50, "Luis");
       
             c1.depositar(40);
             c1.sacar(10);
             c1.exibirSaldo();
             c1.transferir(c3, 20);
         } catch (Exception e) {
            System.out.println("Erro");
             
    }
}
}