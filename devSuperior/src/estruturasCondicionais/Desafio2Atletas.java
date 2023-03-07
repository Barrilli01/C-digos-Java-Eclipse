package estruturasCondicionais;

import java.util.Scanner;

public class Desafio2Atletas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double m = 0, f = 0, total = 0, maior = 0, alturam = 0, alturaf = 0, alturat = 0, pesom = 0, pesof = 0, pesot = 0;
		String s, nome, nomeMaior = "";
		
		do {
		System.out.println("Digite o total de atletas");
		total = entrada.nextInt();
		} while (total < 0);
		
		if (total > 0) {

			for (int i = 1; i <= total; i++) {
				do {
					
					System.out.printf("\nCADASTRO 0%d \n" , i);
					
					System.out.println("Digite o sexo do atleta");
					s = entrada.next().toUpperCase();

					if (!s.equals("M") && !s.equals("F")) {
						System.out.println("Inv�lido, digite novamente!");
						System.out.println(" ");
					}
				} while (!s.equals("M") && !s.equals("F"));

				if (s.equals("M")) {
					m += 1;
				} else if (s.equals("F")) {
					f += 1;
				}

				if (s.equals("M")) {
					do {
						System.out.println("Qual o primeiro nome do atleta?");
						nome = entrada.next();
						
						System.out.println("Qual o peso do atleta?");
						pesom = entrada.nextDouble();
						
						pesot = pesom;
						
						System.out.println("Digite a altura do atleta em metros");
						alturam = entrada.nextDouble();

						if (maior < alturam) {
							maior = alturam;
							nomeMaior = nome;
						} else {
							maior = maior;
						}

						if (alturam < 0) {
							System.out.println("Inv�lido, digite novamente!");
							System.out.println(" ");
						}
					} while (alturam < 0);
					alturat = alturam;
				}
				if (s.equals("F")) {
					do {
						System.out.println("Qual o primeiro nome da atleta?");
						nome = entrada.next();
						
						System.out.println("Qual o peso da atleta?");
						pesof = entrada.nextDouble();
						
						pesot += pesof;
						
						System.out.println("Digite a altura do atleta em metros");
						alturaf = entrada.nextDouble();

						if (maior < alturaf) {
							maior = alturaf;
							nomeMaior = nome;
						} else {
							maior = maior;
						}

						if (alturaf < 0) {
							System.out.println("Inv�lido, digite novamente!");
							System.out.println(" ");
						}

					} while (alturaf < 0);
					alturat = alturaf;
				}
			}

			double pmedio = pesot / total;
			double alturaMedF = alturam / f;
			
			System.out.println("O peso m�dio dos atletas � " + pmedio + "kg");
			System.out.println("O atleta mais alto � " + nomeMaior);

			if (m > 0) {
				System.out.printf("Porcentagem de homens: %.1f %%%n", ((m / total) * 100));
			} else {
				System.out.println("N�o h� homens cadastrados!");
			}

			if (f > 0) {
				System.out.println("Altura m�dia das mulheres: " + alturaMedF);
			} else {
				System.out.println("N�o h� mulheres cadastradas!");
			}

			entrada.close();
		} else {
			System.out.println("N�o existem atletas para serem cadastrados!");
		}
	}
	
}