//Ler 10 numeros e depois exibi-los na ordem inversa em que foram digitados
import java.util.Scanner;
public class LeMostraDezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("digite o " + (i + 1) + "\u00B0 valor: ");
            v [i] = sc.nextInt();
        }
        System.out.println("Sequencia invertida: ");
        for (int i=9; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }

        sc.close();
    }
}