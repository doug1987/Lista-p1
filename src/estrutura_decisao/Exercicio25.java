package estrutura_decisao;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler =new Scanner(System.in);
		
		int valor;
		
		System.out.printf("Digite um valor qualquer: \n");
		valor =ler.nextInt();
		
		if (valor%2==0) {
			
			System.out.printf("O valor digitado é par!!");
		}
		
		else {
			
			System.out.printf("O valor digitado é impar!!");
		}
		
	}

}
