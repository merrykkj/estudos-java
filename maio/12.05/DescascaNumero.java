//ler um numero inteiro, extrair e mostrar seu ultimo digito -> resto por 10

import java.util.Scanner;
public class DescascaNumero
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;

		do {
			System.out.println("digite um inteiro positivo: ");
			n = sc.nextInt();
		} while (n <= 0);
        
        System.out.println("\ndigitos de " + n);

        int soma = 0;
       while(n >= 10) {
		int digito = n%10;
		soma = soma + digito;
        System.out.println(digito);
        n = n / 10;
        }
        
        System.out.println(n); //não esquecer do último digito
		soma = soma + n;
		System.out.println("soma dos digitos: " + soma);
		sc.close();
	}
}
