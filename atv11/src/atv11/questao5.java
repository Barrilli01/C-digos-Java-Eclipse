package atv11;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Digite um número");
			vetor[i] = entrada.nextInt();
			
			if (vetor[i] < 0) {
				vetor[i] = -1;
			}
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(vetor[i]);
		}
		entrada.close();
	}
}