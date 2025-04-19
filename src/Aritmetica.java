import java.util.Scanner;

public class Aritmetica {


        public static void main(String[] args) {
            System.out.println("Meu nome é Roxy, tenho 27 anos e moro em Igarassu - PE.");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número para a resolução: ");
            int num1 = teclado.nextInt();

            System.out.println("Digite outro número para a resolução: ");
            int num2 = teclado.nextInt();

            int soma = num1 + num2;
            int subtracao = num1 - num2;
            int divisao = num1/num2;
            int multiplicacao = num1 * num2;


            System.out.println("A Soma de " + num1 + " + " + num2 + " é = " + soma);

            System.out.println("A Subtração de " + num1 + " - " + num2 + " é = " + subtracao);

            System.out.println("A Divisão de " + num1 + " / " + num2 + " é = " + divisao);

            System.out.println("A Multiplicação de " + num1 + " * " + num2 + " é = " + multiplicacao);

        }
    }

