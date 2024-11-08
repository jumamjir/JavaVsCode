import java.util.Scanner;

public class JogoDaVelha {
    private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X'; // 'X' para o jogador humano, 'O' para o computador
    private static Scanner scanner = new Scanner(System.in);
    private static int rodadas = 0;
    private static int vitoriasHumano = 0;
    private static int vitoriasComputador = 0;
    private static int empates = 0;

    public static void main(String[] args) {
        iniciarTabuleiro();
        System.out.println("Bem-vindo ao Jogo da Velha!");

        do {
            jogarPartida();
            System.out.print("Deseja jogar novamente? (s/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("s"));

        exibirPlacarFinal();
        scanner.close();
        System.out.println("Obrigado por jogar!");
    }

    private static void iniciarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    private static void jogarPartida() {
        iniciarTabuleiro();
        rodadas = 0;
        while (!verificarFimDeJogo()) {
            exibirTabuleiro();
            realizarJogada();
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            rodadas++;
        }
        exibirTabuleiro();
        exibirResultado();
    }

    private static void exibirTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    private static void realizarJogada() {
        if (jogadorAtual == 'X') {
            realizarJogadaHumano();
        } else {
            realizarJogadaComputador();
        }
    }

    private static void realizarJogadaHumano() {
        int linha, coluna;
        do {
            System.out.print("Digite a linha (0-2) e coluna (0-2) para sua jogada separadas por espaço: ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
        } while (!validarJogada(linha, coluna));
        tabuleiro[linha][coluna] = 'X';
    }

    private static void realizarJogadaComputador() {
        // Implementação da estratégia inteligente do computador
        // Exemplo simples: jogada aleatória
        int linha, coluna;
        do {
            linha = (int) (Math.random() * 3);
            coluna = (int) (Math.random() * 3);
        } while (!validarJogada(linha, coluna));
        tabuleiro[linha][coluna] = 'O';
    }

    private static boolean validarJogada(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            System.out.println("Jogada inválida! Tente novamente.");
            return false;
        }
        if (tabuleiro[linha][coluna] != ' ') {
            System.out.println("Posição ocupada! Tente novamente.");
            return false;
        }
        return true;
    }

    private static boolean verificarFimDeJogo() {
        return rodadas == 9 || verificarVitoria('X') || verificarVitoria('O');
    }

    private static boolean verificarVitoria(char jogador) {
        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    private static void exibirResultado() {
        exibirTabuleiro();
        if (verificarVitoria('X')) {
            System.out.println("Jogador humano (X) venceu!");
            vitoriasHumano++;
        } else if (verificarVitoria('O')) {
            System.out.println("Computador (O) venceu!");
            vitoriasComputador++;
        } else {
            System.out.println("Empate!");
            empates++;
        }
    }

    private static void exibirPlacarFinal() {
        System.out.println("Placar final:");
        System.out.println("Jogador humano (X): " + vitoriasHumano + " vitórias");
        System.out.println("Computador (O): " + vitoriasComputador + " vitórias");
        System.out.println("Empates: " + empates);
    }
}
