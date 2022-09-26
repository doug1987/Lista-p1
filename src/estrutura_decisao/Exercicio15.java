package estrutura_decisao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.printf("Digite treas valores: \n");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if (a+b>c&&a+c>b&&b+c>a) {
			
			System.out.printf("Os três lasdos formal um triangulo! \n");
		}
		
		
		 if (a!=b&&b!=c&&c!=a) {
			
			System.out.printf("Temos um triangulo escaleno!"); 
			
		}
		
		else if (a!=b||b!=c||c!=a) {
			
			System.out.printf("Temos um triangulo isoceles!");
			
		}
		
	
	else  {
		
		System.out.printf("Temos um triangulo equilatero!"); 
		
	}
			

	}

}
