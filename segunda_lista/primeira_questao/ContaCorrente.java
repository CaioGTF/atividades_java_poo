public class ContaCorrente {
    private String numConta;
    private double saldo;
    public String nomeTitular;


    public ContaCorrente(){}

    public ContaCorrente(String numConta, double saldo, String nomeTitular){
        this.numConta = numConta;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public String getNumConta(){
        return numConta;
    }
    public void setNumConta(String numConta){
        this.numConta = numConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getNomeTitular(){
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        } else{
            System.out.println("Não é possível depositar valores negativos.");
        }
    }

    public void sacar (double valor) throws Exception{
        if(valor > saldo){
            throw new Exception("Saldo insuficiente para realizar o saque...");
        } else if (valor <= 0){
            throw new Exception("O valor deve ser positivo...");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public void transferir(ContaCorrente destino, double valor) throws Exception {
            if (valor > saldo) {
                throw new Exception("Saldo insuficiente para transferência de R$" + valor);
            } else if (valor <= 0) {
                throw new Exception("O valor da transferência deve ser positivo.");
            }
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para " + destino.getNomeTitular() + " realizada com sucesso.");
        }
    
        public void exibirSaldo() {
            System.out.println("Número da conta: " + numConta);
            System.out.println("Saldo da conta: "+ saldo);
            System.out.println("Nome do titular: "+ nomeTitular);
        }
    }
    

