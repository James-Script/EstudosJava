import java.util.Scanner;

public class AdivinhaNome {
    public static void main(String[] args) {
        final int LIMITE_TENTATIVAS = 3;
        final String NOME_SECRETO = "James";

        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < LIMITE_TENTATIVAS) {
            System.out.print("Tente adivinhar o nome secreto: ");
            String nome = scanner.nextLine();

            tentativas++;

            if (nome.equalsIgnoreCase(NOME_SECRETO)) {
                acertou = true;
                break;
            } else {
                System.out.println("Errado! Tentativas restantes: " + (LIMITE_TENTATIVAS - tentativas));
            }
        }

        if (acertou) {
            System.out.println("Você acertou! O nome era mesmo " + NOME_SECRETO);
        } else {
            System.out.println("Acabaram as tentativas. O nome era: " + NOME_SECRETO);
        }

        scanner.close();
    }
}
