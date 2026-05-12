import java.util.Scanner;
public class maiorIgual
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	double A, B;
	
	System.out.println("Digite o primeiro numero: ");
	A = scanner.nextDouble();
	System.out.println("Digite o segundo numero: ");
	B = scanner.nextDouble();

    
    if (A == B) {
        System.out.println("São iguais");
        
    } else if (A > B) {
        System.out.println("O primeiro é maior");
        
    } else if (B > A) {
    	System.out.println("O segundo é maior");
    }
		scanner.close();
	}
}
