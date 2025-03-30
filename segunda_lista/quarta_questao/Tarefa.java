

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;


    public Tarefa(){}

    public Tarefa(String descricao, boolean concluida, int prioridade){
        this.descricao = descricao;
        this.concluida = concluida;
        this.prioridade = prioridade;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public boolean getConcluida(){
        return concluida;
    }
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
    public int getPrioridade(){
        return prioridade;
    }
    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }

    
}
