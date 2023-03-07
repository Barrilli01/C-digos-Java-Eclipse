package atv09;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número");
		double n1 = entrada.nextDouble();
		double resultado = n1 * 2;
		
		if(resultado < 30) {
		System.out.println("O resultado foi menor que 30!");
		} else {
		System.out.println("O resultado é " + resultado);
		}
			
		entrada.close();
	}
}
