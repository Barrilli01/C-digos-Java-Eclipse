package estruturasCondicionais;

import java.util.Scanner;

public class Desafio1Impostos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o sal�rio anual");
		double salario = entrada.nextDouble();
		double impostos = 0;

		if ((salario / 12) < 3000) {
			impostos = 0;
		} else if ((salario / 12) >= 3000 && (salario / 12) < 5000) {
			impostos = 0.1;
		} else if ((salario / 12) >= 5000) {
			impostos = 0.2;
		}
		
		impostos = salario * impostos;

		System.out.println("Digite a renda com presta��o de servi�os anual");
		double salariop = entrada.nextDouble();
		double impostop = salariop * 0.15;

		System.out.println("Digite a renda com ganho de capital anual");
		double salarioc = entrada.nextDouble();
		double impostoc = salarioc * 0.2;

		double salariot = salario + salariop + salarioc;

		System.out.println("Digite os gastos m�dicos e educacionais anuais");
		double despMedEduc = entrada.nextDouble();
		double valor_dedut�vel;

		double impostot = impostoc + impostop + impostos;

		if (despMedEduc <= impostot * 0.3) {
			valor_dedut�vel = despMedEduc;
			impostot = impostot - despMedEduc;
		} else {
			valor_dedut�vel = impostot * 0.3;
			impostot = impostot * 0.7;
		}

		System.out.println(" ");

		System.out.println("Renda anual com sal�rio: " + salario);
		System.out.println("Renda anual com presta��o de servi�os: " + salariop);
		System.out.println("Renda anual com ganho de capital: " + salarioc);
		System.out.println("Renda anual total: " + salariot);

		System.out.println(" ");

		System.out.println("Valor gasto com m�dicos e educa��o: " + despMedEduc);
		System.out.println("Valor dedut�vel: " + valor_dedut�vel);

		System.out.println(" ");

		System.out.println("Imposto sobre sal�rio: " + impostos);
		System.out.println("Imposto sobre presta��o de servi�os: " + impostop);
		System.out.println("Imposto sobre ganha de capital: " + impostos);
		System.out.println("Imposto sobre todos os ganhos: " + impostot);

		entrada.close();
	}
}
