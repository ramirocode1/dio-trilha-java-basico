import java.util.Scanner;

public class VerificaElegibilidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não é elegível para criar uma conta bancária.");
        }

        scanner.close();
    }
}
