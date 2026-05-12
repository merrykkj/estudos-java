//ler dois numeros inteiros e verificar se o primeiro é múltiplo do segundo

import java.util.Scanner;

public class Divisor
{
	public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print("Digite um inteiro: ");
    int numero1 = scanner.nextInt();
    System.out.print("Digite outro inteiro: ");
    int numero2 = scanner.nextInt();
    
    if (numero1 % numero2 == 0) {
        System.out.println(numero1 + " é múltiplo de " + numero2);
    }  else {
     System.out.println (numero1 + " não é múltiplo de " + numero2);   
    }
    scanner.close();
		
	}
}
