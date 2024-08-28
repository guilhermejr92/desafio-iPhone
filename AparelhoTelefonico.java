public class AparelhoTelefonico {
    private String numeroAtual;

    public void ligar(String numero) {
        this.numeroAtual = numero;
        System.out.println("Ligando para: " + numeroAtual);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}