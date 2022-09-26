package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Insira um valor qualquer: ");
		int a = ler.nextInt();
		for(int i = 1; i < 21; i++) 
		{
			System.out.printf("%d\n", a+i);
		}


	}

}
