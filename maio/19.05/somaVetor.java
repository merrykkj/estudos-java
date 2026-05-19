
//Pedir pro usuário digitar 10 valores e armazena-lo num vetor
//somar todos os valores e exibir a soma final
import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("digite o " + (i + 1) + "\u00B0 valor: ");
            v[i] = sc.nextInt();
            soma = soma + v[i];

        }
        System.out.println("Soma = " + soma);
        double media = (double) soma / 10;
        System.out.println("Media = " + media);
        int contAcima = 0;
        for (int i = 0; i < 10; i++) {
            if (v[i] > media) {
                contAcima++;
            }
        }
        System.out.println("A lista tem " + (10 - contAcima) + " valores abaixo da media");
        System.out.print("A lista tem " + contAcima + " valores acima da media");

        sc.close();
    }
}