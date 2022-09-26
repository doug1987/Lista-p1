package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
      int a, b,c;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			a = ler.nextInt();
		}
		while (a<=0);
		
		System.out.printf("Digite o valor do intervalo: ");
		 b = ler.nextInt();
		
		do {
			System.out.printf("Digite um segundo valor do intervalo (deve ser maior que o primeiro valor): ");
			c = ler.nextInt();
		}
		while(c <=  b);
		
		for(;c >=  b;c--) {
			System.out.printf("\n%d X %d = %d", c, a, (c*a));
		}



	}

}
