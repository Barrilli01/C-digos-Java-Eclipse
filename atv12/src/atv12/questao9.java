package atv12;

public class questao9 {

	public static void main(String[] args) {
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == matriz[1][2] || matriz[i][j] == matriz[2][1] || matriz[i][j] == matriz[2][2]) {
					System.out.print("  ");
				} else {
					System.out.print(" " + matriz[i][j]);
				}
			}
			System.out.println(" ");
		}
	}
}
