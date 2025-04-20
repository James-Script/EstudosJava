import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String [] args){
        final int LIMITE_TENTATIVAS = 3;
        final int NUMERO_SECRETO = 7;

        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < LIMITE_TENTATIVAS){
            System.out.println("Tente adivinhar qual o número secreto (entre 1 a 10): ");
            int palpite = scanner.nextInt();

            tentativas++;

            if(palpite == NUMERO_SECRETO){
                acertou = true;
                break;
            }else{
                System.out.println("Errou! Tentativas restantes: " + (LIMITE_TENTATIVAS - tentativas));

            }
        }
        if(acertou){
            System.out.println("Parabéns! Você acertou o número secreto! " + "( "+NUMERO_SECRETO+" )");

        }else{
            System.out.println("Você excedeu o limite de tentativas. O número era: " + NUMERO_SECRETO);

        }
        scanner.close();
    }
}
