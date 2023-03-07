package estruturasCondicionais;

import java.util.Scanner;

public class Desafio1Impostos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o salário anual");
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

		System.out.println("Digite a renda com prestação de serviços anual");
		double salariop = entrada.nextDouble();
		double impostop = salariop * 0.15;

		System.out.println("Digite a renda com ganho de capital anual");
		double salarioc = entrada.nextDouble();
		double impostoc = salarioc * 0.2;

		double salariot = salario + salariop + salarioc;

		System.out.println("Digite os gastos médicos e educacionais anuais");
		double despMedEduc = entrada.nextDouble();
		double valor_dedutível;

		double impostot = impostoc + impostop + impostos;

		if (despMedEduc <= impostot * 0.3) {
			valor_dedutível = despMedEduc;
			impostot = impostot - despMedEduc;
		} else {
			valor_dedutível = impostot * 0.3;
			impostot = impostot * 0.7;
		}

		System.out.println(" ");

		System.out.println("Renda anual com salário: " + salario);
		System.out.println("Renda anual com prestação de serviços: " + salariop);
		System.out.println("Renda anual com ganho de capital: " + salarioc);
		System.out.println("Renda anual total: " + salariot);

		System.out.println(" ");

		System.out.println("Valor gasto com médicos e educação: " + despMedEduc);
		System.out.println("Valor dedutível: " + valor_dedutível);

		System.out.println(" ");

		System.out.println("Imposto sobre salário: " + impostos);
		System.out.println("Imposto sobre prestação de serviços: " + impostop);
		System.out.println("Imposto sobre ganha de capital: " + impostos);
		System.out.println("Imposto sobre todos os ganhos: " + impostot);

		entrada.close();
	}
}
