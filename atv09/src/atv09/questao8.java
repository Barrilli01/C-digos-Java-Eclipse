package atv09;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu peso em kg");
		double peso = entrada.nextDouble();
		System.out.println("Digite a sua altura em metros");
		double altura = entrada.nextDouble();
		
		double imc = peso / (Math.pow(altura,2)); 
		
		if(imc < 20) {
			System.out.println("Está abaixo do peso");
		} else if(imc >= 20 && imc <= 25) {
			System.out.println("Está com peso normal");
		} else if(imc > 25 && imc <= 30) {
			System.out.println("Está com excesso de peso");
		} else if(imc > 30 && imc < 35) {
			System.out.println("Está com obesidade");
		} else {
			System.out.println("Está com obesidade mórbida");
		}

		entrada.close();
	}
}
