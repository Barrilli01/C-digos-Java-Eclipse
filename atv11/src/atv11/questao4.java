package atv11;

public class questao4 {

	public static void main(String[] args) {
		int vetor1[] = {7 , 4 , 9 , 15 , 20 , 2 , 1 , 4 , 0 , 30}; 
		int vetor2[] = {1 , 8 , 3 , 7 , 17 , 9 , 1 , 8 , 11 , 16}; 
		int vetor3[] = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			vetor3[i] = (vetor1[i] + vetor2[i]);
		}
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("A soma na posição " + i + " é " + vetor3[i]);
		}
	}
}
