package atv09;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero");
		double n1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero");
		double n2 = entrada.nextDouble();

		if(n1 != n2) {
			System.out.println("Os n�meros s�o diferentes! Seus quadrados s�o:");
			System.out.println("n�mero 1: " + Math.pow(n1,2));
			System.out.println("n�mero 2: " + Math.pow(n2,2));
		}else {
			System.out.println("Os n�meros s�o iguais! O cubo deles �: " + Math.pow(n1,3));
		}
		
		entrada.close();
	}
}
