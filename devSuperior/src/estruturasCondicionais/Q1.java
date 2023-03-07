package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = entrada.nextDouble();
		
		double notaf = nota1 + nota2;
		
		if (notaf > 60) {
			System.out.println("Aprovado com nota final igual a " + notaf + "!");
		}
		else {
			System.out.println("Reprovado com nota final igual a " + notaf + "!");
		}
		Locale.setDefault(Locale.US);
		
		entrada.close();
	}
}
