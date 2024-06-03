// ExemploFor.java
public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS", "RAMIRO" };
    
        // (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        for (int x=0; x<alunos.length; x++) {

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    
    }
    }