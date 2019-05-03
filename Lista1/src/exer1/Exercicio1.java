package exer1;

import java.util.Scanner;

public class Exercicio1 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.print("digite o numero: ");

		int numero = scan.nextInt();

		System.out.println(numero);

		if (numero % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	}
}
