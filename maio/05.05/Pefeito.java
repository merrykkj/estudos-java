import java.util.Scanner;

public class Pefeito
{
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		System.out.print("Digite um numero positivo");
		int m = sc.nextInt();
		
	while(m <= 0){
	    System.out.println("o numero deve ser positivo");
	    m = sc.nextInt();
	}
	
	sc.close();
	int soma = 1;
	int metade = m / 2;
	for (int i = 2; i<= metade; i++) {
	    if (m % i == 0) {
	        soma = soma + i;
	    }
	}
	    if (soma == m) {
	        System.out.println(m + "e perfeito");
	    } else {
	        System.out.println(m + "nao e perfeito");

	    }
	}
}
