package atv10;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número");
		int N = entrada.nextInt();
		
		do {
			System.out.println(N);
			N--;
		} while(N>=0);

		entrada.close();
	}
}
