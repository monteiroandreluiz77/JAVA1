package exer7;

import java.util.Scanner;

public class Exercicio7 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {

			if (i % 7 == 0)

				System.out.println(i + " numero multiplo de 7");

		}
	}
}
