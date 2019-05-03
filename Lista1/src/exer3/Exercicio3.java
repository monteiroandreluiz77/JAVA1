package exer3;

import java.util.Scanner;

public class Exercicio3 {

	private static Scanner scan;

	public static void main(String[] args) {
		int valor;
		int valormenor;
		int valormaior;

		scan = new Scanner(System.in);

		System.out.print("Digite seu valor: ");
		valor = scan.nextInt();
		valormaior = valor;
		valormenor = valor;

		for (int i = 0; i < 6; i++) {
			System.out.print("Digite seu valor: ");
			valor = scan.nextInt();

			if (valor < valormenor)
				valormenor = valor;
			else if (valor > valormaior)
				valormaior = valor;
		}

		System.out.println("maior valor: " + valormaior);
		System.out.print("menor valor: " + valormenor);
	}
}
