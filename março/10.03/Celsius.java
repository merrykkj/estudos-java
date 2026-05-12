
import java.util.Scanner;

public class Celsius
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);

    double celsius, fc, divisao;
    double x = 1.8;
    double z = 32;
    System.out.print("digite a temperatura: ");
	celsius = scanner.nextDouble();
    
    divisao = x * celsius + z;

    System.out.println("Fahrenheit = " + divisao);

	}
}
