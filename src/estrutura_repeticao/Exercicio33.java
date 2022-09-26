package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		char a;
	       
        do {
        	System.out.printf("Digite se o sexo é (F/M): ");
            a = ler.next().charAt(0);
        }
        while(a != 'F' && a != 'M');


	}

}
