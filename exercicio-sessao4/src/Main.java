import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double triangulo = a * c / 2;
		double circulo = pi * Math.pow(c, 2.0);
		double trapezio = (a + b) * c / 2;
		double quadrado = b * b; 
		double retangulo = a * b; 
		
		System.out.printf("triangulo: %.3f %n", triangulo);
		System.out.printf("triangulo: %.3f %n", circulo);
		System.out.println("triangulo: " + trapezio);
		System.out.println("triangulo: " + quadrado);
		System.out.println("triangulo: " + retangulo);
		
		sc.close();

	}

}
