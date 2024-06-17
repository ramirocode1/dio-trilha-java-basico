import java.util.Scanner;

public class ChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double LIMITE_CHEQUE_ESPECIAL = 500.0;

        // Solicita o saldo atual da conta bancária
        System.out.print("Informe o saldo atual da conta bancária: ");
        double saldoAtual = scanner.nextDouble();

        // Solicita o valor do saque
        System.out.print("Informe o valor do saque desejado: ");
        double valorSaque = scanner.nextDouble();

        // Verifica se o saque ultrapassa o saldo disponível
        if (valorSaque <= saldoAtual) {
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Calcula o saldo negativo após o saque
            double saldoNegativo = valorSaque - saldoAtual;

            // Verifica se o saldo negativo ultrapassa o limite do cheque especial
            if (saldoNegativo > LIMITE_CHEQUE_ESPECIAL) {
                System.out.println("Transação não pode ser realizada devido ao limite do cheque especial excedido.");
            } else {
                System.out.println("Transação realizada com sucesso, utilizando o cheque especial.");
            }
        }

        scanner.close();
    }
}
