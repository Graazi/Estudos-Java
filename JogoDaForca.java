import java.util.Scanner;
import java.util.HashSet;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = "Mundo";
        HashSet<Character> letrasAcertadas = new HashSet<>();
        int tentativas = 6;

        while (tentativas > 0) {
            mostrarPalavra(palavra, letrasAcertadas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().charAt(0);

            if (palavra.indexOf(letra) >= 0) {
                letrasAcertadas.add(letra);
            } else {
                tentativas--;
                System.out.println("Letra incorreta! Tentativas restantes: " + tentativas);
            }

            if (verificarGanhou(palavra, letrasAcertadas)) {
                System.out.println("Parabéns, você ganhou!");
                return;
            }
        }

        System.out.println("Você perdeu! A palavra era: " + palavra);
    }

    private static void mostrarPalavra(String palavra, HashSet<Character> letrasAcertadas) {
        for (char letra : palavra.toCharArray()) {
            if (letrasAcertadas.contains(letra)) {
                System.out.print(letra + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    private static boolean verificarGanhou(String palavra, HashSet<Character> letrasAcertadas) {
        for (char letra : palavra.toCharArray()) {
            if (!letrasAcertadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }
}