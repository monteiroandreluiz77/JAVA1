package exer12;

import java.util.Scanner;

public class Exercicio12 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int vetor[] = new int[10];
		float soma = 0;
		float media = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o número " + i + " : ");
			vetor[i] = scan.nextInt();
			soma = soma + vetor[i];
		}

		media = soma / 10;

		System.out.print(+media);

	}
}
