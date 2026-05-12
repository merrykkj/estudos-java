//ler 2 notas, calcular a média e mostrar e, se média menor que 6 
//exibir reprovado, se não exibir aprovado

import java.util.Scanner;

public class MediaIfElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// entrada de dados
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();

		// processamento
		double media = (nota1 + nota2) / 2;
		System.out.println("media = " + media);

		// decisão
		if (media >= 6) {
			System.out.println("Parabéns, você está aprovado");
		}

		else {
			System.out.println("Ops, não foi dessa vez");
		}

		scanner.close();
	}
}
