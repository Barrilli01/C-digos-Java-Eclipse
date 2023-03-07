package atv11;

public class questao7 {

	public static void main(String[] args) {
		double vetorA[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		double vetorB[] = new double[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			vetorB[i] = Math.pow(vetorA[i] , 2);  
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println((int) vetorB[i]);
		}
	}
}
