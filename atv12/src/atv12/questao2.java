package atv12;

public class questao2 {

	public static void main(String[] args) {
		int matriz1[][] = { { 2, 4 }, { -3, 1 } };
		int matriz2[][] = { { 2, -3 }, { 4, 1 } };
		
	    for(int i = 0; i < matriz1.length; i++){
	        for(int j = 0; j < matriz2.length; j++){
	            if(matriz1[i][j] != matriz2[j][i])
	                System.out.println("Não é simétrica");
	        }
	    }
	    System.out.println("É simétrica");
	}
}