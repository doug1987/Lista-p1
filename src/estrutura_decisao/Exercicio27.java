package estrutura_decisao;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int valor, result;
		
		System.out.printf("Digite um valor qualquer: \n");
		valor = ler.nextInt();
		
		if (valor%2==0) {
			result = valor+5;
			System.out.printf("Resultado: %d", result);
	
		}
		
		else {
			
			result = valor+8;
			System.out.printf("Resultado: %d", result);
		}

	}

}
