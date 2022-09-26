package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner ler = new Scanner(System.in);
	     
	     int a,b;
			
			do{	
			System.out.printf("Digite um valor qualquer (positivo)!!.");
			a= ler.nextInt();
			}
			while(a<0);
			System.out.printf("Taboada do %d",a);
			for(b=1; b<=10; b++) {			
				System.out.printf("\n %d x %d = %d",b,a,(a*b));
			}


	}

}
