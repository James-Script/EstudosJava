import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        int i = 1;

        for (i = 1; i <= 20; i++)
            if (i % 2 == 0) {
                System.out.println(nome + " o seu número " + i + " é par.");
            } else {
                System.out.println(nome + " o seu número " + i + " é ímpar.");
            }
    }
}


