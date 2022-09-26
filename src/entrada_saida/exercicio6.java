package entrada_saida;

import java.util.Scanner;

public class exercicio6 {
	
// Ex6-Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares.
	//Calcular e exibir o valor correspondente em Reais (R$).	

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double R, Cota, D;
		
		System.out.printf("Digite a cotação do dolar de hj: R$ ");
		Cota = ler.nextDouble();
		System.out.printf("Digite a quantia de dolar a ser convertida para Real: $ ");
		D = ler.nextDouble();
		
		R = D*Cota;
		
		System.out.printf("O valor da quantia em dolares convertido para reais é : %.2f", R);
		

	}

}
