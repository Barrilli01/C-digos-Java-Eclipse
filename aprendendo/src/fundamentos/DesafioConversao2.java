package fundamentos;

import java.util.Scanner;

public class DesafioConversao2 {
	public static void main(String[] args) {

		Scanner valores = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		String salario1 = valores.nextLine().replace(",", ".");

		System.out.println("Digite o segundo valor");
		String salario2 = valores.nextLine().replace(",", ".");

		System.out.println("Digite o terceiro valor");
		String salario3 = valores.nextLine().replace(",", ".");

		System.out.println("Salários amontoados: " + salario1 + salario2 + salario3);

		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		double soma = valor1 + valor2 + valor3;

		System.out.printf("O salário final é %.2f reais \n" + "E a média dos salários é %.2f reais", soma, soma / 3);

		valores.close();
	}
}
