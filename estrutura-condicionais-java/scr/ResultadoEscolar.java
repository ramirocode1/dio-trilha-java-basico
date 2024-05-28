public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 3;
      
    
       if(nota >= 7)
        System.out.println("Aprovado com nota: " + nota);

       else if (nota >= 5)

       System.out.println("Recuperação com nota " + nota);

       else
        System.out.println("Reprovado com nota " + nota);
    }
}