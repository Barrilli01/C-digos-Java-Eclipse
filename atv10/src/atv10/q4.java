package atv10;

public class q4 {

	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		
		for(int i = 10 ; i <= 20 ; i++) {
			if(i % 2 == 0) {
				par++;
			} else {
			impar ++;
			}
		}
		System.out.println("Quanntidade total de números pares: " + par);
		System.out.println("Quanntidade total de números ímpares: " + impar);
	}
}
