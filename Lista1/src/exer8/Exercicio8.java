package exer8;

import java.util.Scanner;

public class Exercicio8 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int num1 = 1, num2 = 0;
		int numDig;
		
		System.out.println("digite o numero para a sequencia: ");
		numDig = scan.nextInt();
		
if(numDig == 1) {
	System.out.println(+num2);
}
 else (numDig == 2)
{
	System.out.println(+num1);
}
		
		int aux;

		for (int i = 2; i < numDig; i++) {
			aux = num2+num1;
			num2=num1;
			num1 = aux;
			System.out.println(aux);
		}

	}
}