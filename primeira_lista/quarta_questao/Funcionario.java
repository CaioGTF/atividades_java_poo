package p.registrofuncionarios;


public class Funcionario {
    public String nome;
    private String departamento;
    private double salario;
    
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, String departamento, double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
      if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do funcionário não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$ " + salario);
        System.out.println("--------------------------");
    }
}
