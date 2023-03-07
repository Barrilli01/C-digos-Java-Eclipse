package atv2;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite o valor 'a'");
	double a = entrada.nextDouble();
	System.out.println("Digite o valor 'b'");
	double b = entrada.nextDouble();
	System.out.println("Digite o valor 'c'");
	double c = entrada.nextDouble();
	System.out.println("Digite o valor 'd'");
	double d = entrada.nextDouble();
	System.out.println("Digite o valor 'e'");
	double e = entrada.nextDouble();
	System.out.println("Digite o valor 'f'");
	double f = entrada.nextDouble();
	
	double X = ((c*e - b*f) / (a*e - b*d));
	double Y = ((a*f - c*d) / (a*e - b*d));
	
	if (X == -0.0) {
		X = 0;
	}
	if (Y == -0.0) {
		Y = 0;
	}
	
	System.out.println("O valor de X é " + X);
	System.out.println("O valor de Y é " + Y);
	entrada.close();
}
}
