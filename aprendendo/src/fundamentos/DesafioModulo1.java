package fundamentos;

import java.util.Scanner;

public class DesafioModulo1 {

	public static void main(String[] args) {
		// calculadora 
		double resultado = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o primeiro número?");
		String NUM1 = entrada.nextLine().replace("," , "."); 

		System.out.println("Qual o segundo número?");
		String NUM2 = entrada.nextLine().replace("," , "."); 
		
		Double num1 = Double.parseDouble(NUM1);
		Double num2 = Double.parseDouble(NUM2);

		System.out.printf("O primeiro e segundo número são %.2f e %.2f \n" , num1 , num2);
		
		System.out.println("Qual operação matemática deseja fazer?");
		System.out.println("+ para soma");
		System.out.println("- para subtração");
		System.out.println("* para multiplicação");
		System.out.println("/ para divisão");
		String operador = entrada.nextLine();
		
		if (operador.equals("+")) {
			resultado = num1 + num2;
		}else if (operador.equals("-")) {
			resultado = num1 - num2;
		}else if (operador.equals("*")) {
			resultado = (num1 * num2);
		}else if (operador.equals("/")) {
			resultado = num1 / num2;
		}
		System.out.printf("O resultado da operação é: %.2f" , resultado);
		entrada.close();
}
}
