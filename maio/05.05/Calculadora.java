//ler uma opção (+, -, *, /, s - sair), realizar a operação
//pedida, mostra o resultado e repetir até que o usuário digite s

import java.util.Scanner;
public class Calculadora
{
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		char opcao;
		do {
		    System.out.print("Digite\n+ - soma\n- -subtracao\n* - multiplicacao\n/ - divisao\ns - sair\n --> ");
		    opcao = sc.nextLine().charAt(0);
		    switch (opcao) {
		        case '+': {
		          System.out.println("digite o primeiro valor: ");
		          double a = sc.nextDouble();
		          System.out.println("digite o segundo valor: ");
		          double b = sc.nextDouble();
		          sc.nextLine();
		          System.out.println("soma = " + (a+b));
		        }
		       break;
		        
		       case '-': {
		          System.out.println("digite o primeiro valor: ");
		          double a = sc.nextDouble();
		          System.out.println("digite o segundo valor: ");
		          double b = sc.nextDouble();
		          sc.nextLine();
		          System.out.println("subtracao = " + (a-b));
		       }
		      break;
		      
		      case '*':
		          {
		           System.out.println("digite o primeiro valor: ");
		          double a = sc.nextDouble();
		          System.out.println("digite o segundo valor: ");
		          double b = sc.nextDouble();
		          sc.nextLine();
		          System.out.println("multiplicacao = " + a*b);
		       }
		          
		      break;
		          
		          case '/': {
		          System.out.println("digite o primeiro valor: ");
		          double a = sc.nextDouble();
		          System.out.println("digite o segundo valor: ");
		          double b = sc.nextDouble();
		          sc.nextLine();
		          if (b == 0) {
		            System.out.println("nao existe divisao por zero");
		              	
		          }else {
		             System.out.println("divisao = " + a/b);
		          }
		       }
		          break;
		          
		              case 'S':
		              case 's':
		              System.out.println("Obrigado, volte sempre");
		              break;
		              
		                  
		              default: 
		              System.out.println("Opcao invalida");
		    }
		} while (opcao != 's' && opcao != 'S' );
		sc.close();



    }
}