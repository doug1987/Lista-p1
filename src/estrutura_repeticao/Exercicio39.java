package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0, n1 = 1, n2 = 0;
		
		System.out.printf("Sequência de Finonacci (Os 30 primeiros valores).\n ");
		
		for(int x = 0; x < 30; x++) {
			soma = n1 + n2;
			
			System.out.printf("\n%d", n1);
			n2 = n1;
			n1 = soma;

	}

		

	}

}
