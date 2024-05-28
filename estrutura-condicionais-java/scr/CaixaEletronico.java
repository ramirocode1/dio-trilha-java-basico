
// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 100.0;
       double valorSolicitado = 30.0;

       if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;

        System.out.println("Saque efetuado com sucesso.");

       }else

       System.out.println("Saldo insulficiente");
       System.out.println(" Seu saldo atual é " + saldo);


    }
}