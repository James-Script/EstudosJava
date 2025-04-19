import java.util.Scanner;
import java.util.Locale;

public class CadastroUsuario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (ex: 1.75): ");
        float altura = scanner.nextFloat();

        System.out.print("Digite seu salário (ex: 2500.50): ");
        double salario = scanner.nextDouble();

        System.out.print("Digite seu sexo (M/F/OUTROS): ");
        char sexo = scanner.next().toUpperCase().charAt(0);


        System.out.print("Você estuda Java? (Sim/Não): ");
        String resposta = scanner.next().trim().toLowerCase();
        boolean estudaJava = resposta.equals("sim");


        float alturaCm = altura * 100;
        double salarioDobrado = salario * 2;
        String javaStatus = estudaJava? "Sim" : "Não";
        String generoCompleto = (sexo == 'F') ? "Feminino" : (sexo == 'M') ? "Masculino" : "Outro / Não informado";



        // Exibição dos dados
        System.out.println("\n" + "|--- DADOS CADASTRADOS ---|");
        System.out.println("|                         |");
        System.out.println("|Nome: " + nome +"              |");
        System.out.println("|Idade: " + idade + " anos           |");
        System.out.println("|Altura: " + altura + " m(" + alturaCm + "cm)  |");
        System.out.printf("|Salário: R$ %.2f (Dobrado: R$ %.2f)%n", salario, salarioDobrado +"|");
        System.out.println("|Sexo: " + generoCompleto + "          |");
        System.out.println("|Estuda Java? " + javaStatus + "         |");
        scanner.close();
    }
}