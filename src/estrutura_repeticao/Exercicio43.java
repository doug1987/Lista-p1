package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		float somSeq = 0, p1 = 1;
		double dividido = 0;
		do {
		System.out.printf("Informe o tamanho da sequencia (1 >= n < 50): ");
		n = ler.nextInt();
		}
		while(n < 1 || n > 49);
		
		for(int x = 0; x < n; x++) {
			p1 +=2*x+1;
			somSeq += p1/Math.pow((x+1), 3);
		}
		
		System.out.printf("A soma dos primerios %d numeros da sequencia e: %.2f", n, somSeq);

		

	}

}
