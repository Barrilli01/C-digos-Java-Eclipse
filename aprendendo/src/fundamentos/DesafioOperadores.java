package fundamentos;

public class DesafioOperadores {
	public static void main(String[] args) {

		double a = (6 * (3 + 2));
		double b = (Math.pow(a, 2)) / 6;

		double c = (((1 - 5) * (2 - 7)) / 2);
		double d = Math.pow(c, 2);

		double e = b - d;
		double f = Math.pow(e, 3);

		double g = 1000;

		double resposta = f / g;

		System.out.println("a resposta da expressão é: " + resposta);
	}
}
