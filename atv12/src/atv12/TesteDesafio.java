package atv12;

import java.util.Random;
import java.util.Scanner;

public class TesteDesafio {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int num;
		int n, i = 1;
		Scanner entrada = new Scanner(System.in);
		
		num = gerador.nextInt(50);
		
		System.out.println(num);
		
		do {
			System.out.println("Digite o valor m�gico");
			n = entrada.nextInt();
			
			if (n > num) {
				System.out.println("O n�mero m�gico � maior do que voc� digitou");
			} else if (n < num) {
				System.out.println("O n�mero m�gico � menor do que voc� digitou");
			} else {
				System.out.println("Parab�ns voc� acertou em " + i + " tentativas");
			}
			i++;
			
		} while ( n != num);
		entrada.close();
	}
}
