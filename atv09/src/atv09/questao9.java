package atv09;

import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		double num = entrada.nextDouble();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("O n�mero � divis�vel por 3 e 5");
		} else {
			System.out.println("O n�mero n�o � divis�vel por 3 e 5");
		}

		entrada.close();
	}
}
