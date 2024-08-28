public class ReprodutorMusical {
    private String currentTrack;

    public void tocar() {
        System.out.println("Tocando a música: " + currentTrack);
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        this.currentTrack = musica;
        System.out.println("Música selecionada: " + currentTrack);
    }

    public String getCurrentTrack() {
        return currentTrack;
    }
}