package atv09;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a senha de 5 dígitos");
		String senha = entrada.nextLine();

		if(senha.equals("123ab")) {
			System.out.println("Senha correta inserida!");
		} else {
			System.out.println("Senha incorreta!");
		}
		
		entrada.close();
	}
}
