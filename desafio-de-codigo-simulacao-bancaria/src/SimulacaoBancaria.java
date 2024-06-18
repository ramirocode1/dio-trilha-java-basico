import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Depositar
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                    
                case 2:
                    // Sacar
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    
                    else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                    
                case 3:
                    // Consultar Saldo
                    System.out.println("Saldo atual: " + saldo);
                    break;
                    
                case 0:
                    // Encerrar
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                    
                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}