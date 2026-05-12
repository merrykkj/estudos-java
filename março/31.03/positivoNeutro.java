import java.util.Scanner;
public class positivoNeutro
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double A;
	
	System.out.println("Digite o primeiro numero: ");
	A = scanner.nextDouble();
    
    if (A > 0) {
        System.out.println("É positivo");
        
    } else if (A < 0) {
        System.out.println("É negativo");
        
    } else if (A == 0) {
    	System.out.println("É neutro");
    }
		scanner.close();
	}
}
