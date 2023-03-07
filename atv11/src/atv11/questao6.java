package atv11;

public class questao6 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int par = 0 , impar = 0;
		
		for (int i = 0 ; i < 10 ; i++) {
			vetor[i] = i;
			
			if (vetor[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Há " + par + " números pares e " + impar + " números ímpares");
	}
}
