public class SessaoCinema {
    private String filme;
    private String horario;
    private int capacidadeTotal;
    private int ingressosVendidos;

    public SessaoCinema() {}

    public SessaoCinema(String filme, String horario, int capacidadeTotal, int ingressosVendidos) {
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = capacidadeTotal;
        this.ingressosVendidos = ingressosVendidos; 
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void venderIngresso() {
        if (ingressosVendidos < capacidadeTotal) {
            ingressosVendidos += 1;
            System.out.println("Ingresso vendido com sucesso!");
            capacidadeTotal -= 1;
            System.out.println("Menos uma cadeira");
        } else {
            System.out.println("Sessão lotada! Não há ingressos disponíveis.");
        }
    }

    public void CancelarIngresso(){
        if(ingressosVendidos > 1){
            ingressosVendidos -= 1;
            System.out.println("Ingresso cancelado com sucesso");
        } else{
            System.out.println("Não há ingressos para cancelar");
        }
    }

    public void exibirInfoSessao(){
        System.out.println("Filme: "+filme);
        System.out.println("Horário: "+horario);
        System.out.println("Capacidade total: "+capacidadeTotal);
        System.out.println("Ingressos vendidos: "+ingressosVendidos);
    }
}

