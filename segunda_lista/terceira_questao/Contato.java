public class Contato {
    private String nome;
    private String telefone;
    private String email;


    public Contato(){}

    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void alterarTelefone(String novoTelefone){
        if(novoTelefone.equals(telefone)){
            System.out.println("Você digitou o mesmo número.");
        } else{
            telefone = novoTelefone;
            System.out.println("Novo telefone cadastrado: "+novoTelefone);
        }
    }

    public void alterarEmail(String novoEmail){
        if(novoEmail.equals(email)){
            System.out.println("Você digitou o mesmo e-mail.");
        } else{
            email = novoEmail;
            System.out.println("Novo e-mail cadastrado: "+novoEmail);
        }
    }

    public void exibirContato(){
        System.out.println("Nome: "+nome);
        System.out.println("telefone: "+telefone);
        System.out.println("E-mail: "+email);
    }

    public void validarEmail(){
        if(email.contains("@")){
            System.out.println("E-mail validado.");
        } else{
            System.out.println("E-mail inválido.");
        }
    }
}
