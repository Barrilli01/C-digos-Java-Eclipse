package atv11;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int iguais = 0;
		
		System.out.println("Digite o número que deseja comparar");
		int valor = entrada.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (valor == vetor[i]) {
				iguais++;
			}
		}
		
		System.out.println("A quantidade de vezes que repete são " + iguais);
		entrada.close();
	}
}
