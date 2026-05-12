//le o inicio e o fim de uma sequencia, mostra e soma seus elementos

import java.util.Scanner;
public class Sequencia
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2, i, soma;

		do {
			System.out.print("digite um inteiro positivo: ");
			n1 = sc.nextInt();
			System.out.print("digite outro inteiro positivo: ");
			n2 = sc.nextInt();
		} while (n1 <= 0 || n2 <= 0);



		soma = 0;
		for(i=n1; i <= n2; i++) {
			System.out.print(i + " ");
			soma = soma + i;
		}
		System.out.print("\nSOMA = " + soma);
		sc.close();
	}
}
