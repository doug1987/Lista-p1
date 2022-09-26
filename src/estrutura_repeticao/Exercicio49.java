package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
        int soma = 0;
		
		System.out.printf("Digite um numero inicial: ");
		int numinicial = ler.nextInt();
		System.out.printf("Digite um numero final: ");
		int numfinal = ler.nextInt();
		while(numfinal <= numinicial) 
		{
			System.out.printf("O numero final deve ser maior que o inicial: ");
			numfinal = ler.nextInt();
		}
		for(int i = numinicial; i <= numfinal; i++) 
		{
			soma+=i;
		}
		System.out.printf("A soma da sequencia de numeros entre %d e %d e: %d", numinicial, numfinal, soma);


	}

}
