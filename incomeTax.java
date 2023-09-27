import java.util.Locale;
import java.util.Scanner;

public class incomeTax {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double income, calc, result, tax;

		System.out.println("Running...");
		income = sc.nextDouble();

		if (income >= 0.00 && income <= 2000.00) {
			System.out.println("Isento");
		} else if (income > 2000.00 && income <= 3000.00) {
			result = 0.08 * income / 10;
			System.out.printf("Income Tax: %.2f%n", result);
		} else if (income >= 3000.01 && income <= 4500.00) {
			calc = income - 2000;
			result = calc * 0.18 - 100;
			System.out.printf("Income Tax: %.2f%n", result);
		} else {
			tax = (income - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.0 * 0.08; // Linha Corrigida;
			System.out.printf("Income Tax: %.2f%n", tax);
		}

		sc.close();

	}

}
