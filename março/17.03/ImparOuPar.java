//ler  um número inteiro e dizer se ele é par ou ímpar

import java.util.Scanner;
public class ImparOuPar
{
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  int numero, divisao, resto;
	  
	  //entrada de dados
	  System.out.print ("Digite um number: ");
      numero = scanner.nextInt();
	  
	  
	  
	  //processamento
	  divisao = numero / 2;
	  resto = numero % 2;
	  


      //decisão
      if (resto == 0){
      System.out.println ("Este número é PAR");
      }
      
      else {
        System.out.println ("Este número é ÍMPAR");
      }

	    
	}
}
