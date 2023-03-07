package atv11;

public class questao9 {

	public static void main(String[] args) {
		int vetor1[] = { 1, 2, 3, 4, 5 };
		int vetor2[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 0; i < vetor2.length; i++) {
			for (int j = 0; j < vetor1.length; j++) {
				if (vetor1[j] == vetor2[i]) {
					System.out.println(vetor1[j]);
				}
			}
		}
	}
}
