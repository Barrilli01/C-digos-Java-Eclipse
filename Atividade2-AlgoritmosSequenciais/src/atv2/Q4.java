package atv2;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite a quantidade de camisetas pequenas");
	int pequenas = entrada.nextInt();
	System.out.println("Digite a quantidade de camisetas médias");
	int medias = entrada.nextInt();
	System.out.println("Digite a quantidade de camisetas grandes");
	int grandes = entrada.nextInt();
	
	int valorTotal = pequenas * 10 + medias * 12 + grandes * 15; 

	System.out.println("O valor total arrecadado nessa venda é de R$" + valorTotal);
	
	entrada.close();
}
}
