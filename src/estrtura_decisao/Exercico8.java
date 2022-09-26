package estrtura_decisao;

import java.util.Scanner;

public class Exercico8 {
	
	//Ex8-Entrar via teclado, com dois valores distintos. Exibir o maior deles.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x, y;
		
		System.out.printf("Digite dois valores distintos: ");
		x = ler.nextInt();
		y = ler.nextInt();
		
		if (x>y)
		{
			System.out.printf("O maior número digitado é: %d",x);
		}
		else if (y>x)
			System.out.printf("O maior número digitado é: %d",y);
			
	}

}
