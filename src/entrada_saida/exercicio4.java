package entrada_saida;

import java.util.Scanner;

public class exercicio4 {
	
	// Ex4 - Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double media, soma, a, b, c, d;
		
		System.out.printf("Digite os valores a serem somados: ");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		d = ler.nextDouble();
		
		soma = a+b+c+d;
		media = soma/4;
		
		System.out.printf("O valor da média aritmética dos valores digitados são: %.2f", media);

	}

}
