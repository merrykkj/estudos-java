import java.util.Scanner;
public class Outraletra
{
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		System.out.print("digite uma letra: ");
		String s = sc.nextLine();
		char letra1 = s.charAt(0);
		System.out.println("voce digitou " + letra1);
        System.out.print("digite outra letra: ");
        s = sc.nextLine();
        char letra2 = s.charAt(0);
        System.out.println("outra letra = " + letra2);
        sc.close();
		


    }
}