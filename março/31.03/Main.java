import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double A, B, C, media;
	
	System.out.println("Digite a primeira nota: ");
	A = scanner.nextDouble();
	System.out.println("Digite a segunda nota: ");
	B = scanner.nextDouble();
	System.out.println("Digite a terceira nota: ");
	C = scanner.nextDouble();
    
    media = (A + B + C) / 3;
    
    if (media < 2) {
        System.out.println("Infelizmente você foi reprovado.");
        
    } else if ( media < 6) {
        System.out.println("Você está de exame.");
        
    } else {
    	System.out.println("Você foi aprovado! ");
    }
		scanner.close();
	}
}
