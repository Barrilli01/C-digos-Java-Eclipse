package estruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Que dia � hoje?");
		System.out.println("Digite 1 para domingo");
		System.out.println("Digite 2 para segunda");
		System.out.println("Digite 3 para ter�a");
		System.out.println("Digite 4 para quarta");
		System.out.println("Digite 5 para quinta");
		System.out.println("Digite 6 para sexta");
		System.out.println("Digite 7 para s�bado");

		int dia = entrada.nextInt();

		if (dia == 1)
			System.out.println("Hoje � domingo!");
		if (dia == 2)
			System.out.println("Hoje � segunda!");
		if (dia == 3)
			System.out.println("Hoje � ter�a!");
		if (dia == 4)
			System.out.println("Hoje � quarta!");
		if (dia == 5)
			System.out.println("Hoje � quinta!");
		if (dia == 6)
			System.out.println("Hoje � sexta!");
		if (dia == 7)
			System.out.println("Hoje � s�bado!");
		if (dia != 1 && dia != 2 && dia != 3 && dia != 4 && dia != 5 && dia != 6 && dia != 7)
			System.out.println("N�mero escolhido n�o est� na lista");

		entrada.close();
	}
}
