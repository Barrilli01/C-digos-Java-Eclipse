package direcionadoObjetos;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a largura do retângulo");
		double largura = entrada.nextDouble();
		System.out.println("Digite a altura do retângulo");
		double altura = entrada.nextDouble();

		retangulo.CalculoArea(largura, altura);
		retangulo.CalculoPerimetro(largura, altura);
		retangulo.CalculoDiagonal(largura, altura);
		
		System.out.println("A área é: " + retangulo.CalculoArea(largura, altura));
		System.out.println("A área é: " + retangulo.CalculoPerimetro(largura, altura));
		System.out.println("A área é: " + retangulo.CalculoDiagonal(largura, altura));
		
		entrada.close();
	}

	public double CalculoArea(double a, double b) {

		double area = a * b;

		return area;
	}

	public double CalculoPerimetro(double a, double b) {

		double perimetro = (a * 2) + (b * 2);

		return perimetro;
	}
	
	public double CalculoDiagonal(double a, double b) {

		double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		return diagonal;
	}
	
}
