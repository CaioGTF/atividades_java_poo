

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;


    public Tarefa(){}

    public Tarefa(String descricao, boolean concluida, int prioridade){
        this.descricao = descricao;
        this.concluida = false;
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

    public void concluirTarefa(){
        setConcluida(true);
        System.out.println("Tarefa concluida com sucesso.");
    }
    
   public void mudarPrioridade(int novaPrioridade){
        if(novaPrioridade == prioridade){
            System.out.println("A prioridade não mudou");
        } else{
            prioridade = novaPrioridade;
            System.out.println("Prioridade alterada.");
        }
   }

   public void exibirTarefa(){
    System.out.println("Descrição: "+descricao);
    System.out.println("Concluída? "+concluida);
    System.out.println("Prioridade: "+prioridade);
   }


   public void resetarTarefa(){
    setConcluida(false);
    System.out.println("Tarefa resetada.");
   }
}
