package estrutura_decisao;

import java.util.Scanner;

public class Ecercicio9 {
	
	//Entrar via teclado, com dois valores distintos. Exibir o menor deles.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
int x, y;
		
		System.out.printf("Digite dois valores distintos: ");
		x = ler.nextInt();
		y = ler.nextInt();
		
		if (x<y)
		{
			System.out.printf("O menor número digitado é: %d",x);
		}
		else if (y<x)
			System.out.printf("O menor número digitado é: %d",y);
	}

}
