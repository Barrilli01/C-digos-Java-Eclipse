package atv09;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um n�mero");
        double num = entrada.nextDouble();

        double sobra = num % 2;
        if (sobra == 0) {
            System.out.println("O n�mero � par");
        } else {
            System.out.println("O n�mero � �mpar");
        }
        entrada.close();
	}
}
