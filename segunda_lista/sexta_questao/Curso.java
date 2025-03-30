

public class Curso {
    public String nome;
    private String categoria;
    private int cargaHoraria;
    private int numAlunosInscritos;


    public Curso (){}

    public Curso (String nome, String categoria, int cargaHoraria, int numAlunosInscritos){
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.numAlunosInscritos = numAlunosInscritos;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    public int getNumAlunosInscritos() {
        return numAlunosInscritos;
    }

    public void setNumAlunosInscritos(int numAlunosInscritos) {
        this.numAlunosInscritos = numAlunosInscritos;
    }

    public void inscreverAluno(){
        numAlunosInscritos += 1;
        System.out.println("Aluno inscrito");
    }
    public void cancelarInscricao() throws Exception{
        if (numAlunosInscritos <= 0){
            throw new Exception("Não tem quantidade mínima de alunos para cancelar.");
        }
        numAlunosInscritos -= 1;
    }
    public void atualizarCargaHoraria(int novaCargaHoraria) throws Exception {
        if (cargaHoraria == novaCargaHoraria) {
            throw new Exception("A carga horária não mudou");
        }
        cargaHoraria = novaCargaHoraria;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Carga horária: "+cargaHoraria);
        System.out.println("Número de alunos inscritos: "+numAlunosInscritos);
    }
}
