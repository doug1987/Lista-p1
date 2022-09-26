package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int soma, a = 1, b = 1, c = 1;
		
		for(int i = 0; i < 20; i++) 
		{
			if(i < 3) {
				System.out.printf("\n1");
			}
			else {
				soma = a + b + c;
				System.out.printf("\n%d",(soma));
				c = b;
				b = a;
				a = soma;
			}
	}


	}

}
