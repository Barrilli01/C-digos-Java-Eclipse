package fundamentos;

import java.util.Scanner;

public class DesafioModulo1 {

	public static void main(String[] args) {
		// calculadora 
		double resultado = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o primeiro n�mero?");
		String NUM1 = entrada.nextLine().replace("," , "."); 

		System.out.println("Qual o segundo n�mero?");
		String NUM2 = entrada.nextLine().replace("," , "."); 
		
		Double num1 = Double.parseDouble(NUM1);
		Double num2 = Double.parseDouble(NUM2);

		System.out.printf("O primeiro e segundo n�mero s�o %.2f e %.2f \n" , num1 , num2);
		
		System.out.println("Qual opera��o matem�tica deseja fazer?");
		System.out.println("+ para soma");
		System.out.println("- para subtra��o");
		System.out.println("* para multiplica��o");
		System.out.println("/ para divis�o");
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
		System.out.printf("O resultado da opera��o �: %.2f" , resultado);
		entrada.close();
}
}
