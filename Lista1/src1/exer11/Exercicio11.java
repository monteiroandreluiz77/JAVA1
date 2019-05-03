package exer11;

import java.util.Scanner;

public class Exercicio11 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o número " + i + " :");
			vetor[i] = scan.nextInt();
		}
		int maior = vetor[0];
		int menor = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior)
				maior = vetor[i];
			else if (vetor[i] < menor)
				menor = vetor[i];
		}

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

	}
}
