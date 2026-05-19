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
        
       while(n >= 10) {
        System.out.print(n%10);
        n = n / 10;
        }
        
        System.out.println(n); //não esquecer do último digito
		sc.close();
	}
}
