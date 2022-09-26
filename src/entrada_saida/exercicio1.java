package entrada_saida;

import java.util.Scanner;

public class exercicio1 {
	
	//Ex.1 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int b, h, area;
		
		System.out.printf("Informe a medida da base: ");
		b = ler.nextInt();
		System.out.printf("Informe a medida da altura: ");
		h = ler.nextInt();
		
		area = b * h;
		
		System.out.printf("O valor da area do retangulo é: %d", area);
		
	}

}
