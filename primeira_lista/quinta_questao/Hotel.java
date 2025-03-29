

package p.hotel;


public class Hotel {

    public static void main(String[] args) {
         try {
            Reserva reserva1 = new Reserva("João Silva", "Duplo", 3);
            Reserva reserva2 = new Reserva("Maria Oliveira", "Suíte", 5);
            Reserva reserva3 = new Reserva("Carlos Souza", "Simples", 2);
            
            reserva1.exibirInformacoes();
            reserva2.exibirInformacoes();
            reserva3.exibirInformacoes();
        } catch (Exception e) {
            System.out.println("Erro ao criar reserva: " + e.getMessage());
        }
    }
}