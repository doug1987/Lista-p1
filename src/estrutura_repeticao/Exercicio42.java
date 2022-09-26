package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		float somSeq = 0, y = 1;
		
		do {
		System.out.printf("Informe o tamanho da sequencia (1 >= n < 50): ");
		n = ler.nextInt();
		}
		while(n < 1 || n > 49);
		
		for(int i = 0; i < n; i++) {
			somSeq += y/(y+1);
			y++;
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia e: %.2f", n, somSeq);


	}

}
