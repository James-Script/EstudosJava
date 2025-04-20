public class ConversaoTemperatura {
    public static void main(String[] args) {
        final double FATOR_MULTIPLICACAO = 1.8;
        final int AJUSTE = 32;

        double celsius = 26;
        double fahrenheit = (celsius * FATOR_MULTIPLICACAO) + AJUSTE;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
