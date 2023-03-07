package fundamentos;

import java.util.Scanner;

public class PrimeiroPrograma {
	public static void main(String[] args) {

		System.out.println("Ola mundo!!!");
		String a = "Hello again";
		System.out.println(a);

		int b = 1;
		int c = 3;
		System.out.println(b + c);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual seu nome? ");
		String nome = entrada.nextLine();

		System.out.println("Qual sua idade? ");
		int idade = entrada.nextInt();

		System.out.printf("%s tem %d anos", nome, idade);
		entrada.close();
	}
}
