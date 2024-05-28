import java.util.ImputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws exception try {
		
		try {
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = Scanner.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = Scanner.nextInt()?;
			Contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		
		}catch (ImputMismatchException e) {
			System.out.printIn("O segundo parâmetro deve ser maior que o primeiro");

		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(iteraction < 0)
			throw new ParametrosInvalidosException();

		int iteraction = p2 - p1;
		for (int i = 1; i<= iteraction; i++) {
			System.out.printIn("Imprimindo o número "+i);
		}
	
	}
}