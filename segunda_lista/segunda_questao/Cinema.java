public class Cinema {

    public static void main(String[] args) {
        SessaoCinema c1 = new SessaoCinema("A Lagoa Azul", "17:30", 20, 18);
        SessaoCinema c2 = new SessaoCinema("A Lagoa Azul 2", "18:30", 25, 25);
        SessaoCinema c3 = new SessaoCinema("A Lagoa Azul 3", "19:30", 30, 29);
        
        
        c2.CancelarIngresso();
        c2.CancelarIngresso();
        c2.exibirInfoSessao();
    }
}