package atv10;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int n = entrada.nextInt();
		System.out.println("Esses s�o os n�meros �mpares entre 0 e " + n + ":");
		for (int i = 0 ; i <= n ; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		entrada.close();
	}
}
