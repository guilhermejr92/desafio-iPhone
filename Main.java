import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (escolha) {
                case 1:
                    System.out.println("1. Selecionar música");
                    System.out.println("2. Tocar música");
                    System.out.println("3. Pausar música");

                    int escolhaMusica = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (escolhaMusica) {
                        case 1:
                            System.out.println("Digite o nome da música:");
                            String musica = scanner.nextLine();
                            reprodutorMusical.selecionarMusica(musica);
                            break;
                        case 2:
                            reprodutorMusical.tocar();
                            break;
                        case 3:
                            reprodutorMusical.pausar();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("1. Ligar");
                    System.out.println("2. Atender");
                    System.out.println("3. Iniciar Correio de Voz");

                    int escolhaTelefone = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (escolhaTelefone) {
                        case 1:
                            System.out.println("Digite o número para ligar:");
                            String numero = scanner.nextLine();
                            aparelhoTelefonico.ligar(numero);
                            break;
                        case 2:
                            aparelhoTelefonico.atender();
                            break;
                        case 3:
                            aparelhoTelefonico.iniciarCorreioVoz();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("1. Exibir Página");
                    System.out.println("2. Adicionar Nova Aba");
                    System.out.println("3. Atualizar Página");

                    int escolhaNavegador = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (escolhaNavegador) {
                        case 1:
                            System.out.println("Digite a URL da página:");
                            String url = scanner.nextLine();
                            navegadorInternet.exibirPagina(url);
                            break;
                        case 2:
                            navegadorInternet.adicionarNovaAba();
                            break;
                        case 3:
                            navegadorInternet.atualizarPagina();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}