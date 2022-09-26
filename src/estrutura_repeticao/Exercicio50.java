package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um numero numero inicial: ");
		int numinicial = ler.nextInt();
		System.out.printf("Digite um numero final: ");
		int numfinal = ler.nextInt();
		
		while(numfinal <= numinicial) 
		{
			System.out.printf("O numero final deve ser maior que o inicial: ");
			numfinal = ler.nextInt();
		}
		System.out.printf("Os numeros pares inteiros maiores que 10 entre %d e %d sÃ£o:\n",numinicial,numfinal);
		for(int i = numinicial; i <=numfinal; i++) 
		{
			if(i > 10 && (i % 2) == 0) 
			{
			System.out.printf("%d\n", i);
			}
		}


	}

}
