import java.util.Scanner;
public class AtividadeDuracao
{
	public static void main(String[] args) {
	  
	    //declaração das variáveis
	    Scanner scanner = new Scanner(System.in);
	    int hora, minuto, segundo, resto, duracao;
	    
	    //entrada de dados
	    System.out.print ("digite a duração: ");
	    duracao = scanner.nextInt();
	    scanner.close();
	    
	    //processamento
	    
	    hora = duracao / 3600;
	    resto = duracao % 3600;
	    minuto = resto / 60;
	    segundo = resto % 60;
	    
	    
	    //saída
	    System.out.println ("O horário de duração é: " );
	    System.out.println (hora + " horas");
	    System.out.println (minuto + " minutos");
	    System.out.println (segundo + " segundos");

	    
	    
	    
	}
}
