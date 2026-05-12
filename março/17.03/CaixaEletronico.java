import java.util.Scanner;
public class CaixaEletronico
{
	public static void main(String[] args) {
	  
	    //declaração das variáveis
	    Scanner scanner = new Scanner(System.in);
	    int saque, notas50, notas20, notas10, resto;
	    
	    //entrada de dados
	    System.out.print ("digite o valor do saque: ");
	    saque = scanner.nextInt();
	    scanner.close();
	    
	    //processamento
	    notas50 = saque / 50;
	    resto = saque % 50;
	    notas20 = resto / 20;
	    resto = resto % 20;
	    notas10 = resto / 10;
	    
	    //saída
	    System.out.println ("Você receberá: ");
	    System.out.println (notas50 + " notas de 50");
	    System.out.println (notas20 + " notas de 20");
	    System.out.println (notas10 + " notas de 10");

	    
	    
	    
	}
}
