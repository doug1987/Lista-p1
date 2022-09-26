package estrutura_decisao;

import java.util.Scanner;

public class Exercicio12 {
	
	// ex12- Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		int b, h, area;
		
		System.out.printf("Informe a medida da base: \n");
		b = ler.nextInt();
		System.out.printf("Informe a medida da altura: \n");
		h = ler.nextInt();
		
		area = b * h;
		
		System.out.printf("O valor da area do retangulo é: %d\n\n", area);
		
		if (area>100) {
			System.out.printf("Terreno grande!!\n"); 
				
	}
		else if (area<100) {
			System.out.printf("Terreno pequeno!!\n"); 
		}
		

	}

}
