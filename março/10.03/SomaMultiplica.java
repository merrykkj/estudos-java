//ler 3 valores, multiplicar o 3o pela soma dos outros 2; exibir o resultado
import java.util.Scanner;

public class SomaMultiplica
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		double numero1, numero2, numero3, soma;
		
		System.out.print ("digite o primeiro numero para soma: ");
		numero1 = scanner.nextDouble();
		System.out.print ("digite o segundo numero: ");
		numero2 = scanner.nextDouble();
		System.out.print ("digite o terceiro numero: ");
		numero3 = scanner.nextDouble();
		
		soma = (numero1 + numero2) * numero3;
		
		System.out.println("soma = " + soma);
		scanner.close();
		
	}
}
