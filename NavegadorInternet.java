import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<String> abas = new ArrayList<>();
    private String paginaAtual;

    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + paginaAtual);
    }

    public void adicionarNovaAba() {
        abas.add("Nova aba");
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada: " + paginaAtual);
    }

    public void exibirPaginaMusica(String musica) {
        // Codifica a música para usar em uma URL do YouTube
        String urlMusica = "https://youtu.be/dhZUsNJ-LQU" + musica.replace(" ", "+");
        exibirPagina(urlMusica);
    }
}