//ler um numero n inteiro e positivo (validar)
//exibir e somar os numeros de 1 a n
//a) usando while ou do while para validação
//b) usando while, do while e for para exibir e somar
import java.util.Scanner;
public class Somas
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n, i, soma;

		//leitura e validação com while
		System.out.print("digite um inteiro positivo: ");
		n = sc.nextInt();

		while (n <= 0 ) {
			System.out.print("valor deve ser positivo (>0)");
			n = sc.nextInt();
		} 
		//Leitura e validação com do-while
		do {
		    System.out.print("digite um inteiro positivo: (>0)");
		    n = sc.nextInt();
		} while (n <= 0);
		
		//exibe e soma com while
		soma = 0;
		i=1;
		
		while(i <= n){
		    System.out.print(i + " ");
		    soma = soma + i; // soma += i
		    i = i + 1; // i++ ou ++i
		}
		System.out.println("\n soma com while = " + soma);
		
		//exibe e soma com for
		soma = 0;
		for(i=1; i <= n; i++) {
		    System.out.print(i + " ");
		   soma += i;
		}
	    System.out.println("\n soma com for = " + soma);
	    //exibe e soma com do-while
	    i = 1;
	    soma = 0;
	    do {
	        System.out.print(i + " ");
	        soma = soma + i;
	        i++;
	    } while (i <= n);
	    System.out.println("\n soma com do-while = " + soma);
	    
		sc.close();
	}
}
