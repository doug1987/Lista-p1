package estrutura_decisao;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double preco, pag;
		int opc;
		
		System.out.printf("Digite o valor do protudo: ");
		preco = ler.nextDouble();
		
		System.out.printf("Opções de pagamento:\n ");
		System.out.printf("1 - À vista, dinheiro ou cheque.\n ");
		System.out.printf("2- -À vista no cartao de credito.\n ");
		System.out.printf("3 - Em duas vezes.\n ");
		System.out.printf("4 - Em quatro vezes.\n ");
		System.out.printf("Digite a forma de pagamento:\n ");
		opc = ler.nextInt();
		
		switch(opc) {
			case 1:
				
				pag = preco - (preco*0.10);
				System.out.printf("O total a ser pago e de: %.2f.", pag);
				
				break;
				
			case 2:
				
				pag = preco - (preco*0.15);
				System.out.printf("O total a ser pago e de: %.2f.", pag);
				
				break;
				
			case 3:
				
				pag = preco;
				System.out.printf("O total a ser pago e de: %.2f.", pag);
				
				break;
				
			case 4:
				
				pag = preco + (preco*0.1);
				System.out.printf("O total a ser pago e de: %.2f.", pag);
				
				break;
				
			default:
				System.out.println("Opcao invalida.");
		}


	}

}
