import java.util.Scanner;
public class DuracaoDoEvento
{
	public static void main(String[] args) {
	  
	    //declaração das variáveis
	    Scanner scanner = new Scanner(System.in);
	    int horaInicio, horaFim, minutoInicio, minutoFim, segundoInicio, segundoFim, resto, duracao, tempoTotalInicio, tempoTotalFim, hora, minuto, segundo;
	    
	    //entrada de dados
	    System.out.print ("Digite as horas de inicio: ");
	    horaInicio = scanner.nextInt();
	    System.out.print ("Digite os minutos: ");
	    minutoInicio = scanner.nextInt();
	    System.out.print ("Digite os segundos: ");
	    segundoInicio = scanner.nextInt();
	    System.out.print ("Digite as horas finais: ");
	    horaFim = scanner.nextInt();
	    System.out.print ("Digite os minutos: ");
	    minutoFim = scanner.nextInt();
	    System.out.print ("Digite os segundos: ");
	    segundoFim = scanner.nextInt();
	    scanner.close();
	    
	    
	    //processamento 
	    tempoTotalInicio = horaInicio * 3600 + minutoInicio * 60 + segundoInicio;
        tempoTotalFim = horaFim * 3600 + minutoFim * 60 + segundoFim;
        
	    duracao = tempoTotalFim - tempoTotalInicio;
	    
	    hora = duracao / 3600;
	    resto = duracao % 3600;
	    minuto = resto / 60;
	    segundo = resto % 60;
	    
	    
	    //saída
	    System.out.printf ("O evento durou %dh %dm %ds\n ", hora, minuto, segundo);


	    
	}
}
