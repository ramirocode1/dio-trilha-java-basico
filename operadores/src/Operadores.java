public class Operadores {
    public static void main(String[] args) throws Exception {

        double soma = 15.8 + 13.75;
        int subtracao = 50 - 34;
        double resultado1 = (10 * 5) + (75 / 5);
        int divisao = 1000 / 72;
        double modulo = 150 % 2;

        String linguagem = "LINGUAGEM" + " " + "JAVA";
        String nomeCompleto = "Ramiro" +  " " + "Lima" + " " + "Gonçalves";
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(resultado1);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(nomeCompleto);
        System.out.println(linguagem);

        int a, b;
        a = 5;
        b = 6;

        // String resultado = " ";
        // if (a==b) 
        //    resultado = "VERDADEIRO";
        // else
        //    resultado = "FALSO";

        String resultado = a==b ? "VERDADEIRO" : "FALSO"; // Abreviação o IF, com operadores alternario

        System.out.println(resultado);


        int numero1 = 2;
        int numero2 = 3;
        double numero3 = 15.5;
        double numero4 = 20.0;

        boolean simNao = numero1 != numero2; //True
        boolean simNao2 = numero3 == numero4; // False

        System.out.println("Nº1 é diferente do Nº2?" + " " +  simNao);
        System.out.println("Nº3 é igual do Nº4?" + " " + simNao2);
    
        // Diferente !=
        // Igual ==
        // Maior, Maior ou Igual, Menor, Menor ou igual = >, >= / <, <=
            
        
    }
}
