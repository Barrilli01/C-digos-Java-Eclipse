package atv11;

public class questao3 {

	public static void main(String[] args) {
		int vetor[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		int menor = 0 , i = 0 , maior = 0;
		
		do {
		if (vetor[i] % 2 != 0) {
			menor = vetor[i];
		}
		
		i++;
		} while(vetor[i] % 2 != 0);
		
		for (i = 0 ; i < 10 ; i++) {
			if (vetor[i] % 2 ==  0 && vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] % 2 !=  0 && vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("O maior valor par é " + maior);
		System.out.println("O menor valor ímpar é " + menor);
	}
}
