package exer10;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero = 0;
		int par[] = new int[10];
		int impar[] = new int[10];
		int parQtd = 0;
		int imparQtd = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("digite o numero " + i + ": ");
			numero = scan.nextInt();
		}
		if (numero % 2 == 0) {
			par[parQtd] = numero;
			parQtd++;
		} else {
			impar[imparQtd] = numero;
			imparQtd++;
		}
		System.out.println("Pares:" + parQtd);
		System.out.print("impares:" + imparQtd);
	}
}
