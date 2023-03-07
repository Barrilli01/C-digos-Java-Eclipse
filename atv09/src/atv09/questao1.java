package atv09;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        double num = entrada.nextDouble();

        double sobra = num % 2;
        if (sobra == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        entrada.close();
	}
}
