package atv12;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int igual;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite o valor da matriz na posição " + i + j);
				matriz[i][j] = entrada.nextInt();
			}
		}
		do {
			System.out.println("Digite o número q deseja verificar");
			igual = entrada.nextInt();
			
			int cont = 0;
			
			if (igual != 999) {
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						if (igual == matriz[i][j]) {
							cont++;
						}
					}
				}
				System.out.println("O número " + igual + " aparece " + cont + " vezes");
			} else {
				System.out.println("Programa encerrado!1");
			}
			
		} while(igual != 999);
		entrada.close();
	}
}