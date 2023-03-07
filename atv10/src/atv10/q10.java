package atv10;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i, tempo, mvolta, mtempo, ttempo;
		
		System.out.println("Digite o número de voltas");
		int voltas = entrada.nextInt();
		
		System.out.println("Digite o tempo em segundos na volta 1");
		tempo = entrada.nextInt();
		
		mtempo = tempo;
		mvolta = 1;
		
		ttempo = tempo;
		
		i = 0;
		i++;
		
		for (i = i; i < voltas; i++) {
			System.out.println("Digite o tempo em segundos na volta " + (i + 1));
			tempo = entrada.nextInt();
			
			if (tempo < mtempo) {
				mtempo = tempo;
				mvolta = i;
			}
			
			ttempo += tempo;
		}
		
		System.out.println("O melhor tempo foi de " + mtempo + " segundos");
		System.out.println("A melhor volta foi na volta " + mvolta);
		System.out.println("A média das voltas foi de " + ttempo / i);
		
		entrada.close();
	}
}
