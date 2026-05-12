//ler 3 notas, calcular e exibir a mC)dia
import java.util.Scanner;

public class Media
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double x = 9;
		double y = 8.4;
		double z = 5;
		double w = 3;
        double somaDouble = x + y + z;

    

		somaDouble = (x + y + z) / w;



		System.out.println("media = " + somaDouble);



		scanner.close();

	}
}
