package atv09;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		if(idade >=5 && idade <= 7) {
			System.out.println("Pertence a categoria Infantil A");
		} else if(idade >= 8 && idade <= 10) {
			System.out.println("Pertence a categoria Infantil B");
		} else if(idade >= 11 && idade <= 13) {
			System.out.println("Pertence a categoria Juvenil A");
		} else if(idade >= 14 && idade <= 17) {
			System.out.println("Pertence a categoria Juvenil B");
		} else {
			System.out.println("Não pertence a nenhuma categoria");
		}
		entrada.close();
	}
}
