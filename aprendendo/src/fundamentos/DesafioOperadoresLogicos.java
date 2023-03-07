package fundamentos;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		
		Boolean trabalhoterca = true;
		Boolean trabalhoquarta = true;
		
		Boolean tv50 = trabalhoterca && trabalhoquarta;
		Boolean tv32 = trabalhoterca ^ trabalhoquarta;
		Boolean sorvete = trabalhoterca || trabalhoquarta;
		
		System.out.println("Comprou tv50? " + tv50);
		System.out.println("Comprou tv32? " + tv32);
		System.out.println("Comprou sorvete? " + sorvete);
		
		if (sorvete == true) { 
			System.out.println("Não está saudável");
		}else { 
				System.out.println("Está mais saudável");
		}
	}
}
