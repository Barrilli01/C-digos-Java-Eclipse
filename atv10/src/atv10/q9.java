package atv10;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		int total , max , soma = 0 , pares = 0 , menor =0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = entrada.nextInt();
		
		max = n;
		soma += n;
		
		for (total = 1; n != 0; total++) {
			System.out.println("Digite um número");
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
		
		System.out.println("O total de números digitados foi: " + total);
		System.out.println("O total de números pares digitados foi: " + pares);
		System.out.println("A média dos números digitados foi: " + media);
		System.out.println("O maior número digitado foi: " + max + " e o menor foi: " + menor);
		
		entrada.close();
	}
}
