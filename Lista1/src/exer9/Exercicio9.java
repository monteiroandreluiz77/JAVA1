package exer9;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int numero1;
	int numero2;
	
	System.out.print("Digite o 1 numero:");
	numero1 = scan.nextInt();
	
	System.out.print("Digite o 2 numero:");
	numero2 = scan.nextInt();
	
	
	int soma;
	soma = numero1 + numero2;
	
	System.out.println("Soma: "+soma);
	
	int multiplicacao;
	multiplicacao = numero1*soma;
	
	System.out.print("Multiplicacao: "+multiplicacao);
	}
	}