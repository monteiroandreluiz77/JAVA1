package exer15;

import java.util.Scanner;

public class Exercicio15 {
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		float salarioFixo;

		System.out.print("Digite o salario: ");
		salarioFixo = scan.nextFloat();

		float vendas;

		System.out.print("Digite o valor das vendas: ");
		vendas = scan.nextFloat();

		if (vendas <= 1500) {
			salarioFixo = (float) (vendas * 0.03);
		} else {
			salarioFixo = (float) (1500 * 0.03);
			float vendasAcima1500 = vendas - 1500;
			salarioFixo = (float) (salarioFixo + (vendasAcima1500 * 0.05));
		}
		System.out.println("Salario com Comissao: " + salarioFixo);
	}
}