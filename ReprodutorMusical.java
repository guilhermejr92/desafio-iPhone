public class ReprodutorMusical {
    private String musica;

    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música selecionada: " + musica);
    }

    public void tocar() {
        if (musica != null) {
            System.out.println("Tocando música: " + musica);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    public void pausar() {
        if (musica != null) {
            System.out.println("Música pausada: " + musica);
        } else {
            System.out.println("Nenhuma música para pausar.");
        }
    }
}