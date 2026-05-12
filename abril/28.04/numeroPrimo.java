//ler um inteiro positivo e descobrir se ele é primo ou não
import java.util.Scanner;
public class numeroPrimo
{
	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Digite um numero positivo: ");
    int m = sc.nextInt();
       
    while (m <= 0 ) {
        System.out.println("o numero deve ser positivo");
        m = sc.nextInt();
    }

	sc.close();
    
    boolean ePrimo = true;
    int i = 2;
    int metade = m / 2;
    while (ePrimo && i <= metade) {
        if (m % i == 0) {
            ePrimo = false;
        } else {
            i++;
        }
    }
    if (ePrimo == true) {
        System.out.println(m + " e primo");
    } else {
        System.out.println(m + " nao e primo");
       }
	}
}