package exer5;

import java.util.Scanner;

public class Exercicio5 {
	private static Scanner scan;

	public static void main(String[] args) {
		int idade = 0;

		scan = new Scanner(System.in);

		System.out.print("qual a idade? ");
		idade = scan.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.print("infantil A");
		} else if (idade >= 8 && idade <= 11) {
			System.out.print("infantil B");
		} else if (idade >= 12 && idade <= 15) {
			System.out.print("juvenil a");
		} else if (idade >= 16 && idade <= 17) {
			System.out.print("juvenil b");
		} else if (idade >= 18) {
			System.out.print("adulto");
		}
	}

}
