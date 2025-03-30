public class GerenciadorTarefas {
    public static void main(String[] args){
        Tarefa t1 = new Tarefa("Tarefa de casa", false, 3);
        Tarefa t2 = new Tarefa("Dever de classe", false, 3);
        Tarefa t3 = new Tarefa("Leitura de classe", true, 1);


        t1.concluirTarefa();
        t1.mudarPrioridade(1);
        t1.exibirTarefa();
    }
}
