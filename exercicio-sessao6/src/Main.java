import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			int x = i + 1;
			
			System.out.printf(x + " ");
			System.out.printf((int)Math.pow(x, 2) + " ");
			System.out.println((int)Math.pow(x, 3));
		}
		
		sc.close();

	}

}
