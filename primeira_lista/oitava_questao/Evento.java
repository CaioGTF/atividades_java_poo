public class Evento {
    private String nomeEvento;
    private String data;
    private String local;

    public Evento() {}

    public Evento(String nomeEvento, String data, String local){
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.local = local;
    }

    public String getNomeEvento(){
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento){
        this.nomeEvento = nomeEvento;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local = local;
    }

    public void exibirEvento() {
        System.out.println("Evento: " + nomeEvento);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
        System.out.println("--------------------------");
    }
}
