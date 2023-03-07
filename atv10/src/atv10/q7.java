package atv10;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		int total = 0;
		
		System.out.println("Digite um número negativo");
		num = entrada.nextInt();
		
		do {
			total += num;
			num++;
		}while (num<0);
		
		System.out.println("O somatório é " + total);
		
		entrada.close();
	}
}
