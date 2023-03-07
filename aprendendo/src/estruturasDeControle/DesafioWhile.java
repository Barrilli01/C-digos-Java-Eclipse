package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) { 
			System.out.println("Se quiser sair digite 'sair'");
			System.out.println("Caso contrário, escreva algo!");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
