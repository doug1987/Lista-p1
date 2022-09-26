package entra_saida;

import java.util.Scanner;

public class exercicio3 {
	
	//Ex3- A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int area, b, h ;
		
		System.out.printf("Informe o valor da base do trangulo: ");
		b = ler.nextInt();
		
		System.out.printf("Informe o valor da altura do triangulo: ");
		h = ler.nextInt();
		
		area = (b*h)/2;
		
		System.out.printf("O valor da area do triangulo é : %d", area);
		
		

	}

}
