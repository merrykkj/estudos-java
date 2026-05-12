//ler 2 inteiros positivos (validar) e descobrir se o
// segundo é divisor do primeiro 
import java.util.Scanner;
public class divisor
{
	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Digite um numero positivo: ");
    int m = sc.nextInt();
       
    while (m <= 0 ) {
        System.out.println("o numero deve ser positivo");
        m = sc.nextInt();
    }
    
    System.out.println ("Divisores de " + m + "\n1 ");
    int metade = m / 2;
    for (int i=2; i<=metade; i++) {
        if (m % i == 0) {
         System.out.print (i + " ");
        }
    }
      System.out.println(m);
	sc.close();
	}
}