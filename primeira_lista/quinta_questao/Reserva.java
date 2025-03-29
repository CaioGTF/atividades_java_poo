package p.hotel;

public class Reserva {
   private String nome;
   private String tipoQuarto;
   private int numeroNoites;

   public Reserva() {}

   public Reserva(String nome, String tipoQuarto, int numeroNoites) {
       this.nome = nome;
       this.tipoQuarto = tipoQuarto;
       this.numeroNoites = numeroNoites;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getTipoQuarto() {  // Corrigido
       return tipoQuarto;
   }

   public void setTipoQuarto(String tipoQuarto) throws Exception {
       if (!tipoQuarto.equalsIgnoreCase("simples") && 
           !tipoQuarto.equalsIgnoreCase("duplo") && 
           !tipoQuarto.equalsIgnoreCase("suíte")) {
           throw new Exception("Tipo de quarto inválido. Escolha entre Simples, Duplo ou Suíte.");
       }
       this.tipoQuarto = tipoQuarto;
   }

   public int getNumeroNoites() {
       return numeroNoites;
   }

   public void setNumeroNoites(int numeroNoites) {
       this.numeroNoites = numeroNoites;
   }

   public void exibirInformacoes() {
       System.out.println("Hóspede: " + nome);
       System.out.println("Tipo de Quarto: " + tipoQuarto);
       System.out.println("Número de Noites: " + numeroNoites);
       System.out.println("--------------------------");
   }
}