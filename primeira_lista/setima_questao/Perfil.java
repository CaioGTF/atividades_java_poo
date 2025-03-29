public class Perfil {
    public static void main(String[] args) {
        PerfilUsuario p1 = new PerfilUsuario("Caio Gabriel", "Gosto de viver a vida e aprender coisas novas", 339);
        PerfilUsuario p2 = new PerfilUsuario("Jurema fox", "Trabalho na SBT e tenho um programa de televisão", 90000);
        PerfilUsuario p3 = new PerfilUsuario("Madonna", "Hi, i'm Madonna and i'm a singer", 100000);

        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}
