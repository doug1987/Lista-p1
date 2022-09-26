package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int a,b;
		System.out.printf("Digite o primeiro valor!!.");
		a= ler.nextInt();
		
		do{	
		System.out.printf("Digite segundo valor, desde que seja maior que o primeiro!!.");
		b= ler.nextInt();
		}
		while(a>=b);

	}

}
