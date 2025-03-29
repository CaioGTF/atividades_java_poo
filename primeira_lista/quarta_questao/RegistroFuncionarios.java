

public class RegistroFuncionarios {

    public static void main(String[] args) {
              try {
            Funcionario func1 = new Funcionario("Carlos Alberto", "TI", 5000.00);
            Funcionario func2 = new Funcionario("Ana Souza", "RH", 4500.00);
            Funcionario func3 = new Funcionario("Mariana Lima", "Financeiro", 6000.00);
            
            func1.exibirInformacoes();
            func2.exibirInformacoes();
            func3.exibirInformacoes();
            
            Funcionario funcInvalido = new Funcionario("", "", -2000.00);
            funcInvalido.exibirInformacoes();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar funcionário: " + e.getMessage());
        }
    }
}