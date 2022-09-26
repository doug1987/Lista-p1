package estrutura_decisao;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// ex13-. Entrar via teclado com três valores distintos. Exibir o maior deles.
		
Scanner ler = new Scanner(System.in);
		
		int x, y,z;
		
		System.out.printf("Digite tres valores distintos: ");
		x = ler.nextInt();
		y = ler.nextInt();
		z = ler.nextInt();
		
		if (x>y&&x>z)
		{
			System.out.printf("O maior número digitado é: %d",x);
		}
		else if (y>x&&y>z) {
			System.out.printf("O maior número digitado é: %d",y);
		}
		else if (z>x&&z>y) {
			System.out.printf("O maior número digitado é: %d",z); 
		}
		
	
	}

}
