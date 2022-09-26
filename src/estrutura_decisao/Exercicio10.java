package estrutura_decisao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

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
		{	
			System.out.printf("O maior número digitado é: %d",y);
		}
				
		else if (x==y)
		{
			System.out.printf("Os números digitados são identicos: %d",x);
		}
		
	
	}
}
