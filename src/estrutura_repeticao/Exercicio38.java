package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0, ant = 0;
		for(int i = 1; i <= 100; i++) {
			soma = i + ant;
			System.out.printf("\n%d + %d = %d",i, ant, soma);
			ant = soma;
		}
		System.out.printf("\nA A Soma dos intervalos entre 1 e 100 é = %d", soma);


	}

}
