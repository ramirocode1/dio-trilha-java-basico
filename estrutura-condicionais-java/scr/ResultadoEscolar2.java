// Cenário 2
public class ResultadoEscolar2 {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=6 ? "Aprovado" : nota >=5 && nota <5 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}