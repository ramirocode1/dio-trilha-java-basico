import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Consultar Saldo");
            System.out.println("0: Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Saldo atual: %.1f%n", deposito);
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;
                    
                case 2:
                   System.out.print("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor de saque inválido.");
                    }
                    break;
                    
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }   
        scanner.close();   
    }
}