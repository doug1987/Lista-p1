package entrada_saida;

import java.util.Scanner;

public class exercicio2 {
	
	 //Ex2 -Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int l, area;
		
		System.out.printf("Informe o valor da aresta do quadrado: ");
		l = ler.nextInt();
		
		area = l*l;
		
		System.out.printf("O valor da area do quadrado é: %d", area);
		

	}

}
