import java.util.Locale;
import java.util.Scanner;

public class storeLogic {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B;
		double result;

		System.out.println("Running...");

		A = sc.nextInt();
		B = sc.nextInt();

		if (A == 1) {
			result = 4.00 * B;
			System.out.printf("Total: R$ %.2f%n", result);
		} else if (A == 2) {
			result = 4.50 * B;
			System.out.printf("Total: R$ %.2f%n", result);
		} else if (A == 3) {
			result = 5.00 * B;
			System.out.printf("Total: R$ %.2f%n", result);
		} else if (A == 4) {
			result = 2.00 * B;
			System.out.printf("Total: R$ %.2f%n", result);
		} else if (A == 5) {
			result = 1.50 * B;
			System.out.printf("Total: R$ %.2f%n", result);
		} else {
			System.out.println("Esse item não existe no cardápio. Favor verificar!");
		}
		
		sc.close();

	}

}
