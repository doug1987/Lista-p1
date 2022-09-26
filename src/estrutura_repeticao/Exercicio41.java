package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0, n1 = 2, n2 = 0, seq = 0;
		do {
			System.out.println("\nDigite a quantidade de vezes que a sequencia ocorrer até a soma (0 > N < 100): ");
			n2 = ler.nextInt();
			
		}
		while(n2 >= 100 || n2 < 1);
		for(int x = 0; x < n2; x++) {
				seq += n1;
				soma+= seq;
				n1 = 3 + 2 * x;
		}
		System.out.printf("\nA soma dos %d os primeiros numeros da são sequencia é: %d", n2, soma);


	}

}
