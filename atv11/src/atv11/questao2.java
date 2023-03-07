package atv11;

public class questao2 {

	public static void main(String[] args) {
		int vetor[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , -10};
		int soma = 0;
		
		for (int i = 0 ; i < 10 ; i++) {
			
			if (vetor[i] >= 0) {
				soma += vetor[i];
			}
		}
		
		System.out.println("A soma foi de " + soma);
		
	}
}
