public class RegistrarVeiculo{
    public static void main(String[] args){
         try {
            Veiculo veiculo1 = new Veiculo("ABC-1234", "Toyota", 2020);
            Veiculo veiculo2 = new Veiculo("XYZ-5678", "Honda", 2018);
            Veiculo veiculo3 = new Veiculo("LMN-9012", "Ford", 2026);
            
            veiculo1.exibirInformacoes();
            veiculo2.exibirInformacoes();
            veiculo3.exibirInformacoes();
        } catch (Exception e) {
            System.out.println("Erro ao registrar veículo: " + e.getMessage());
        }
    }
}
