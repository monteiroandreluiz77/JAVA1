package exer6;

import java.util.Scanner;

public class Exercicio6 {

	private static Scanner scan;

	public static void main(String[] args) {

		float fatorial = 1;

		scan = new Scanner(System.in);

		System.out.print("digite valor: ");
		int numero = scan.nextInt();

		for (int i; numero > 1; numero--) {
			fatorial = fatorial * numero;
		}

		System.out.print(+fatorial);

	}
}
