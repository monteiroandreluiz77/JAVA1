package exer2;

import java.util.Scanner;

public class Exercicio2 {
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.print("digite valor gasolina: ");

		float valorGasolina = scan.nextFloat();

		System.out.print("digite valor etanol: ");

		float valorEtanol = scan.nextFloat();

		double custo = valorGasolina / valorEtanol;

		if (custo <= 0.7)

		{
			System.out.println("Abasteca com etanol");
		}

		else {
			System.out.println("Abasteca com gasolina");
		}
	}
}
