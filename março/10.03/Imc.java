
import java.util.Scanner;

public class Imc
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	double numero1, numero2, divDouble;

	
	System.out.print("digite seu peso: ");
	numero1 = scanner.nextDouble();
	System.out.print("digite sua altura: ");
	numero2 = scanner.nextDouble();
	
    divDouble = numero1 / (numero2 * numero2);
	
	System.out.println("IMC = " + divDouble);
    scanner.close();
	}
}
