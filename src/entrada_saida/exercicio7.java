package entrada_saida;

import java.util.Scanner;

public class exercicio7 {
	
	//Ex7-Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor
	//referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá
	//ser devolvido.

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a,b,c,d,e,soma,pag,troco;
		
		System.out.printf("Digite os valores dos cinco produtos: \n");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		d = ler.nextDouble();
		e = ler.nextDouble();
		
		soma = a+b+c+d+e;
		
		System.out.printf("A somatória dos valores é:R$ %.2f\n\n", soma);
		
		System.out.printf("Digite o valor do pagamento: \n");
		pag = ler.nextDouble();
		
		troco = pag-soma;
		
		System.out.printf("O valor do troco é:R$ %.2f \n",troco); 
		
	

	}

}
