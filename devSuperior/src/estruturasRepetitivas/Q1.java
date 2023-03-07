package estruturasRepetitivas;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x, y;
		
		do {
		System.out.println("Digite o Primeiro número");
		x = entrada.nextInt();
		System.out.println("Digite o Segundo número");
		y = entrada.nextInt();
		
		if (x > y) { 
			System.out.println("Os números foram digitados em ordem decrescente!");
		}
		
		else if (x < y) { 
			System.out.println("Os números foram digitados em ordem crescente!");
		}
		
		} while (x != y);
		
		System.out.println("");
		System.out.println("Os números digitados são iguais!");
		System.out.println("");
		System.out.println("Sistema Encerrado!");
		
		entrada.close();
	}
}
