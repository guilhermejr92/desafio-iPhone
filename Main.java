public class Main {
    public static void main(String[] args) {
        // Testando ReprodutorMusical
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Oasis - Stop Crying Your Heart Out (Official Video)");
        reprodutor.tocar();

        // Testando AparelhoTelefonico
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123-456-789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        // Testando NavegadorInternet
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPaginaMusica(reprodutor.getCurrentTrack());
    }
}