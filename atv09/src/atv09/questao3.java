package atv09;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		double n1 = entrada.nextDouble();
		System.out.println("Digite o segundo número");
		double n2 = entrada.nextDouble();

		if(n1 != n2) {
			System.out.println("Os números são diferentes! Seus quadrados são:");
			System.out.println("número 1: " + Math.pow(n1,2));
			System.out.println("número 2: " + Math.pow(n2,2));
		}else {
			System.out.println("Os números são iguais! O cubo deles é: " + Math.pow(n1,3));
		}
		
		entrada.close();
	}
}
