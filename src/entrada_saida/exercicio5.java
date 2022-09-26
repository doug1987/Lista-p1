package entrada_saida;

import java.util.Scanner;

public class exercicio5 {
	
	//ex5-Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua
	//temperatura equivalente em Fahrenheit

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double F, C;
		
		System.out.printf("Digite o valor da temperatura em graus Celsius a ser convertido: ");
		C = ler.nextDouble();
		
		F = 1.8*C+32;
		
		System.out.printf("O valor da temperatura em graus Fahrenheit é: %.2f", F);

	}

}
