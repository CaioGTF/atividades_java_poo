public class PerfilUsuario {
    public String nomeUsuario;
    private String bio;
    private int numeroSeguidores;

    public PerfilUsuario(){}

    public PerfilUsuario(String nomeUsuario, String bio, int numeroSeguidores){
        this.nomeUsuario = nomeUsuario;
        this.bio = bio;
        this.numeroSeguidores = numeroSeguidores;
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    public String getBio(){
        return bio;
    }
    public void setBio(String bio){
        this.bio = bio;
    }
    public int getNumeroSeguidores(){
        return numeroSeguidores;
    }
    public void setNumeroSeguidores(int numeroSeguidores){
        this.numeroSeguidores = numeroSeguidores;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do usuário: "+nomeUsuario);
        System.out.println("Bio do usuário: "+bio);
        System.out.println("Número de seguidores"+ numeroSeguidores);
    }
}
