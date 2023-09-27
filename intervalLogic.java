import java.util.Locale;
import java.util.Scanner;

public class intervalLogic {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A;

		System.out.println("Running...");
		A = sc.nextDouble();

		if (A <= 25.00 && A >= 0) {
			System.out.println("Intervalo [0,25]");
		} else if (A == 25.01 && A <= 50.00) {
			System.out.println("Intervalo [25,50]");
		} else if (A == 50.01 && A <= 99.99) {
			System.out.println("Intervalo [50,75]");
		} else if (A == 100.00) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de Intervalo");
		}

		sc.close();

	}

}
