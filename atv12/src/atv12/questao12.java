package atv12;

public class questao12 {

	public static void main(String[] args) {
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == matriz[0][2] || matriz[i][j] == matriz[1][1] || matriz[i][j] == matriz[2][0]) {
					soma += matriz[i][j];
				} 
			}
		}
		System.out.println(soma);
	}
}
