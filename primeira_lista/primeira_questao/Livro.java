
package b.biblioteca;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;
    
    
    public Livro (){
        
    }
    
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
 
    
    public void exibirInformacoes(){
        System.out.println("Titulo do livro: "+ titulo);
        System.out.println("Autor(a) do livro: "+ autor);
        System.out.println("Ano de publicação do livro: "+anoPublicacao);
    }
}
