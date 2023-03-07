package treinando;

import java.util.Scanner;

public class Cadastro {

	public static void cadastro() {
		Scanner entrada = new Scanner(System.in);

		String nome; 
		int idade; 
		String dataNascimento;
		
		System.out.println("Digite o nome");
		nome = entrada.nextLine();
		System.out.println("Digite a idade");
		idade = entrada.nextInt();
		System.out.println("Digite a data de nascimento (Neste formato:xx/xx/xxxx)");
		dataNascimento = entrada.nextLine();
	
		entrada.close();
	}
	public static void Exibir(String nome, int idade, String dataNascimento) {
		
		System.out.println("Nome : " + nome);
		System.out.println("Nome : " + idade);
		System.out.println("Nome : " + dataNascimento);
	}
}
