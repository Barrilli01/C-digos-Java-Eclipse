package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile2 {

	public static void main(String[] args) {

		double nota = 0;
		int a = 0;
		int r = 0;

		Scanner entrada = new Scanner(System.in);
		
		do {
			
		System.out.println("Se quiser sair digite -1");
		System.out.println("caso queira continuar digite uma nota v�lida");
		System.out.println("Digite uma nota v�lida");
		
		nota = entrada.nextDouble();
		
			if (nota >= 7.0) {
				a++;
			}else if (nota < 7.0) { 
				r++;
			}
		
		} while (nota != -1);
		
		int total = a + r;
		
		System.out.println("A quantidade de alunos aprovados � " + a);
		System.out.println("A quantidade de alunos reprovados � " + r);
		System.out.println("O total de  alunos � " + total);
		
		entrada.close();
	}
}
