package direcionadoObjetos;

import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {
		Funcionarios funcionarios = new Funcionarios();
		String nome;
		double salario_bruto, imposto, porcentagem_imposto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário");
		nome = entrada.nextLine();
		System.out.println("Digite o salário do funcionário");
		salario_bruto = entrada.nextDouble();
		System.out.println("Digite o imposto sobre o salário do funcionário");
		imposto = entrada.nextDouble();
		
		System.out.println("Funcionário: " + nome + " recebe " + (salario_bruto - imposto) + " reais");
		
		System.out.println("Qual a porcentagem para aumentar o salário?");
		porcentagem_imposto = entrada.nextDouble();
		
		funcionarios.CalculoSalario(salario_bruto, imposto, porcentagem_imposto);
		
		System.out.println("Dados atualizados: " + nome + " recebe " + funcionarios.CalculoSalario(salario_bruto, imposto, porcentagem_imposto) + " reais");
		entrada.close();
	}
	
	public double CalculoSalario(double a, double b, double c) {
		
		double salariof = a - b + (a * (c / 100));
		
		return salariof;
	}
}
