package estruturasSequenciais;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno");
		double largura = ent.nextDouble();
		System.out.println("Digite o comprimento do terreno");
		double comprimento = ent.nextDouble();
		
		double area = largura * comprimento;
		
		System.out.println("Digite o valor do metro quadrado");
		double valor = ent.nextDouble();
		
		double total = area * valor;
		
		System.out.println("Area do terreno:" + area);
		System.out.println("Preço do terreno: " + total);

		ent.close();
	}
}
