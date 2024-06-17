import java.util.Scanner;

public class VerificaContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número da conta bancária: ");
            String numeroConta = scanner.nextLine();

            // Verifica se o número da conta tem exatamente 8 dígitos
            if (numeroConta.length() != 8 || !numeroConta.matches("\\d{8}")) {
                throw new IllegalArgumentException("Número de conta inválido. O número da conta deve ter exatamente 8 dígitos.");
            }

            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
