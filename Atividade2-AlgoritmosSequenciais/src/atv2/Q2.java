package atv2;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite a primeira nota");
	double nota1 = entrada.nextDouble();
	System.out.println("Digite a segunda nota");
	double nota2 = entrada.nextDouble();
	System.out.println("Digite a terceira nota");
	double nota3 = entrada.nextDouble();
	
	double notaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
	
	System.out.println("A média final do aluno é " + notaFinal);
	
	entrada.close();
}
}
