package estrutura_decisao;

import java.util.Scanner;

public class Exercicio026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
int val, result;
		
		System.out.printf("Digite um valor qualquer: ");
		val= ler.nextInt();
		
		if(val<0) {
			result = val*3;
			System.out.printf("Resultado: %d", result);
		}else {
			result = val*2;
			System.out.printf("Resultado: %d", result); 
		}


	}

}
