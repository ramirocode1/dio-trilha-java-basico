import java.util.Scanner;

public class LimiteDiarioSaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o limite diário de saque
        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();
        double totalSacado = 0.0;

        // Laço para iterar sobre os saques
        for (int i = 1; ; i++) {
            System.out.printf("Informe o valor do saque %d: ", i);
            double valorSaque = scanner.nextDouble();

            if (totalSacado + valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Operação não realizada.");
                break;
            } else {
                totalSacado += valorSaque;
                System.out.println("Saque realizado com sucesso.");
                System.out.printf("Total sacado até agora: %.2f%n", totalSacado);
            }

            System.out.print("Deseja realizar outro saque? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}