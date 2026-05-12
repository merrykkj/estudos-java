//ler o valor de uma compra e o nC:mero de parcelas (2, 3, ou 4).
//para 2 parcelas calcular um acrC)scimo de 5%, para 3, 10% e para 4, 15%.
//exibir o acrC)scimo e o valor final a pagar.


import java.util.Scanner;
public class compra
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valorCompra, juros, valorFinal, valorParcela;
		int parcelas;

		System.out.print("Digite o valor da compra: ");
		valorCompra = scanner.nextDouble();

		System.out.print("Digite o numero de parcelas (2, 3, ou 4): ");
		parcelas = scanner.nextInt();

		if(parcelas == 2) {
			juros = 5.0 / 100 * valorCompra;
			valorFinal = valorCompra + juros;
			valorParcela = valorFinal / parcelas;
			System.out.println("Acrescimo = " + juros + "\nValor Final = " + valorFinal + "\nValor de cada parcela: " + valorParcela);

		} else if (parcelas == 3) {
			juros = 10.0 / 100 * valorCompra;
			valorFinal = valorCompra + juros;
			valorParcela = valorFinal / parcelas;
			System.out.println("Acrescimo = " + juros + "\nValor Final = " + valorFinal + "\nValor de cada parcela: " + valorParcela);

		} else if (parcelas == 4) {
			juros = 15.0 / 100 * valorCompra;
			valorFinal = valorCompra + juros;
			valorParcela = valorFinal / parcelas;
			System.out.println("Acrescimo = " + juros + "\nValor Final = " + valorFinal + "\nValor de cada parcela: " + valorParcela);
		} else {
			System.out.println("Numero de parcelas invalidas");
		}
		scanner.close();
	}
}
