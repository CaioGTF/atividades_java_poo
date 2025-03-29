public class Biblioteca {
    public static void main(String[] args){
        Livro livro1 = new Livro("Jurassic Park", "Michael Crichton", 1990);
        Livro livro2 = new Livro("Duna", "Frank Herbert", 1965);
        Livro livro3 = new Livro("Mr. Mercedes", "Stephen King", 2013);
        
       livro1.exibirInformacoes();
       livro2.exibirInformacoes();
       livro3.exibirInformacoes();
    }
}