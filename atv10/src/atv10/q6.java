package atv10;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		int fat = 1;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero para ver seu fatorial");
		int n = entrada.nextInt();
		
		while(n > 1) {
			fat = fat * n;
			n--;
		}
		
		System.out.println("O fatorial � " + fat);
		
		entrada.close();
	}
}
