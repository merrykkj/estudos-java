//ler 2 números, somar e exibir o resultado
import java.util.Scanner;

public class SomaDois
{
	public static void main(String[] args) {
		//declaração de variáveis
		Scanner scanner = new Scanner (System.in);
		double numero1, numero2, soma;
		
		//entrada
		System.out.print ("digite o primeiro numero para soma: ");
		numero1 = scanner.nextDouble();
		System.out.print ("digite o segundo numero: ");
		numero2 = scanner.nextDouble();
		
		
        //processamento
        soma = numero1 + numero2;
        
        
        //saída
		System.out.println("soma = " + soma);
		scanner.close();
		
	}
}
