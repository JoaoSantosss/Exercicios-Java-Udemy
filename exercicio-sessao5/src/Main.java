import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double imposto_sob_mil = 1000 * 8 / 100;
		double imposto_total;
		double renda;
		System.out.println("Renda: ");
		renda = sc.nextDouble();

		if (renda >= 0.00 && renda <= 2000.00) {
			System.out.println("Isento");
		}

		if (renda >= 2000.01 && renda <= 3000.00) {

			System.out.printf("R$ %.2f", imposto_sob_mil);

		}

		if (renda >= 3000.01 && renda <= 4500.00) {

			imposto_total = imposto_sob_mil + (renda - 3000 * 0.18);
			System.out.printf("R$ %.2f", imposto_total);
		}

		if (renda > 4500.00) {

			imposto_total = imposto_sob_mil + (renda - 3000) * 0.28;
			System.out.printf("R$ %.2f", imposto_total);
			
		}

		sc.close();

	}
	
}
