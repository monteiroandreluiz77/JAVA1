package exer4;

import java.util.Scanner;

public class Exercicio4 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int valor;
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("digite valor:");
			valor = scan.nextInt();
			soma = soma + valor;
		}
		double media = soma / 5;
		System.out.println("A média é:" + media);
	}

}
