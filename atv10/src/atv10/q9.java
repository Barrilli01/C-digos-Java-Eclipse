package atv10;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		int total , max , soma = 0 , pares = 0 , menor =0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int n = entrada.nextInt();
		
		max = n;
		soma += n;
		
		for (total = 1; n != 0; total++) {
			System.out.println("Digite um n�mero");
			n = entrada.nextInt();
			
			soma += n;
			
			if (n % 2 == 0) {
				pares++;
			}
			if(n > max) {
				max = n;
			}
		}
		
		double media = soma/total;
		
		System.out.println("O total de n�meros digitados foi: " + total);
		System.out.println("O total de n�meros pares digitados foi: " + pares);
		System.out.println("A m�dia dos n�meros digitados foi: " + media);
		System.out.println("O maior n�mero digitado foi: " + max + " e o menor foi: " + menor);
		
		entrada.close();
	}
}
