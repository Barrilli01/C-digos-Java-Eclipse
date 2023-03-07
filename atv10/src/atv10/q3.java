package atv10;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o numero inicial");
		double inicio = entrada.nextDouble();
		System.out.println("Digite o numero final");
		double fim = entrada.nextDouble();

		do {

			System.out.println(inicio);
			inicio++;

		} while (inicio <= fim);
		entrada.close();
	}
}
