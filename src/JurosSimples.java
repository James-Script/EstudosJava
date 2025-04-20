public class JurosSimples {
    public static void main(String[] args) {
        final double TAXA_JUROS = 0.02; // 2% ao mês

        double valorInicial = 1000;
        int meses = 6;

        double juros = valorInicial * TAXA_JUROS * meses;
        double valorFinal = valorInicial + juros;

        System.out.println("Valor final após " + meses + " meses: R$ " + valorFinal);
    }
}
