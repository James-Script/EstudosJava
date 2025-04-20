
public class LimiteTentativas {
    public static void main(String[] args) {
        final int MAX_TENTATIVAS = 3;
        for (int i = 1; i <= MAX_TENTATIVAS; i++) {
            System.out.println("Tentativa " + i + " de " + MAX_TENTATIVAS);
        }
    }
}
