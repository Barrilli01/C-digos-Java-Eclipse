package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {

		Scanner valores = new Scanner(System.in);

		String salario1 = JOptionPane.showInputDialog("Digite o primeiro salário");
		String salario2 = JOptionPane.showInputDialog("Digite o segundo salário");
		String salario3 = JOptionPane.showInputDialog("Digite o terceiro salário");

		System.out.println("Salários amontoados: " + salario1 + salario2 + salario3);

		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		double soma = valor1 + valor2 + valor3;

		System.out.printf("o salário final é %.2f reais \n" + "e a média dos salários é %.2f reais", soma, soma / 3);
		valores.close();
	}
}
