public class Veiculo{
    private String placa;
    public String marca;
    private int ano;

    public Veiculo(){}

    public Veiculo(String placa, String marca, int ano){
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano) throws Exception{
         if (ano < 1886 || ano > 2025) { 
            throw new Exception("Ano inválido. Deve estar entre 1886 e 2025.");
        }
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------------");
    }
}