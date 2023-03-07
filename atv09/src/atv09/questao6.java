package atv09;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int total = 780000; 
		double primeiro = total * 0.46;
		double segundo = total * 0.32;
		double terceiro = total - (primeiro + segundo);
		
		System.out.println("O primeiro ganhará : R$" + primeiro);
		System.out.println("O segundo: R$" + segundo);
		System.out.println("O terceiro: R$" + terceiro);

		entrada.close();
	}
}
