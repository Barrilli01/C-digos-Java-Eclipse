package atv12;

public class questao1 {

	public static void main(String[] args) {
		int matriz1[][] = { { 1, 4, 1 }, { -3, 2, 0 }, { 3, 5, 2 } };
		int matriz2[][] = { { 2, 8, 1 }, { -1, 1, 0 }, { 5, 1, -2 } };
		int matrizX[][] = new int[3][3];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matrizX[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		for (int i = 0; i < matrizX.length; i++) {
			for (int j = 0; j < matrizX.length; j++) {
				System.out.print(" " + matrizX[i][j]);
			}
			System.out.println(" ");
		}
	}
}
