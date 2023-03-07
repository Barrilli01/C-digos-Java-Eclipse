package atv11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		int cont[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0 ; i < 6 ; i++) {
			System.out.println("Digite o valor para armazenar na posição " + i);
			cont[i] = entrada.nextInt();
		}
		
		for (int i = 6 ; i >= 0 ; i--) {
			System.out.println(cont[i]);
		}
		
		entrada.close();
	}
}
